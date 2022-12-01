package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	private WebDriver driver;
	Actions actions = new Actions(driver);
	
	
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectByVisibileTexy(WebElement ele, String optionName) {
		Select select = new Select(ele);
		select.selectByVisibleText(optionName);
	}
	
	public void scrollToAnElementUsingActions(WebElement ele) {
		actions.moveToElement(ele).build().perform();
	}
	
	public void doubleClickAnElement(WebElement ele) {
		actions.contextClick(ele).build().perform();
	}

}
