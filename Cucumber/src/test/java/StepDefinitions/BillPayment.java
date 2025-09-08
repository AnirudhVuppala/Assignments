package StepDefinitions;

import config.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RegistrationPage;
import utils.DriverFactory;

import java.util.List;
import java.util.Map;

public class BillPayment {
    WebDriver driver= DriverFactory.getDriver();
    RegistrationPage bill;
    @Given("user is logged in with valid data")
    public void userIsLoggedIn(DataTable dataTable) {
        ConfigReader.loadConfig();
        driver.get(ConfigReader.get("baseUrl"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Map<String, String>> data = dataTable.asMaps();
        Map<String, String> row = data.get(0);
        List<WebElement> loginDiv = driver.findElements(By.cssSelector("div.login"));

        if (!loginDiv.isEmpty()) {

            driver.findElement(By.name("username")).sendKeys(row.get("uname"));
            driver.findElement(By.name("password")).sendKeys(row.get("pass"));
            driver.findElement(By.cssSelector("input[value='Log In']")).click();
        } else {
            System.out.println("User is already logged in.");
        }
    }

    @When("user fills the bill payment details")
    public void userFillsTheBillPaymentDetails() {

        driver.findElement(By.cssSelector("a[href='billpay.htm']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> inputs = driver.findElements(By.cssSelector("input"));
        for (WebElement input : inputs) {
            if (!"button".equalsIgnoreCase(input.getAttribute("type"))) {
                input.sendKeys("1");
            }else  {
                input.click();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.findElement(By.cssSelector("div[id='billpayResult']")).getText());



    }
}
