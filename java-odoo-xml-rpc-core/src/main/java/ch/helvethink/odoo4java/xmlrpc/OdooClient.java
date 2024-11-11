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

import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.tools.FieldUtils;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.*;

import static ch.helvethink.odoo4java.xmlrpc.OdooConstants.*;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static org.codehaus.plexus.util.StringUtils.capitalizeFirstLetter;

/**
 * Abstraction of Odoo's XML-RPC API
 */
@SuppressWarnings({"squid:S1171", "squid:S3599", "squid:S3011"})
public class OdooClient {
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
    XmlRpcClient commonClient;

    /**
     * Object API XML-RPC Client
     */
    XmlRpcClient objectXmlRpcClient;

    /**
     * Constructor with direct connection
     * @param instanceUrl The odoo Instance URL
     * @param dbName The odoo DB Name
     * @param username The Odoo username when authenticating
     * @param password The Odoo password when authenticating
     * @throws MalformedURLException when URI is not valid
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public OdooClient(final String instanceUrl, final String dbName, final String username, final String password) throws MalformedURLException, XmlRpcException {
        this(instanceUrl, dbName, username, password, true);
    }

    /**
     * Constructor that initializes the Common API XML-RPC client
     * @param instanceUrl The odoo Instance URL
     * @param dbName The odoo DB Name
     * @param username The Odoo username when authenticating
     * @param password The Odoo password when authenticating
     * @param mustConnect - describes if we must try to connect or not
     * @throws MalformedURLException when URI is not valid
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public OdooClient(final String instanceUrl, final String dbName, final String username, final String password, final boolean mustConnect) throws MalformedURLException, XmlRpcException {
        this(new XmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                setServerURL(URI.create(String.format("%s/xmlrpc/2/common", instanceUrl)).toURL());
                setEnabledForExceptions(true);
                setEnabledForExtensions(true);
            }});
        }}, instanceUrl, dbName, username, password, mustConnect);
    }

    /**
     * Constructor with all fields
     * @param commonClient - The common XML-RPC API client
     * @param instanceUrl The odoo Instance URL
     * @param dbName The odoo DB Name
     * @param username The Odoo username when authenticating
     * @param password The Odoo password when authenticating
     * @param mustConnect - describes if we must try to connect or not
     * @throws MalformedURLException when URI is not valid
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public OdooClient(final XmlRpcClient commonClient, final String instanceUrl, final String dbName, final String username, final String password, final boolean mustConnect) throws MalformedURLException, XmlRpcException {
        this.dbName = dbName;
        this.password = password;

        final String objectEndpoint = String.format("%s/xmlrpc/2/object", instanceUrl);

        objectXmlRpcClient = new XmlRpcClient() {{
            setConfig(new XmlRpcClientConfigImpl() {{
                setServerURL(URI.create(objectEndpoint).toURL());
            }});
        }};

        this.commonClient = commonClient;

        if (mustConnect) {
            final Object authentication = commonClient.execute("authenticate", asList(dbName, username, password, emptyMap()));
            // In case Authentication fail through the Odoo XML RPC Api, it sends a Boolean instead of throwing an exception
            if (Boolean.FALSE.equals(authentication) || !(authentication instanceof Integer)) {
                throw new XmlRpcException("Authentication failed");
            } else {
                uid = (int) authentication;
                LOG.info("User is {}, uid is {}", username, uid);
            }
        }
    }

    /**
     * Retrieve Version from the Odoo Server
     * @return Version like "17.0"
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public String getVersion() throws XmlRpcException {
        return ((Map<String, Object>) commonClient.execute("version", emptyList())).get("server_version").toString();
    }

    /**
     * Retrieve all Odoo models of the Odoo instance we're connected to
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
     * Fetch relationships from an Odoo object, without recursion
     * @param o The object to fetch
     * @param classesToFetch The list of types we want to fetch, If empty everything will be fetched
     * @return true when succeeded
     */
    public boolean fetchRelationShips(final Object o, final List<Class<? extends OdooObj>> classesToFetch) {
        Arrays.stream(o.getClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(FieldRelation.class))
                .forEach(
                        fieldRelation -> {
                            String fieldToUpdate = FieldUtils.formatFieldName(fieldRelation.getName());
                            try {
                                final Class<? extends OdooObj> aClass = (Class<? extends OdooObj>) Class.forName(fieldRelation.getAnnotation(FieldRelation.class).value());
                                if (classesToFetch.isEmpty() || classesToFetch.contains(aClass)) {
                                    if (fieldRelation.getType().equals(List.class)) {
                                        // name of associated attribute to populate is <fieldName>AsList
                                        Object ids = o.getClass().getDeclaredMethod("get" + capitalizeFirstLetter(fieldToUpdate)).invoke(o);
                                        o.getClass().getDeclaredMethod("set" + capitalizeFirstLetter(fieldToUpdate) + "AsList", List.class).invoke(o, fetchListByIdsInt(aClass.getDeclaredAnnotation(OdooObject.class).value(), (List<Integer>) ids, aClass));
                                    } else {
                                        // name of associated attribute to populate is <fieldNameAsObject>
                                        Object id = o.getClass().getDeclaredMethod("get" + capitalizeFirstLetter(fieldToUpdate)).invoke(o);
                                        o.getClass().getDeclaredMethod("set" + capitalizeFirstLetter(fieldToUpdate) + "AsObject", aClass).invoke(o, fetchObjectById(aClass.getDeclaredAnnotation(OdooObject.class).value(), (OdooId) id, aClass));
                                    }
                                }
                            } catch (final IllegalAccessException | ClassNotFoundException | XmlRpcException | InvocationTargetException | NoSuchMethodException e) {
                                throw new RuntimeException(e); //NOSONAR
                            }
                        }
                );
        return true;
    }

