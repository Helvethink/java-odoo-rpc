/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.xmlrpc;

import ch.helvethink.odoo4java.FetchException;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.rpc.OdooRpcClient;
import ch.helvethink.odoo4java.serialization.OdooObjectMapper;
import ch.helvethink.odoo4java.tools.CriteriaTools;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.codehaus.plexus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.*;

import static ch.helvethink.odoo4java.serialization.OdooConstants.*;
import static ch.helvethink.odoo4java.serialization.OdooConstants.OdooMethods.*;
import static ch.helvethink.odoo4java.serialization.OdooConstants.OdooPagination.*;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

/**
 * Abstraction of Odoo's XML-RPC API
 */
@SuppressWarnings({"squid:S1171", "squid:S3599", "squid:S3011"})
public class OdooClient implements OdooRpcClient {
    /**
     * Simple logger
     */
    public static final Logger LOG = LoggerFactory.getLogger(OdooClient.class.getName());

    /**
     * DB name we target
     */
    private final String dbName;
    /**
     * Password to be used when calling api (should be your api key)
     */
    private final String password;

    /**
     * uid of logged user to the api
     */
    int uid;

    /**
     * Custom object mapper that includes our custom deserializers
     */
    private final OdooObjectMapper odooObjectMapper = new OdooObjectMapper();

    /**
     * Common API XML-RPC Client
     */
    OdooXmlRpcClient commonClient;

    /**
     * Object API XML-RPC Client
     */
    OdooXmlRpcClient objectXmlRpcClient;

    /**
     * Constructor with direct connection
     *
     * @param instanceUrl The odoo Instance URL
     * @param dbName      The odoo DB Name
     * @param username    The Odoo username when authenticating
     * @param password    The Odoo password when authenticating
     * @throws MalformedURLException when URI is not valid
     * @throws XmlRpcException       when an error occurs with the XML-RPC API
     */
    public OdooClient(final String instanceUrl, final String dbName, final String username, final String password) throws MalformedURLException, XmlRpcException {
        this(instanceUrl, dbName, username, password, true);
    }

