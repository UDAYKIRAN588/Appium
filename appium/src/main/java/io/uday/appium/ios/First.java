package io.uday.appium.ios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class First {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	//File f1 = new File("/Users/uday/Desktop/");
    	File app = new File("/Users/uday/Downloads/UICatalog.app");
    	//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iphone 6");
		capabilities.setCapability(MobileCapabilityType.APP, app);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserName.FF);
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		
		
	}

}
