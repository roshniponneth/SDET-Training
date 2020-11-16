package Session11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_3 {
	 public static void main(String[] args) throws InterruptedException {
	    	// Declare new WebDriver
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://www.training-support.net/selenium/javascript-alerts");
	    String title = driver.getTitle();
	    System.out.print("title");
	    
	  driver.findElement(By.xpath("//*[@id='prompt']")).click();
        //driver.findElement(By.cssSelector("button#prompt")).click();
    
	    Alert promptAlert = driver.switchTo().alert();
    	
        String alertText = promptAlert.getText();
	
        System.out.println("Alert text is: " + alertText);
		 
		  promptAlert.sendKeys("Yes, you are!");
		 
		 promptAlert.accept();
		 
		 //confirmAlert.dismiss();
		 //driver.close();
	    
	    
	 }
}
