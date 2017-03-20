package io.uday.appium.android.webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class First {

	
	@Test
	public void test () throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/uday/Downloads/chromedriver");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		
		
		try {
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		driver.get("https://in.bookmyshow.com/hyderabad");
		System.out.println(driver.findElementByXPath("//button[@class='btn _uno _active button-now-showing']").getText());
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		
	}
	
}
