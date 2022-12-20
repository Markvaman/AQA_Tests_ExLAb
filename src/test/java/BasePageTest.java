import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.BasePage;

import static driver.driver.*;

public class BasePageTest {

    public BasePage basePage;

    @BeforeTest
    public void start () {
        createDriver();
        basePage = new BasePage();
        basePage.open();

    }

    @AfterTest
    public void finish() {
        quite();
    }

    @Test
    public void pageOpened() {

        String expectedUrl = "http://test.exlab.team/";
        String actualUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

        Assert.assertEquals(getDriver().getTitle(), "ExLab Landing");

        Assert.assertTrue(basePage.logo.isDisplayed());





        System.out.println("________________________\n" +
                "TEST PASSED: website is opened:\n" +
                "- URL is the same\n" +
                "- Title is the same" + "\n" +
                "- Logo is visible\n________________________");
    }

}
