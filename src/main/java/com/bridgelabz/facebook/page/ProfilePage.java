package com.bridgelabz.facebook.page;


import com.bridgelabz.facebook.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseClass {

        @FindBy(xpath = "//span[contains(text(),'John Smith')]")
        WebElement element;
        public ProfilePage() {
            PageFactory.initElements(driver, this);
        }


        }


