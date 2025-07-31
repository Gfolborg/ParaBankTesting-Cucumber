package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement firstNameTextBox;
    public RegistrationPage firstName(String firstName) {
        firstNameTextBox.sendKeys(firstName);
        return this;
    }

    @FindBy(css = "input.input[name='customer.lastName']")
    WebElement lastNameTextBox;
    public RegistrationPage lastName(String lastName) {
        lastNameTextBox.sendKeys(lastName);
        return this;
    }

    @FindBy(id = "customer.address.street")
    WebElement addressTextBox;
    public RegistrationPage address(String address) {
        addressTextBox.sendKeys(address);
        return this;
    }

    @FindBy(id = "customer.address.city")
    WebElement cityTextBox;
    public RegistrationPage city(String city) {
        cityTextBox.sendKeys(city);
        return this;
    }

    @FindBy(css = "input#customer\\.address\\.state")
    WebElement stateTextBox;

    public RegistrationPage state(String state) {
        stateTextBox.sendKeys(state);
        return this;
    }

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCodeTexBox;

    public RegistrationPage zipCode(String zipCode) {
        zipCodeTexBox.sendKeys(zipCode);
        return this;
    }

    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumberTextBox;

    public RegistrationPage phoneNumber(String phoneNumber) {
        phoneNumberTextBox.sendKeys(phoneNumber);
        return this;
    }

    @FindBy(id = "customer.ssn")
    WebElement ssnTextBox;

    public RegistrationPage ssn(String ssn) {
        ssnTextBox.sendKeys(ssn);
        return this;
    }

    @FindBy(id = "customer.username")
    WebElement usernameTextBox;

    public RegistrationPage username(String username) {
        usernameTextBox.sendKeys(username);
        return this;
    }

    @FindBy(id = "customer.password")
    WebElement passwordTextBox;

    public RegistrationPage password(String password) {
        passwordTextBox.sendKeys(password);
        return this;
    }

    @FindBy(css = "input#repeatedPassword")
    WebElement confirmTextBox;

    public RegistrationPage confirmPassword(String password) {
        confirmTextBox.sendKeys(password);
        return this;
    }

    @FindBy(xpath = "//input[@type='submit' and @value='Register']")
    WebElement registerButton;
    public RegistrationPage clickRegisterButton() {
        registerButton.click();
        return this;
    }


}
