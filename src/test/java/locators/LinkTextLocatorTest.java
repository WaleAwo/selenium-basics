package locators;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LinkTextLocatorTest extends Hooks {

    @Test
    public void linkTextLocatorTest() {

        driver.get("https://www.automationtesting.co.uk");
        driver.findElement(By.linkText("ACTIONS")).click(); // linkText word is case-sensitive

    }
}
