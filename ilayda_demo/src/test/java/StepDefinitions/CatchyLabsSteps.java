package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatchyLabsSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User goes to catchylabs login page")
    public void userGoesToAmazonHomePage() {
        LoginPage.HomePage();
    }

    @When("Write username")
    public void writeUsername() {
        LoginPage.Username();
    }

    @When("Write password")
    public void writePassword() {
        LoginPage.Password();
    }

    @When("Click Login")
    public void clickLogin() {
        LoginPage.Login();
    }


    @Then("Check the homepage")
    public void checkTheHomePage() {
        LoginPage.checkTheHomePage();
    }

    @When("Write invalid username")
    public void invalidUsername() {
        LoginPage.invalidUsername();
    }

    @When("Write invalid password")
    public void invalidPassword() {
        LoginPage.invalidPassword();
    }



    @Then("Check the error message")
    public void checkTheErrorMessega() {
        LoginPage.checkTheErrorMessage();
    }
}
