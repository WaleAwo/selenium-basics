package misc;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClearCookiesTest extends Hooks {

    @Test
    public void clearCookiesTest() {

        driver.get("http://teststore.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();

        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("iamjohndoe@test.com");

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("iamjohndoe");

        driver.findElement(By.cssSelector("button#submit-login")).click();

        driver.findElement(By.linkText("CLOTHES")).click();

        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();

        driver.findElement(By.cssSelector("[data-button-action]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart-content-btn [data-dismiss]")));
        driver.findElement(By.cssSelector(".cart-content-btn [data-dismiss]")).click();

        driver.manage().deleteAllCookies(); // clear cookies
    }
}
