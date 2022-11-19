package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RadioButtonTest extends Hooks {

    @Test
    public void radioButtonTest() {

        driver.get("https://www.automationtesting.co.uk/dropdown.html");

        // use the "label" tag to interact with radio buttons
        driver.findElement(By.xpath("//label[normalize-space()='One']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Two']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Three']")).click();

    }
}
