package Session11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_2 {
	 public static void main(String[] args) throws InterruptedException {
	    	// Declare new WebDriver
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://www.training-support.net/selenium/javascript-alerts");
	    String title = driver.getTitle();
	    System.out.print("title");
	    
	    driver.findElement(By.xpath("//*[@id='confirm']")).click();
	    
	    Alert  confirmAlert = driver.switchTo().alert();
	   
	    String alertText = confirmAlert.getText();
		 System.out.println("Alert is: " + alertText);
		 
		 confirmAlert.accept();
		 
		 //confirmAlert.dismiss();
		 driver.close();
	    
	    
	 }
}
