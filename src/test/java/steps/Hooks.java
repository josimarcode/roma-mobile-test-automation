package steps;

import driver.AppiumDriverManager;
import io.cucumber.java.After;
import java.io.IOException;

public class Hooks {

    @After(order = 0)
    public void afterScenario() throws IOException {
        AppiumDriverManager.getInstance().getDriver();
    }
}
