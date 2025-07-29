import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v136.page.Page;
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
    public void loginButton(){
        loginButton.click();
    }

    @FindBy(xpath = "//input[text()='Register']")
    WebElement registerButton;
    public void registerButton(){
        registerButton.click();
    }
}
