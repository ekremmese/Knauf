package com.Knauf.pages;

import com.Knauf.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersMainPage {

    public CareersMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy ( xpath = "//button[.='Accept all']")
    public WebElement acceptAllCookiesButton;

    @FindBy ( linkText = "Click here to explore our open job opportunities")
    public WebElement searchJobOpportunitiesButton;


}
