package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRM_Create_Product {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^The User Logged into the page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }
   
    @When("^User submit username \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_name")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("username_password")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("bigbutton")).click();
    }
      
    @Then("^Navigate to All -> Products-> Create Product$")
    public void addVacancies() {
        //Navigate to the “Recruitment” page
     	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_5")));
      	  //Navigate to PIM page
      	  driver.findElement(By.id("grouptab_5")).click();	    
      	  driver.findElement(By.id("grouptab_5")).click();

      	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[7]/span[2]/ul/li[25]/a")));
      	   WebElement createProduct= driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul/li[7]/span[2]/ul/li[25]/a"));
      	   createProduct.click();    
      
      	   
      	 //Retrieve information about all the contacts listed in the table
      	// List<WebElement> contactlist =driver.findElements(By.xpath("//table[contains(@class, 'table')]/tbody/tr[1]/td"));
      	//To locate rows of table. 
      		 List<WebElement> rows_table =driver.findElements(By.xpath("//table[contains(@class, 'table')]/tbody/tr"));
      		   		 //To calculate no of rows In table.
      		    	int rows_count = rows_table.size();
      			System.out.println(rows_count);
      			//Loop will execute till the last row of table.
      				for (int row = 0; row < rows_count; row++) {
      		    	    //To locate columns(cells) of that specific row.
      		    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
      		    	    //To calculate no of columns (cells). In that specific row.
      		    	    int columns_count = Columns_row.size();
      		    	    //System.out.println("Number of cells In Row " + row + " are " + columns_count);
      		    	    //Loop will execute till the last cell of that specific row.
      		    	    for (int column = 0; column < columns_count; column++) {
      		    	        // To retrieve text from that specific cell.
      		    	        String celtext = Columns_row.get(column).getText();
      		    	        System.out.println("Row " + row + " and column  " + column + " Is " + celtext);
      		    	    }
      		    	    System.out.println("-------------------------------------------------- ");
      		    	}
           
  	  
  	  }
  	 
        
    
    @And("^Close Browsers$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}