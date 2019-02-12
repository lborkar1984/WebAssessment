package com.cucumber.framework.stepdefinition.adduserdetails;

import com.cucumber.framework.PageObject.AddUserDetailsPage;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddUserdetails {
	
	AddUserDetailsPage userPage;
	
	@Given("^navigate to URL$")
	public void navigate_to_URL() throws Throwable {
       TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}
	
	@When("^user click on AddUserDeatils Link$")
	public void user_click_on_AddUserDeatils_Link() throws Throwable {
		userPage= new AddUserDetailsPage(TestBase.driver);
		//userPage.validateAddUserLink();
		userPage.clickOnAddUserLink();
	}

	@When("^enter firstName \"([^\"]*)\"$")
	public void enter_firstName(String firstName) throws Throwable {	  
		userPage.enterFirstName(firstName);
	}

	@When("^enter lastName \"([^\"]*)\"$")
	public void enter_lastName(String lastname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		userPage.enterLastname(lastname);
	}

	@When("^enter username \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		userPage.enterUserName(username);
	}

	@When("^enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {	  
		userPage.enterPassword(password);
	}

	@When("^select customer \"([^\"]*)\"$")
	public void select_customer(String value) throws Throwable {	  
		userPage.selectRadioButton(value);
	}

	@When("^select Role \"([^\"]*)\"$")
	public void select_Role(String role) throws Throwable {	  
		userPage.selectRole(role);
	}

	@When("^enter your email address \"([^\"]*)\"$")
	public void enter_your_email_address(String email) throws Throwable {	  
		userPage.enterEmailAddress(email);
	}

	@When("^Enter mobile phone nymber \"([^\"]*)\"$")
	public void emter_mobile_phone_nymber(String mobileNo) throws Throwable {	 
		userPage.enterMobileNo(mobileNo);
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {	  
		userPage.clickOnSavebtn();
	}


}
