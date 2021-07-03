/**
 * 
 */
package com.qa.utils;

import org.apache.log4j.Logger;

/**
 * @author ujjwal
 *
 */
public class LoggerConfig {

	// Initialize Log4j logs

	 static Logger Log = Logger.getLogger(LoggerConfig.class.getName());//

	// This is to print log for the beginning of the test case, as we usually run so

	public static void startTestCase(String sTestCaseName) {

		Log.info("****************************************************************************************");


		Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");


		Log.info("****************************************************************************************");

	}

	// This is to print log for the ending of the test case

	public static void endTestCase(String sTestCaseName) {

		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

		Log.info("X");

		Log.info("X");

	}

	// Need to create these methods, so that they can be called

	public static void info(String message) {

		Log.info(message);

	}

	public static void warn(String message) {

		Log.warn(message);

	}

	public static void error(String message) {

		Log.error(message);

	}

	public static void fatal(String message) {

		Log.fatal(message);

	}

	public static void debug(String message) {

		Log.debug(message);

	}
}
