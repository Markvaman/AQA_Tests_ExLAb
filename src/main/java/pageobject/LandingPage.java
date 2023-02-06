package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

import java.util.List;

public class LandingPage extends BaseData {

    //HEADER
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

    //ABOUT US AND WHY EXLAB MODULES
    private final By aboutUsTitle = By.xpath("//*[@id='about']/div[1]");
    private final By aboutUsText = By.xpath("//*[@id='about']/div[2]/p");
    private final By whyExlabTitle = By.xpath("//*[@id='about']/div[3]/div[1]");
    private final By whyExlabText = By.xpath("//*[@id='about']/div[3]/ol");
    private final By secondJoinButton = By.xpath("//*[@id='about']/div[3]/div[2]/a");
    private final By botName = By.xpath("//div[2]/div[2]/div/div[2]/span");

    //PROJECTS MODULE
    private final By projectsTitle = By.xpath("//*[@id='projects-title-wrapper']/div");
    private final By projectsExlabLogo = By.xpath("//*[@id='projects']/div[2]/div[1]/img");
    private final By projectsHealthLogo = By.xpath("//*[@id='projects']/div[2]/div[2]/img");
    private final By projectsEasyHelpLogo = By.xpath("//*[@id='projects']/div[2]/div[3]/img");
    private final By projectsExlabText = By.xpath("//*[@id='projects']/div[2]/div[1]/p");
    private final By projectsHealthText = By.xpath("//*[@id='projects']/div[2]/div[2]/p");
    private final By projectsEasyHelpText = By.xpath("//*[@id='projects']/div[2]/div[3]/p");

    //START UP AND MENTORS MODULES
    private final By mentorsTitle = By.xpath("//*[@id='mentors']/div[1]");
    private final By startUpTitle = By.xpath("//div[@data-scroll-target='#startup-title-wrapper']");
    private final By startUpText = By.xpath("//div[@class='sc-jfmDQi jtqNlU']");
    private final By findSpecialistButton = By.xpath("//a[@class='sc-dkzDqf dEddqP']");
    private final By stanislavHeader = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[1]/p[1]");
    private final By stanislavInfo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[2]");
    private final By plusIcon = By.xpath("//div[@class='sc-TRNrF fYlkKP']//span[1]");
    private final By becomeMentorButton = By.xpath("//div[@class='sc-dwLEzm kIwrdA']");
    private final By alexandrHeader = By.xpath("//p[text()='Александр Юдаев']");
    private final By plusIconTwo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[2]/div[1]/span");
    private final By minusIcon = By.xpath("//span[@class='sc-eKBdFk gGHWQo']");
    private final By alexandrFoto = By.xpath("//img[@alt='Александр Юдаев']");

    //HELP PROJECT AND STAY CONNECTED MODULES
    private final By helpProjectTitle = By.xpath("//div[@class='sc-jTYCaT coDMnK']");
    private final By helpProjectText = By.xpath("//div[@class='sc-fctJkW gfwicC']");
    private final By boostyButton = By.xpath("//a[@href='https://boosty.to/exlab_startup']");
    private final By pantheonButton = By.xpath("//a[@class='sc-hKMtZM etdNbW']");
    private final By boostyLogo = By.xpath("//*[@class='TopMenu_logo_UXt7J']");
    private final By stayConnectedTitle = By.xpath("//div[@class='sc-bhVIhj uaVnA']");
    private final By stayConnectedText = By.xpath("//div[@class='sc-eGAhfa cacMWv']");



    //FOOTER
    private static final By footerLogo = By.xpath("//div[@class='sc-fIavCj fEzmxG']");
    private static final By copywrite = By.xpath("//div[@class='sc-gITdmR hYaavu']");
    private static final By linkedinLink = By.xpath("//ul[@class='sc-duzrYq iFnyqc']/li[1]");
    private static final By instagramLink = By.xpath("//ul[@class='sc-duzrYq iFnyqc']/li[2]");
    private static final By telegramLink = By.xpath("//ul[@class='sc-duzrYq iFnyqc']/li[3]");
    private static final By youtubeLink = By.xpath("//ul[@class='sc-duzrYq iFnyqc']/li[4]");
    private static final By emailLink = By.xpath("//a[@class='sc-ikjQzJ gjCqBu']");


    // Методы страницы
    public LandingPage openPage() {
        open("http://test.exlab.team/");
        return this;
    }

    public Boolean logoIsVisible() {
        return driver.findElement(logo).isDisplayed();
    }

    public String getMiniLogoClass() {
        return driver.findElement(miniLogo).getAttribute("class");
    }

    public String getMenuClass() {
        return driver.findElement(menu).getAttribute("class");
    }

    public String getRightLongImageClass() {
        return driver.findElement(rightLongImage).getAttribute("class");
    }

