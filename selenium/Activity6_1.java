package Session6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Open browser
        driver.get("https://training-support.net/selenium/tables");

        String title = driver.getTitle();
	       //Print the title of the page
	      System.out.println("Page title is: " + title);
       
	   //  List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')/tbody/tr[1]/td"));
	    // System.out.println("Number of columns are: " + columns.size());
        
	     //List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')/tbody/tr"));
	    // System.out.println("Number of columns are: " + rows.size());
	      List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		  List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		   System.out.println("Number of columns are: " + cols.size());
		    System.out.println("Number of rows are: " + rows.size());
		
	 
	      
	     List<WebElement> thirdrow =driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
	     for (WebElement cellvalue :thirdrow)
	     {
	    	 System.out.println("cellvalue" + cellvalue.getText());
	     }
	     
	     WebElement secondrowsecondcolum =driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
	    	 System.out.println("secondrowsecondcolum" + secondrowsecondcolum.getText());
	     
	     
	     
        //Close browser
        driver.close();
    }
}