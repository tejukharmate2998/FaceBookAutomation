package com.bridgelabz.facebook.page;

import com.bridgelabz.facebook.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//span[contains(text(),'John Smith')]")
    WebElement userProfile;

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public String verifyHomePagePageTitle() {
        return driver.getTitle();
    }

    public ProfilePage clickOnProfile() {
        userProfile.click();
        return new ProfilePage();
    }
}


