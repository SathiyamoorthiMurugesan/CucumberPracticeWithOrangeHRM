package com.orangehrm.stepDefinitions;

import com.orangehrm.base.OrangeHRMBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	OrangeHRMBase base;

	@Before
	public void initializeTest() throws Exception {
		base = new OrangeHRMBase();
		base.launchBrowser();
	}
	
	@After
	public void closeBrowser() {
		base.quitBrowser();
	}
	

}
