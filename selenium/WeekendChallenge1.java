package Session9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class WeekendChallenge1 {
	public static void main(String[] arg)
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	 String title = driver.getTitle();
	   System.out.println(title);
	   WebElement inputtext= driver.findElement(By.xpath("//input[@type=\"text\"]"));
	   inputtext.sendKeys("Cheese");
	   WebElement search= driver.findElement(By.xpath("//svg[contains(viewBox=\"0 0 24 24\"]"));
	   search.click();
	   
	}
	
}
