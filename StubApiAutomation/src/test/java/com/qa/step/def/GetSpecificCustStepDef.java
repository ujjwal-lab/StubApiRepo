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
public class GetSpecificCustStepDef {

	GetApiMethodCall getMethod = new GetApiMethodCall();

	@Given("User has the specific customer endpoint Uri")
	public void user_has_the_specific_customer_endpoint_Uri() throws IOException {

		LoggerConfig.startTestCase(GetSpecificCustStepDef.class.toString());
		LoggerConfig.info("Entering get URI method to fetch Get All Customer Endpoint");

		getMethod.getUri();
	}

	@When("User hit the get specific customer endpoint {string}")
	public void user_hit_the_get_specific_customer_endpoint(String endpoint) throws IOException {

		LoggerConfig.info("Entering Get End point method with invalid customer ID");

		getMethod.hitGetendpoint(endpoint);
	}

	@Then("Verify success {int} code")
	public void verify_success_code(Integer status) {

		LoggerConfig.info("Entering verifying status code method");
		getMethod.verifyStatus(status);
	}

	@Then("verify {string} {string} {string}")
	public void verify(String email, String fname, String lname) {

		LoggerConfig.info("Entering verifying email method");

		getMethod.verifyEmail(email);

		LoggerConfig.info("Entering verifying First Name method");
		getMethod.verifyFirstName(fname);

		LoggerConfig.info("Entering verifying Last Name method");
		getMethod.verifyLastName(lname);

		LoggerConfig.endTestCase(GetAllCustStepDef.class.toString());

	}

}
