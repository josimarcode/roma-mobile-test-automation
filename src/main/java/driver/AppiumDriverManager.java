package driver;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverManager {
    private static AppiumDriver<MobileElement> driver;
    private static AppiumDriverManager instance;

    private AppiumDriverManager() {
        // Configuración y creación del controlador de Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/josimar/amazing/repo/selenium/roma-mobile-test-automation/src/test/resources/app/Android-NativeDemoApp-0.4.0.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.wdiodemoapp");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.wdiodemoapp.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        // Configurar la URL del servidor Appium
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Crear la instancia del controlador de Appium
        driver = new AndroidDriver<>(appiumServerURL, capabilities);
    }

    public static AppiumDriverManager getInstance() {
        if (instance == null) {
            instance = new AppiumDriverManager();
        }
        return instance;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
