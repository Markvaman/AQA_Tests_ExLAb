import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import static driver.driver.getDriver;

public class LandingPageTest extends BaseTest {


    @Test(groups = "header")
    @Description("Name: Open Landing page Exlab\n" + "Open page and check URL, title and logos visibility")
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
    @Test(groups = "header")
    @Description("Name: Open Landing with dark theme\n" + "Open page and check default dark theme with comparing of elements classes")
    public void landingPageOpensWithDarkTheme() {
        Assert.assertTrue(landingPage.getMiniLogoClass().contains("EnPDN"));
        Assert.assertTrue(landingPage.getMenuClass().contains("iVTdFt"));
        Assert.assertTrue(landingPage.getRightLongImageClass().contains("kjBOCW"));
        System.out.println("________________________\n" +
                "TEST PASSED: Landing page has a default dark theme");
    }
    @Test(groups = "header")
    @Description( "Name: Visibility of main logo on page\n" + "Open landing page, wait and check main logos visibility")
    public void exlabBigLogoIsVisible() {
        Assert.assertTrue(landingPage.bigLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Big Exlab logo is displayed");}
    @Test(groups = "header")
    @Description("Name: Visibility of menu item 'about us'\n" + "Open landing page, wait and check 'about us' visibility")
    public void menuItemAboutUsIsVisible() {
        Assert.assertTrue(landingPage.menuItemAboutUsIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item About us is displayed");
    }
    @Test(groups = "header")
    @Description("Name: Click on 'about us' in menu opens module About us\n" + "Open landing, click on 'about us' in menu, wait and check About us headers visibility")
    public void aboutUsMenuLinkOpensCorrectModule() throws InterruptedException {
        landingPage.clickOnAboutUsMenuItem();
        Assert.assertTrue(landingPage.checkAboutUSMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item About Us guids to About us module");
    }
    @Test(groups = "header")
    @Description("Name: Visibility of menu item 'projects'\n" + "Open landing page, wait and check 'projects' visibility")
    public void menuItemProjectsIsVisible(){
        Assert.assertTrue(landingPage.menuItemProjectsIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Projects is displayed");
    }
    @Test(groups = "header")
    @Description("Name: Click on 'projects' in menu opens module Projects\n" + "Open landing, click on 'projects' in menu, wait and check Projects headers visibility")
    public void projectsMenuLinkOpensCorrectModule() throws InterruptedException {
        landingPage.clickOnProjectsMenuItem();
        Assert.assertTrue(landingPage.checkProjectsMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Projects guids to Projects module");
    }
    @Test(groups = "header")
    @Description("Name: Visibility of menu item 'mentors'\n" + "Open landing page, wait and check 'mentors' visibility")
    public void menuItemMentorsIsVisible(){
        Assert.assertTrue(landingPage.menuItemMentorsIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Mentors is displayed");
    }
    @Test(groups = "header")
    @Description("Name: Click on 'mentors' in menu opens module Mentors\n" + "Open landing, click on 'mentors' in menu, wait and check Mentors headers visibility")
    public void menuItemMentorsOpensCorrectModule() throws InterruptedException {
        landingPage.scrollDown();
        landingPage.scrollUp();
        landingPage.clickOnMentorsMenuItem();
        Assert.assertTrue(landingPage.checkMentorsMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Mentors guids to Mentors module");
    }
    @Test(groups = "header")
    @Description("Name: Visibility of menu item 'StartUp'\n" + "Open landing page, wait and check 'start up' visibility")
    public void menuItemStartUpIsVisible(){
        Assert.assertTrue(landingPage.startUpMenuItemIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Start up is displayed");
    }
    @Test(groups = "header")
    @Description("Name: Click on 'start up' in menu opens module Start up\n" + "Open landing, click on 'start up' in menu, wait and check Start up headers visibility")
    public void menuItemStartUpOpensCorrectModule() throws InterruptedException {
        landingPage.scrollDown();
        landingPage.scrollUp();
        landingPage.clickOnStartUpMenuItem();
        Assert.assertTrue(landingPage.checkStarUpMenuItemIsClickable());
        System.out.println("________________________\n" +
                "TEST PASSED: Item Start up guids to Start up module");
    }
    @Test(groups = "header")
    @Description("Name: Visibility of sun icon in header\n" + "Open landing page, wait and check icon visibility")
    public void buttonSunIconIsVisible(){
        Assert.assertTrue(landingPage.sunIconIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Sun icon is visible");}
    @Test(groups = "header")
    @Description("Name: Check changing of background color by click on sun icon\n" + "Open landing page, get background color, then click on sun icon and compare colors")
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
    @Test(groups = "header")
    @Description("Name: Visibility of join button in header\n" + "Open landing page, wait and check join button visibility")
    public void joinButtonIsVisible(){
        Assert.assertTrue(landingPage.joinButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Join button in header is visible");
    }
    @Test(groups = "header")
    @Description("Name: Check join button follows to telegram bot page\n" + "Open landing page, click to join button in header, switch tabs and check URL and bot name visibility")
    public void clickOnJoinButtonInvitesToTelegramBot(){
        landingPage.clickOnJoinButton();
        landingPage.switchToBotTab();
        landingPage.botNameIsDisplayed();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://t.me/ExLab_registration_bot");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on join button invites to tg bot");
    }
    @Test(groups = "about us + why exlab")
    @Description("Name: Visibility of About us modules header\n" + "Open landing page, scroll to About us module and check headers visibility")
    public void aboutUsTitleIsVisible(){
        Assert.assertTrue(landingPage.aboutUsTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: About us title is visible");
    }
    @Test(groups = "about us + why exlab")
    @Description("Name: Visibility of About us modules text\n" + "Open landing page, scroll to About us module and check texts visibility")
    public void aboutUsTextIsVisible(){
        Assert.assertTrue(landingPage.aboutUsTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: About us text is visible");
    }
    @Test(groups = "about us + why exlab")
    @Description("Name: Visibility of Why Exlab modules header\n" + "Open landing page, scroll to Why Exlab module and check headers visibility")
    public void whyExlabTitleIsVisible(){
        Assert.assertTrue(landingPage.whyExlabTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Why Exlab title is visible");
    }
    @Test(groups = "about us + why exlab")
    @Description("Name: Visibility of Why Exlab modules text\n" + "Open landing page, scroll to Why Exlab module and check texts visibility")
    public void whyExlabTextIsVisible(){
        Assert.assertTrue(landingPage.whyExlabTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Why Exlab text is visible");
    }
    @Test(groups = "about us + why exlab")
    @Description("Name: Visibility of join button on page\n" + "Open landing page, scroll to join button and check visibility")
    public void secondJoinButtonIsVisible(){
        Assert.assertTrue(landingPage.secondJoinButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Join button on page is visible");
    }
    @Test(groups = "about us + why exlab")
    @Description("Name: Check join button on page follows to telegram bot page\n" + "Open landing page, scroll to join button, click, switch tabs and check URL and bot name visibility")
    public void clickOnSecondJoinButtonInvitesToTelegramBot(){
        landingPage.clickOnSecondJoinButton();
        landingPage.switchToBotTab();
        Assert.assertTrue(landingPage.botNameIsDisplayed());
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://t.me/ExLab_registration_bot");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on second join button invites to tg bot");
    }
    @Test(groups = "projects")
    @Description("Name: Visibility of Projects modules header\n" + "Open landing page, scroll to projects module and check headers visibility")
    public void projectsTitleIsVisible(){
        Assert.assertTrue(landingPage.projectTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Projects title on page is visible");
    }
    @Test(groups = "projects")
    @Description("Name: Visibility of Exlab logo in Projects module\n" + "Open landing page, scroll to projects module and check Exlab logos visibility")
    public void projectExlabLogoIsVisible() {
        Assert.assertTrue(landingPage.exlabProjectLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Exlab project logo is visible");
    }
    @Test(groups = "projects")
    @Description("Name: Visibility of Healthy logo in Projects module\n" + "Open landing page, scroll to projects module and check Healthy logos visibility")
    public void projectHealthLogoIsVisible() {
        Assert.assertTrue(landingPage.healthProjectLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Health project logo is visible");
    }
    @Test(groups = "projects")
    @Description("Name: Visibility of Easy help logo in Projects module\n" + "Open landing page, scroll to projects module and check Easy help logos visibility")
    public void projectEasyHelpLogoIsVisible() {
        Assert.assertTrue(landingPage.easyHelpLogoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Easy help logo is visible");
    }
    @Test(groups = "projects")
    @Description("Name: Visibility of Exlab text in Projects module\n" + "Open landing page, scroll to projects module and check Exlab text visibility")
    public void projectExlabTextIsVisible() {
        Assert.assertTrue(landingPage.exlabProjectTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Exlab project text is visible");
    }
    @Test(groups = "projects")
    @Description("Name: Visibility of Healthy text in Projects module\n" + "Open landing page, scroll to projects module and check Healthy text visibility")
    public void projectHealthTextIsVisible() {
        Assert.assertTrue(landingPage.healthProjectTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Heath project text is visible");
    }
    @Test(groups = "projects")
    @Description("Visibility of Easy help text in Projects module\n" + "Open landing page, scroll to projects module and check Easy help text visibility")
    public void projectEasyHelpTextIsVisible() {
        Assert.assertTrue(landingPage.easyHelpTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Easy Help text is visible");
    }
    @Test(groups = "mentors")
    @Description("Name: Visibility of header in Mentors module\n" + "Open landing page, scroll to mentor module and check headers visibility")
    public void mentorsTitleIsVisible() {
        Assert.assertTrue(landingPage.mentorsTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors title on page is visible");
    }
    @Test(groups = "mentors")
    @Description("Name: Mentors info opens by click on plus icon\n" + "Open landing page, scroll to mentors module, click on plus against first mentor and check info is visible")
    public void mentorsInfoOpensByClickToPlus() throws InterruptedException {
        landingPage.scrollToMentorsModule();
        landingPage.clickOnPlus();
        Assert.assertTrue(landingPage.checkPlusIconClass().contains("gGHWQo"));
        Assert.assertTrue(landingPage.stanislavHeaderIsDisplayed());
        Assert.assertTrue(landingPage.stanislavInfoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors info open by click on plus icon");
    }
    @Test(groups = "mentors")
    @Description("Name: Mentors foto is visible after click on plus icon\n" + "Open landing page, scroll to mentors module, click on plus against second mentor and check foto is visible")
    public void mentorsFotoIsVisible() throws InterruptedException {
        landingPage.scrollToMentorsModule();
        landingPage.clickOnPlusTwo();
        Assert.assertTrue(landingPage.alexandrHeaderIsDisplayed());
        Assert.assertTrue(landingPage.alexandrFotoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors foto is displayed");
    }
    @Test(groups = "mentors")
    @Description("Name: Mentors count is 4\n" + "Open landing page, scroll to mentors module and check count of mentors headers")
    public void mentorsCountIsFour(){
        landingPage.scrollToMentorsModule();
        Assert.assertEquals(landingPage.checkMentorsCount(), 4);
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors count equals 4");
    }
    @Test(groups = "mentors")
    @Description("Name: Mentors info closes by double click on plus icon\n" + "Open landing page, scroll to mentors module, click on plus against second mentor, click again  and check info is invisible")
    public void mentorsInfoIsClosedByMinus() throws InterruptedException {
        landingPage.scrollToMentorsModule();
        Assert.assertTrue(landingPage.alexandrHeaderIsDisplayed());
        landingPage.clickOnPlusTwo();
        Assert.assertTrue(landingPage.alexandrFotoIsDisplayed());
        landingPage.clickOnMinus();
        Assert.assertFalse(landingPage.alexandrFotoIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Foto is not visible after click on minus");
    }
    @Test(groups = "mentors")
    @Description("Name: Become mentor button in mentors module is visible\n" + "Open landing page, scroll to mentors module and check visibility of button")
    public void becomeMentorButtonIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToBecomeMentorButton();
        Assert.assertTrue(landingPage.becomeMentorButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Become mentor button is displayed");
    }
    @Test(groups = "mentors")
    @Description("Name: Start up header in Start up module is visible\n" + "Open landing page, scroll to start up module and check headers visibility")
    public void startUpTitleIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToStartUpModule();
        Assert.assertTrue(landingPage.startUpTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Start Up title is displayed");
    }
    @Test(groups = "mentors")
    @Description("Name: Start up text in Start up module is visible\n" + "Open landing page, scroll to start up module and check texts visibility")
    public void startUpTextIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToStartUpModule();
        Assert.assertTrue(landingPage.startUpTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Start Up text is displayed");
    }
    @Test(groups = "mentors")
    @Description("Name: Find specialist button in Start up module is visible\n" + "Open landing page, scroll to start up module and check buttons visibility")
    public void findSpecialistButtonIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToFindSpecialistButton();
        Assert.assertTrue(landingPage.findSpecialistButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Find specialist button is displayed");
    }
    @Test(groups = "help project")
    @Description("Name: Help project header in help project module is visible\n" + "Open landing page, scroll to help project module and check headers visibility")
    public void helpProjectTitleIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToHelpProjectModule();
        Assert.assertTrue(landingPage.helpProjectTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Help project title is displayed");
    }
    @Test(groups = "help project")
    @Description("Name: Help project text in help project module is visible\n" + "Open landing page, scroll to help project module and check texts visibility")
    public void helpProjectTextIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToHelpProjectModule();
        Assert.assertTrue(landingPage.helpProjectTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Help project text is displayed");
    }
    @Test(groups = "help project")
    @Description("Name: Boosty button in help project module is visible\n" + "Open landing page, scroll to help project module and check buttons visibility")
    public void boostyButtonIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToBoostyButton();
        Assert.assertTrue(landingPage.boostyButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Boosty button is displayed");
    }
    @Test(groups = "help project")
    @Description("Name: Pantheon button in help project module is visible\n" + "Open landing page, scroll to help project module and check buttons visibility")
    public void pantheonButtonIsVisible(){
        landingPage.scrollDown();
        landingPage.scrollToBoostyButton();
        Assert.assertTrue(landingPage.pantheonButtonIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Pantheon button is displayed");
    }
    @Test(groups = "help project")
    @Description("Name: Boosty button follows to Exlab page on Boosty\n" + "Open landing page, scroll to help project module, click on boosty button, switch tabs and check URL and logo")
    public void clickOnBoostyButtonOpensExlabBoostyPage() throws InterruptedException {
        landingPage.scrollDown();
        landingPage.scrollToBoostyButton();
        Assert.assertTrue(landingPage.boostyButtonIsDisplayed());
        landingPage.clickOnBoostyButton();
        landingPage.switchToBoostyTab();
        Assert.assertTrue(landingPage.boostyLogoIsDisplayed());
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://boosty.to/exlab_startup");
        System.out.println("________________________\n" +
                "TEST PASSED: Click on boosty button opens Exlab page on Boosty");
    }
    @Test(groups = "help project")
    @Description("Name: Stay connected header in stay connected module is visible\n" + "Open landing page, scroll to stay connected module and check headers visibility")
    public void stayConnectedTitleIsVisible(){
        landingPage.scrollDown();
        Assert.assertTrue(landingPage.stayConnectedTitleIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Stay connected title is displayed");
    }
    @Test(groups = "help project")
    @Description("Name: Stay connected text in stay connected module is visible\n" + "Open landing page, scroll to stay connected module and check texts visibility")
    public void stayConnectedTextIsDisplayed(){
        landingPage.scrollDown();
        Assert.assertTrue(landingPage.stayConnectedTextIsDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Stay connected text is displayed");
    }






}
