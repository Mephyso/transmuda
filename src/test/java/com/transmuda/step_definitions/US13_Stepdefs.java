package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US13_Stepdefs {

    DashboardPage dashboardPage = new DashboardPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    @And("the user click on the Vehicle Costs under the Fleet")
    public void theUserClickOnTheVehicleCostsUnderTheFleet() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.clickWithJS(dashboardPage.fleetModule);
        BrowserUtils.clickWithJS(dashboardPage.fleetModuleVehicleCosts);
        BrowserUtils.sleep(5);
    }

    @Then("the user should see following titles in the table")
    public void theUserShouldSeeFollowingTitlesInTheTable(List<String> expectedTitles) {
        List<String> actualTitles = new ArrayList<>();
        for (WebElement element:vehicleCostsPage.allVehicleCostsTablesHeaders)
            if (element.getText().length()>0) actualTitles.add(element.getText());

        Assert.assertEquals(expectedTitles,actualTitles);
    }

    @And("the user click the first checkbox")
    public void theUserClickTheFirstCheckbox() {
        BrowserUtils.clickWithJS(vehicleCostsPage.firstCheckBox);
    }

    @Then("the user should see all the vehicle costs are checked")
    public void theUserShouldSeeAllTheVehicleCostsAreChecked() {
        boolean result=true;
        for (WebElement element:vehicleCostsPage.allCheckBoxes)
            if (!element.isSelected()) result=false;

        Assert.assertTrue(result);
    }

}
