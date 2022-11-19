package misc;

import base.Hooks;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotTest extends Hooks {

    // method to take a screenshot
    public static void takeSnapShot(WebDriver webdriver) throws IOException {

        // take screenshot and stores in variable
        File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./src/main/java/screenshots/ " + timestamp() + ".png"));
    }

    // method to generate a date and time string
    public static @NotNull String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
    }

    @Test
    public void screenshotTest() throws IOException {
        driver.get("http://automationtesting.co.uk/");
        takeSnapShot(driver);
    }
}
