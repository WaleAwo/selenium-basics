package travelwebsite;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OriginDestinationTest extends Hooks {

    @Test
    public void partOneTest() {

        driver.get("https://www.easyjet.com/en/");

        WebElement cookieBanner = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id("ensCloseBanner")));

        cookieBanner.click();

        driver.findElement(By.cssSelector("input[name='origin']")).clear();
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");

        // store all web elements matching css selector
        List<WebElement> origins = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("#ui-id-1 li>a>span")));

        // loop through all items and click matching item
        for (WebElement origin : origins) {
            if (origin.getText().contains("Luton")) {
                origin.click();
            }
        }

        driver.findElement(By.cssSelector("input[name='destination']")).clear();
        driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("a");

        List<WebElement> destinations = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("#ui-id-2 li>a>span")));

        for (WebElement destination : destinations) {
            if (destination.getText().contains("Antalya")) {
                destination.click();
            }
        }
    }
}
