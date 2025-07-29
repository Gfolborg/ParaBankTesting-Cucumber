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

    @FindBy(css = "input#id='customer.firstName'")
    WebElement firstNameTextBox;
    public void firstName(String firstName){
        firstNameTextBox.sendKeys();
    }

    @FindBy(css = "input.input[name='customer.lastName']")
    WebElement lastNameTextBox;
    public void lastName(String lastName){
        lastNameTextBox.sendKeys(lastName);
    }

    @FindBy(id = "customer.address.street")
    WebElement addressTextBox;
    public void address(String address){
        addressTextBox.sendKeys(address);
    }

    @FindBy(id = "customer.address.city")
    WebElement cityTextBox;
    public void city(String city){
        cityTextBox.sendKeys(city);
    }

    @FindBy(css = "input#customer.address.state")
    WebElement stateTextBox;
    public void state(String state){
        stateTextBox.sendKeys(state);
    }

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCodeTexBox;
    public void zipCode(String zipCode){
        zipCodeTexBox.sendKeys(zipCode);
    }

    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumberTextBox;
    public void phoneNumber(String phoneNumber){
        phoneNumberTextBox.sendKeys(phoneNumber);
    }

    @FindBy(id="customer.ssn")
    WebElement ssnTextBox;
    public void ssn(String ssn){
        ssnTextBox.sendKeys(ssn);
    }

    @FindBy(id = "customer.username")
    WebElement usernameTextBox;
    public void username(String username){
        usernameTextBox.sendKeys(username);
    }

    @FindBy(id = "customer.password")
    WebElement passwordTextBox;
    public void password(String password){
        passwordTextBox.sendKeys(password);
    }

    @FindBy(css = "input#repeatedPassword")
    WebElement confirmTextBox;
    public void confirmPassword(String password){
        confirmTextBox.sendKeys(password);
    }

    @FindBy(xpath = "input[@type='submit' and @value='Register']")
    WebElement registerButton;
    public void registerButton(){
        registerButton.click();
    }


}
