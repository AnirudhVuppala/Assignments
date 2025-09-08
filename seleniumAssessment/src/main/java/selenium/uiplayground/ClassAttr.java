package selenium.uiplayground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAttr {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/classattr");
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
}
