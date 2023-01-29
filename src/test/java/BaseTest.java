import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobject.LandingPage;

import static driver.driver.createDriver;
import static driver.driver.quite;

public abstract class BaseTest {
    protected LandingPage landingPage;

    @BeforeMethod(groups = {"header", "about us + why exlab", "projects", "mentors", "help project"})
    public void start () {
        createDriver();
        landingPage = new LandingPage();
        landingPage.openPage();
    }


    @AfterMethod(groups = {"header", "about us + why exlab", "projects", "mentors", "help project"})
    public void finish() {
        quite();
    }

}
