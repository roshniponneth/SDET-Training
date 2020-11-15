package Session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_Lists {

	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    //Open browser
	    driver.get("https://training-support.net/selenium/lists");
	    
	    WebElement unorderedchosen = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/ul/li[1]"));
	    System.out.println(unorderedchosen.getText());
	    
	    WebElement orderedchosen = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/ol/li[1]"));
	    System.out.println(orderedchosen.getText());
	    
	    driver.close();
	}
}

