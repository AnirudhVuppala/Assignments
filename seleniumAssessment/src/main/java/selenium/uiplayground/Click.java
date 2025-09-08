package selenium.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/click");
        WebElement button=driver.findElement(By.cssSelector("[id='badButton']"));
        Actions actions=new Actions(driver);
        button.click();
        actions.moveToElement(button).click().perform();
    }
}
