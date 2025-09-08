package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Nba {
    public void trial() throws InterruptedException {
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("https:nba.com/warriors");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String originalWindow = driver.getWindowHandle();

        WebElement xButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'hover:cursor-pointer') and text()='x']")));

        xButton.click();
        WebElement shopLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[span[text()='Shop']]")));
        shopLink.click();
        wait.until(driver1 -> driver1.getWindowHandles().size() > 1);
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement menLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Men']")
        ));
        menLink.click();
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        List<String> filters = List.of(
                "Hoodies & Sweatshirts",
                "Big & Tall",
                "5XT",
                "Hoodies",
                "Vintage Clothing",
                "Mitchell & Ness",
                "Sale Items"
        );

        for (String filter : filters) {
            clickFilter(driver, wait, filter);
            Thread.sleep(1000);
        }
        List<WebElement> elements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div[class*='product-image-container']")));
        elements.get(0).click();

        WebElement shirt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='product-title-container']")));
        System.out.println(shirt.getText());

    }
    private void clickFilter(WebDriver driver, WebDriverWait wait, String filterText) {
        List<WebElement> filterElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a.facet-link span")));

        for (WebElement el : filterElements) {
            if (el.getText().trim().equalsIgnoreCase(filterText)) {
                wait.until(ExpectedConditions.elementToBeClickable(el)).click();
                break;
            }
        }

    }
}
