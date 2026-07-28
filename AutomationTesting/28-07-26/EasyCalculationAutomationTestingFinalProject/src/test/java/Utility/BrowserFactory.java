package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver startBrowser(String browserName) {

        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        }

        else if (browserName.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        }

        else if (browserName.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        }

        else {

            throw new RuntimeException("Browser Not Supported");

        }

        return driver;

    }

}