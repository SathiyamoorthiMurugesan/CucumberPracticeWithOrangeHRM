package com.orangehrm.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase{
	
//	private WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement LoginUsername;

	@FindBy(name = "password")
	WebElement LoginPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;
	
	public void launchApplication() {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	public void loginOrangeHRM() {
		LoginUsername.sendKeys("Admin");
		LoginPassword.sendKeys("admin123");
		SubmitButton.submit();
	}
	
	public void validateLoginPage() {
		Assert.assertTrue(LoginUsername.isDisplayed());
	}
	

}
