package locators;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NameLocatorTest extends Hooks {

    @Test
    public void nameLocatorTest() {

        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        driver.findElement(By.name("first_name")).sendKeys("test");

    }
}
