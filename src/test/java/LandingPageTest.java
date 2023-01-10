import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.LandingPage;

import static driver.driver.getDriver;

public class LandingPageTest extends BaseTest {
    public LandingPage landingPage;

    @BeforeMethod
    public void createLanding() {
        landingPage = new LandingPage();
    }

    public void isElementDisplayed(WebElement element){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", element);
        Assert.assertTrue(element.isDisplayed());
        System.out.println("Element is visible");
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
        isElementDisplayed(landingPage.getBigLogo());
    }
    @Test
    public void menuItemAboutUsIsVisible() {
        isElementDisplayed(landingPage.getAboutUs());
    }
    @Test
    public void menuItemAboutUsHasValidLink() {
        Assert.assertTrue(landingPage.getAboutUs().getAttribute("href").contains("#about"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'О нас' has valid link");
    }
    @Test
    public void menuItemProjectsIsVisible(){
        isElementDisplayed(landingPage.getProjects());
    }
    @Test
    public void menuItemProjectsHasValidLink(){
        Assert.assertTrue(landingPage.getProjects().getAttribute("href").contains("#projects"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Проекты' has valid link");
    }
    @Test
    public void menuItemMentorsIsVisible(){
        isElementDisplayed(landingPage.getMentors());
    }
    @Test
    public void menuItemMentorsHasValidLink(){
        Assert.assertTrue(landingPage.getMentors().getAttribute("href").contains("#mentors"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Менторы' has valid link");
    }
    @Test
    public void menuItemStartUpIsVisible(){
        isElementDisplayed(landingPage.getStartUp());
    }
    @Test
    public void menuItemStartUpHasValidLink(){
        Assert.assertTrue(landingPage.getStartUp().getAttribute("href").contains("#startup"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Start Up' has valid link");
    }
    @Test
    public void buttonSunIconIsVisible(){
        isElementDisplayed(landingPage.getSunIcon());
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
    @Test
    public void joinButtonIsVisible(){
        isElementDisplayed(landingPage.getJoinButton());
    }
    @Test
    public void clickOnJoinButtonInvitesToTelegramBot(){
        landingPage.clickOnJoinButton();
        landingPage.switchToBotTab();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://t.me/ExLab_registration_bot");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on join button invites to tg bot");
    }
    @Test
    public void aboutUsTitleIsVisible(){
        isElementDisplayed(landingPage.getAboutUsTitle());
    }
    @Test
    public void aboutUsTextIsVisible(){
        isElementDisplayed(landingPage.getAboutUsText());
    }
    @Test
    public void whyExlabTitleIsVisible(){
        isElementDisplayed(landingPage.getWhyExlabTitle());
    }
    @Test
    public void whyExlabTextIsVisible(){
        isElementDisplayed(landingPage.getWhyExlabText());
    }


}
