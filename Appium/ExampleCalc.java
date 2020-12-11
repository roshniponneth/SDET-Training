package Appium_Activities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class ExampleCalc {
    AppiumDriver<MobileElement> driver = null;
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
         caps.setCapability("deviceId", "RZ8N81DDXXR");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void multiply() {
        driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05").click();
        driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul").click();
        driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09").click();
        
         // Perform Calculation
        driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal").click();

        // Display Result
        String result = driver.findElementById("com.sec.android.app.popupcalculator:id/calc_edt_formula").getText();
        System.out.println(result);
        Assert.assertEquals(result, "45");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}