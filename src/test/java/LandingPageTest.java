import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.LandingPage;

import static driver.driver.getDriver;

public class LandingPageTest extends BaseTest {
    public LandingPage landingPage;

    @BeforeMethod
    public void createLanding() {
        landingPage = new LandingPage();
        landingPage.openPage();
    }
    @Test
    public void pageOpened() {
        String expectedUrl = "http://test.exlab.team/";
        String actualUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertEquals(getDriver().getTitle(), "ExLab Landing");
        landingPage.logoIsVisible();
        System.out.println("________________________\n" +
                "TEST PASSED: website is opened:\n" +
                "- URL is the same\n" +
                "- Title is the same" + "\n" +
                "- Logo is visible\n________________________");
    }
    @Test
    public void landingPageOpensWithDarkTheme() {
        landingPage.checkMiniLogoClass();
        landingPage.checkMenuClass();
        landingPage.checkRightLongImageClass();
        System.out.println("________________________\n" +
                "TEST PASSED: Landing page has a default dark theme");
    }
    @Test
    public void exlabBigLogoIsVisible() { landingPage.bigLogoIsDisplayed(); }
    @Test
    public void menuItemAboutUsIsVisible() {
        landingPage.menuItemAboutUsIsDisplayed();
    }
    @Test
    public void aboutUsMenuLinkOpensCorrectModule() {
        landingPage.clickOnAboutUsMenuItem();
        landingPage.checkAboutUSMenuItemIsClickable();
    }
    @Test
    public void menuItemProjectsIsVisible(){
        landingPage.menuItemProjectsIsDisplayed();
    }
    @Test
    public void projectsMenuLinkOpensCorrectModule() {
        landingPage.clickOnProjectsMenuItem();
        landingPage.checkProjectsMenuItemIsClickable();
    }
    @Test
    public void menuItemMentorsIsVisible(){ landingPage.menuItemMentorsIsDisplayed(); }
    @Test
    public void menuItemMentorsOpensCorrectModule(){
        landingPage.clickOnMentorsMenuItem();
        landingPage.checkMentorsMenuItemIsClickable();
    }
    @Test
    public void menuItemStartUpIsVisible(){ landingPage.startUpMenuItemIsDisplayed(); }
    @Test
    public void menuItemStartUpOpensCorrectModule(){
        landingPage.clickOnStartUpMenuItem();
        landingPage.checkStarUpMenuItemIsClickable();
    }
    @Test
    public void buttonSunIconIsVisible(){ landingPage.sunIconIsDisplayed(); }
    @Test
    public void clickOnSunIconChangeBackgroundColour(){
        String backgroundColorOne = landingPage.getBackgroundColor();
        landingPage.clickOnSunIcon();
        String backgroundColorTwo = landingPage.getBackgroundColor();
        Assert.assertNotEquals(backgroundColorTwo, backgroundColorOne, "Colour is not changed");
        landingPage.clickOnSunIcon();
        String backgroundColorThree = landingPage.getBackgroundColor();
        Assert.assertNotEquals(backgroundColorThree, backgroundColorTwo, "Colour is not changed");
    }
    @Test
    public void joinButtonIsVisible(){ landingPage.joinButtonIsDisplayed(); }
    @Test
    public void clickOnJoinButtonInvitesToTelegramBot(){
        landingPage.clickOnJoinButton();
        landingPage.switchToBotTab();
        landingPage.botNameIsDisplayed();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://t.me/ExLab_registration_bot");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on join button invites to tg bot");
    }
    @Test
    public void aboutUsTitleIsVisible(){ landingPage.aboutUsTitleIsDisplayed(); }
    @Test
    public void aboutUsTextIsVisible(){ landingPage.aboutUsTextIsDisplayed(); }
    @Test
    public void whyExlabTitleIsVisible(){ landingPage.whyExlabTitleIsDisplayed(); }
    @Test
    public void whyExlabTextIsVisible(){ landingPage.whyExlabTextIsDisplayed(); }
    @Test
    public void secondJoinButtonIsVisible(){ landingPage.secondJoinButtonIsDisplayed(); }
    @Test
    public void clickOnSecondJoinButtonInvitesToTelegramBot(){
        landingPage.clickOnSecondJoinButton();
        landingPage.switchToBotTab();
        landingPage.botNameIsDisplayed();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://t.me/ExLab_registration_bot");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on second join button invites to tg bot");
    }
    @Test
    public void projectsTitleIsVisible(){ landingPage.projectTitleIsDisplayed(); }
    @Test
    public void projectExlabLogoIsVisible() { landingPage.exlabProjectLogoIsDisplayed(); }
    @Test
    public void projectHealthLogoIsVisible() { landingPage.healthProjectLogoIsDisplayed();}
    @Test
    public void projectEasyHelpLogoIsVisible() { landingPage.easyHelpLogoIsDisplayed(); }
    @Test
    public void projectExlabTextIsVisible() { landingPage.exlabProjectTextIsDisplayed(); }
    @Test
    public void projectHealthTextIsVisible() { landingPage.healthProjectTextIsDisplayed(); }
    @Test
    public void projectEasyHelpTextIsVisible() { landingPage.easyHelpTextIsDisplayed(); }
    @Test
    public void mentorsTitleIsVisible() { landingPage.mentorsTitleIsDisplayed(); }
    @Test
    public void mentorsInfoOpensByClickToPlus(){
        landingPage.scrollToMentorsModule();
        landingPage.clickOnPlus();
        landingPage.checkPlusIconClass();
        landingPage.stanislavHeaderIsDisplayed();
        landingPage.stanislavInfoIsDisplayed();
    }
    @Test
    public void mentorsFotoIsVisible(){
        landingPage.scrollToMentorsModule();
        landingPage.clickOnPlusTwo();
        landingPage.alexandrHeaderIsDisplayed();
        landingPage.alexandrFotoIsDisplayed();
    }
    @Test
    public void mentorsCountIsFour(){
        landingPage.scrollToMentorsModule();
        landingPage.checkMentorsCount();
    }
    @Test
    public void mentorsInfoIsClosedByMinus(){
        landingPage.scrollToMentorsModule();
        landingPage.alexandrHeaderIsDisplayed();
        landingPage.clickOnPlusTwo();
        landingPage.alexandrFotoIsDisplayed();
        landingPage.clickOnPlusTwo();
        landingPage.alexandrFotoIsNotDisplayed();
    }
    @Test
    public void becomeMentorButtonIsVisible(){
        landingPage.scrollToAlexandraHeader();
        landingPage.becomeMentorButtonIsDisplayed();
    }





}
