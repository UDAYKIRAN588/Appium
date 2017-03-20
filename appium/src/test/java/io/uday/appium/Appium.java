package io.uday.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {
	
	 
    @Test
	public void testing() throws MalformedURLException, InterruptedException {
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	File f1 = new File("/Users/uday/Desktop");
    	File app = new File( f1,"BookMyShow–Movie.apk");
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0"); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		capabilities.setCapability(MobileCapabilityType.APP, app);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserName.FF);
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
		Thread.sleep(3000);
//		
//							      // com.bt.bms:id/language_text_view_label
//		System.out.println("next");
//		driver.findElementById("com.bt.bms:id/launcher_tv_for_signup").click();
//		System.out.println("signup");
//		 List<WebElement> editElement =driver.findElementsByClassName("android.widget.EditText");
//		 editElement.get(0).sendKeys("uday");
//		System.out.println(editElement.size());
		driver.findElementById("com.bt.bms:id/language_text_view_label").click();
		driver.findElementById("com.bt.bms:id/launcher_tv_for_skip").click();
		driver.findElementById("com.bt.bms:id/btn_positive").click();
		
		//Mobile Element
		MobileElement mobiEle = (MobileElement)driver.findElementById("com.bt.bms:id/polular_location_recyclerview_adapter_rl");
		
		// Gesture's
		mobiEle.swipe(SwipeElementDirection.UP, 3000);
		
		
		
		
	}

}
