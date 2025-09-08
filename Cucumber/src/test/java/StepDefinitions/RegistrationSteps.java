package StepDefinitions;

import config.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.RegistrationPage;
import utils.DriverFactory;

import java.util.List;
import java.util.Map;

public class RegistrationSteps {
    WebDriver driver=DriverFactory.getDriver();
    RegistrationPage registrationPage;

    @When("user goes to the bank page")
            public void userGoesToTheBankPage()
    {

        ConfigReader.loadConfig();
        driver.get(ConfigReader.get("baseUrl"));
    }
    @When("user is on the registration page")
    public void navigateToRegistrationPage() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.openRegistrationPage();
    }
    @Then("user fills the registration form with valid data")
    public void fillRegistrationForm(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
        Map<String, String> row = data.get(0);

                registrationPage.fillForm(
                        row.get("firstName"),
                        row.get("lastName"),
                        row.get("address"),
                        row.get("city"),
                        row.get("state"),
                        row.get("zip"),
                        row.get("phone"),
                        row.get("ssn"),
                        row.get("username"),
                        row.get("password")
                );


    }

    @And("user clicks on register button")
    public void clickOnRegisterButton() {
        registrationPage.clickRegister();
    }

    @Then("user will see registration success message")
    public void verifyRegistrationSuccessMessage() {
        String message = registrationPage.getSuccessMessage();
        System.out.println(message);
        Assert.assertTrue(message.contains("Your account was created successfully"), "Registration failed!");
    }

    @Then("user creates a savings account")
    public void userCreatesASavingsAccount() {
        String ans=registrationPage.createAccount();
        System.out.println(ans);


    }
}