    /**
     * The same as {@link #fetchRelationShips(Object, List)} but recursively
     * Warn! Since there are a lot of relationships, this increases number of calls and might be less performant
     * Ideally when using depth, indicate the classes you want to fetch to avoid wasting time
     * @param o The initial object we want to fetch relationships for
     * @param depth The depth to which we want to fetch Objects
     * @param classesToFetch The list of types we want to fetch
     * @return true if operation is a success
     */
    public boolean fetchRecursivelyRelationShips(final Object o, final int depth, final List<Class<? extends OdooObj>> classesToFetch) {
        if (depth <= 0) {
            return true;
        }

        Arrays.stream(o.getClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(FieldRelation.class))
                .forEach(
                        fieldRelation -> {
                            String fieldToUpdate = FieldUtils.formatFieldName(fieldRelation.getName());
                            try {
                                final Class<? extends OdooObj> aClass = (Class<? extends OdooObj>) Class.forName(fieldRelation.getAnnotation(FieldRelation.class).value());
                                if (classesToFetch.isEmpty() || classesToFetch.contains(aClass)) {
                                    if (fieldRelation.getType().equals(List.class)) {
                                        LOG.debug("fieldRelation: {}", fieldRelation);

                                        Object ids = o.getClass().getDeclaredMethod("get" + capitalizeFirstLetter(fieldToUpdate)).invoke(o);
                                        final List<?> fetchedList = fetchListByIdsInt(
                                                aClass.getDeclaredAnnotation(OdooObject.class).value(),
                                                (List<Integer>) ids,
                                                aClass
                                        );
                                        o.getClass().getDeclaredMethod("set" + capitalizeFirstLetter(fieldToUpdate) + "AsList", List.class).invoke(o, fetchedList);
                                        // Recursive call for each list's element if depth has not been reached and we're not in "lazy_list" mode
                                        for (final Object relatedObject : fetchedList) {
                                            fetchRecursivelyRelationShips(relatedObject, depth - 1, classesToFetch);
                                        }
                                    } else {
                                        Object id = o.getClass().getDeclaredMethod("get" + capitalizeFirstLetter(fieldToUpdate)).invoke(o);
                                        final Object fetchedObject = fetchObjectById(
                                                aClass.getDeclaredAnnotation(OdooObject.class).value(),
                                                (OdooId) id,
                                                aClass
                                        );
                                        o.getClass().getDeclaredMethod("set" + capitalizeFirstLetter(fieldToUpdate) + "AsObject", aClass).invoke(o, fetchedObject);

                                        // recursive call if object exists and depth has not been reached
                                        if (fetchedObject != null) {
                                            fetchRecursivelyRelationShips(fetchedObject, depth - 1, classesToFetch);
                                        }
                                    }
                                }
                            } catch (final IllegalAccessException | ClassNotFoundException | XmlRpcException | InvocationTargetException | NoSuchMethodException e) {
                                throw new RuntimeException(e); //NOSONAR
                            }
                        }
                );
        return true;
    }

