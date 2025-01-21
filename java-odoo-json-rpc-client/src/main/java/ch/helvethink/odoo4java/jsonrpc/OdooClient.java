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

package ch.helvethink.odoo4java.jsonrpc;

import ch.helvethink.odoo4java.FetchException;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.rpc.OdooRpcClient;
import ch.helvethink.odoo4java.serialization.OdooObjectMapper;
import ch.helvethink.odoo4java.tools.CriteriaTools;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.codehaus.plexus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

import static ch.helvethink.odoo4java.serialization.OdooConstants.OdooMethods.*;
import static ch.helvethink.odoo4java.serialization.OdooConstants.OdooPagination.*;
import static ch.helvethink.odoo4java.serialization.OdooConstants.OdooServices.ODOO_COMMON_SERVICE;
import static ch.helvethink.odoo4java.serialization.OdooConstants.OdooServices.ODOO_OBJECT_SERVICE;

/**
 * Abstraction of Odoo's JSON-RPC API
 */
@SuppressWarnings({"squid:S1171", "squid:S3599", "squid:S3011"})
public class OdooClient implements OdooRpcClient {
    /**
     * Simple logger
     */
    public static final Logger LOG = LoggerFactory.getLogger(OdooClient.class.getName());
    /**
     * JSON RPC API endpoint
     */
    public static final String JSONRPC_ENDPOINT = "/jsonrpc";
    /**
     * Result field returned by the Odoo JSON RPC API
     */
    public static final String RESULT_FIELD = "result";

    /**
     * DB name we target
     */
    private final String dbName;
    /**
     * Password to be used when calling api (should be your api key)
     */
    private final String password;
    /**
     * Odoo instance Url
     */
    private final String instanceUrl;
    /**
     * Http client instance
     */
    private final OkHttpClient httpCli;

    /**
     * uid of logged user to the api
     */
    int uid;

    /**
     * Custom object mapper that includes our custom deserializers
     */
    private final OdooObjectMapper odooObjectMapper = new OdooObjectMapper();

    /**
     * Constructor with direct connection
     *
     * @param instanceUrl The odoo Instance URL
     * @param dbName      The odoo DB Name
     * @param username    The Odoo username when authenticating
     * @param password    The Odoo password when authenticating
     * @throws IOException Exceptions from OkHttpClient
     */
    public OdooClient(final String instanceUrl, final String dbName, final String username, final String password) throws IOException {
        this(new OkHttpClient(), instanceUrl, dbName, username, password, true);
    }

    /**
     * Constructor
     *
     * @param httpCli     The ok http instance
     * @param instanceUrl The odoo Instance URL
     * @param dbName      The odoo DB Name
     * @param username    The Odoo username when authenticating
     * @param password    The Odoo password when authenticating
     * @param mustConnect - describes if we must try to connect or not
     * @throws IOException Exceptions from OkHttpClient
     */
    public OdooClient(final OkHttpClient httpCli, final String instanceUrl, final String dbName, final String username, final String password, final boolean mustConnect) throws IOException {
        this.dbName = dbName;
        this.password = password;
        this.instanceUrl = instanceUrl;
        this.httpCli = httpCli;

        final RequestBody body = new JsonRPCRequestBuilder()
                .withMethod(ODOO_JSON_LOGIN_METHOD)
                .withService(ODOO_COMMON_SERVICE)
                .withParamArgs(dbName, username, password)
                .buildRequest();

        Request request = new Request.Builder()
                .url(instanceUrl + JSONRPC_ENDPOINT)
                .post(body)
                .build();

        this.uid = getResult(request).get(RESULT_FIELD).getAsInt();
    }

