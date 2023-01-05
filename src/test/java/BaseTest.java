import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.BaseData;

import static driver.driver.*;
import static driver.driver.getDriver;

public class BaseTest {

    public BaseData basePage;

    @BeforeTest
    public void start () {
        createDriver();
        basePage = new BaseData();
        basePage.open();

    }

    @AfterTest
    public void finish() {
        quite();
    }

}
