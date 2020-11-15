package Session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trial1 {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		 driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		 System.out.println("Heading is: " + driver.getTitle());
	     driver.close();	
			}

}
