/**
 * 
 */
package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ujjwal
 * 
 *         this class is for baic utility functions like loading payload ,
 *         properties and end point
 *
 */
public class Utilityclass {

	static Properties epProp = new Properties();
	static Properties authProp = new Properties();

	public static String url;

	// Method to get specific end point form properties files

	public static String getApiEndpoint(String endpoint) throws IOException {

		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/endpoint.properties");
		epProp.load(inputStream);
		String endpt = epProp.getProperty(endpoint);

		return endpt;
	}

	// Method to load URI

	public static String loadUri() throws IOException {
		FileInputStream stream = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/env.properties");
		Properties properties = new Properties();
		properties.load(stream);
		url = properties.getProperty("Uri");
		return url;

	}

}
