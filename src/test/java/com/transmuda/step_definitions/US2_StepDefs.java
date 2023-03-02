package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US2_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @And("the user click on the question icon")
    public void theUserClickOnTheQuestionIcon() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(5);
        dashboardPage.questionIcon.click();
        BrowserUtils.sleep(5);
    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedTitle) {
        BrowserUtils.switchToWindow(expectedTitle);
        BrowserUtils.verifyTitle(expectedTitle);
    }
}
