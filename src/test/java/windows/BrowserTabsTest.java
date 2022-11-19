package windows;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BrowserTabsTest extends Hooks {

    @Test
    public void browserTabsTest() {

        driver.get("https://www.automationtesting.co.uk/browserTabs.html");

        // click the 'open tab' button 3 times
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector("form[target='_blank'] > input[value='Open Tab']")).click();
        }

        // store all opened windows handles into a list + print number of windows
        ArrayList<String> windowsHandles = new ArrayList<>(driver.getWindowHandles());
        System.out.println("Number of window handles: " + windowsHandles.size());

        // click each window
        for (String windowHandle : windowsHandles) {
            driver.switchTo().window(windowHandle);
        }

        // switch to parent window
        driver.switchTo().window(windowsHandles.get(0));
    }
}
