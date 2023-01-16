package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.print.DocFlavor;
import java.util.ArrayList;

import static driver.driver.getDriver;
import static org.testng.Assert.assertTrue;

public class LandingPage extends BaseData {

    private By logo = By.id("logo_mobile");
    private By bigLogo = By.xpath("//div[@id='header']//img");
    private By sunIcon = By.xpath("//div[1]/div[2]/div[2]/div[1]/div");
    private By aboutUs = By.xpath("//li[1]//a");
    private By miniLogo = By.xpath("//div[@id='logo_mobile']");
    private By menu = By.xpath("//*[@id='header']/div[1]/div[2]");
    private By rightLongImage = By.xpath("//*[@id='root']/div/div[1]");
    private By projects = By.xpath("//li[2]//a");
    private By mentors = By.xpath("//*[@id='header']/div[1]/div[2]/nav/ul/li[3]/a");
    private By startUp = By.xpath("//*[@id='header']/div[1]/div[2]/nav/ul/li[4]/a");
    private By background = By.xpath("//div[@id='root']/div");
    private By joinButton = By.xpath("//*[@id='header']/div[1]/div[2]/div[2]/div[2]");
    private By aboutUsTitle = By.xpath("//*[@id='about']/div[1]");
    private By aboutUsText = By.xpath("//*[@id='about']/div[2]/p");
    private By whyExlabTitle = By.xpath("//*[@id='about']/div[3]/div[1]");
    private By whyExlabText = By.xpath("//*[@id='about']/div[3]/ol");
    private By secondJoinButton = By.xpath("//*[@id='about']/div[3]/div[2]/a");
    private By projectsTitle = By.xpath("//*[@id='projects-title-wrapper']/div");
    private By projectsExlabLogo = By.xpath("//*[@id='projects']/div[2]/div[1]/img");
    private By projectsHealthLogo = By.xpath("//*[@id='projects']/div[2]/div[2]/img");
    private By projectsEasyHelpLogo = By.xpath("//*[@id='projects']/div[2]/div[3]/img");
    private By projectsExlabText = By.xpath("//*[@id='projects']/div[2]/div[1]/p");
    private By projectsHealthText = By.xpath("//*[@id='projects']/div[2]/div[2]/p");
    private By projectsEasyHelpText = By.xpath("//*[@id='projects']/div[2]/div[3]/p");
    private By mentorsTitle = By.xpath("//div[text()='Менторы']");
    private By mentorsText = By.xpath("//*[@id='mentors']/div[2]");
    private By startUpTitle = By.xpath("//*[@id='startup-title-wrapper']/div");
    private By botName = By.xpath("//div[2]/div[2]/div/div[2]/span");
    private By stanislavHeader = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[1]/p[1]");
    private By stanislavInfo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[2]");
    private By stanislavFoto = By.xpath("//img[@alt='Станислав Харлап']");
    private By plusIcon = By.xpath("//div[@class='sc-TRNrF fYlkKP']//span[1]");
    private By becomeMentorButton = By.xpath(".//a[text()='Стать ментором']");
    private By alexandrHeader = By.xpath("//p[text()='Александр Юдаев']");
    private By plusIconTwo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[2]/div[1]/span");
    private By alexandrFoto = By.xpath("//img[@alt='Александр Юдаев']");
    private By alexandraHeader = By.xpath("//p[text()='Александра Мурашко']");





