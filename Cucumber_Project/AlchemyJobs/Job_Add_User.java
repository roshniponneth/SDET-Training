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

public class Job_Add_User {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on login page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }
    
    @When("^User Enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_login")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("user_pass")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("wp-submit")).click();
    }

    @Then("^Locate Add Button and Click$")
    public void addButton() {
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-users\"]")));
 driver.findElement(By.id("menu-users")).click();
 driver.findElement(By.id("menu-users")).click();       
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("a[@href ='user-new.php']")));
 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[11]/ul/li[3]/a")).click();
 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[11]/ul/li[3]/a")).click();

 driver.findElement(By.id("user_login")).sendKeys("user1");
 driver.findElement(By.id("email")).sendKeys("user1@mail.com");
 driver.findElement(By.id("first_name")).sendKeys("first");
 driver.findElement(By.id("last_name")).sendKeys("lastname");
 driver.findElement(By.id("url")).sendKeys("www.user1.com");
 driver.findElement(By.id("createusersub")).click();

     }
    
    @And("^Close theBrowser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}