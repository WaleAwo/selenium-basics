package assertions;

import base.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionOneTest extends Hooks {

    @Test
    public void assertionOne() {

        driver.get("https://www.automationtesting.co.uk");

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Homepage");

    }
}
