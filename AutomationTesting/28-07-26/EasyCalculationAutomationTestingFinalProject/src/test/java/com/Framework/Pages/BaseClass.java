package com.Framework.Pages;

import org.openqa.selenium.WebDriver;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;

public class BaseClass {

    public WebDriver driver;
    public ConfigDataProvider config;

    public void setup() {

        config = new ConfigDataProvider();

        driver = BrowserFactory.startBrowser(config.getBrowser());

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.get(config.getUrl());

    }

    public void tearDown() {

        if (driver != null) {

            driver.quit();

        }

    }

}