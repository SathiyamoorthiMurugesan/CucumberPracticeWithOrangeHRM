package com.orangehrm.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orangehrm.base.OrangeHRMBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	OrangeHRMBase base;

	@Before
	public void initializeTest() throws Exception {
		base = new OrangeHRMBase();
		base.launchBrowser();
	}
	
//	@After
//	public void closeBrowser() {
//		base.quitBrowser();
//	}
	
	 @After
	    public void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) OrangeHRMBase.driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	        base.quitBrowser();
	    }
	

}
