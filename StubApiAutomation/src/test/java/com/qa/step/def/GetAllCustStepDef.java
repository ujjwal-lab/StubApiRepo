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
public class GetAllCustStepDef {
	GetApiMethodCall getMethod = new GetApiMethodCall();

	@Given("User has the all customer endpoint Uri")
	public void user_has_the_all_customer_endpoint_Uri() throws IOException {
		getMethod.getUri();
	}

	@When("User hit the get all customer endpoint {string}")
	public void user_hit_the_get_all_customer_endpoint(String endpoint) throws IOException {
		
		getMethod.hitGetendpoint(endpoint);
	}

	@Then("Verify the {int} code for get all customer endpoint")
	public void verify_the_code_for_get_all_customer_endpoint(Integer status) {
		
		getMethod.verifyStatus(status);
	}

	@Then("check the {int} of records in response")
	public void check_the_of_records_in_response(Integer count) {
		getMethod.checkNodeCount(count);
	}
}