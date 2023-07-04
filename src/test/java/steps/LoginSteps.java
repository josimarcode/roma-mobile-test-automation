package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.NavigationBarPage;
import pages.PageManager;

public class LoginSteps {

    private LoginPage loginPage = PageManager.obtenerInstancia().getLoginPage();
    private NavigationBarPage navigationBarPage = PageManager.obtenerInstancia().getNavigationBarPage();
    @Given("I am on the login view")
    public void i_am_on_the_login_view() {
        navigationBarPage.clickLoginButton();
    }
    @When("I login with {string} and {string}")
    public void i_login_with_and(String email, String password) {
        loginPage.enterUsername(email);
    }
    @Then("I should see a flash message saying {string}")
    public void i_should_see_a_flash_message_saying(String password) {
        loginPage.enterPassword(password);
    }
}
