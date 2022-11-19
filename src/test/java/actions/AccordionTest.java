package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccordionTest extends Hooks {

    @Test
    public void accordionTest() {

        driver.get("https://www.automationtesting.co.uk/accordion.html");

        // a for-loop to click each button
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
            driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
        }
    }
}
