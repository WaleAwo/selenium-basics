package locators;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IDLocatorTest extends Hooks {

    @Test
    public void iDLocatorTest() {

        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.id("btn_one")).click();

    }
}
