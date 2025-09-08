package selenium.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.get("http://www.uitestingplayground.com/hiddenlayers");
            driver.findElement(By.cssSelector("[id='greenButton']")).click();
            driver.findElement(By.cssSelector("[id='greenButton']")).click();
        }
}
