package Appium_Project;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class GoogleChrome_ToDoList {
    WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RZ8N81DDXXR");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
     
    }

    @Test
    public void scrollIntoViewTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Open page    	
        driver.get("https://www.training-support.net/selenium");
        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Selenium']").getText();
        System.out.println("Title on Homepage: " + pageTitle);
    
       	// Scroll element into view and click it
    	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"To-Do List Elements get added at run time\"]")));
       	
     // driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollIntoView(text(\"Tab Opener\"))")).click();   	
  //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollIntoView(text(\"To-Do List Elements\"))")).click();
	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollable(true).instance(0).scrollIntoView(textContains(\"To-Do List\"))")).click();	  


    }

    @AfterTest
    public void tearDown() {
       // driver.quit();
    }
}