package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();

        DriverFactory.driver = new ChromeDriver();

        DriverFactory.driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        DriverFactory.driver.quit();

    }

}