package com.Knauf.pages;

import com.Knauf.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ITDepartmentJobsPage {

    public ITDepartmentJobsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindAll( @FindBy( xpath = "//li[@class='block-grid-item border border-block-base-text border-opacity-15 min-h-[180px] items-center justify-center rounded overflow-hidden relative z-career-job-card-image']"))
    public List<WebElement> listOfJobs;

}
