package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickingButtonsTest extends Hooks {

    @Test
    public void clickingButtonTest() {

        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.id("btn_one")).click();

    }
}
