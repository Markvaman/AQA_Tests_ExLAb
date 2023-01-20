import org.testng.Assert;
import org.testng.annotations.Test;

import static driver.driver.getDriver;

public class LandingPageTest extends BaseTest {

    @Test
    public void pageOpened() {
        String expectedUrl = "http://test.exlab.team/";
        String actualUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertEquals(getDriver().getTitle(), "ExLab Landing");
        Assert.assertTrue(landingPage.logoIsVisible());
        System.out.println("________________________\n" +
                "TEST PASSED: website is opened:\n" +
                "- URL is the same\n" +
                "- Title is the same" + "\n" +
                "- Logo is visible\n________________________");
    }
    @Test
    public void landingPageOpensWithDarkTheme() {
        Assert.assertTrue(landingPage.getMiniLogoClass().contains("EnPDN"));
        Assert.assertTrue(landingPage.getMenuClass().contains("iVTdFt"));
        Assert.assertTrue(landingPage.getRightLongImageClass().contains("kjBOCW"));
        System.out.println("________________________\n" +
                "TEST PASSED: Landing page has a default dark theme");
    }
    @Test
    public void exlabBigLogoIsVisible() {
        Assert.assertTrue(landingPage.bigLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Big Exlab logo is displayed");}
    @Test
    public void menuItemAboutUsIsVisible() {
        Assert.assertTrue(landingPage.menuItemAboutUsIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item About us is displayed");
    }
    @Test
    public void aboutUsMenuLinkOpensCorrectModule() {
        landingPage.clickOnAboutUsMenuItem();
        Assert.assertTrue(landingPage.checkAboutUSMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item About Us guids to About us module");
    }
    @Test
    public void menuItemProjectsIsVisible(){
        Assert.assertTrue(landingPage.menuItemProjectsIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Projects is displayed");
    }
    @Test
    public void projectsMenuLinkOpensCorrectModule() {
        landingPage.clickOnProjectsMenuItem();
        Assert.assertTrue(landingPage.checkProjectsMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Projects guids to Projects module");
    }
    @Test
    public void menuItemMentorsIsVisible(){
        Assert.assertTrue(landingPage.menuItemMentorsIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Mentors is displayed");
    }
    @Test
    public void menuItemMentorsOpensCorrectModule() {
        landingPage.clickOnMentorsMenuItem();
        Assert.assertTrue(landingPage.checkMentorsMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Mentors guids to Mentors module");
    }
    @Test
    public void menuItemStartUpIsVisible(){
        Assert.assertTrue(landingPage.startUpMenuItemIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Start up is displayed");
    }
    @Test
    public void menuItemStartUpOpensCorrectModule() {
        landingPage.clickOnStartUpMenuItem();
        Assert.assertTrue(landingPage.checkStarUpMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Start up guids to Start up module");
    }
    @Test
    public void buttonSunIconIsVisible(){
        Assert.assertTrue(landingPage.sunIconIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Sun icon is visible");}
    @Test
    public void clickOnSunIconChangeBackgroundColour(){
        String backgroundColorOne = landingPage.getBackgroundColor();
        landingPage.clickOnSunIcon();
        String backgroundColorTwo = landingPage.getBackgroundColor();
        Assert.assertNotEquals(backgroundColorTwo, backgroundColorOne, "Colour is not changed");
        landingPage.clickOnSunIcon();
        String backgroundColorThree = landingPage.getBackgroundColor();
        Assert.assertNotEquals(backgroundColorThree, backgroundColorTwo, "Colour is not changed");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on sun icon changes background color");
    }
    @Test
    public void joinButtonIsVisible(){
        Assert.assertTrue(landingPage.joinButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Join button in header is visible");
    }
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
    public void aboutUsTitleIsVisible(){
        Assert.assertTrue(landingPage.aboutUsTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: About us title is visible");
    }
    @Test
    public void aboutUsTextIsVisible(){
        Assert.assertTrue(landingPage.aboutUsTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: About us text is visible");
    }
    @Test
    public void whyExlabTitleIsVisible(){
        Assert.assertTrue(landingPage.whyExlabTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Why Exlab title is visible");
    }
    @Test
    public void whyExlabTextIsVisible(){
        Assert.assertTrue(landingPage.whyExlabTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Why Exlab text is visible");
    }
    @Test
    public void secondJoinButtonIsVisible(){
        Assert.assertTrue(landingPage.secondJoinButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Join button on page is visible");
    }
    @Test
    public void clickOnSecondJoinButtonInvitesToTelegramBot(){
        landingPage.clickOnSecondJoinButton();
        landingPage.switchToBotTab();
        Assert.assertTrue(landingPage.botNameIsDisplayed());
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://t.me/ExLab_registration_bot");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on second join button invites to tg bot");
    }
    @Test
    public void projectsTitleIsVisible(){
        Assert.assertTrue(landingPage.projectTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Projects title on page is visible");
    }
    @Test
    public void projectExlabLogoIsVisible() {
        Assert.assertTrue(landingPage.exlabProjectLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Exlab project logo is visible");
    }
    @Test
    public void projectHealthLogoIsVisible() {
        Assert.assertTrue(landingPage.healthProjectLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Health project logo is visible");
    }
    @Test
    public void projectEasyHelpLogoIsVisible() {
        Assert.assertTrue(landingPage.easyHelpLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Easy help logo is visible");
    }
    @Test
    public void projectExlabTextIsVisible() {
        Assert.assertTrue(landingPage.exlabProjectTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Exlab project text is visible");
    }
    @Test
    public void projectHealthTextIsVisible() {
        Assert.assertTrue(landingPage.healthProjectTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Heath project text is visible");
    }
    @Test
    public void projectEasyHelpTextIsVisible() {
        Assert.assertTrue(landingPage.easyHelpTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Easy Help text is visible");
    }
    @Test
    public void mentorsTitleIsVisible() {
        Assert.assertTrue(landingPage.mentorsTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors title on page is visible");
    }
    @Test
    public void mentorsInfoOpensByClickToPlus(){
        landingPage.scrollToMentorsModule();
        landingPage.clickOnPlus();
        Assert.assertTrue(landingPage.checkPlusIconClass().contains("gGHWQo"));
        Assert.assertTrue(landingPage.stanislavHeaderIsDisplayed());
        Assert.assertTrue(landingPage.stanislavInfoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors info open by click on plus icon");
    }
    @Test
    public void mentorsFotoIsVisible(){
        landingPage.scrollToMentorsModule();
        landingPage.clickOnPlusTwo();
        Assert.assertTrue(landingPage.alexandrHeaderIsDisplayed());
        Assert.assertTrue(landingPage.alexandrFotoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors foto is displayed");
    }
    @Test
    public void mentorsCountIsFour(){
        landingPage.scrollToMentorsModule();
        Assert.assertEquals(landingPage.checkMentorsCount(), 4);
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors count equals 4");
    }
    @Test
    public void mentorsInfoIsClosedByMinus(){
        landingPage.scrollToMentorsModule();
        Assert.assertTrue(landingPage.alexandrHeaderIsDisplayed());
        landingPage.clickOnPlusTwo();
        Assert.assertTrue(landingPage.alexandrFotoIsDisplayed());
        landingPage.clickOnMinus();
        Assert.assertFalse(landingPage.alexandrFotoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Foto is not visible after click on minus");
    }
    @Test
    public void becomeMentorButtonIsVisible(){
        landingPage.scrollToBecomeMentorButton();
        Assert.assertTrue(landingPage.becomeMentorButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Become mentor button is displayed");
    }





}
