package Session17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {
	WebDriver driver;
    WebDriverWait wait;
   
	@BeforeMethod
	  public void beforeMethod() {
		  WebDriver driver = new FirefoxDriver();
		  wait = new WebDriverWait(driver, 10);
		  driver.get("https://www.training-support.net/selenium/login-form");
	  }

	
	@Parameters({ "username","password" })
	@Test
	
    public void TestCase(String username, String password) {
	 
		  WebElement usernamefield = driver.findElement(By.id("username"));
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  usernamefield.sendKeys(username);
		  passwordfield.sendKeys(password);
		 
		  
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
     
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	      Assert.assertEquals(loginMessage, "Welcome Back, admin");	  
	}

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }


  }
  