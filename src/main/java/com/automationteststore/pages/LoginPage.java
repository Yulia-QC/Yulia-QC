package com.automationteststore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
private String username = "//input[@id='loginFrm_loginname']";
private String password = "//input[@id='loginFrm_password']";
private String loginButton = "//button[@title='Login']";

public LoginPage(WebDriver driver) {
    this.driver = driver;
}

    public void enterUserName() {
        driver.findElement(By.xpath(username)).sendKeys("username");
    }

    public void enterPassword() {
        driver.findElement(By.xpath(password)).sendKeys("password");
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath(loginButton)).click();
    }
}
