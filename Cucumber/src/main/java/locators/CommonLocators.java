package locators;

import org.openqa.selenium.By;

public class CommonLocators {
    public static final By registerLink = By.linkText("Register");
    public static final By firstName = By.cssSelector("#cust omer\\.firstName");
    public static final By lastName = By.cssSelector("#customer\\.lastName");
    public static final By address = By.cssSelector("#customer\\.address\\.street");
    public static final By city = By.cssSelector("#customer\\.address\\.city");
    public static final By state = By.cssSelector("#customer\\.address\\.state");
    public static final By zipCode = By.cssSelector("#customer\\.address\\.zipCode");
    public static final By phone = By.cssSelector("#customer\\.phoneNumber");
    public static final By ssn = By.cssSelector("#customer\\.ssn");
    public static final By username = By.cssSelector("#customer\\.username");
    public static final By password = By.cssSelector("#customer\\.password");
    public static final By confirmPassword = By.cssSelector("#repeatedPassword");
    public static final By registerBtn = By.cssSelector("input[value='Register']");
    public static final By successMsg = By.cssSelector("#rightPanel p");
    public static final By openAcc = By.cssSelector("a[href='openaccount.htm']");
    public static final By choice = By.cssSelector("select[id='type']");

}
