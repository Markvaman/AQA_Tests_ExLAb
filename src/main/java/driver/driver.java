package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static Util.Config.*;

public class driver {

    private static WebDriver driver;

    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(turnChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITY_WAIT));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(SCRIPT_TIME_OUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quite() {
        driver.close();
        driver.quit();
    }
    protected static ChromeOptions turnChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        if(ON_HEADLESS) {
            chromeOptions.addArguments("--headless");
        }
        return chromeOptions;
        }
    }


