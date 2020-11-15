package Session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InnerHTMLDemo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://training-support.net");
        
        //Use linkText() to find <a> tag
        WebElement anchorTag = driver.findElement(By.linkText("About Us"));
        //Use getText() to get innerHTML text
        String anchorText = anchorTag.getText();
        //Print the String
        System.out.println("Anchor tag text is: " + anchorText);
        
        //Close browser
        driver.close();
    }
}