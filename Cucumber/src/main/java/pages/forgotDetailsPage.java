package pages;


import io.cucumber.java.it.Ma;
import org.apache.logging.log4j.Logger;
import utils.myLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class forgotDetailsPage {
    WebDriver driver;

    public forgotDetailsPage(WebDriver driver){
        this.driver=driver;
    }
    public void forgotLoginPage(){
        driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
    }
    public void enterValidationDetails(Map<String,String> hm){
        driver.findElement(By.cssSelector("[id=\"firstName\"]")).sendKeys(hm.get("firstName"));
        driver.findElement(By.cssSelector("[id=\"lastName\"]")).sendKeys(hm.get("lastName"));
        driver.findElement(By.cssSelector("[id=\"address.street\"]")).sendKeys(hm.get("street"));
        driver.findElement(By.cssSelector("[id=\"address.city\"]")).sendKeys(hm.get("city"));
        driver.findElement(By.cssSelector("[id=\"address.state\"]")).sendKeys(hm.get("state"));
        driver.findElement(By.cssSelector("[id=\"address.zipCode\"]")).sendKeys(hm.get("zipCode"));
        driver.findElement(By.cssSelector("[id=\"ssn\"]")).sendKeys(hm.get("ssn"));
    }
    public void myLoginInfo(){
        driver.findElement(By.cssSelector("[value=\"Find My Login Info\"]")).click();
    }
    public void displayCredentials(){
        System.out.println(driver.findElements(By.cssSelector("[id=\"rightPanel\"] p")).get(1).getText());
    }
}
