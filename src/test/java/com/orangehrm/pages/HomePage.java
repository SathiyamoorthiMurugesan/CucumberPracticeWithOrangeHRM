package com.orangehrm.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.base.OrangeHRMBase;
public class HomePage {
	
	private WebDriver driver;
	OrangeHRMBase base = new OrangeHRMBase();
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h6[text() = 'Dashboard']")
	WebElement dashboardText;
	
	public void validateHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(dashboardText));
		System.out.println(dashboardText.getText()+"^^^^^^^^^^^^^^^^");
		Assert.assertEquals(dashboardText.getText(), "Dashboard");
	}
}
