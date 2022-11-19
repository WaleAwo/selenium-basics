package actions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PopupTest extends Hooks {

    @Test
    public void popupTest() {

        driver.get("https://www.automationtesting.co.uk/popups.html");
        driver.findElement(By.cssSelector("button[onclick='popup()']")).click();

        // store window handles
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

        // switch to and close pop-up
        driver.switchTo().window(windows.get(1));
        driver.close();

        // switch to 1st window
        driver.switchTo().window(windows.get(0));

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Pop Ups");

    }
}
