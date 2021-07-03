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
public class GetSpecificCustStepDef {

	GetApiMethodCall getMethod = new GetApiMethodCall();

	@Given("User has the specific customer endpoint Uri")
	public void user_has_the_specific_customer_endpoint_Uri() throws IOException {

		getMethod.getUri();
	}

	@When("User hit the get specific customer endpoint {string}")
	public void user_hit_the_get_specific_customer_endpoint(String endpoint) throws IOException {

		getMethod.hitGetendpoint(endpoint);
	}

	@Then("Verify success {int} code")
	public void verify_success_code(Integer status) {

		getMethod.verifyStatus(status);
	}

	@Then("verify {string} {string} {string}")
	public void verify(String email, String fname, String lname) {
		getMethod.verifyEmail(email);
		getMethod.verifyFirstName(fname);
		getMethod.verifyLastName(lname);

	}

}
