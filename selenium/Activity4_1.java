package Session4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.training-support.net");
		        String title = driver.getTitle();
			       //Print the title of the page
			      System.out.println("Page title is: " + title);
			      driver.findElement(By.xpath("//a[@id=\"about-link\"]")).click();
			      //		        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();	 	
			      driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();    
			  	  System.out.println("Heading is: " + driver.getTitle());	
			        //Close the browser				
			        driver.close();
			      
	}

}
