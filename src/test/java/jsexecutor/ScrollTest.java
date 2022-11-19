package jsexecutor;

import base.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollTest extends Hooks {

    @Test
    public void scrollTest() {

        driver.get("https://www.automationtesting.co.uk");

        // scroll down 300 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

    }
}
