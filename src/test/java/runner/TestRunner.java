package runner;

import driver.AppiumDriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@HappyPath",
        plugin = {"pretty",
                "json:target/cucumber.json"
        },
        monochrome = true)
public class TestRunner {

    @BeforeClass
    public static void start() throws IOException {
        AppiumDriverManager.getInstance().getDriver();
    }

    @AfterClass
    public static void end() {
        AppiumDriverManager.getInstance().quitDriver();
    }
}
