package locators;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathLocatorsTest extends Hooks {

    @Test
    public void xpathLocatorsTest() {

        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.xpath("//button[@id='btn_one']")).click();

    }
}
