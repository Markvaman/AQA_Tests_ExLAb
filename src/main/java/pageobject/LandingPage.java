package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

import static driver.driver.getDriver;

public class LandingPage extends BaseData {

    private final By logo = By.id("logo_mobile");
    private final By bigLogo = By.xpath("//div[@id='header']//img");
    private final By sunIcon = By.xpath("//div[1]/div[2]/div[2]/div[1]/div");
    private final By aboutUs = By.xpath("//li[1]");
    private final By miniLogo = By.xpath("//div[@id='logo_mobile']");
    private final By menu = By.xpath("//*[@id='header']/div[1]/div[2]");
    private final By rightLongImage = By.xpath("//*[@id='root']/div/div[1]");
    private final By projects = By.xpath("//li[2]");
    private final By mentors = By.xpath("//li[3]");
    private final By startUp = By.xpath("//ul/li[last()]");
    private final By background = By.xpath("//div[@id='root']/div");
    private final By joinButton = By.xpath("//*[@id='header']/div[1]/div[2]/div[2]/div[2]");
    private final By aboutUsTitle = By.xpath("//*[@id='about']/div[1]");
    private final By aboutUsText = By.xpath("//*[@id='about']/div[2]/p");
    private final By whyExlabTitle = By.xpath("//*[@id='about']/div[3]/div[1]");
    private final By whyExlabText = By.xpath("//*[@id='about']/div[3]/ol");
    private final By secondJoinButton = By.xpath("//*[@id='about']/div[3]/div[2]/a");
    private final By projectsTitle = By.xpath("//*[@id='projects-title-wrapper']/div");
    private final By projectsExlabLogo = By.xpath("//*[@id='projects']/div[2]/div[1]/img");
    private final By projectsHealthLogo = By.xpath("//*[@id='projects']/div[2]/div[2]/img");
    private final By projectsEasyHelpLogo = By.xpath("//*[@id='projects']/div[2]/div[3]/img");
    private final By projectsExlabText = By.xpath("//*[@id='projects']/div[2]/div[1]/p");
    private final By projectsHealthText = By.xpath("//*[@id='projects']/div[2]/div[2]/p");
    private final By projectsEasyHelpText = By.xpath("//*[@id='projects']/div[2]/div[3]/p");
    private final By mentorsTitle = By.xpath("//*[@id='mentors']/div[1]");
    private final By startUpTitle = By.xpath("//div[@data-scroll-target='#startup-title-wrapper']");
    private final By botName = By.xpath("//div[2]/div[2]/div/div[2]/span");
    private final By stanislavHeader = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[1]/p[1]");
    private final By stanislavInfo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[2]");
    private final By plusIcon = By.xpath("//div[@class='sc-TRNrF fYlkKP']//span[1]");
    private final By becomeMentorButton = By.xpath("//div[@class='sc-dwLEzm kIwrdA']");
    private final By alexandrHeader = By.xpath("//p[text()='Александр Юдаев']");
    private final By plusIconTwo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[2]/div[1]/span");
    private final By minusIcon = By.xpath("//span[@class='sc-eKBdFk gGHWQo']");
    private final By alexandrFoto = By.xpath("//img[@alt='Александр Юдаев']");
    private final By alexandraHeader = By.xpath("//p[text()='Александра Мурашко']");





