package TestNG_Activities;

import org.testng.annotations.Test;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver driver = new FirefoxDriver();
	
@BeforeMethod
public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
	  }
 
@Test
  public void exampleTestCase() {
	String title = driver.getTitle();         
	System.out.println("Page title is: " + title);
	Assert.assertEquals("Training Support", title);
          
	//Find the clickable link on the page and click it
    //driver.findElement(By.tagName("a")).click();
    WebElement aboutUsButton = driver.findElement(By.linkText("About Us"));
    aboutUsButton.click();
	//Print title of new page
	System.out.println("New page title is: " + driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "About Training Support");
	
  }


  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }
  

}
