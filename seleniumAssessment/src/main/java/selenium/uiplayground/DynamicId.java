package selenium.uiplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicId {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/dynamicid");
        driver.findElement(By.xpath("//button[text()='Button with Dynamic ID']")).click();
        driver.close(); // assertion
    }
}
