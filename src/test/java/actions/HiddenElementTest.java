package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HiddenElementTest extends Hooks {

    @Test
    public void hiddenElementTest() {

        driver.get("https://www.automationtesting.co.uk/hiddenElements.html");

        // check element visibility
        System.out.println("Is the hidden paragraph displayed? " +
                driver.findElement(By.xpath("//p[normalize-space()='This paragraph should be hidden.']")).isDisplayed());

        System.out.println("Is the visible paragraph displayed? " +
                driver.findElement(By.xpath("//p[normalize-space()='This is a visible paragraph.']")).isDisplayed());
    }
}
