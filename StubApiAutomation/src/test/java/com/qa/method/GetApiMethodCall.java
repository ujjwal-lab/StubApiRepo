/**
 * 
 */
package com.qa.method;

import java.io.IOException;
import java.util.ArrayList;

import com.qa.utils.CommonMethod;
import com.qa.utils.LoggerConfig;
import com.qa.utils.Utilityclass;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author ujjwal
 *
 */
public class GetApiMethodCall {

	RequestSpecification request;
	Response response;

	public void getUri() throws IOException {
		

		RestAssured.baseURI = Utilityclass.loadUri();
		
		LoggerConfig.info("Adding Header application Json ");
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
	}

	public void hitGetendpoint(String endpoint) throws IOException {

		String path = Utilityclass.getApiEndpoint(endpoint);
		response = request.when().log().all().get(path);
	}

	public void verifyStatus(Integer status) {

		System.out.println("Response code is " + response.getStatusCode());
		CommonMethod.compareStatusCode(status, response.getStatusCode());
	}


	public void verifyFirstName(String fname) {
		String resfname = JsonPath.from(response.asString()).get("data.first_name");
		System.out.println("First naem in response is " + resfname);
		CommonMethod.compareMessage(fname, resfname);

	}

	public void verifyLastName(String lname) {
		String reslname = JsonPath.from(response.asString()).get("data.last_name");
		System.out.println("Last name in response is " + reslname);
		CommonMethod.compareMessage(lname, reslname);

	}

	public void verifyEmail(String email) {
		String reseml = JsonPath.from(response.asString()).get("data.email");
		System.out.println("Email Id in response is " + reseml);
		CommonMethod.compareMessage(email, reseml);

	}

	public void checkNodeCount(int count) {
		ArrayList<?> reseml = JsonPath.from(response.asString()).get("data.id");
		System.out.println("Number of entries in response is " + reseml.size());

	}

	public void verifyStatusMsg(String msg) {
		String status = JsonPath.from(response.asString()).get("status");
		System.out.println("Status in resposne is " + status);
		CommonMethod.compareMessage(msg, status);

	}

	public void verifyCodeText(String cde) {
		String code = JsonPath.from(response.asString()).get("code").toString();
		System.out.println("Code in resposne is " + code);
		CommonMethod.compareMessage(cde, code);

	}

	public void verifyFailureMsg(String msg) {

		String resmsg = JsonPath.from(response.asString()).get("message");
		System.out.println("Message in resposne is " + resmsg);
		CommonMethod.compareMessage(msg, resmsg);

	}
}
