package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    // Локаторы страницы, кроме тех, которые отнесены в BasePage

    @FindBy(xpath = "//div[@id='header']//img")
    private WebElement bigLogo;

    public WebElement getBigLogo() {
        return bigLogo;
    }

    public void setBigLogo(WebElement bigLogo) {
        this.bigLogo = bigLogo;
    }

    public WebElement getSunIcon() {
        return sunIcon;
    }

    public void setSunIcon(WebElement sunIcon) {
        this.sunIcon = sunIcon;
    }

    @FindBy(xpath = "//div[@class='sc-ksZaOG bxLYUZ']")
    private WebElement sunIcon;

    public WebElement getAboutUs() {
        return aboutUs;
    }

    @FindBy(xpath = "//a[@class='sc-evZas hJsxZw'][1]")
    private WebElement aboutUs;

// Методы страницы


}
