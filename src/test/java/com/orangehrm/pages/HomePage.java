package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;
public class HomePage {
	
	private WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h6[text() = 'Dashboard']")
	WebElement dashboardText;
	
	public void validateHomePage() {
		Assert.assertEquals(dashboardText.getText(), "Dashboard");
	}
}
