package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertsTest extends Hooks {

    @Test
    public void alertsTest() {

        driver.get("https://www.automationtesting.co.uk/popups.html");

        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();

        // click OK button
        driver.switchTo().alert().accept();

        // click Cancel button
        // driver.switchTo().alert().dismiss();

    }
}
