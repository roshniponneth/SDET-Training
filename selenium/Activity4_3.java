package Session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4_3 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");

        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

      String thirdheader=  driver.findElement(By.xpath("//*[@id='third-header']")).getText();
      System.out.println(thirdheader);
      
      String fifthheader=  driver.findElement(By.xpath("//h5")).getText();
      System.out.println(fifthheader);
      
      String fifthheadercolor = driver.findElement(By.xpath("//h5")).getCssValue("color");
      System.out.println(fifthheadercolor);
    
      String violetClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
  	  System.out.println("Violet button's classes are: " + violetClasses);
  	  
      String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
      System.out.println(greyButton);
      //Close the browser
      
        driver.close();

    }

}