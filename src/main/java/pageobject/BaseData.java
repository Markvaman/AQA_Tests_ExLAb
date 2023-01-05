package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.driver.getDriver;

public class BaseData {

    protected WebDriver driver;

    protected String baseUrl = "http://test.exlab.team/";

    public BaseData() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public BaseData open() {
        driver.get(baseUrl);
        return this;
    }

}

