package com.automationteststore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private String homePageUrl = "https://automationteststore.com/";
    private String loginOrRegisterButton = "//a[text()='Login or register']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginOrRegisterButton() {
        driver.findElement(By.xpath(loginOrRegisterButton)).click();

    }

    public void openPage() {
        driver.get(homePageUrl);
    }
}
