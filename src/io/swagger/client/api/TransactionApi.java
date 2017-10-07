

package io.swagger.client.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Transaction;
import org.joda.time.LocalDate;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionApi {
    private ApiClient apiClient;

    public TransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for transactionCreate */
    private com.squareup.okhttp.Call transactionCreateCall(Transaction body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling transactionCreate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transactions".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Implicit Grant" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Post a transaction
     * OAuth Scope: **write:transactions**
     * @param body Transaction to post (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transaction transactionCreate(Transaction body) throws ApiException {
        ApiResponse<Transaction> resp = transactionCreateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Post a transaction
     * OAuth Scope: **write:transactions**
     * @param body Transaction to post (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transaction> transactionCreateWithHttpInfo(Transaction body) throws ApiException {
        com.squareup.okhttp.Call call = transactionCreateCall(body, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post a transaction (asynchronously)
     * OAuth Scope: **write:transactions**
     * @param body Transaction to post (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transactionCreateAsync(Transaction body, final ApiCallback<Transaction> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transactionCreateCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for transactionGet */
    private com.squareup.okhttp.Call transactionGetCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling transactionGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transactions/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Implicit Grant" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Inspect a transaction
     * OAuth Scope: **read:transactions**
     * @param id ID of the transaction to get. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transaction transactionGet(Integer id) throws ApiException {
        ApiResponse<Transaction> resp = transactionGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Inspect a transaction
     * OAuth Scope: **read:transactions**
     * @param id ID of the transaction to get. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transaction> transactionGetWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = transactionGetCall(id, null, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Inspect a transaction (asynchronously)
     * OAuth Scope: **read:transactions**
     * @param id ID of the transaction to get. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transactionGetAsync(Integer id, final ApiCallback<Transaction> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transactionGetCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for transactionList */
    private com.squareup.okhttp.Call transactionListCall(LocalDate after, LocalDate before, String type, String counterParty, Integer pageSize, String nextPageCursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/transactions".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
        if (counterParty != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "counterParty", counterParty));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (nextPageCursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nextPageCursor", nextPageCursor));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Implicit Grant" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List transactions
     * OAuth Scope: **read:transactions**
     * @param after Transactions posted after date, in [Internet date and time format](&#39;https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14&#39;). For example, *yyyy-MM-ddz*. (optional)
     * @param before Transactions posted before date, in [Internet date and time format](&#39;https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14&#39;). For example, *yyyy-MM-ddz*. (optional)
     * @param type Transaction type. (optional)
     * @param counterParty Counter party identifier. (optional)
     * @param pageSize Number of results to return per call. (optional, default to 20)
     * @param nextPageCursor Add this if you are making this call to get the next page of results from a previous call. (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 transactionList(LocalDate after, LocalDate before, String type, String counterParty, Integer pageSize, String nextPageCursor) throws ApiException {
        ApiResponse<InlineResponse200> resp = transactionListWithHttpInfo(after, before, type, counterParty, pageSize, nextPageCursor);
        return resp.getData();
    }

    /**
     * List transactions
     * OAuth Scope: **read:transactions**
     * @param after Transactions posted after date, in [Internet date and time format](&#39;https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14&#39;). For example, *yyyy-MM-ddz*. (optional)
     * @param before Transactions posted before date, in [Internet date and time format](&#39;https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14&#39;). For example, *yyyy-MM-ddz*. (optional)
     * @param type Transaction type. (optional)
     * @param counterParty Counter party identifier. (optional)
     * @param pageSize Number of results to return per call. (optional, default to 20)
     * @param nextPageCursor Add this if you are making this call to get the next page of results from a previous call. (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> transactionListWithHttpInfo(LocalDate after, LocalDate before, String type, String counterParty, Integer pageSize, String nextPageCursor) throws ApiException {
        com.squareup.okhttp.Call call = transactionListCall(after, before, type, counterParty, pageSize, nextPageCursor, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List transactions (asynchronously)
     * OAuth Scope: **read:transactions**
     * @param after Transactions posted after date, in [Internet date and time format](&#39;https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14&#39;). For example, *yyyy-MM-ddz*. (optional)
     * @param before Transactions posted before date, in [Internet date and time format](&#39;https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14&#39;). For example, *yyyy-MM-ddz*. (optional)
     * @param type Transaction type. (optional)
     * @param counterParty Counter party identifier. (optional)
     * @param pageSize Number of results to return per call. (optional, default to 20)
     * @param nextPageCursor Add this if you are making this call to get the next page of results from a previous call. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transactionListAsync(LocalDate after, LocalDate before, String type, String counterParty, Integer pageSize, String nextPageCursor, final ApiCallback<InlineResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transactionListCall(after, before, type, counterParty, pageSize, nextPageCursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
