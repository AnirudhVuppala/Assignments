package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import locators.CommonLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class RegistrationPage {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openRegistrationPage() {
        driver.findElement(CommonLocators.registerLink).click();
    }
    public void fillForm(String fName, String lName, String addr, String cityName, String stateName,
                         String zip, String phoneNum, String ssnNum, String user, String pass) {
        driver.findElement(CommonLocators.firstName).sendKeys(fName);
        driver.findElement(CommonLocators.lastName).sendKeys(lName);
        driver.findElement(CommonLocators.address).sendKeys(addr);
        driver.findElement(CommonLocators.city).sendKeys(cityName);
        driver.findElement(CommonLocators.state).sendKeys(stateName);
        driver.findElement(CommonLocators.zipCode).sendKeys(zip);
        driver.findElement(CommonLocators.phone).sendKeys(phoneNum);
        driver.findElement(CommonLocators.ssn).sendKeys(ssnNum);
        driver.findElement(CommonLocators.username).sendKeys(user);
        driver.findElement(CommonLocators.password).sendKeys(pass);
        driver.findElement(CommonLocators.confirmPassword).sendKeys(pass);
    }
    public void clickRegister() {
        driver.findElement(CommonLocators.registerBtn).click();
    }
    public String getSuccessMessage() {
        return driver.findElement(CommonLocators.successMsg).getText();
    }
    public String createAccount()
    {
        driver.findElement(CommonLocators.openAcc).click();
        WebElement selectele= driver.findElement(CommonLocators.choice);
        Select select = new Select(selectele);
        List<WebElement> el=select.getOptions();
        for(WebElement el1:el)
        {
            if(el1.getText().equalsIgnoreCase("Savings"))
            {
                el1.click();
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div input[type='button']"))).click();
        String res= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='openAccountResult'] h1[class='title']"))).getText();
        String accno=driver.findElement(By.cssSelector("a[id='newAccountId']")).getText();
        return res+accno;
    }


}
