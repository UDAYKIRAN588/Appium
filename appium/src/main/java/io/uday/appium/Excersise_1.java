package io.uday.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import java.util.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Excersise_1 {
	 @Test
		public void test() throws MalformedURLException, InterruptedException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
	    	File f1 = new File("/Users/uday/Desktop/");
	    	File app = new File( f1,"base.apk");
	    	
	    	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0"); 
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
			capabilities.setCapability(MobileCapabilityType.APP, app);
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
			
			//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserName.FF);
			AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
			
			
			Thread.sleep(4000);
			driver.findElementById("com.raaga.android:id/skip_text").click();
			TouchAction action = new TouchAction(driver);
			// getting by google account 
		
			Thread.sleep(1000);
			action.tap((WebElement)driver.findElementById("com.raaga.android:id/landing_google_log_lay")).perform();
			Thread.sleep(1000);
			
			
			List<WebElement>  elements = driver.findElementsByClassName("android.widget.TextView");
			
			for (WebElement e : elements) {
				
				if(e.getText().contains("y.udayk3@gmail.com"))
				{
					e.click();
					System.out.println("element clicked");
					break;
				}
			}
		}

}
