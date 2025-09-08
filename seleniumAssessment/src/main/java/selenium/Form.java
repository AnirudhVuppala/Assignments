package selenium;

import org.openqa.selenium.*;

import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Form {


    public void fill() {
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Ani");
        driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("V");
        driver.findElement(By.cssSelector("input[pattern^='^([a-zA-Z0-9_']")).sendKeys("ani@gmail.com");
        List<WebElement> radio=driver.findElements(By.xpath("//div[@id='genterWrapper']//label[@class='custom-control-label']"));
        for(WebElement ele:radio){
            System.out.println(ele.getText());
            if (ele.getText().equals("Male")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
            }

        }
        By mobile[]=new By[]{By.cssSelector("input[minlength='10']"),By.id("userNumbe")};
        for(By ele:mobile){
            try {
                WebElement e = driver.findElement(ele);
                e.sendKeys("6305020068");
                System.out.println(e);
            }
            catch(Exception e) {
            System.out.println(e.getMessage());
            }
        }
        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbiesCheckbox);
        By pic= new ByChained(By.className("form-file"),By.tagName("input"));
        driver.findElement(pic).sendKeys("/Users/Anirudh.Vuppala/Downloads/random.jpg");
        driver.findElement(By.tagName("textarea")).sendKeys("hello");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class*='css-yk16xz-control']")));
        dropdown.click();

        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id^='react-select'][id$='-input']")));

        inputField.sendKeys("NCR");

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'react-select') and text()='NCR']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
        option.click();
        WebElement abc= driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", abc);
        abc.click();


//        driver.quit();
    }


}
