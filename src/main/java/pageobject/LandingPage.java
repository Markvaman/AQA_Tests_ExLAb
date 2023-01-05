package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BaseData {

    // Локаторы страницы, кроме тех, которые отнесены в BasePage

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

    public void quit(){
        quit();
    }


}
