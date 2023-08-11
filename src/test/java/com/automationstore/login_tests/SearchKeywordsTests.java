package com.automationstore.login_tests;

import com.automationteststore.base.DriverFactory;
import com.automationteststore.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchKeywordsTests {
    private WebDriver driver;

    @BeforeTest
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
    }
    @Test
    public void verifyPositiveSearchProductTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.enterSearchValue("Armani");

    }

}
