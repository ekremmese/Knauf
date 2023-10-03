package com.Knauf.pages;

import com.Knauf.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSearchPage {
    public JobSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy( xpath = "//span[text()='IT']")
    public WebElement ITDepartmentLink;


}
