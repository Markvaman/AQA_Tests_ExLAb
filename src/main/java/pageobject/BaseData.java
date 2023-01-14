package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import static driver.driver.getDriver;

public class BaseData {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BaseData() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);

    }

    protected void open(String url) {
        driver.get(url);
    }
    protected void isElementDisplayed(By locator){
        Assert.assertTrue(driver.findElement(locator).isDisplayed());
        System.out.println("Element is visible");
    }
    protected void scrollToElement(By locator) {
        actions.scrollToElement(driver.findElement(locator)).build().perform();
    }

}

