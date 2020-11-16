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

public class Activity16_1 {
	WebDriver driver;
	  
   @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }
   @Test
   public void testCase1()
   {
	   String Title =driver.getTitle();
	   System.out.println(Title);
	   Assert.assertEquals("Target Practice", Title);
   }
   
   @Test
   public void testCase2()
   {
	//WebElement button =   driver.findElement(By.className("Black"));
	WebElement button =   driver.findElement(By.cssSelector("button.black"));
	Assert.assertTrue(button.isDisplayed());
	   Assert.assertEquals("Black",button.getText());
   }
     
   @Test
   public void testCase3() {
	 throw new SkipException("Skipping test case");  
   }
	
   @Test(enabled = false)
	public void testCase4() {
	//This test will be skipped and not counted
	 String subHeading = driver.findElement(By.className("sub")).getText();
	 Assert.assertTrue(subHeading.contains("Practice"));
	
   }
	
   
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
