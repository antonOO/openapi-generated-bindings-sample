# DefaultApi

All URIs are relative to *http://localhost:8080/test*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionPost**](DefaultApi.md#transactionPost) | **POST** /transaction | 



## transactionPost

> SuccessfulTransactionResp transactionPost(transactionReq)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/test");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        TransactionReq transactionReq = new TransactionReq(); // TransactionReq | 
        try {
            SuccessfulTransactionResp result = apiInstance.transactionPost(transactionReq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#transactionPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionReq** | [**TransactionReq**](TransactionReq.md)|  |

### Return type

[**SuccessfulTransactionResp**](SuccessfulTransactionResp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | InvalidTransaction |  -  |

