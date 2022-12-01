package com.orangehrm.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.base.CommonMethods;
import com.orangehrm.base.OrangeHRMBase;

public class LoginPage {
	
	private WebDriver driver;
	OrangeHRMBase base = new OrangeHRMBase();
//	CommonMethods commonMethods = new CommonMethods(driver);
	
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
	
	@FindBy(xpath = "//p[text() = 'Invalid credentials']")
	WebElement invalidCredentialsText;
	
	@FindBy(xpath = "//*[text() = 'Required']")
	WebElement requiredText;
	
	public void launchApplication() {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void loginOrangeHRM() {
		LoginUsername.sendKeys("Admin");
		LoginPassword.sendKeys("admin123");
		SubmitButton.submit();
		
	}
	
	public void loginOrangeHRM(String userName, String pass) {
		LoginUsername.sendKeys(userName);
		LoginPassword.sendKeys(pass);
		SubmitButton.submit();
		
	}
	
	public void validateLoginPage() {
		Assert.assertTrue(LoginUsername.isDisplayed());
//		commonMethods.selectByVisibileTexy(LoginPassword, null);
	}
	
	public void validateUserIsNotLoggedIn() {
		Assert.assertTrue(invalidCredentialsText.isDisplayed());
	}
	
	public void validateRequiredTextOnLoginPage() {
		Assert.assertTrue(requiredText.isDisplayed());
	}

}