    // Методы страницы
    public LandingPage openPage(){
        open("http://test.exlab.team/");
        return this;
    }
    public Boolean logoIsVisible(){
        return driver.findElement(logo).isDisplayed();
    }
    public String getMiniLogoClass(){
       return driver.findElement(miniLogo).getAttribute("class");
    }
    public String getMenuClass(){
        return driver.findElement(menu).getAttribute("class");
    }
    public String getRightLongImageClass(){
        return driver.findElement(rightLongImage).getAttribute("class");
    }
    public Boolean bigLogoIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(bigLogo)));
        return driver.findElement(bigLogo).isDisplayed();
    }
    public Boolean menuItemAboutUsIsDisplayed(){
        return driver.findElement(menu).isDisplayed();
    }
    public Boolean checkAboutUSMenuItemIsClickable(){
        return driver.findElement(aboutUsTitle).isDisplayed();
    }
    public LandingPage clickOnAboutUsMenuItem(){
        driver.findElement(aboutUs).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(aboutUsTitle)));
        return this;
    }
    public Boolean menuItemProjectsIsDisplayed(){
        return driver.findElement(projects).isDisplayed();
    }
    public Boolean checkProjectsMenuItemIsClickable(){
        return driver.findElement(projectsTitle).isDisplayed();
    }
    public LandingPage clickOnProjectsMenuItem(){
        driver.findElement(projects).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(projectsTitle)));
        return this;
    }
    public Boolean menuItemMentorsIsDisplayed(){
        return driver.findElement(mentors).isDisplayed();
    }
    public Boolean checkMentorsMenuItemIsClickable(){
       return driver.findElement(mentorsTitle).isDisplayed();
    }
    public LandingPage clickOnMentorsMenuItem(){
        driver.findElement(mentors).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(stanislavHeader)));
        return this;
    }
    public Boolean startUpMenuItemIsDisplayed(){
        return driver.findElement(startUp).isDisplayed();
    }
    public Boolean checkStarUpMenuItemIsClickable(){
        return driver.findElement(startUpTitle).isDisplayed();
    }
    public LandingPage clickOnStartUpMenuItem () {
        driver.findElement(startUp).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startUpTitle)));
        return this;
    }
    public Boolean sunIconIsDisplayed(){
        return driver.findElement(sunIcon).isDisplayed(); }
    public LandingPage clickOnSunIcon(){
        driver.findElement(sunIcon).click();
        return this;}
    public String getBackgroundColor(){
        return driver.findElement(background).getCssValue("background-color");
    }
    public Boolean joinButtonIsDisplayed(){
        return driver.findElement(joinButton).isDisplayed(); }
    public LandingPage clickOnJoinButton(){
        driver.findElement(joinButton).click();
        return this;
    }
    public Boolean botNameIsDisplayed(){
       return driver.findElement(botName).isDisplayed(); }
    public LandingPage switchToBotTab(){
        ArrayList<String>tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        return this;
    }
    public Boolean aboutUsTitleIsDisplayed(){
        scrollToElement(aboutUsTitle);
        return driver.findElement(aboutUsTitle).isDisplayed();
    }
    public Boolean aboutUsTextIsDisplayed(){
        scrollToElement(aboutUsText);
        return driver.findElement(aboutUsText).isDisplayed();
    }
    public Boolean whyExlabTitleIsDisplayed(){
        scrollToElement(whyExlabTitle);
       return driver.findElement(whyExlabTitle).isDisplayed();
    }
    public Boolean whyExlabTextIsDisplayed(){
        scrollToElement(whyExlabText);
        return driver.findElement(whyExlabText).isDisplayed();
    }
    public Boolean secondJoinButtonIsDisplayed() {
        scrollToElement(secondJoinButton);
        return driver.findElement(secondJoinButton).isDisplayed();
    }
    public LandingPage clickOnSecondJoinButton(){
        scrollToElement(secondJoinButton);
        driver.findElement(secondJoinButton).click();
        return this;
    }
    public Boolean projectTitleIsDisplayed(){
        scrollToElement(projectsTitle);
        return driver.findElement(projectsTitle).isDisplayed();
    }
    public Boolean exlabProjectLogoIsDisplayed(){
        scrollToElement(projectsExlabLogo);
        return driver.findElement(projectsExlabLogo).isDisplayed();
    }
    public Boolean exlabProjectTextIsDisplayed(){
        scrollToElement(projectsExlabText);
        return driver.findElement(projectsExlabText).isDisplayed();
    }
    public Boolean healthProjectLogoIsDisplayed(){
        scrollToElement(projectsHealthLogo);
        return driver.findElement(projectsHealthLogo).isDisplayed();
    }
    public Boolean healthProjectTextIsDisplayed(){
        scrollToElement(projectsHealthText);
        return driver.findElement(projectsHealthText).isDisplayed();
    }
    public Boolean easyHelpLogoIsDisplayed(){
        scrollToElement(projectsEasyHelpLogo);
        return driver.findElement(projectsEasyHelpLogo).isDisplayed();
    }
    public Boolean easyHelpTextIsDisplayed(){
        scrollToElement(projectsEasyHelpText);
        return driver.findElement(projectsEasyHelpText).isDisplayed();
    }
    public Boolean mentorsTitleIsDisplayed() {
        scrollToElement(stanislavHeader);
        return driver.findElement(mentorsTitle).isDisplayed();
    }
    public Boolean scrollToMentorsModule(){
        scrollToElement(alexandrHeader);
        return driver.findElement(mentorsTitle).isDisplayed();
    }
    public LandingPage clickOnPlus(){
        driver.findElement(plusIcon).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(stanislavInfo)));
        return this;
    }
    public String checkPlusIconClass(){
        return driver.findElement(plusIcon).getAttribute("class");
    }
    public Boolean stanislavHeaderIsDisplayed(){
        return driver.findElement(stanislavHeader).isDisplayed();
    }
    public Boolean stanislavInfoIsDisplayed(){
        return driver.findElement(stanislavInfo).isDisplayed();
    }
    public LandingPage clickOnPlusTwo() {
        driver.findElement(plusIconTwo).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(alexandrFoto)));
        return this;
    }
    public LandingPage clickOnMinus(){
        driver.findElement(minusIcon).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(alexandrFoto)));
        return this;
    }
    public Boolean alexandrHeaderIsDisplayed(){
        return driver.findElement(alexandrHeader).isDisplayed();
    }
    public Boolean alexandrFotoIsDisplayed(){
        return driver.findElement(alexandrFoto).isDisplayed();
    }
    public int checkMentorsCount(){
        int count = driver.findElements(By.className("sc-jIAOiI")).size();
        return count;
    }
    public Boolean scrollToBecomeMentorButton(){
        scrollToElement(mentorsTitle);
        scrollToElement(becomeMentorButton);
        return driver.findElement(becomeMentorButton).isDisplayed();
    }
    public Boolean becomeMentorButtonIsDisplayed(){
        return driver.findElement(becomeMentorButton).isDisplayed();
    }


}
