package Session9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Activity9_1 {

	public static void main(String[] arg)
		{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		  
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		  String title = driver.getTitle();
	 	   System.out.println(title);
	 	  
	 	  driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]")).sendKeys("password");
		  //wait.until(elementToBeClickable(By.xpath("//button[@type=\"submit\"]"));
		  WebElement checkbox= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		  wait.until(ExpectedConditions.visibilityOf(checkbox));
		  checkbox.click();
		  //driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
	 			}
}
