package Session8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleDynamicElements {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
	       //Print the title of the page
	      System.out.println("Page title is: " + title);

	        //Close the browser				
	        driver.close();
	      
}

}
