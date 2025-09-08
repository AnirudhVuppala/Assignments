package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.forgotDetailsPage;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class forgotDetailsSteps {
    WebDriver driver;
    forgotDetailsPage forgotDetailsPage;
    @Given("the user is in login credentials recovery page")
    public void forgotLoginPage(){
        driver= DriverFactory.getDriver();
        forgotDetailsPage=new forgotDetailsPage(driver);
        forgotDetailsPage.forgotLoginPage();
    }
    @When("user enters all the fields require to validate the account")
    public void enterValidationDetails(Map<String,String> hm){
        forgotDetailsPage.enterValidationDetails(hm);
    }
    @And("click on find my login info button")
    public void myLoginInfo(){
        forgotDetailsPage.myLoginInfo();
    }
    @Then("display the user credentials")
    public void displayCredentials(){
        forgotDetailsPage.displayCredentials();
    }
}


