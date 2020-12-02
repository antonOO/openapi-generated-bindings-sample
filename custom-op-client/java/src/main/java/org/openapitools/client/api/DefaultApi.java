package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.InvalidTransaction;
import org.openapitools.client.model.SuccessfulTransactionResp;
import org.openapitools.client.model.TransactionReq;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-02T07:25:24.845-08:00[America/Los_Angeles]")
@Component("org.openapitools.client.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - success
     * <p><b>400</b> - InvalidTransaction
     * @param transactionReq  (required)
     * @return SuccessfulTransactionResp
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuccessfulTransactionResp transactionPost(TransactionReq transactionReq) throws RestClientException {
        return transactionPostWithHttpInfo(transactionReq).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - success
     * <p><b>400</b> - InvalidTransaction
     * @param transactionReq  (required)
     * @return ResponseEntity&lt;SuccessfulTransactionResp&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuccessfulTransactionResp> transactionPostWithHttpInfo(TransactionReq transactionReq) throws RestClientException {
        Object postBody = transactionReq;
        
        // verify the required parameter 'transactionReq' is set
        if (transactionReq == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionReq' when calling transactionPost");
        }
        
        String path = apiClient.expandPath("/transaction", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SuccessfulTransactionResp> returnType = new ParameterizedTypeReference<SuccessfulTransactionResp>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
