package com.Knauf.pages;


import com.Knauf.utilitites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button#onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButton;

    @FindBy(xpath = "//span[@data-cy='header-nav-3']")
    public WebElement careerTab;

    @FindBy( xpath = "//a[@href='https://career.knauf.com/']")
    public WebElement  findCurrentJobOpeningsButton;



}
