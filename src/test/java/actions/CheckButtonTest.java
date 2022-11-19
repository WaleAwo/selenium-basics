package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckButtonTest extends Hooks {

    @Test
    public void checkButtonTest() {

        driver.get("https://www.automationtesting.co.uk/buttons.html");
        System.out.println("Is the button enabled? " + driver.findElement(By.id("btn_four")).isEnabled());
    }
}
