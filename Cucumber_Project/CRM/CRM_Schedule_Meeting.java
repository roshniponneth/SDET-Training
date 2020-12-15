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

public class CRM_Schedule_Meeting {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^The User Logged into page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }
   
    @When("^User submit \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_name")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("username_password")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("bigbutton")).click();
    }
      
    @Then("^Navigate to Activities -> Meetings -> Schedule a Meeting$")
    public void addVacancies() {
        //Navigate to the “Recruitment” page
     	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_3")));
      	  //Navigate to PIM page
      	  driver.findElement(By.id("grouptab_3")).click();	    
      	  driver.findElement(By.id("grouptab_3")).click();
      
      	wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Meetings")));
        WebElement clickMeeting = driver.findElement(By.id("moduleTab_9_Meetings"));
        clickMeeting.click();
       
  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/ul/li[1]/a/div[2]")));
        WebElement clickSchedule = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/ul/li[1]/a/div[2]"));
        clickSchedule.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
           
        driver.findElement(By.id("name")).sendKeys("Meeting Room1");
        driver.findElement(By.id("description")).sendKeys("Meeting Room");
       driver.findElement(By.id("invitees_search")).click();
     
      
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("SAVE_HEADER")));
	    driver.findElement(By.id("SAVE_HEADER")).click();
  	  
  	  
  	  }
  	 
        
    
    @And("^CloseOpened Browser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}