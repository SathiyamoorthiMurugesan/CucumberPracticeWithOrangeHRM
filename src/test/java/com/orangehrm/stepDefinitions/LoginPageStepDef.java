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
	
	@When("user enters {string} and {string} and clicks on login button")
	public void user_enters_and_and_clicks_on_login_button(String abc, String bcd) {
		loginPage.loginOrangeHRM(abc, bcd);
	}
	
	@Then ("validate user is not logged into Orange HRM")
	public void validate_user_is_not_logged_into_Orange_HRM() {
		loginPage.validateUserIsNotLoggedIn();
	}
	
	@Then("validate user is able to see required text")
	public void validate_user_is_able_to_see_required_text() {
		loginPage.validateRequiredTextOnLoginPage();
	}
	
}

