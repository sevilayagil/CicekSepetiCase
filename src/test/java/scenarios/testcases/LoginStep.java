package scenarios.testcases;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageobjects.LoginPageObjects;
import scenarios.base.StepManager;

public class LoginStep extends StepManager {
    private LoginPageObjects loginPage;
    public LoginStep() {
        super("application");
        loginPage = PageFactory.initElements(this.driver, LoginPageObjects.class);
        set_timeOutValue(10);

    }
    @Given("^user is at landing page for the login process$")
    public void userIsAtLandingPageForTheLoginProcess() {
        getUrl();
    }

    @When("^user clicks sign button and after clicks sign item$")
    public void userClicksSignButtonAndAfterClicksSignItem() {
        elementClick(loginPage.home);
        elementClick(loginPage.SignInIcon);
        elementClick(loginPage.SignItem);
    }

    @And("^user fills user email and password$")
    public void userFillsUserEmailAndPassword() {

        getElement(loginPage.EmailTextBox).sendKeys(user.getUserName());
        getElement(loginPage.PasswordTextBox).sendKeys(user.getUserPassword());
    }

    @Then("^user clicks sign in button and it display close icon$")
    public void userClicksSignInButtonAndItDisplayCloseIcon() {
        elementClick(loginPage.SignInButton);
        getElement(loginPage.IconClose).isDisplayed();
        driver.quit();
    }

    @When("^user clicks sign in area and choose to sign in item$")
    public void userClicksSignInAreaAndChooseToSignInItem() {
        elementClick(loginPage.home);
        elementClick(loginPage.SignInIcon);
        elementClick(loginPage.SignItem);
        getElement(loginPage.EmailTextBox).sendKeys(user.getUserName());
        getElement(loginPage.PasswordTextBox).sendKeys("aks");
    }

    @And("^user fills correct email and wrong password$")
    public void userFillsCorrectEmailAndWrongPassword() {
        elementClick(loginPage.SignInButton);
    }

    @Then("^user display to open modal$")
    public void userDisplayToOpenModal() {
        getElement(loginPage.userpageheaderlan).isDisplayed();
        driver.quit();
    }
}
