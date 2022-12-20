import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.BasePage;
import pageobject.LandingPage;

import static driver.driver.*;

public class LandingPageTest { //убрала наследование - нам же нужны нормальные названия тестов, а не бесконечное переопределение одного и того же
    public BasePage basePage;
    public LandingPage landingPage;

    @BeforeTest
    public void openLandingPage() {
        createDriver();
        basePage = new BasePage();
        basePage.open();
        landingPage = new LandingPage();
    }

    @AfterTest
    public void quitPage() {
        quite();
    }

    @Test
    public void landingPageOpensWithDarkTheme() {
        Assert.assertTrue(landingPage.getSunIcon().getAttribute("class").contains("bxLYUZ"));
        System.out.println("________________________\n" +
                "TEST PASSED: landing page has a default dark theme");
    }

    @Test
    public void exlabBigLogoIsVisible() {
        Assert.assertTrue(landingPage.getBigLogo().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: ExLab big logo is visible");
    }

    @Test
    public void menuItemAboutUsIsVisible() {
        Assert.assertTrue(landingPage.getAboutUs().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'О нас' is visible");
    }

    @Test
    public void menuItemAboutUsNasValidLink() {
        Assert.assertTrue(landingPage.getAboutUs().getAttribute("href").contains("#about"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'О нас' has valid link");
    }





    //Тесты для этой страницы. Они обращаются к локаторам и методам класса LandingPage

}
