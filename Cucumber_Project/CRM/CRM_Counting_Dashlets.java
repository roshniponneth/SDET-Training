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

public class CRM_Counting_Dashlets {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User Log into the page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }
   
    @When("^User entrs \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_name")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("username_password")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("bigbutton")).click();
    }
      
    @Then("^Open the homepage and count the number of the dashlets on the page$")
    public void addVacancies() {
        //Navigate to the “Recruitment” page
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"grouptab_0\"]")));
      	  //Navigate to PIM page
      	  driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
    }
    @And("^Close Browser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}