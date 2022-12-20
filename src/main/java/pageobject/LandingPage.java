package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    // Локаторы страницы, кроме тех, которые отнесены в BasePage

    @FindBy(xpath = "//div[@id='header']//img")
    private WebElement bigLogo;

// Методы страницы


}
