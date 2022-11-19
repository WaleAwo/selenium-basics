package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SendTextTest extends Hooks {

    @Test
    public void sendTextTest() {

        driver.get("https://www.automationtesting.co.uk/contactForm.html");

        driver.findElement(By.name("first_name")).sendKeys("John");
        driver.findElement(By.name("last_name")).sendKeys("Doe");
        driver.findElement(By.name("email")).sendKeys("jd@jd.com");
        driver.findElement(By.name("message")).sendKeys("new message");
    }
}