    /**
     * Constructor that initializes the Common API XML-RPC client
     *
     * @param instanceUrl The odoo Instance URL
     * @param dbName      The odoo DB Name
     * @param username    The Odoo username when authenticating
     * @param password    The Odoo password when authenticating
     * @param mustConnect - describes if we must try to connect or not
     * @throws MalformedURLException when URI is not valid
     */
    public OdooClient(final String instanceUrl, final String dbName, final String username, final String password, final boolean mustConnect) throws MalformedURLException {
        this(new OdooXmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                setServerURL(URI.create(String.format("%s/xmlrpc/2/common", instanceUrl)).toURL());
                setEnabledForExceptions(true);
                setEnabledForExtensions(true);
            }});
        }}, instanceUrl, dbName, username, password, mustConnect);
    }

    /**
     * Constructor with all fields
     *
     * @param commonClient - The common XML-RPC API client
     * @param instanceUrl  The odoo Instance URL
     * @param dbName       The odoo DB Name
     * @param username     The Odoo username when authenticating
     * @param password     The Odoo password when authenticating
     * @param mustConnect  - describes if we must try to connect or not
     * @throws MalformedURLException when URI is not valid
     */
    public OdooClient(final OdooXmlRpcClient commonClient, final String instanceUrl, final String dbName, final String username, final String password, final boolean mustConnect) throws MalformedURLException {
        this.dbName = dbName;
        this.password = password;

        final String objectEndpoint = String.format("%s/xmlrpc/2/object", instanceUrl);

        objectXmlRpcClient = new OdooXmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                setServerURL(URI.create(objectEndpoint).toURL());
            }});
        }};

        this.commonClient = commonClient;

        if (mustConnect) {
            final Object authentication = commonClient.execute("authenticate", asList(dbName, username, password, emptyMap()));
            // In case Authentication fail through the Odoo XML RPC Api, it sends a Boolean instead of throwing an exception
            if (Boolean.FALSE.equals(authentication) || !(authentication instanceof Integer)) {
                throw new FetchException("Authentication failed");
            } else {
                uid = (int) authentication;
                LOG.info("User is {}, uid is {}", username, uid);
            }
        }
    }

    /**
     * Retrieve Version from the Odoo Server
     *
     * @return Version like "17.0"
     */
    public String getVersion() {
        return ((Map<String, Object>) commonClient.execute("version", emptyList())).get("server_version").toString();
    }

    /**
     * Retrieve all Odoo models of the Odoo instance we're connected to
     *
     * @param packageName - allows to filter the names of models we want to retrieve
     * @return List of Odoo models with fields like "description", "name", "access_ids", ...
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public List<Map<String, Object>> getAllModels(final String packageName) throws XmlRpcException {
        final Object[] modelParams = new Object[]{
                dbName, uid, password,
                ODOO_INSTROSPECTION_MODEL, ODOO_SEARCH_READ_API,
                emptyList(),
                emptyMap()
        };

        final Object[] models = (Object[]) objectXmlRpcClient.execute(XML_RPC_EXECUTE_METHOD_NAME, modelParams);

        return Arrays.stream(models).map(model -> ((Map<String, Object>) model))
                .filter(aModel -> ((Object[]) aModel.get(MANDATORY_FIELD_FOR_ACCESSING_MODEL)).length > 0) // render only the accessible models
                .filter(aModel -> aModel.get("name") == null || ((String) aModel.get("name")).startsWith(packageName))
                .toList();
    }

    /**
     * Get fields From Odoo, for a given model
     *
     * @param modelName The model we want to inspect
     * @return The list of fields as a Map containing the following information: string, help, type, and relation
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public Map<String, Map<String, Object>> getFields(final String modelName) throws XmlRpcException {
        final Object[] params = new Object[]{dbName, uid, password, modelName, ODOO_FETCH_FIELDS_API,
                emptyList(),
                new HashMap<>() {{
                    put("attributes", ATTRIBUTES_FOR_FETCHED_FIELDS);
                }}
        };
        return (Map<String, Map<String, Object>>) objectXmlRpcClient.execute(XML_RPC_EXECUTE_METHOD_NAME, params);
    }


    /**
     * Find a list of object from names
     *
     * @param classToConvert The type of objects
     * @param names          The "name" value of objects we're looking for
     * @param <T>            The type of objects to return
     * @return List of found objects
     */
    public <T extends OdooObj> List<T> findByNames(final Class<T> classToConvert, final List<String> names) {
        LOG.debug("Searching {} with names: {}", classToConvert.getSimpleName(), names);
        return findListByIdsInt(names.stream().map(aName -> findByName(classToConvert, aName))
                        .filter(result -> result.length > 0) // If object is not found we don't want to get an exception
                        .map(result -> (Integer) ((Object[]) result[0])[0]).toList(), // id is the first field
                classToConvert);
    }

    /**
     * Fetch a single object from its name
     *
     * @param classToConvert The object's type
     * @param aName          The name of the object
     * @param <T>            The object's type
     * @return The id of the object under its XML-RPC representation (array of objects)
     */
    private <T extends OdooObj> Object[] findByName(final Class<T> classToConvert, final String aName) {
        return (Object[]) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(
                        dbName, uid, password,
                        classToConvert.getDeclaredAnnotation(OdooObject.class).value(), // modelName
                        ODOO_NAME_SEARCH_API, Collections.singletonList(aName), // Pass name as a single string
                        new HashMap<String, Object>() {{
                            put(ODOO_LIMIT, 1);
                        }}
                )
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final Class<T> classToConvert, final Object... criteria) {
        return findByCriteria(limit, 0, classToConvert, criteria);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final int page, final Class<T> classToConvert, final Object... criteria) {
        return findByCriteria(limit, page, "", classToConvert, criteria);
    }

    @Override
    public int countByCriteria(final Class<? extends OdooObj> objectType, final Object... criteria) {
        final List<List<List<Object>>> crits = (criteria != null && criteria.length > 0) ? CriteriaTools.groupCriteria(criteria) :
                List.of(List.of(asList("id", ">=", "0")));
        LOG.debug("{}", crits);

        return (int) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(dbName, uid, password,
                        objectType.getDeclaredAnnotation(OdooObject.class).value(), //modelName,
                        "search_count", crits, new HashMap<String, Object>() {})
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final int page, final String sortByField, final Class<T> classToConvert, final Object... criteria) {
        final List<List<List<Object>>> crits = (criteria != null && criteria.length > 0) ? CriteriaTools.groupCriteria(criteria) :
                List.of(List.of(asList("id", ">=", "0")));
        LOG.debug("{}", crits);
        final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(dbName, uid, password,
                        classToConvert.getDeclaredAnnotation(OdooObject.class).value(), //modelName,
                        ODOO_SEARCH_READ_API, crits, new HashMap<String, Object>() {{
                            put(ODOO_LIMIT, limit);
                            put(ODOO_OFFSET, page * limit);
                            if (!StringUtils.isEmpty(sortByField)) {
                                put(ODOO_SORT, sortByField);
                            }
                        }}
                )
        );
        return Arrays.stream(resultFromXmlRpc)
                .map(anObject -> odooObjectMapper.convertValue(anObject, classToConvert))
                .toList();
    }

    /**
     * {@inheritDoc}
     */
    public <T extends OdooObj> T findObjectById(final OdooId idToFetch, final Class<T> classToConvert) {
        if (idToFetch == null || !idToFetch.exists) {
            return null;
        }

        final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(dbName, uid, password,
                        classToConvert.getDeclaredAnnotation(OdooObject.class).value(), ODOO_READ_METHOD, List.of(idToFetch.id)
                ));
        return odooObjectMapper.convertValue(resultFromXmlRpc[0], classToConvert);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findListByIdsInt(final List<Integer> idsToFetch, final Class<T> classToConvert) {
        if (idsToFetch == null || idsToFetch.isEmpty()) {
            return Collections.emptyList();
        }
        try {
            final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                    XML_RPC_EXECUTE_METHOD_NAME, asList(dbName, uid, password,
                            classToConvert.getDeclaredAnnotation(OdooObject.class).value(), ODOO_READ_METHOD, List.of(idsToFetch)));
            return Arrays.stream(resultFromXmlRpc)
                    .map(anObject -> odooObjectMapper.convertValue(anObject, classToConvert))
                    .toList();
        } catch (final FetchException e) {
            if (e.getMessage().contains("TypeError: dictionary key must be string")) {
                LOG.error("Exception occured for class {} with ids {}", classToConvert.getSimpleName(), idsToFetch, e); // because of account.move.line
                return Collections.emptyList();
            } else {
                throw e;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public <T extends OdooObj> List<T> findListByIds(final List<OdooId> idsToFetch, final Class<T> classToConvert) {
        return findListByIdsInt(idsToFetch == null ? null : idsToFetch.stream().filter(odooId -> odooId.exists).map(odooId -> odooId.id).toList(), classToConvert);
    }

}
