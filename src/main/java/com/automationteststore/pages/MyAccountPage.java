package com.automationteststore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyAccountPage {
    private WebDriver driver;

    private String maintext = "//span[@class='maintext']";

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyMainText() {
        String expectedText = "MY ACCOUNT";
        String actualText = driver.findElement(By.xpath(maintext)).getText();
        Assert.assertEquals(actualText, expectedText, "Text is not match");
    }

}
