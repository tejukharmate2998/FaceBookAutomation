package com.bridgelabz.facebook.page;

import com.bridgelabz.facebook.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends BaseClass {
        LoginPage loginPage;
        ProfilePage profilePage;
        HomePage homePage;
        public  ProfilePageTest(){
            super();
        }

        @BeforeMethod
        public void setUp() {
            initialization();
            loginPage = new LoginPage();
            profilePage =homePage.clickOnProfile();
        }

        @Test
        public void launchFB_profilePage() throws InterruptedException {
            profilePage = new ProfilePage();

        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
