package Session9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Activity9_2 {
	public static void main(String[] arg)
	{
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	driver.get("https://training-support.net/selenium/dynamic-attributes");
	  String title = driver.getTitle();
 	   System.out.println(title);
 	    driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("admin");
	     driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
	     driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Password");
	    driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("real_email@xyz.com");
	    driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();	      
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		 System.out.println("Login message: " + loginMessage);       
		
	        //Close browser
		
	        driver.close();
	        
	}
}
