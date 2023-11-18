package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver() {
        String browser =ConfigReader.getProperty("browser");
        if (driver == null){
            switch (browser){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    driver=new InternetExplorerDriver();
            }

        } else if ("chorome-headless".equals(browser)) {
            ChromeOptions options =new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--wnidow-size=1920.1080");
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver(options);
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
