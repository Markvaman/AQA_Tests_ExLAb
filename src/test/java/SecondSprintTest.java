import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.SecondSprintPage;

public class SecondSprintTest extends BaseTest{
    public SecondSprintPage secondSprintPage;

    @BeforeTest
    public void createSecondSprintPage(){
        secondSprintPage = new SecondSprintPage();
    }

    @Test
    public void joinButtonIsVisible(){
        Assert.assertTrue(secondSprintPage.getJoinButton().isDisplayed());
        System.out.println("________________________\n" +
                "TEST PASSED: Join Button is visible");
    }
}
