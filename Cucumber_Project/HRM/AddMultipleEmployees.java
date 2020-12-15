package stepDefinitions;

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

public class AddMultipleEmployees{
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User Login to page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
   
    
    @When("^User enter username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        //Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        //Click Login
        driver.findElement(By.id("btnLogin")).click();
      }
    
    @Then("^Click the Add button to add a new Employee$")
    public void addEmployees() {
      //Wait for the PIM menu
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewPimModule")));
  	  //Navigate to PIM page
  	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
  	  //Wait for the AddEmployee menu
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_addEmployee")));
  	  //launch the addEmployee page
  	  driver.findElement(By.id("menu_pim_addEmployee")).click();
  	 //Fill required employee details
  	  driver.findElement(By.id("firstName")).sendKeys("Roshni");
  	  driver.findElement(By.id("lastName")).sendKeys("Ponneth");
  	  WebElement checkbox= driver.findElement(By.id("chkLogin"));
  	  if (!checkbox.isSelected())
  		  checkbox.click();
  	 driver.findElement(By.id("user_name")).sendKeys("rosh.ponneth");
  	 driver.findElement(By.id("user_password")).sendKeys("password@123");
 	 driver.findElement(By.id("re_password")).sendKeys("password@123");
 	   	
   	 driver.findElement(By.id("btnSave")).click();
     
      
      
     
      
    }
    @And("^Close opened Browser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}