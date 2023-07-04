package pages;


import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]")
    private MobileElement emailField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]")
    private MobileElement passwordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup")
    private MobileElement loginButton;

    public LoginPage enterUsername(String username) {
        emailField.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
    public LoginPage clickButton() {
        loginButton.click();
        return this;
    }
}
