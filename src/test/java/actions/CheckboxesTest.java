package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckboxesTest extends Hooks {

    @Test
    public void checkboxesTest() {

        driver.get("https://www.automationtesting.co.uk/dropdown.html");

        System.out.println("Is the green checkbox ticked? " + driver.findElement(By.id("cb_green")).isSelected());
        System.out.println("Is the red checkbox ticked? " + driver.findElement(By.id("cb_red")).isSelected());

    }
}
