package com.bridgelabz.facebook.page;

import com.bridgelabz.facebook.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homepage;
    ProfilePage profilePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homepage = new HomePage();
        homepage = loginPage.login();
    }

    @Test
    public void verifyClickOnProfile() {
        profilePage = homepage.clickOnProfile();

    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}


