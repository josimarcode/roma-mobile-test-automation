package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarPage extends BasePage{

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView")
    private MobileElement loginButton;

    public NavigationBarPage clickLoginButton() {
        loginButton.click();
        return this;
    }

}
