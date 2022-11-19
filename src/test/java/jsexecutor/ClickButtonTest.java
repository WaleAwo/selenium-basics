package jsexecutor;

import base.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickButtonTest extends Hooks {

    @Test
    public void clickButtonTest() {

        driver.get("https://www.automationtesting.co.uk/contactForm.html");

        driver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys("John");
        driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys("Doe");
        driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("johndoe@gmail.com");
        driver.findElement(By.cssSelector("form#contact_form > textarea[name='message']")).sendKeys("This is some text.");

        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        WebElement reset = driver.findElement(By.cssSelector("[type='reset']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // click one button
        // js.executeScript("arguments[0].click()", submit);

        // click the reset button first, then the submit button
        js.executeScript("arguments[0].click(), arguments[1].click()", reset, submit);
    }
}
