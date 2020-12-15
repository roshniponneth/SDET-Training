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

public class AddCandidate {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User Login to the page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
   
    
    @When("^User enter the username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        //Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        //Click Login
        driver.findElement(By.id("btnLogin")).click();
      }
    
    @Then("^Click on the Add button to add candidateinformation$")
    public void addVacancies() {
        //Navigate to the “Recruitment” page
     	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]")));
      driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
      driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
      //Click on the Add button to add candidate information
      driver.findElement(By.id("btnAdd")).click();

 	  driver.findElement(By.id("addCandidate_firstName")).sendKeys("FirstName");
   	  driver.findElement(By.id("addCandidate_lastName")).sendKeys("LastName");
   	  driver.findElement(By.id("addCandidate_email")).sendKeys("firstname@gmail.com");
   	  driver.findElement(By.id("addCandidate_contactNo")).sendKeys("1234");
   	  
   	 WebElement chosen = driver.findElement(By.id("addCandidate_vacancy"));
   	 System.out.println(chosen.getText());      	
        //Find dropdown
    	 Select dropdown = new Select(driver.findElement(By.id("addCandidate_vacancy")));
        System.out.println(chosen.getText());     
   	 dropdown.selectByVisibleText("TEST");
   	 System.out.println(chosen.getText());
   	 driver.findElement(By.id("addCandidate_keyWords")).sendKeys("1");
 	 driver.findElement(By.id("addCandidate_comment")).sendKeys("1");
 	 driver.findElement(By.id("addCandidate_consentToKeepData")).click();
 
   	 driver.findElement(By.id("btnSave")).click();
     
      
      
     
      
    }
    @And("^Close the Opened Browser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}