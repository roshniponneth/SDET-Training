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

public class CreateJobVacancy {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Login page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
                //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
   
    
    @When("^User enters username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        //Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        //Click Login
        driver.findElement(By.id("btnLogin")).click();
      }
    
    @Then("^Navigate to the vacancies page and add Vacancies$")
    public void addVacancies() {
        //Navigate to the “Recruitment” page
     	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]")));
      driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
      driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
     
   	 //Click on the “Vacancies” menu item to navigate to the vacancies page	 
   	 driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewJobVacancy\"]")).click();
   	 //Click on the “Add” button to navigate to the “Add Job Vacancy” form
   	 driver.findElement(By.id("btnAdd")).click();
   	 WebElement chosen = driver.findElement(By.id("addJobVacancy_jobTitle"));
   	 System.out.println(chosen.getText());      	
        //Find dropdown
    	 Select dropdown = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
        System.out.println(chosen.getText());     
   	 dropdown.selectByVisibleText("DevOps Engineer");
   	 System.out.println(chosen.getText());
   	 	
   	  //Add Vacancy
   	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"addJobVacancy_name\"]")));
   	  driver.findElement(By.id("addJobVacancy_name")).sendKeys("DevOpsTester");
   	  driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys("FirstName LastName");
   	  driver.findElement(By.id("addJobVacancy_noOfPositions")).sendKeys("1");
   	  driver.findElement(By.id("btnSave")).click();
     
      
    }
    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        //driver.close();
    }

}