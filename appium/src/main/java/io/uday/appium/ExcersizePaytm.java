package io.uday.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExcersizePaytm {
	  @Test
		public void testing() throws MalformedURLException, InterruptedException {
	    	
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	    	File f1 = new File("/Users/uday/Downloads");
	    	File app = new File( f1,"base.apk");
	    	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0"); 
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
			capabilities.setCapability(MobileCapabilityType.APP, app);
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
			//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserName.FF);
			AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
			TouchAction action = new TouchAction(driver);
			Thread.sleep(7000);
			action.tap(driver.findElementById("net.one97.paytm:id/btn_language_continue_button")).perform();
			driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
			
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Do It Later\")").click();
			Thread.sleep(7000);
			try {
			driver.swipe(527, 1316, 527, 1311,1000);
			}
			catch (Exception ex){
				 ex.printStackTrace();
			}
			
			driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
			driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Mobile   Prepaid\")").click();
//			
//			List <WebElement> editText = driver.findElementsByClassName("android.widget.EditText");
//			
//			editText.get(0).sendKeys("9966963158");
//			editText.get(1).sen
			driver.findElementById("net.one97.paytm:id/edit_no").sendKeys("9966963158");
			driver.findElementById("net.one97.paytm:id/text_mob_op").click();
			
			//  driver.scrollTo("Vodafone").click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                    + "new UiSelector().text(\"Vodafone\"));").click();
			  Thread.sleep(2000);
			//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Vodafone\")").click();
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Andhra Pradesh\")").click();
			driver.findElementById("net.one97.paytm:id/edit_amount").sendKeys("232");
			driver.findElementById("net.one97.paytm:id/radio_fast_forward").click();
			
			
			
									
}
}