    /**
     * Find an Odoo object using criteria.
     * If no criteria, will send all the objects (id >=0 )
     * @param limit Number of objects we want to retrieve
     * @param classToConvert Type of the target object
     * @param criteria The search criteria
     * @return List of corresponding objects
     * @param <T> The target type
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final Class<T> classToConvert, final String... criteria) throws XmlRpcException {
        final List<List<List<String>>> crits = (criteria != null && criteria.length > 0) ? List.of(List.of(asList(criteria))) :
                List.of(List.of(asList("id", ">=", "0")));
        LOG.debug("{}", crits);
        final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(
                        dbName, uid, password,
                        classToConvert.getDeclaredAnnotation(OdooObject.class).value(), //modelName,
                        ODOO_SEARCH_READ_API, crits, new HashMap<String, Object>() {{
                            put("limit", limit);
                        }}
                )
        );
        return Arrays.stream(resultFromXmlRpc)
                .map(anObject -> odooObjectMapper.convertValue(anObject, classToConvert))
                .toList();
    }

    /**
     * Fetch an object by its id
     * @param modelName The Odoo model name
     * @param idToFetch The id of the object we want to fetch
     * @param classToConvert The type of the target Object
     * @return The object fetched
     * @param <T> The type of the target Object
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public <T extends OdooObj> T fetchObjectById(final String modelName, final OdooId idToFetch, final Class<T> classToConvert) throws XmlRpcException {
        if (!idToFetch.exists) {
            return null;
        }

        final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(dbName, uid, password, modelName, "read", List.of(idToFetch.id)
                ));
        return odooObjectMapper.convertValue(resultFromXmlRpc[0], classToConvert);
    }

    /**
     * Same as {@link #fetchObjectById(String, OdooId, Class)} but with a List
     * @param modelName The Odoo model name
     * @param idsToFetch The ids of objects we want to fetch
     * @param classToConvert The type of the target objects
     * @return List of built objects
     * @param <T> The type of the target objects
     * If an exception occured, will send back an empty list
     */
    public <T extends OdooObj> List<T> fetchListByIdsInt(final String modelName, final List<Integer> idsToFetch, final Class<T> classToConvert) {
        if (idsToFetch == null || idsToFetch.isEmpty()) {
            return Collections.emptyList();
        }

        LOG.info("modelName: {}", modelName);
        LOG.info("idstofetch: {}", idsToFetch);

        try {
            final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                    XML_RPC_EXECUTE_METHOD_NAME, asList(
                            dbName, uid, password,
                            modelName, "read",
                            List.of(idsToFetch)));
            return Arrays.stream(resultFromXmlRpc)
                    .map(anObject -> odooObjectMapper.convertValue(anObject, classToConvert))
                    .toList();

        } catch (final XmlRpcException e) {
            LOG.error("Exception occured", e); // because of account.move.line
            //   File "/usr/lib/python3.11/xmlrpc/client.py", line 605,
            //   in dump_struct raise TypeError("dictionary key must be string")
            //   TypeError: dictionary key must be string)
            return Collections.emptyList();
        }
    }

    /**
     * Same as above but with Odoo Ids, and no catch of the exception
     * @param modelName The Odoo model name
     * @param idsToFetch The ids of objects we want to fetch under the form of {@link OdooId}
     * @param classToConvert The type of the target objects
     * @return List of built objects
     * @param <T> The type of the target objects
     * @throws XmlRpcException when an error occurs with the XML-RPC API
     */
    public <T extends OdooObj> List<T> fetchListByIds(final String modelName, final List<OdooId> idsToFetch, final Class<T> classToConvert) throws XmlRpcException {
        if (idsToFetch == null || idsToFetch.isEmpty() || idsToFetch.stream().noneMatch(id -> id.exists)) {
            return Collections.emptyList();
        }

        final Object[] resultFromXmlRpc = (Object[]) objectXmlRpcClient.execute(
                XML_RPC_EXECUTE_METHOD_NAME, asList(
                        dbName, uid, password,
                        modelName, "read",
                        List.of(idsToFetch.stream().filter(anId -> anId.exists).map(id -> id.id).toList())
                )
        );
        return Arrays.asList(resultFromXmlRpc)
                .stream()
                .map(anObject -> odooObjectMapper.convertValue(anObject, classToConvert))
                .toList();
    }

}
