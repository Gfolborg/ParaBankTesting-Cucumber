package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Pages.CommonActions;
import Pages.TestData;
import Pages.RegistrationPage;


public class RegistrationTestSteps implements TestData {
    WebDriver driver;
    CommonActions actions;
    HomePage homePage;
    RegistrationPage register;


    @Given("Open Browser")
    public void open_browser() {
        actions = new CommonActions(driver);
        driver = actions.openBrowser(BROWSER_TYPE);
    }

    @And("Enter url")
    public void enter_url() {
        actions.enterUrl(URL);
    }
    @When("Click register")
    public void click_register() {
        homePage = new HomePage(driver);
        homePage.clickRegisterButton();
    }
    @And("Fill out Registration Form")
    public void fill_out_registration_form() {
        register = new RegistrationPage(driver);
        register.firstName(VALID_FIRSTNAME)
                .lastName(VALID_LASTNAME)
                .address("1234 Main St")
                .city(CITY)
                .state(STATE)
                .zipCode(ZIPCODE)
                .phoneNumber(PHONE_NUMBER)
                .ssn(SSN)
                .username(USERNAME)
                .password(PASSWORD)
                .confirmPassword(PASSWORD);
    }
    @And("Click register button")
    public void click_register_button() {
        register.clickRegisterButton();

    }
    @Then("Validate registration successful")
    public void validate_registration_successful() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals("ParaBank | Customer Created", pageTitle);
    }
    @And("Close Browser")
    public void close_browser() {
        actions.closeBrowser();
    }
}
