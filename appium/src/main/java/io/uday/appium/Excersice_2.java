package io.uday.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Excersice_2 {
	
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
		
		capabilities.setCapability("appPackage","com.whatsapp");//org.gamatech.androidclient.app
		capabilities.setCapability("appActivity","Main");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		TouchAction longPress = new TouchAction(driver);
		Thread.sleep(2000);
		longPress.longPress(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Ram Charan\")")).perform();
		System.out.println("cqecqecwec "+driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Ram Charan\")").getTagName());
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
	}

}
