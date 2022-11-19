package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest extends Hooks {

    @Test
    public void dropdownsTest() {

        driver.get("https://www.automationtesting.co.uk/dropdown.html");

        Select menuItem = new Select(driver.findElement(By.id("cars"))); // Select class for using dropdown
        menuItem.selectByVisibleText("Jeep");
        menuItem.selectByValue("suzuki");
        menuItem.selectByIndex(0);
    }
}
