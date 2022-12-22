import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.LandingPage;

public class LandingPageTest extends BasePageTest {
    public LandingPage landingPage;

    @BeforeTest
    public void createLanding() {
        landingPage = new LandingPage();
    }

    @Test
    public void landingPageOpensWithDarkTheme() {
        Assert.assertTrue(landingPage.getMiniLogo().getAttribute("class").contains("EnPDN"));
        Assert.assertTrue(landingPage.getMenu().getAttribute("class").contains("iVTdFt"));
        Assert.assertTrue(landingPage.getRightLongImage().getAttribute("class").contains("kjBOCW"));
        System.out.println("________________________\n" +
                "TEST PASSED: Landing page has a default dark theme");
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
    public void menuItemAboutUsHasValidLink() {
        Assert.assertTrue(landingPage.getAboutUs().getAttribute("href").contains("#about"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'О нас' has valid link");
    }

    @Test
    public void menuItemProjectsIsVisible(){
        Assert.assertTrue(landingPage.getProjects().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Проекты' is visible");
    }

    @Test
    public void menuItemProjectsHasValidLink(){
        Assert.assertTrue(landingPage.getProjects().getAttribute("href").contains("#projects"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Проекты' has valid link");
    }

    @Test
    public void menuItemMentorsIsVisible(){
        Assert.assertTrue(landingPage.getMentors().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Менторы' is visible");
    }

    @Test
    public void menuItemMentorsHasValidLink(){
        Assert.assertTrue(landingPage.getMentors().getAttribute("href").contains("#mentors"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Менторы' has valid link");
    }

    @Test
    public void menuItemStartUpIsVisible(){
        Assert.assertTrue(landingPage.getStartUp().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Start Up' is visible");
    }

    @Test
    public void menuItemStartUpHasValidLink(){
        Assert.assertTrue(landingPage.getStartUp().getAttribute("href").contains("#startup"));
        System.out.println("________________________\n" +
                "TEST PASSED: Menu item 'Start Up' has valid link");
    }

    @Test
    public void buttonSunIconIsVisible(){
        Assert.assertTrue(landingPage.getSunIcon().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Sun Icon is visible");
    }

    @Test
    public void clickOnSunIconChangesBackgroundColour(){
        landingPage.clickOnSunIcon();
        Assert.assertTrue(landingPage.getMiniLogo().getAttribute("class").contains("FjAfx"));
        Assert.assertTrue(landingPage.getRightLongImage().getAttribute("class").contains("khsHPC"));
        Assert.assertTrue(landingPage.getMenu().getAttribute("class").contains("eLZoiV"));
        landingPage.clickOnSunIcon();
        System.out.println("________________________\n" +
                "TEST PASSED: Sun Icon changes landing theme");

    }

}
