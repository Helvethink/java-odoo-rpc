package ch.helvethink.odoo4java.jsonrpc;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Request Builder for the Odoo RPC API
 */
public class JsonRPCRequestBuilder {

    /**
     * Logger
     */
    public static final Logger LOG = LoggerFactory.getLogger(JsonRPCRequestBuilder.class.getName());

    /**
     * Params to put in the request
     */
    private final JsonObject params = new JsonObject();

    /**
     * JSON request body
     */
    private final JsonObject requestBody = new JsonObject();

    /**
     * Which service we use during the request
     * @param service The odoo service name (aka object most of the time)
     * @return The builder instance
     */
    public JsonRPCRequestBuilder withService(final String service) {
        params.addProperty("service", service);
        return this;
    }

    /**
     * Which method we use to retrieve results
     * @param method The method we're calling (search_name, search, ...)
     * @return The builder instance
     */
    public JsonRPCRequestBuilder withMethod(final String method) {
        params.addProperty("method", method);
        return this;
    }

    /**
     * The args to put in "params"
     * @param args the argument lists (for instance, ids of the object when findById)
     * @return The builder instance
     */
    public JsonRPCRequestBuilder withParamArgs(final JsonElement args) {
        params.add("args", args);
        return this;
    }

    /**
     * @see #withParamArgs(JsonElement)
     * @param args the argument lists
     * @return The builder instance
     */
    public JsonRPCRequestBuilder withParamArgs(final Object... args) {
        return withParamArgs(new Gson().toJsonTree(args));
    }

    /**
     * Build the request to send to the http client
     * @return The Json request body
     */
    public RequestBody buildRequest() {
        requestBody.addProperty("jsonrpc", "2.0");
        requestBody.add("params", params);
        requestBody.addProperty("id", 1);

        final String jsonRequest = new Gson().toJson(requestBody);
        LOG.debug("The following request will be sent: {}", jsonRequest);
        return RequestBody.create(jsonRequest, MediaType.get("application/json; charset=utf-8"));
    }

}