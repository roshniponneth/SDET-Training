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

public class CRM_Create_Lead {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User Logged into page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }
   
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_name")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("username_password")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("bigbutton")).click();
    }
      
    @Then("^Navigate to Sales Leads Create Lead$")
    public void addVacancies() {
        //Navigate to the “Recruitment” page
     	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"grouptab_0\"]")));
      	  //Navigate to PIM page
      	  driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();	    
      	  driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
      
      	wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Leads")));
        WebElement clickleads = driver.findElement(By.id("moduleTab_9_Leads"));
   clickleads.click();
   
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"actionMenuSidebar\"]/ul/li[1]/a/div[2]")));
   WebElement createLead= driver.findElement(By.xpath("//*[@id=\"actionMenuSidebar\"]/ul/li[1]/a/div[2]"));
   createLead.click();
   wait.until(ExpectedConditions.elementToBeClickable(By.name("salutation")));
   Select drpdown = new Select(driver.findElement(By.name("salutation")));
   drpdown.selectByVisibleText("Mr.");
   driver.findElement(By.id("first_name")).sendKeys("First1");
   driver.findElement(By.id("last_name")).sendKeys("Last1");
   driver.findElement(By.id("Leads0emailAddress0")).sendKeys("first.last@gmail.com");
   driver.findElement(By.id("SAVE")).click();
   WebElement viewLead = driver.findElement(By.xpath("//*[@id=\"actionMenuSidebar\"]/ul/li[3]/a/div[2]"));
   viewLead.click();
      	
      
    }
    @And("^Close  Opened Browser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}