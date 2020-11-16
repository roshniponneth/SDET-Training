package TestNG_Activities;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16_2 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void loginTest() {
        //Find the username and password fields
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.id("password")).sendKeys("password");
       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();
       
       //driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
       String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
   	
       Assert.assertEquals("Welcome Back, admin", loginMessage);
	
      
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        //driver.close();
    }
}