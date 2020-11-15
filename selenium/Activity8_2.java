package Session8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Activity8_2 {
	  public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  
		  driver.get("https://training-support.net/selenium/ajax");
		  String title = driver.getTitle();
	 	   System.out.println(title);
	 	   
	 	   
	 	    driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
	        //Wait for text to load
	 	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
	        //getText() and print it
	 		String ajaxText1 = driver.findElement(By.id("ajax-content")).getText();
	 		System.out.println(ajaxText1);
	 		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
			 String lateText = driver.findElement(By.id("ajax-content")).getText();
			 System.out.println(lateText);
			 driver.close();
	  }	  
}