    /**
     * Call Request and extract simple result from it
     *
     * @param request The request that must be sent
     * @return The extracted "result" field
     * @throws IOException If something is wrong with the request
     */
    private JsonObject getResult(final Request request) throws IOException {
        try (final Response response = httpCli.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                return new Gson().fromJson(response.body().string(), JsonObject.class);
            } else {
                throw new FetchException("No result or something went terribly wrong");
            }
        }
    }

    @Override
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final int page, final Class<T> classToConvert, final Object... criteria) {
        return findByCriteria(limit, page, "", classToConvert, criteria);
    }

    @Override
    public int countByCriteria(final Class<? extends OdooObj> objectType, final Object... criteria) {
        JsonObject requestArgs = new JsonObject();

        final RequestBody requestBody =
                new JsonRPCRequestBuilder()
                        .withMethod(XML_RPC_EXECUTE_METHOD_NAME)
                        .withService(ODOO_OBJECT_SERVICE)
                        .withParamArgs(dbName, uid, password,
                                objectType.getDeclaredAnnotation(OdooObject.class).value(),
                                "search_count",
                                new Gson().toJsonTree(CriteriaTools.groupCriteria(criteria)),
                                requestArgs)
                        .buildRequest();

        final Request request0 = new Request.Builder()
                .url(instanceUrl + JSONRPC_ENDPOINT)
                .post(requestBody)
                .build();

        return requestSingleResult(request0);
    }

    /**
     * {@inheritDoc}
     */
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final Class<T> classToConvert, final Object... criteria) {
        return findByCriteria(limit, 0, "", classToConvert, criteria);
    }

    @Override
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final int page, String sort, final Class<T> classToConvert, final Object... criteria) {
        return genericCall(limit, page, sort, classToConvert, ODOO_SEARCH_READ_API, criteria);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> T findObjectById(final OdooId idToFetch, final Class<T> classToConvert) {
        if (idToFetch == null || !idToFetch.exists) {
            return null;
        }

        final List<T> foundObjects = findByCriteria(1, classToConvert, "id", "=", String.valueOf(idToFetch.id));
        if (foundObjects.isEmpty()) {
            LOG.warn("No object found with id {} for class {}, this can happen due to old bad unlinked references", idToFetch.id, classToConvert);
            return null;
        } else if (foundObjects.size() > 1) {
            LOG.error("Multiple objects with id {} for class {}, this should not happen", idToFetch.id, classToConvert);
            throw new FetchException("Several objects with the same id");
        } else {
            return foundObjects.get(0);
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findListByIdsInt(final List<Integer> idsToFetch, final Class<T> classToConvert) {
        if (idsToFetch == null || idsToFetch.isEmpty()) {
            return Collections.emptyList();
        }
        return genericCall(0, 0, "", classToConvert, ODOO_READ_METHOD, idsToFetch);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findListByIds(final List<OdooId> idsToFetch, final Class<T> classToConvert) {
        return findListByIdsInt(idsToFetch == null ? null : idsToFetch.stream().filter(odooId -> odooId.exists).map(odooId -> odooId.id).toList(), classToConvert);
    }

    public int createOdooObject(final OdooObj toSave) {
        return genericSave(ODOO_CREATE_METHOD, toSave, null);
    }

    public int updateOdooObject(final OdooObj toSave, final Integer id) {
        return genericSave(ODOO_UPDATE_METHOD, toSave, id);
    }

    public int deleteOdooObject(final Integer id, final Class<? extends OdooObj> classOfTheObject) {
        final JsonRPCRequestBuilder jsonRPCRequestBuilder = new JsonRPCRequestBuilder();
        final Object[] params = {dbName, uid, password, getOdooObjAnnotation(classOfTheObject), ODOO_DELETE_METHOD,
                new Object[]{Collections.singletonList(id)}, Collections.emptyList()};
        jsonRPCRequestBuilder.withMethod(XML_RPC_EXECUTE_METHOD_NAME)
                .withService(ODOO_OBJECT_SERVICE)
                .withParamArgs(params);

        final RequestBody requestBody = jsonRPCRequestBuilder.buildRequest();

        final Request deleteRequest = new Request.Builder()
                .url(instanceUrl + JSONRPC_ENDPOINT).post(requestBody).build();

        return requestSingleResult(deleteRequest);
    }

    /**
     * Generic save through Odoo JSON-RPC API
     *
     * @param method The JSON-RPC method we need to call (create or write)
     * @param toSave The object to save
     * @return The id of the saved object in odoo
     */
    int genericSave(final String method, final OdooObj toSave, Integer id) {
        final JsonRPCRequestBuilder jsonRPCRequestBuilder = new JsonRPCRequestBuilder();
        final Object[] params = {dbName, uid, password, toSave.getClass().getDeclaredAnnotation(OdooObject.class).value(), method,
                method.equals("write") ? new Object[]{
                        Collections.singletonList(id),
                        odooObjectMapper.convertValue(toSave, Map.class)
                } : new Object[]{odooObjectMapper.convertValue(toSave, Map.class)}
                , Collections.emptyList()};
        jsonRPCRequestBuilder.withMethod(XML_RPC_EXECUTE_METHOD_NAME).withService(ODOO_OBJECT_SERVICE).withParamArgs(params);

        final RequestBody requestBody = jsonRPCRequestBuilder.buildRequest();

        final Request saveRequest = new Request.Builder().url(instanceUrl + JSONRPC_ENDPOINT).post(requestBody).build();

        return requestSingleResult(saveRequest);
    }

    /**
     * Send the request and extract the single result node as integer (for crud operations)
     *
     * @param request The request to send
     * @return The result extracted from the response body
     */
    private int requestSingleResult(final Request request) {
        try (final Response response = httpCli.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null && response.code() >= 200 && response.code() < 300) {
                final String responseBody = response.body().string();
                LOG.debug("Response body: {}", responseBody);
                return odooObjectMapper.readTree(responseBody).get(RESULT_FIELD).asInt();
            } else {
                throw new FetchException(response.message());
            }
        } catch (final IOException e) {
            throw new FetchException(e);
        }
    }

    <T extends OdooObj> List<T> genericCall(final int limit, final int page, final Class<T> responseType, final String method, final Object... requestCriteria) {
        return genericCall(limit, page, "", responseType, method, requestCriteria);
    }

        /**
         * Generic call through Odoo JSON-RPC API
         *
         * @param limit           Results limit
         * @param responseType    The type of objects we want to retrieve
         * @param method          The JSON-RPC method we need to call (search_name, execute, ...)
         * @param requestCriteria The request criteria
         * @param <T>             Type of objects we're retrieving
         * @return The list of objects returned by Odoo
         */
    <T extends OdooObj> List<T> genericCall(final int limit, final int page, final String sortByField, final Class<T> responseType, final String method, final Object... requestCriteria) {
        final Object[] requestCriteriaNotEmpty = requestCriteria == null || requestCriteria.length == 0 ?
                new Object[]{"id", ">", "-1"} : requestCriteria;

        final List<?> criteria = method.equals(ODOO_NAME_SEARCH_API) ? Arrays.asList(requestCriteria) :
                method.equals(ODOO_READ_METHOD) ?
                        List.of(requestCriteriaNotEmpty) : CriteriaTools.groupCriteria(requestCriteriaNotEmpty);

        // Warn, some of the json apis do not accept the limit field (and it produces a silent error...)
        JsonObject requestArgs = new JsonObject();
        if(!StringUtils.isEmpty(sortByField)) {
            requestArgs.addProperty(ODOO_SORT, sortByField);
        }
        if (limit > 0) {
            requestArgs.addProperty(ODOO_LIMIT, limit);
            requestArgs.addProperty(ODOO_OFFSET, page * limit);
        }

        final RequestBody requestBody =
                new JsonRPCRequestBuilder()
                        .withMethod(XML_RPC_EXECUTE_METHOD_NAME)
                        .withService(ODOO_OBJECT_SERVICE)
                        .withParamArgs(dbName, uid, password, responseType.getDeclaredAnnotation(OdooObject.class).value(), method, new Gson().toJsonTree(criteria), requestArgs)
                        .buildRequest();

        final Request request0 = new Request.Builder()
                .url(instanceUrl + JSONRPC_ENDPOINT)
                .post(requestBody)
                .build();

        final List<T> toReturn = new ArrayList<>();

        try (final Response response = httpCli.newCall(request0).execute()) {
            if (response.isSuccessful() && response.body() != null && response.code() >= 200 && response.code() < 300) {
                final JsonNode jsonTreeResponse = odooObjectMapper.readTree(response.body().string());
                final JsonNode resultNode = jsonTreeResponse.get(RESULT_FIELD);
                if (resultNode instanceof ArrayNode) {
                    for (int i = 0; i < resultNode.size(); i++) {
                        toReturn.add(odooObjectMapper.convertValue(resultNode.get(i), responseType));
                    }
                }
                return toReturn;
            } else {
                throw new FetchException(response.message());
            }
        } catch (final IOException e) {
            throw new FetchException(e);
        }
    }

    /**
     * Retrieve the OdooObj annotation for a class
     *
     * @param classOfTheObject The object's type
     * @return The value of the annotation
     */
    private static String getOdooObjAnnotation(final Class<? extends OdooObj> classOfTheObject) {
        return classOfTheObject.getDeclaredAnnotation(OdooObject.class).value();
    }

}
