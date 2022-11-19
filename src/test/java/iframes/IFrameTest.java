package iframes;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class IFrameTest extends Hooks {

    @Test
    public void iFrameTest() {

        driver.get("https://www.automationtesting.co.uk/iframes.html");

        // switch to the 1st iframe
        driver.switchTo().frame(0);
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#sidebar > .toggle")));

        element.click();

        // switch back to parent window
        driver.switchTo().parentFrame();
        driver.findElement(By.cssSelector("div#sidebar > .toggle")).click();

        // switch to the 2nd iframe
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("[aria-label='Play']")).click();

    }
}
