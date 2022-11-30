package com.orangehrm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.utilities.PropertyReader;

public class OrangeHRMBase {

	public static WebDriver driver;

	public WebDriver launchBrowser() throws Exception {
		PropertyReader prop = new PropertyReader();
		String browserName = prop.readAProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_107.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Error Message ---->" + "browser name not mentioned properly");
		}

		return driver;
	}

	public void quitBrowser() {
		driver.quit();
	}
	
	public void pause(Integer milliSeconds) {
		try {
			TimeUnit.MICROSECONDS.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
