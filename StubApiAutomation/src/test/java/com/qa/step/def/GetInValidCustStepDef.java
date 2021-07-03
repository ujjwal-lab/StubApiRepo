/**
 * 
 */
package com.qa.step.def;

import java.io.IOException;

import com.qa.method.GetApiMethodCall;
import com.qa.utils.LoggerConfig;

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

		LoggerConfig.startTestCase(GetInValidCustStepDef.class.toString());
		LoggerConfig.info("Entering get URI method to fetch Get All Customer Endpoint");

		getMethod.getUri();
	}

	@When("User hit the endpoint {string}")
	public void user_hit_the_endpoint(String endpoint) throws IOException {

		LoggerConfig.info("Entering Get End point method");

		getMethod.hitGetendpoint(endpoint);
	}

	@Then("Verify failure {int} code")
	public void verify_failure_code(Integer status) {

		LoggerConfig.info("Entering verifying status code method");

		getMethod.verifyStatus(status);
	}

	@Then("Verify {string} and {string} {string}in response")
	public void verify_and_in_response(String status, String message, String code) {

		LoggerConfig.info("Entering verifying status message method");
		getMethod.verifyStatusMsg(status);

		LoggerConfig.info("Entering verifying code text method");
		getMethod.verifyCodeText(code);
		LoggerConfig.info("Entering verifying Failure message method");
		getMethod.verifyFailureMsg(message);

		LoggerConfig.endTestCase(GetAllCustStepDef.class.toString());

	}
}
