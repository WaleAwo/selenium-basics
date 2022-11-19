package locators;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CSSLocatorTest extends Hooks {

    @Test
    public void cssLocatorTest() {

        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.cssSelector("button#btn_one")).click();

    }
}
