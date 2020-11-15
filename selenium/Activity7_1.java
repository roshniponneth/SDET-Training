package Session7;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7_1 {
    public static void main(String[] args) {
    	 WebDriver driver = new FirefoxDriver();
 	    //Open browser
 	    driver.get("https://training-support.net/selenium/selects");
 	    
        //Chosen option 		
        WebElement chosen = driver.findElement(By.id("single-value"));
        System.out.println(chosen.getText());
         	
        //Find dropdown
    	 Select dropdown = new Select(driver.findElement(By.id("single-select")));
    	 
    	 dropdown.selectByVisibleText("Option 3");
    	 System.out.println(chosen.getText());
    	 
    	 dropdown.selectByValue("2");
     	 System.out.println(chosen.getText());
     	 
     	 dropdown.selectByIndex(6);
     	 System.out.println(chosen.getText());
     	 
     	 boolean value = dropdown.isMultiple();
     	 System.out.println(value);
     	 
     	 dropdown.getFirstSelectedOption();
     	 System.out.println(chosen.getText());
     	 
     	List<WebElement> options = dropdown.getOptions();
     	 for (WebElement option : options)
     	 {
     		 System.out.println("Option: " + option.getText());
     	 }
 	   
     	 driver.close();
    	
    }
}