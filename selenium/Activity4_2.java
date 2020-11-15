package Session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
	     System.out.println("Page title is: " + title);
	  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Roshni");
	  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Roshni");
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Roshni");
	  driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9999");
	  driver.findElement(By.xpath("//textarea")).sendKeys("This is message");
      driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	   // WebElement lastName =  driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	}

}
