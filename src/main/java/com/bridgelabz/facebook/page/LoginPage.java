package com.bridgelabz.facebook.page;

import com.bridgelabz.facebook.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    //declaration

    @FindBy(id="email")
    WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;

    @FindBy(name = "login")
    WebElement loginButton;

    //initialization
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }


    public String verifyPageTitle(){
        return driver.getTitle();
    }


             public HomePage login(){

                 username.sendKeys(properties.getProperty("username"));
                 password.sendKeys(properties.getProperty("password"));
                 loginButton.click();
                 return new HomePage();
                 }

             }


