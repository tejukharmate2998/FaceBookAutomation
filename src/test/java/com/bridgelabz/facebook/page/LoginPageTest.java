package com.bridgelabz.facebook.page;

import com.bridgelabz.facebook.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage loginPage;

    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @Test(priority = 1)
    public void loginPageTitleTest(){
        loginPage = new LoginPage();
        String loginPageTitle = loginPage.verifyPageTitle();
        //System.out.println("Login Page Title is:"+loginPageTitle);
        Assert.assertEquals(loginPageTitle, "Facebook – log in or sign up", loginPageTitle);

    }
    @Test(priority = 2)
    public void loginTest() {
        loginPage = new LoginPage();
         loginPage.login();
    }

        @AfterMethod
        public void tearDown(){
           // driver.quit();
        }

    }


