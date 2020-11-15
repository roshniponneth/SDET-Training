package Session3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/selenium/simple-form");
    
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	
	WebElement FirstName = driver.findElement(By.id("firstName"));
	WebElement LastName = driver.findElement(By.id("lastName"));
	FirstName.sendKeys("Roshni");
	LastName.sendKeys("Ponneth");
	
	 driver.findElement(By.id("email")).sendKeys("roshni@gmail");
	 driver.findElement(By.id("number")).sendKeys("1234567890");
	  
	 driver.findElement(By.cssSelector(".green")).click();
	//driver.close();	 
}
	
}
