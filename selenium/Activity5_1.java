package Session5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
                String title = driver.getTitle();
	       //Print the title of the page
	      System.out.println("Page title is: " + title);
	      
	      WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
	      System.out.println(checkbox.isDisplayed());
	      driver.findElement(By.id("toggleCheckbox")).click();
	        System.out.println("The checkbox Input is displayed: " + checkbox.isDisplayed());
	            //Close the browser
        driver.close();

    }

}