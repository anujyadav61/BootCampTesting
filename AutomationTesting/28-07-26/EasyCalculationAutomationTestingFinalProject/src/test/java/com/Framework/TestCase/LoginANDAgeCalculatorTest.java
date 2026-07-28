package com.Framework.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Framework.Pages.AgeCalculatorPage;
import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import Utility.ExcelDataReader;
import Utility.Screenshot;

public class LoginANDAgeCalculatorTest extends BaseClass {

    LoginPage login;
    AgeCalculatorPage age;

    ExcelDataReader loginData;
    ExcelDataReader ageData;

    @BeforeMethod
    public void startApplication() {

        setup();

        login = new LoginPage(driver);

        age = new AgeCalculatorPage(driver);

        loginData = new ExcelDataReader("./TestData/Login Data.xlsx");

        ageData = new ExcelDataReader("./TestData/TestData.xlsx");

    }

    @Test
    public void verifyAgeCalculator() {

        String username = loginData.getUsername(1);
        String password = loginData.getPassword(1);

        // Login
        login.login(username, password);

        Screenshot.captureScreenshot(driver, "Login_Success");

        // Open Age Calculator
        age.openAgeCalculator();

        Screenshot.captureScreenshot(driver, "AgeCalculator_Page");

        // Read age data from Excel
        String day = ageData.getDay(1);
        String month = ageData.getMonth(1);
        String year = ageData.getYear(1);

        // Calculate Age
        age.calculateAge(day, month, year);

        Screenshot.captureScreenshot(driver, "Age_Result");

        // Scroll Down
        age.scrollDown();

    }

    @AfterMethod
    public void closeApplication() {

        loginData.closeWorkbook();

        ageData.closeWorkbook();

        tearDown();

    }

}