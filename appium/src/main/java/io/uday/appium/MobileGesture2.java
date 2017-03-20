package io.uday.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileGesture2 {
	
	
	@Test
	public void testing() {
		try {
		
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
			System.out.println(driver.getContext());
			System.out.println(driver.isLocked());
			List <WebElement> elements = driver.findElements(By.className("android.widget.TextView"));
			TouchAction actions = new TouchAction(driver);
			actions.tap(elements.get(2)).perform();
			driver.closeApp();
		
		
		
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
