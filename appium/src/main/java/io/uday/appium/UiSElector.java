package io.uday.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UiSElector {

	 @Test
	 	public void test() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	File f1 = new File("/Users/uday/Downloads");
    	File app = new File( f1,"ApiDemos-debug.apk");
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP, app);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserName.FF);
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		 
		
	
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NFC\")").click();
		driver.pressKeyCode(AndroidKeyCode.HOME);
		
		
	}
	
}
