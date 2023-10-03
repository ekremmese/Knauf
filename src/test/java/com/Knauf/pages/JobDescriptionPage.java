package com.Knauf.pages;

import com.Knauf.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDescriptionPage {

    public JobDescriptionPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//button[text()='Accept all']")
    public WebElement acceptAllCookies;

    @FindBy ( css = "span.truncate")
    public WebElement applyJobButton;

}
