package selenium.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;

public class Delay {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Load Delay")).click();
        HashSet<String> hs=new HashSet<>();
        hs.add(driver.getWindowHandle());
        for(String i:driver.getWindowHandles()){
            if(!hs.contains(i)){
                driver.switchTo().window(i);
                break;
            }
        }
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("[class='btn btn-primary']")))).isDisplayed());
    }
}