    // Методы страницы
    public void openPage(){
        open("http://test.exlab.team/");
    }
    public void logoIsVisible(){
        isElementDisplayed(logo);
    }
    public void checkMiniLogoClass(){
        assertTrue(driver.findElement(miniLogo).getAttribute("class").contains("EnPDN"));
    }
    public void checkMenuClass(){
        assertTrue(driver.findElement(menu).getAttribute("class").contains("iVTdFt"));
    }
    public void checkRightLongImageClass(){
        assertTrue(driver.findElement(rightLongImage).getAttribute("class").contains("kjBOCW"));
    }
    public void bigLogoIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(bigLogo)));
        isElementDisplayed(bigLogo);
    }
    public void menuItemAboutUsIsDisplayed(){
        isElementDisplayed(aboutUs);
    }
    public void checkAboutUSMenuItemIsClickable(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(aboutUsTitle)));
        isElementDisplayed(aboutUsTitle);
    }
    public void clickOnAboutUsMenuItem(){
        driver.findElement(aboutUs).click();
    }
    public void menuItemProjectsIsDisplayed(){
        isElementDisplayed(projects);
    }
    public void checkProjectsMenuItemIsClickable(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(projectsTitle)));
        isElementDisplayed(projectsTitle);
    }
    public void clickOnProjectsMenuItem(){
        driver.findElement(projects).click();
    }
    public void menuItemMentorsIsDisplayed(){
        isElementDisplayed(mentors);
    }
    public void checkMentorsMenuItemIsClickable(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsText)));
        isElementDisplayed(mentorsText);
    }
    public void clickOnMentorsMenuItem(){
        driver.findElement(mentors).click();

    }
    public void startUpMenuItemIsDisplayed(){
        isElementDisplayed(startUp);
    }
    public void checkStarUpMenuItemIsClickable(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startUpTitle)));
        isElementDisplayed(startUpTitle);
    }
    public void clickOnStartUpMenuItem(){ driver.findElement(startUp).click(); }
    public void sunIconIsDisplayed(){ isElementDisplayed(sunIcon); }
    public void clickOnSunIcon(){ driver.findElement(sunIcon).click(); }
    public String getBackgroundColor(){
        return driver.findElement(background).getCssValue("background-color");
    }
    public void joinButtonIsDisplayed(){ isElementDisplayed(joinButton); }
    public void clickOnJoinButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(joinButton)));
        driver.findElement(joinButton).click();
    }
    public void botNameIsDisplayed(){ isElementDisplayed(botName); }
    public LandingPage switchToBotTab(){
        ArrayList<String>tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        return this;
    }
    public void aboutUsTitleIsDisplayed(){
        scrollToElement(aboutUsTitle);
        isElementDisplayed(aboutUsTitle);
    }
    public void aboutUsTextIsDisplayed(){
        scrollToElement(aboutUsText);
        isElementDisplayed(aboutUsText);
    }
    public void whyExlabTitleIsDisplayed(){
        scrollToElement(whyExlabTitle);
        isElementDisplayed(whyExlabTitle);
    }
    public void whyExlabTextIsDisplayed(){
        scrollToElement(whyExlabText);
        isElementDisplayed(whyExlabText);
    }
    public void secondJoinButtonIsDisplayed() {
        scrollToElement(secondJoinButton);
        isElementDisplayed(secondJoinButton);}
    public void clickOnSecondJoinButton(){
        scrollToElement(secondJoinButton);
        driver.findElement(secondJoinButton).click();
    }
    public void projectTitleIsDisplayed(){
        scrollToElement(projectsTitle);
        isElementDisplayed(projectsTitle); }
    public void exlabProjectLogoIsDisplayed(){
        scrollToElement(projectsExlabLogo);
        isElementDisplayed(projectsExlabLogo);}
    public void exlabProjectTextIsDisplayed(){
        scrollToElement(projectsExlabText);
        isElementDisplayed(projectsExlabText);}
    public void healthProjectLogoIsDisplayed(){
        scrollToElement(projectsHealthLogo);
        isElementDisplayed(projectsHealthLogo);}
    public void healthProjectTextIsDisplayed(){
        scrollToElement(projectsHealthText);
        isElementDisplayed(projectsHealthText);
    }
    public void easyHelpLogoIsDisplayed(){
        scrollToElement(projectsEasyHelpLogo);
        isElementDisplayed(projectsEasyHelpLogo);
    }
    public void easyHelpTextIsDisplayed(){
        scrollToElement(projectsEasyHelpText);
        isElementDisplayed(projectsEasyHelpText);
    }
    public void mentorsTitleIsDisplayed() {
        scrollToElement(stanislavHeader);
        isElementDisplayed(mentorsTitle);
    }
    public void scrollToMentorsModule(){
        scrollToElement(alexandrHeader);
        isElementDisplayed(mentorsTitle);
    }
    public void clickOnPlus(){
        driver.findElement(plusIcon).click();
    }
    public void checkPlusIconClass(){
        Assert.assertTrue(driver.findElement(plusIcon).getAttribute("class").contains("gGHWQo"));
    }
    public void stanislavHeaderIsDisplayed(){
        isElementDisplayed(stanislavHeader);
    }
    public void stanislavInfoIsDisplayed(){
        isElementDisplayed(stanislavInfo);
    }
    public void clickOnPlusTwo() {
        driver.findElement(plusIconTwo).click();
    }
    public void alexandrHeaderIsDisplayed(){
        isElementDisplayed(alexandrHeader);
    }
    public void alexandrFotoIsDisplayed(){
        isElementDisplayed(alexandrFoto);
    }
    public void alexandrFotoIsNotDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Александр Юдаев']")).isEnabled());
        System.out.println("________________________\n" +
                "TEST PASSED: Foto is not visible after click on minus");
    }
    public void checkMentorsCount(){
        int count = driver.findElements(By.className("sc-jIAOiI")).size();
        Assert.assertEquals(count, 4);
        System.out.println("________________________\n" +
                "TEST PASSED: Mentors count equals 4");
    }
    public void scrollToAlexandraHeader(){
        scrollToElement(alexandraHeader);
    }
    public void becomeMentorButtonIsDisplayed(){
        isElementDisplayed(becomeMentorButton);
    }


}
