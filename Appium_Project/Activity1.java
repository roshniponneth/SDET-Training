package Appium_Project;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
  @Test
	  public void task() throws InterruptedException, IOException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceId", "RZ8N81DDXXR");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");

	        // Instantiate Appium Driver
	        AppiumDriver<MobileElement> driver = null;
	        try {
	            // Initialize driver
	            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	            System.out.println("Google Task is open");
	        } catch (MalformedURLException e) {
	            System.out.println(e.getMessage());
	        }
	        
	      	        MobileElement startButton = driver.findElementById("com.google.android.apps.tasks:id/welcome_get_started");
		        startButton.click();
			        startButton.click();
	 
	    }
  }

