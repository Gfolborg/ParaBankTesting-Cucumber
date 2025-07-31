package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text'] and @class='input'")
    WebElement usernameInput;
    public void usernameTextBox(String username){
        usernameInput.sendKeys(username);
    }

    @FindBy(xpath = "//input[@class='login' and @type='password']")
    WebElement passwordTextBox;
    public void passwordInput(String password){
        passwordTextBox.sendKeys(password);
    }

    @FindBy(css = "input.button[value='Log In']")
    WebElement loginButton;
    public void clickLoginButton(){
        loginButton.click();
    }

    @FindBy(xpath = "//a[contains(@href, 'register')]")
    WebElement registerButton;
    public void clickRegisterButton(){
        registerButton.click();
    }
}
