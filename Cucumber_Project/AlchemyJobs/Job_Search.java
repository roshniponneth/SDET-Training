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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Job_Search {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^u ser is on login page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }
    
    @When("^User Enters  \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_login")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("user_pass")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("wp-submit")).click();
    }

    @Then("^Find the Keywords search input field$")
    public void addButton() {
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul[1]/li[3]/a")));
 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul[1]/li[3]/a")).click();

 driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
 
 driver.findElement(By.id("search_keywords")).sendKeys("SDET Tester");
 
 
     }
    
    @And("^Close theBrowse$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}