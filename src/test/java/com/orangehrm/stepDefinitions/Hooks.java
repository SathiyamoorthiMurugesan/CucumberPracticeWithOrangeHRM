package com.orangehrm.stepDefinitions;

import org.junit.After;
import org.junit.Before;

import com.orangehrm.base.OrangeHRMBase;

public class Hooks extends OrangeHRMBase {
	
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
