package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondSprintPage extends BaseData {

    @FindBy(xpath = "//*[@id='header']/div[1]/div[2]/div[2]/div[2]")
    private WebElement joinButton;


    public WebElement getJoinButton() {
        return joinButton;
    }
}
