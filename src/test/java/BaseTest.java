import org.testng.Assert;
import org.testng.annotations.*;
import pageobject.BaseData;

import static driver.driver.*;
import static driver.driver.getDriver;

public class BaseTest {

    public BaseData basePage;

    @BeforeMethod
    public void start () {
        createDriver();
        basePage = new BaseData();
        basePage.open();

    }

    @AfterMethod
    public void finish() {
        quite();
    }

}
