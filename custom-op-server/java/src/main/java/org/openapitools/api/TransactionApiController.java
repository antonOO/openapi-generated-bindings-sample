package org.openapitools.api;

import org.openapitools.model.InvalidTransaction;
import org.openapitools.model.SuccessfulTransactionResp;
import org.openapitools.model.TransactionReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.ApiParam;

import java.util.Optional;

import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-02T07:25:48.417-08:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.vmodlNsManagedObject.base-path:/test}")
public class TransactionApiController implements TransactionApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    public ResponseEntity<SuccessfulTransactionResp> transactionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody TransactionReq transactionReq) {
		if (transactionReq.getAmount() > 0) {
			SuccessfulTransactionResp resp = new SuccessfulTransactionResp();
			resp.setMessage("Success");
			return new ResponseEntity<SuccessfulTransactionResp>(resp, HttpStatus.OK);
		}
		InvalidTransaction invalid = new InvalidTransaction();
		invalid.setMessage("Invalid transaction");
		return new ResponseEntity(invalid, HttpStatus.BAD_REQUEST);
    }

}
