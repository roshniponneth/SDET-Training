package TestNG_Activities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Activity15 {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }
  @Test
  public void exampleTestCase() {
      // Check the title of the page
	    String title = driver.getTitle();         
	
      //Print the title of the page
	
      System.out.println("Page title is: " + title);
      
      Assert.assertEquals("Training Support", title);
      driver.findElement(By.id("a")).click();
      //Print title of new page
  	  System.out.println("New page title after click: " + driver.getTitle());
  }
  @AfterMethod
  public void afterMethod() {
      //Close the browser
		driver.quit();
  }

}
