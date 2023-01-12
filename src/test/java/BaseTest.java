import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static driver.driver.createDriver;
import static driver.driver.quite;

public abstract class BaseTest {

    @BeforeMethod
    public void start () {
        createDriver();
    }

    @AfterMethod
    public void finish() {
        quite();
    }

}
