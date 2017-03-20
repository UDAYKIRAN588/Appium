package io.uday.appium.android.webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UdemyAutomation {

	@Test
	public void test() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "6000");

		try {
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.get("https://www.udemy.com/");
			driver.findElementByXPath("//*[@id='udemy']/div[2]/div[1]/div[2]/div[2]/form/div/input").sendKeys("Soap UI");
			driver.findElementByXPath("//*[@id='udemy']/div[2]/div[1]/div[2]/div[2]/form/div/input").sendKeys(Keys.ENTER);
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.findElementByXPath("//search-course-card/div/div/div[1]/a/h1").getText());
		
		
		
		
		
		} catch (Exception x) {
			x.printStackTrace();
		}

	}

}
