package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static driver.driver.getDriver;

public class LandingPage extends BaseData {

    @FindBy(id = "logo_mobile")
    private WebElement logo;
    @FindBy(xpath = "//div[@id='header']//img")
    private WebElement bigLogo;
    @FindBy(xpath = "//div[1]/div[2]/div[2]/div[1]/div")
    private WebElement sunIcon;
    @FindBy(xpath = "//li[1]//a")
    private WebElement aboutUs;
    @FindBy(xpath = "//div[@id='logo_mobile']")
    private WebElement miniLogo;
    @FindBy(xpath = "//*[@id='header']/div[1]/div[2]")
    private WebElement menu;
    @FindBy(xpath = "//*[@id='root']/div/div[1]")
    private WebElement rightLongImage;
    @FindBy(xpath = "//li[2]//a")
    private WebElement projects;
    @FindBy(xpath = "//li[3]//a")
    private WebElement mentors;
    @FindBy(xpath = "//li[4]//a")
    private WebElement startUp;
    @FindBy(xpath = "//div[@id='root']/div")
    private WebElement background;
    @FindBy(xpath = "//*[@id='header']/div[1]/div[2]/div[2]/div[2]")
    private WebElement joinButton;
    @FindBy(xpath = "//*[@id='about']/div[1]")
    private WebElement aboutUsTitle;
    @FindBy(xpath = "//*[@id='about']/div[2]/p")
    private WebElement aboutUsText;
    @FindBy(xpath = "//*[@id='about']/div[3]/div[1]")
    private WebElement whyExlabTitle;
    @FindBy(xpath = "//*[@id='about']/div[3]/ol")
    private WebElement whyExlabText;


    // Методы страницы

    public WebElement getLogo() {
        return logo;
    }
    public WebElement getBackground() {
        return background;
    }
    public WebElement getStartUp() {
        return startUp;
    }
    public WebElement getMentors() {
        return mentors;
    }
    public WebElement getProjects() {
        return projects;
    }
    public WebElement getRightLongImage() {
        return rightLongImage;
    }
    public WebElement getMenu() {
        return menu;
    }
    public WebElement getMiniLogo() {
        return miniLogo;
    }
    public WebElement getBigLogo() {
        return bigLogo;
    }
    public WebElement getSunIcon() {
        return sunIcon;
    }
    public void clickOnSunIcon(){
        sunIcon.click();
    }
    public WebElement getAboutUs() {
        return aboutUs;
    }
    public WebElement getJoinButton() {
        return joinButton;
    }
    public WebElement getAboutUsTitle(){return aboutUsTitle; }
    public WebElement getAboutUsText() {return aboutUsText; }
    public WebElement getWhyExlabTitle() {return whyExlabTitle; }
    public WebElement getWhyExlabText() {return whyExlabText; }
    public void clickOnJoinButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(joinButton));
        joinButton.click();
    }
    public LandingPage switchToBotTab(){
        ArrayList<String>tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        return this;
    }

}
