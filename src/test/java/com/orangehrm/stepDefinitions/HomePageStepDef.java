package com.orangehrm.stepDefinitions;

import com.orangehrm.base.OrangeHRMBase;
import com.orangehrm.pages.HomePage;

import io.cucumber.java.en.Then;

public class HomePageStepDef extends OrangeHRMBase {
	
	HomePage homePage = new HomePage(driver);
	
	@Then("user able to see home page of OrangeHRM")
	public void user_able_to_see_home_page_of_orange_hrm() {
		homePage.validateHomePage();
	}

}
