package Session11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) throws InterruptedException {
    	// Declare new WebDriver
    WebDriver driver = new FirefoxDriver();
    
    driver.get("https://www.training-support.net/selenium/javascript-alerts");
    String title = driver.getTitle();
    System.out.print("title");
    
    driver.findElement(By.xpath("//*[@id='simple']")).click();
    
    Alert  simpleAlert = driver.switchTo().alert();
   
    String alertText = simpleAlert.getText();
	 System.out.println("Alert is: " + alertText);
	 simpleAlert.accept();
	 
	 driver.close();
    
    
    }

}
