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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static ch.helvethink.odoo4java.serialization.OdooConstants.ODOO_NAME_SEARCH_API;
import static java.util.Arrays.asList;

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
                .withMethod("login")
                .withService("common")
                .withParamArgs(dbName, username, password)
                .buildRequest();
        Request request = new Request.Builder()
                .url(instanceUrl + "/jsonrpc")
                .post(body)
                .build();

        this.uid = getResult(request).get("result").getAsInt();
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

    /**
     * Find an Odoo object using criteria.
     * If no criteria, will send all the objects (id >=0 )
     *
     * @param limit          Number of objects we want to retrieve
     * @param classToConvert Type of the target object
     * @param criteria       The search criteria
     * @param <T>            The target type
     * @return List of corresponding objects
     */
    public <T extends OdooObj> List<T> findByCriteria(final int limit, final Class<T> classToConvert, final String... criteria) {
        final List<List<List<String>>> crits = (criteria != null && criteria.length > 0) ? List.of(List.of(asList(criteria))) :
                List.of(List.of(asList("id", ">=", "0")));
        LOG.debug("{}", crits);
        return genericCall(limit, classToConvert, "search_read", criteria);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> T findObjectById(final OdooId idToFetch, final Class<T> classToConvert) {
        if (idToFetch == null || !idToFetch.exists) {
            return null;
        }

        return findByCriteria(1, classToConvert, "id", "=", String.valueOf(idToFetch.id)).get(0);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findListByIdsInt(final List<Integer> idsToFetch, final Class<T> classToConvert) {
        if (idsToFetch == null || idsToFetch.isEmpty()) {
            return Collections.emptyList();
        }
        return genericCall(0, classToConvert, "read", idsToFetch);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends OdooObj> List<T> findListByIds(final List<OdooId> idsToFetch, final Class<T> classToConvert) {
        return findListByIdsInt(idsToFetch == null ? null : idsToFetch.stream().filter(odooId -> odooId.exists).map(odooId -> odooId.id).toList(), classToConvert);
    }

    /**
     * Generic call through Odoo JSON-RPC API
     * @param limit Results limit
     * @param responseType The type of objects we want to retrieve
     * @param method The JSON-RPC method we need to call (search_name, execute, ...)
     * @param requestCriteria The request criteria
     * @param <T> Type of objects we're retrieving
     * @return The list of objects returned by Odoo
     */
    <T extends OdooObj> List<T> genericCall(final int limit, final Class<T> responseType, final String method, final Object... requestCriteria) {
        final var criteria = method.equals(ODOO_NAME_SEARCH_API) ? requestCriteria
                :
                method.equals("read") ? List.of(requestCriteria) : List.of(List.of(List.of(requestCriteria)));

        JsonObject requestArgs = new JsonObject();
        if (limit > 0) {
            requestArgs.addProperty("limit", limit);
        }

        final RequestBody body1 =
                new JsonRPCRequestBuilder()
                        .withMethod("execute_kw")
                        .withService("object")
                        .withParamArgs(dbName, uid, password, responseType.getDeclaredAnnotation(OdooObject.class).value(), method, new Gson().toJsonTree(criteria), requestArgs)
                        .buildRequest();

        final Request request0 = new Request.Builder()
                .url(instanceUrl + "/jsonrpc")
                .post(body1)
                .build();

        final List<T> toReturn = new ArrayList<>();

        try (final Response response = httpCli.newCall(request0).execute()) {
            if (response.isSuccessful() && response.body() != null && response.code() >= 200 && response.code() < 300) {
                final JsonNode jsonTreeResponse = odooObjectMapper.readTree(response.body().string());
                final JsonNode resultNode = jsonTreeResponse.get("result");
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
}
