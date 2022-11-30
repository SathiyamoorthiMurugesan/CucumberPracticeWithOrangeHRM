package com.orangehrm.stepDefinitions;

import com.orangehrm.base.OrangeHRMBase;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends OrangeHRMBase{

	LoginPage loginPage = new LoginPage(driver);
	
	
	@Given("user launches OrangeHRM page")
	public void user_launches_orange_hrm_page() {
		loginPage.launchApplication();
	}
	@Then("validate user is on login page")
	public void validate_user_is_on_login_page() {
		loginPage.validateLoginPage();
	}
	@When("user enters username and password and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button() {
		loginPage.loginOrangeHRM();
	}
	

	
}

