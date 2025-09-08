package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tooltip {
    public void gettext()
    {
        WebDriver driver= DriverSingleton.getDriver();
        driver.get("https://google.com");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[aria-label='Search by voice'][role='button']")));
        String tooltipText = mic.getAttribute("aria-label");
        System.out.println(tooltipText);
        WebElement lens= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[aria-label='Search by image'][role='button']")));
        String tooltiplens = lens.getAttribute("aria-label");
        System.out.println(tooltiplens);
        driver.close();
//
//        WebElement image= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='lensSearchButton']")));
//        System.out.println(image.getText());

    }
}
