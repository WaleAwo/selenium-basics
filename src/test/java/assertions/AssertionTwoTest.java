package assertions;

import base.Hooks;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTwoTest extends Hooks {

    @Test
    public void assertionTwoTest() {

        driver.get("https://www.automationtesting.co.uk");

        driver.findElement(By.linkText("TEST STORE")).click();
        driver.findElement(By.cssSelector("[data-id-product='1'] .product-thumbnail")).click();
        driver.findElement(By.cssSelector("[data-button-action]")).click();

        var amount = driver.findElement(By.cssSelector(".product-total .value")).getText();

        Assert.assertEquals(amount, "$26.12");
    }
}
