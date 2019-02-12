package com.cucumber.framework.PageObject;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;



public class AddUserDetailsPage {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(AddUserDetailsPage.class);
	WaitHelper waitHelper;

	@FindBy(xpath = "//button[@class=\"btn btn-link pull-right\"][contains(text(),' Add User')]")
	public WebElement adduserLink;

	@FindBy(xpath = "//input[@name=\"FirstName\"]")
	WebElement firtsname;

	@FindBy(xpath = "//input[@name=\"LastName\"]")
	WebElement lastName;

	@FindBy(xpath = "//input[@name=\"UserName\"]")
	WebElement userName;

	@FindBy(xpath = "//input[@name=\"Password\"]")
	WebElement password;

	@FindBy(xpath = "//input[@name=\"Email\"]")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@name=\"Mobilephone\"]")
	WebElement mobilePhoneNo;

	@FindBy(xpath = "//select[@name=\"RoleId\"]")
	WebElement role;

	@FindBy(xpath = "//input[@name=\"optionsRadios\"]")
	WebElement customerRadioBtn;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"][contains(text(),'Save')] ")
	WebElement savebtn;

	public AddUserDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, adduserLink, ObjectRepo.reader.getExplicitWait());
	}

	public void validateAddUserLink()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//button[@class=\\\"btn btn-link pull-right\\\"][contains(text()")).isDisplayed());
	}
		
		public void clickOnAddUserLink() {
			log.info("Click on add user Link");
			this.adduserLink.click();
		}


		public void enterFirstName(String firstName) {
			log.info("entering firstName.." + firstName);
			this.firtsname.sendKeys(firstName);
		}

		public void enterLastname(String lastname) {
			log.info("entering lastname.." + lastname);
			this.lastName.sendKeys(lastname);
		}

		public void enterUserName(String username) {
			log.info("entering userName.." + userName);
			this.userName.sendKeys(username);
		}

		public void enterEmailAddress(String emailAddress) {
			log.info("entering emailAddress.." + emailAddress);
			this.emailAddress.sendKeys(emailAddress);
		}

		public void enterPassword(String password) {
			log.info("entering password.." + password);
			this.password.sendKeys(password);
		}

		public void enterMobileNo(String mobileNo) {
			log.info("entering emailAddress.." + emailAddress);
			this.mobilePhoneNo.sendKeys(mobileNo);
		}

		public void selectRadioButton(String custvalue ) {
			log.info("selecting mrs checkbox..");
			this.customerRadioBtn.click();
		}

		public void selectRole(String day) {
			List<WebElement> days = driver.findElements(By.xpath("//select[@name='RoleId']/option"));
			Iterator<WebElement> itr = days.iterator();
			while (itr.hasNext()) {
				WebElement c = itr.next();
				String text = c.getText().trim().toString();
				if (text.equals(day)) {
					System.out.println(day);
					c.click();
					break;
				}
			}
		}

		public void clickOnSavebtn() {
			log.info("Click on add user Link");
			this.savebtn.click();
		}

	}
