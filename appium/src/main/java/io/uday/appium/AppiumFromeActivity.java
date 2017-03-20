package io.uday.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumFromeActivity {
	
	@Test
	public void test() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		
		
		
		capabilities.setCapability("appPackage","com.example.android.contactmanager");// apk info 
		capabilities.setCapability("appActivity","com.example.android.contactmanager.ContactManager");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		
	}

}
