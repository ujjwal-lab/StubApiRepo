/**
 * 
 */
package com.qa.runnerpkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author ujjwal
 *
 */
@CucumberOptions(features = { "src/test/resources/featurefiles" }, glue = { "com.qa.step.def" }, tags = {
		"@testsuite" }, monochrome = true, plugin = { "html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json" })
public class Runner extends AbstractTestNGCucumberTests {

}
