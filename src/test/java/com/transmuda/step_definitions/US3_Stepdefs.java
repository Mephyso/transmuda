package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.PinbarHelpPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US3_Stepdefs {

    DashboardPage dashboardPage = new DashboardPage();
    PinbarHelpPage pinbarHelpPagePage = new PinbarHelpPage();

    @And("the user click on the Learn how to use this space message")
    public void theUserClickOnTheLearnHowToUseThisSpaceMessage() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.clickWithJS(dashboardPage.pinbarHelpButton);
        BrowserUtils.sleep(5);}

    @Then("Verify user can see these messages {string} and {string}")
    public void verifyUserCanSeeTheseMessagesAnd(String expectedHeader, String expectedText) {
       String actualHeader = pinbarHelpPagePage.pinbarHeader.getText();
       String actualText = pinbarHelpPagePage.pinbarExplanation.getText();
       Assert.assertEquals(expectedHeader,actualHeader);
       Assert.assertEquals(expectedText, actualText);

    }

    @Then("the user should see an example image")
    public void theUserShouldSeeAnExampleImage() {
        Assert.assertTrue(pinbarHelpPagePage.pinbarImage.isDisplayed());
    }
}
