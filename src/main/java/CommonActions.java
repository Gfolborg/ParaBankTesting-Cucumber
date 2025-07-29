import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonActions {
    WebDriver driver;
    public CommonActions(WebDriver driver){
        this.driver=driver;
    }

    public WebDriver openBrowser(String BROWSER_TYPE){
        switch (BROWSER_TYPE) {
            case "Chrome":
                driver=new ChromeDriver();
            case "Edge":
                driver=new EdgeDriver();
            case "Firefox":
                driver=new FirefoxDriver();
            case "Internet Explorer":
                driver=new InternetExplorerDriver();
        }
                return driver;
    }

    public void closeBrowser(){
        driver.quit();
    }

}
