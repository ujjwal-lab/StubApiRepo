/**
 * 
 */
package com.qa.utils;

import org.testng.Assert;

/**
 * @author Ujjwal
 *
 */
public class CommonMethod {

	// method to compare status code
	public static void compareStatusCode(int inputCode, int responseCode) {

		Assert.assertEquals(inputCode, responseCode);
	}

	// Method to comapre two string messages
	public static void compareMessage(String inputStr, String responseStr) {

		Assert.assertEquals(inputStr, responseStr);
	}
}
