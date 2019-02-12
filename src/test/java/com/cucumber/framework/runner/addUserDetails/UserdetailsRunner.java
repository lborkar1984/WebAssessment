package com.cucumber.framework.runner.addUserDetails;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/addUserDetails/AddUserDetails.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class UserdetailsRunner  extends AbstractTestNGCucumberTests {

}
