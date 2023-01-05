import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.LandingPage;

import static driver.driver.getDriver;

public class LandingPageTest extends BaseTest {
    public LandingPage landingPage;

    @BeforeTest
    public void createLanding() {
        landingPage = new LandingPage();
    }

    @Test
    public void pageOpened() {
        String expectedUrl = "http://test.exlab.team/";
        String actualUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

        Assert.assertEquals(getDriver().getTitle(), "ExLab Landing");

        Assert.assertTrue(landingPage.getLogo().isDisplayed());

        System.out.println("________________________\n" +
                "TEST PASSED: website is opened:\n" +
                "- URL is the same\n" +
                "- Title is the same" + "\n" +
                "- Logo is visible\n________________________");
    }
    @Test
    public void landingPageOpensWithDarkTheme() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.getMiniLogo().getAttribute("class").contains("EnPDN"));
        Assert.assertTrue(landingPage.getMenu().getAttribute("class").contains("iVTdFt"));
        Assert.assertTrue(landingPage.getRightLongImage().getAttribute("class").contains("kjBOCW"));
        System.out.println("________________________\n" +
                "TEST PASSED: Landing page has a default dark theme");
    }

    @Test
    public void exlabBigLogoIsVisible() {
        Assert.assertTrue(landingPage.getBigLogo().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: ExLab big logo is visible");
    }

    @Test
    public void menuItemAboutUsIsVisible() {
        Assert.assertTrue(landingPage.getAboutUs().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'О нас' is visible");
    }

    @Test
    public void menuItemAboutUsHasValidLink() {
        Assert.assertTrue(landingPage.getAboutUs().getAttribute("href").contains("#about"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'О нас' has valid link");
    }

    @Test
    public void menuItemProjectsIsVisible(){
        Assert.assertTrue(landingPage.getProjects().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Проекты' is visible");
    }

    @Test
    public void menuItemProjectsHasValidLink(){
        Assert.assertTrue(landingPage.getProjects().getAttribute("href").contains("#projects"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Проекты' has valid link");
    }

    @Test
    public void menuItemMentorsIsVisible(){
        Assert.assertTrue(landingPage.getMentors().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Менторы' is visible");
    }

    @Test
    public void menuItemMentorsHasValidLink(){
        Assert.assertTrue(landingPage.getMentors().getAttribute("href").contains("#mentors"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Менторы' has valid link");
    }

    @Test
    public void menuItemStartUpIsVisible(){
        Assert.assertTrue(landingPage.getStartUp().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Start Up' is visible");
    }

    @Test
    public void menuItemStartUpHasValidLink(){
        Assert.assertTrue(landingPage.getStartUp().getAttribute("href").contains("#startup"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Start Up' has valid link");
    }

    @Test
    public void buttonSunIconIsVisible(){
        Assert.assertTrue(landingPage.getSunIcon().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Sun Icon is visible");
    }

    @Test
    public void clickOnSunIconChangesTheme(){
        landingPage.clickOnSunIcon();
        Assert.assertTrue(landingPage.getMiniLogo().getAttribute("class").contains("FjAfx"));
        Assert.assertTrue(landingPage.getRightLongImage().getAttribute("class").contains("khsHPC"));
        Assert.assertTrue(landingPage.getMenu().getAttribute("class").contains("eLZoiV"));
        landingPage.clickOnSunIcon();
        System.out.println("________________________\n" +
                "TEST PASSED: Sun Icon changes landing theme");

    }

    @Test
    public void clickOnSunIconChangeBackgroundColour(){
        String blackBackground = landingPage.getBackground().getCssValue("background-color");
        landingPage.clickOnSunIcon();
        String whiteBackground = landingPage.getBackground().getCssValue("background-color");
        Assert.assertNotEquals(whiteBackground, blackBackground, "Colour is not changed");
        landingPage.clickOnSunIcon();
        System.out.println("________________________\n" +
                "TEST PASSED: Sun Icon changes background colour");
    }

}
