package com.Knauf.step_definitions;

import com.Knauf.pages.*;
import com.Knauf.utilitites.BrowserUtilities;
import com.Knauf.utilitites.ConfigurationReader;
import com.Knauf.utilitites.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ApplyJob_StepDefs {


    String currentWindowHandle;
    MainPage mainPage = new MainPage();
    CareersMainPage careersMainPage = new CareersMainPage();
    JobSearchPage jobSearchPage = new JobSearchPage();
    ITDepartmentJobsPage itDepartmentJobsPage = new ITDepartmentJobsPage();
    JobDescriptionPage jobDescriptionPage = new JobDescriptionPage();

    @Given("user is on Knauf English page")
    public void user_is_on_knauf_english_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        mainPage.acceptAllCookiesButton.click();
    }
    @When("user hover overs career tab")
    public void user_hover_overs_career_tab() {
        // Write code here that turns the phrase above into concrete actions
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.careerTab).perform();
        
    }

    @When("user clicks Find current job openings button")
    public void user_Clicks_FindCurrent_Job_Openings_Button() {
        //Write code here that turns the phrase above into concrete actions
        currentWindowHandle = Driver.getDriver().getWindowHandle();
        mainPage.findCurrentJobOpeningsButton.click();
        BrowserUtilities.sleep(2);


    }

    @When("user switches to careers page")
    public void user_switches_to_careers_page() {
        // Write code here that turns the phrase above into concrete actions
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(currentWindowHandle))
                Driver.getDriver().switchTo().window(windowHandle);
        }
    }

    @And("user clicks on Click here to explore our open job positions opportunities button")
    public void user_Clicks_On_Click_Here_To_Explore_Our_Open_Job_Positions_Opportunities_Button() {
        // Write code here that turns the phrase above into concrete actions
        //BrowserUtilities.sleep(3);
        careersMainPage.acceptAllCookiesButton.click();
        careersMainPage.searchJobOpportunitiesButton.click();
    }

    @When("user selects IT as a department")
    public void user_selects_it_as_a_department() {
        // Write code here that turns the phrase above into concrete actions
        jobSearchPage.ITDepartmentLink.click();
    }
    @When("user clicks one of the job openings on the list")
    public void user_clicks_one_of_the_job_openings_on_the_list() {
        // Write code here that turns the phrase above into concrete actions
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(itDepartmentJobsPage.listOfJobs.get(0)));
        BrowserUtilities.sleep(30);
        System.out.println(itDepartmentJobsPage.listOfJobs.size());
        itDepartmentJobsPage.listOfJobs.get(0).click();

    }
    @Then("user should be able to apply the job")
    public void user_should_be_able_to_apply_the_job() {
        // Write code here that turns the phrase above into concrete actions
        jobDescriptionPage.acceptAllCookies.click();
        Assert.assertTrue(jobDescriptionPage.applyJobButton.isEnabled());
        
    }



}
