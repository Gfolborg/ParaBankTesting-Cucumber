package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.io.File;

public class CommonActions {
    static WebDriver driver;
    public CommonActions(WebDriver driver){
        this.driver=driver;
    }

    public WebDriver openBrowser(String BROWSER_TYPE){
        switch (BROWSER_TYPE) {
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "Internet Explorer":
                driver=new InternetExplorerDriver();
                break;
        }
        return driver;
    }


    public void closeBrowser(){
        driver.quit();
    }

    public void enterUrl(String url){
        driver.get(url);
    }

}
