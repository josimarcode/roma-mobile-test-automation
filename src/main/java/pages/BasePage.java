package pages;

import driver.AppiumDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected AppiumDriver<MobileElement> driver;

    public BasePage() {
        driver = AppiumDriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