    public Boolean bigLogoIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(bigLogo)));
        return driver.findElement(bigLogo).isDisplayed();
    }

    public Boolean menuItemAboutUsIsDisplayed() {
        return driver.findElement(menu).isDisplayed();
    }

    public Boolean checkAboutUSMenuItemIsClickable() {
        return driver.findElement(aboutUsTitle).isDisplayed();
    }

    public LandingPage clickOnAboutUsMenuItem() throws InterruptedException {
        clickWithDelay(aboutUs);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(aboutUsTitle)));
        return this;
    }

    public Boolean menuItemProjectsIsDisplayed() {
        return driver.findElement(projects).isDisplayed();
    }

    public Boolean checkProjectsMenuItemIsClickable() {
        return driver.findElement(projectsTitle).isDisplayed();
    }

    public LandingPage clickOnProjectsMenuItem() throws InterruptedException {
        clickWithDelay(projects);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(projectsTitle)));
        return this;
    }

    public Boolean menuItemMentorsIsDisplayed() {
        return driver.findElement(mentors).isDisplayed();
    }

    public Boolean checkMentorsMenuItemIsClickable() {
        return driver.findElement(mentorsTitle).isDisplayed();
    }

    public LandingPage clickOnMentorsMenuItem() throws InterruptedException {
        clickWithDelay(mentors);
        return this;
    }

    public Boolean startUpMenuItemIsDisplayed() {
        return driver.findElement(startUp).isDisplayed();
    }

    public Boolean checkStarUpMenuItemIsClickable() {
        return driver.findElement(startUpTitle).isDisplayed();
    }

    public LandingPage clickOnStartUpMenuItem() throws InterruptedException {
        clickWithDelay(startUp);
        return this;
    }

    public Boolean sunIconIsDisplayed() {
        return driver.findElement(sunIcon).isDisplayed();
    }

    public LandingPage clickOnSunIcon() {
        driver.findElement(sunIcon).click();
        return this;
    }

    public String getBackgroundColor() {
        return driver.findElement(background).getCssValue("background-color");
    }

    public Boolean joinButtonIsDisplayed() {
        return driver.findElement(joinButton).isDisplayed();
    }

    public LandingPage clickOnJoinButton() {
        driver.findElement(joinButton).click();
        return this;
    }

    public Boolean botNameIsDisplayed() {
        return driver.findElement(botName).isDisplayed();
    }

    public LandingPage switchToBotTab() {
        switchToSecondTab();
        return this;
    }

    public Boolean aboutUsTitleIsDisplayed() {
        scrollToElement(aboutUsTitle);
        return driver.findElement(aboutUsTitle).isDisplayed();
    }

    public Boolean aboutUsTextIsDisplayed() {
        scrollToElement(aboutUsText);
        return driver.findElement(aboutUsText).isDisplayed();
    }

    public Boolean whyExlabTitleIsDisplayed() {
        scrollToElement(whyExlabTitle);
        return driver.findElement(whyExlabTitle).isDisplayed();
    }

    public Boolean whyExlabTextIsDisplayed() {
        scrollToElement(whyExlabText);
        return driver.findElement(whyExlabText).isDisplayed();
    }

    public Boolean secondJoinButtonIsDisplayed() {
        scrollToElement(secondJoinButton);
        return driver.findElement(secondJoinButton).isDisplayed();
    }

    public LandingPage clickOnSecondJoinButton() {
        scrollToElement(secondJoinButton);
        driver.findElement(secondJoinButton).click();
        return this;
    }

    public Boolean projectTitleIsDisplayed() {
        scrollToElement(projectsTitle);
        return driver.findElement(projectsTitle).isDisplayed();
    }

    public Boolean exlabProjectLogoIsDisplayed() {
        scrollToElement(projectsExlabLogo);
        return driver.findElement(projectsExlabLogo).isDisplayed();
    }

    public Boolean exlabProjectTextIsDisplayed() {
        scrollToElement(projectsExlabText);
        return driver.findElement(projectsExlabText).isDisplayed();
    }

    public Boolean healthProjectLogoIsDisplayed() {
        scrollToElement(projectsHealthLogo);
        return driver.findElement(projectsHealthLogo).isDisplayed();
    }

    public Boolean healthProjectTextIsDisplayed() {
        scrollToElement(projectsHealthText);
        return driver.findElement(projectsHealthText).isDisplayed();
    }

    public Boolean easyHelpLogoIsDisplayed() {
        scrollToElement(projectsEasyHelpLogo);
        return driver.findElement(projectsEasyHelpLogo).isDisplayed();
    }

    public Boolean easyHelpTextIsDisplayed() {
        scrollToElement(projectsEasyHelpText);
        return driver.findElement(projectsEasyHelpText).isDisplayed();
    }

    public Boolean mentorsTitleIsDisplayed() {
        scrollToElement(stanislavHeader);
        return driver.findElement(mentorsTitle).isDisplayed();
    }

    public Boolean scrollToMentorsModule() {
        scrollToElement(alexandrHeader);
        return driver.findElement(mentorsTitle).isDisplayed();
    }

    public LandingPage clickOnPlus() throws InterruptedException {
        clickWithDelay(plusIcon);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(stanislavInfo)));
        return this;
    }

    public String checkPlusIconClass() {
        return driver.findElement(plusIcon).getAttribute("class");
    }

    public Boolean stanislavHeaderIsDisplayed() {
        return driver.findElement(stanislavHeader).isDisplayed();
    }

    public Boolean stanislavInfoIsDisplayed() {
        return driver.findElement(stanislavInfo).isDisplayed();
    }

    public LandingPage clickOnPlusTwo() throws InterruptedException {
        clickWithDelay(plusIconTwo);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(alexandrFoto)));
        return this;
    }

    public LandingPage clickOnMinus() throws InterruptedException {
        clickWithDelay(minusIcon);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(alexandrFoto)));
        return this;
    }

    public Boolean alexandrHeaderIsDisplayed() {
        return driver.findElement(alexandrHeader).isDisplayed();
    }

    public Boolean alexandrFotoIsDisplayed() {
        return driver.findElement(alexandrFoto).isDisplayed();
    }

    public int checkMentorsCount() {
        int count = driver.findElements(By.className("sc-jIAOiI")).size();
        return count;
    }

    public Boolean scrollToBecomeMentorButton() {
        scrollToElement(becomeMentorButton);
        return driver.findElement(becomeMentorButton).isDisplayed();
    }

    public Boolean becomeMentorButtonIsDisplayed() {
        return driver.findElement(becomeMentorButton).isDisplayed();
    }

    public void scrollDown() {
        // js.executeScript("arguments[0].scrollIntoView();", driver.findElement(aboutUsTitle));
        // js.executeScript("arguments[0].scrollIntoView();", driver.findElement(projectsTitle));
        // js.executeScript("arguments[0].scrollIntoView();", driver.findElement(mentorsTitle));
        // js.executeScript("arguments[0].scrollIntoView();", driver.findElement(startUpTitle));
        String xpath = "//*[@class='sc-fEOsli iema-Dv']";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        int count = elements.size();
        for (int i = 1; i <= count; i++) {
            WebElement position = driver.findElement(By.xpath(String.format("(%s)[%d]", xpath, i)));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].scrollIntoView(true);", position);
        }
    }

    public void scrollUp() {
        String xpath = "//*[@class='sc-fEOsli iema-Dv']";
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        int count = elements.size();
        for (int i = 7; i > 0; i--) {
            WebElement position = driver.findElement(By.xpath(String.format("(%s)[%d]", xpath, i)));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].scrollIntoView(true);", position);
        }
        //js.executeScript("arguments[0].scrollIntoView()", menu);
    }

    public LandingPage scrollToStartUpModule() {
        scrollToElement(startUpTitle);
        return this;
    }

    public Boolean startUpTitleIsDisplayed() {
        return driver.findElement(startUpTitle).isDisplayed();
    }

    public Boolean startUpTextIsDisplayed() {
        return driver.findElement(startUpText).isDisplayed();
    }

    public LandingPage scrollToFindSpecialistButton() {
        scrollToElement(findSpecialistButton);
        return this;
    }

    public Boolean findSpecialistButtonIsDisplayed() {
        return driver.findElement(findSpecialistButton).isDisplayed();
    }

    public LandingPage scrollToHelpProjectModule() {
        scrollToElement(helpProjectText);
        return this;
    }

    public LandingPage scrollToBoostyButton() {
        scrollToElement(boostyButton);
        return this;
    }

    public Boolean helpProjectTitleIsDisplayed() {
        return driver.findElement(helpProjectTitle).isDisplayed();
    }

    public Boolean helpProjectTextIsDisplayed() {
        return driver.findElement(helpProjectText).isDisplayed();
    }

    public Boolean boostyButtonIsDisplayed() {
        return driver.findElement(boostyButton).isDisplayed();
    }

    public Boolean pantheonButtonIsDisplayed() {
        return driver.findElement(pantheonButton).isDisplayed();
    }

    public void clickOnBoostyButton() throws InterruptedException {
        clickWithDelay(boostyButton);
    }

    public Boolean boostyLogoIsDisplayed() {
        return driver.findElement(boostyLogo).isDisplayed();
    }

    public LandingPage switchToBoostyTab() {
        switchToSecondTab();
        return this;
    }

    public Boolean stayConnectedTitleIsDisplayed() {
        return driver.findElement(stayConnectedTitle).isDisplayed();
    }

    public Boolean stayConnectedTextIsDisplayed() {
        return driver.findElement(stayConnectedText).isDisplayed();
    }
    @DataProvider(name = "locators for tests 41-43, 45, 47, 49, 51")
    public static Object[][] getData(){
        return new Object[][] {
                {"Exlab logo in footer is displayed", footerLogo},
                {"Copywrite in footer is displayed", copywrite},
                {"LinkedIn link in footer is displayed", linkedinLink},
                {"Instagram link in footer is displayed", instagramLink},
                {"Telegram in footer is displayed", telegramLink},
                {"Youtube link in footer is displayed", youtubeLink},
                {"Email in footer is displayed", emailLink}
        };

    }

}
