/**
 * 
 */
package com.qa.step.def;

import java.io.IOException;

import com.qa.method.GetApiMethodCall;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author ujjwa
 *
 */
public class GetInValidCustStepDef {

	GetApiMethodCall getMethod = new GetApiMethodCall();

	@Given("User has the endpoint Uri")
	public void user_has_the_endpoint_Uri() throws IOException {
		
		getMethod.getUri();
	}

	@When("User hit the endpoint {string}")
	public void user_hit_the_endpoint(String endpoint) throws IOException {
		
		getMethod.hitGetendpoint(endpoint);
	}

	@Then("Verify failure {int} code")
	public void verify_failure_code(Integer status) {
		
		getMethod.verifyStatus(status);
	}

	@Then("Verify {string} and {string} {string}in response")
	public void verify_and_in_response(String status, String message, String code) {
		
		getMethod.verifyStatusMsg(status);
		getMethod.verifyCodeText(code);
		getMethod.verifyFailureMsg(message);
		
		
	}
}
