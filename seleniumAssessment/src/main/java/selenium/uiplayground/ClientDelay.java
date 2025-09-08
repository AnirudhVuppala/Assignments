package selenium.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClientDelay {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/clientdelay");
        driver.findElement(By.cssSelector("[id='ajaxButton']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"content\"] [class='bg-success']")));
        System.out.println(element.isDisplayed());
    }
}
