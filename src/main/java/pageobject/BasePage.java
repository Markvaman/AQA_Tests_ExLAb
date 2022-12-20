package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.driver.getDriver;

public class BasePage {

    protected WebDriver driver;

    protected String baseUrl = "http://test.exlab.team/";

    public BasePage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    //Локаторы, относящиеся ко всем страницам сайта. В случае лендинга - к хедеру и футеру

    @FindBy(id = "logo_mobile")
    public WebElement logo;

    //Методы для данной страницы, которые используются тестами в классе BasePageTest

    public BasePage open() {
        driver.get(baseUrl);
        return this;
    }
}

