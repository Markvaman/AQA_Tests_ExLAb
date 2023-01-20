package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Util.Config.WEB_DRIVER_WAIT;
import static driver.driver.getDriver;

public class BaseData {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BaseData() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(WEB_DRIVER_WAIT));
        actions = new Actions(driver);

    }

    protected void open(String url) {
        driver.get(url);
    }
    protected void scrollToElement(By locator) {
        actions.scrollToElement(driver.findElement(locator)).build().perform();
    }

}

