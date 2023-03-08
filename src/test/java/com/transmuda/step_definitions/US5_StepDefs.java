package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehiclesModelPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;

import java.util.ArrayList;
import java.util.List;

public class US5_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();
    @Then("the user clicks the Vehicle Model under the Fleet")
    public void the_user_clicks_the_vehicle_model_under_the_fleet() {
        BrowserUtils.hover(dashboardPage.fleetModule);
        BrowserUtils.sleep(5);
        dashboardPage.vehiclesModel.click();
        BrowserUtils.sleep(5);

    }
    @Then("the user verifies managers see below columns in the web-table")
    public void the_user_verifies_managers_see_below_columns_in_the_web_table(List<String> expectedTitles) {

        /*

        List<String> actualTitles = BrowserUtils.getElementsText(vehiclesModelPage.allVehiclesModelTableHeaders);

        Assert.assertEquals(expectedTitles,actualTitles);
        */

        List<String> actualTitles = new ArrayList<>();

        for (WebElement each : vehiclesModelPage.allVehiclesModelTableHeaders) {
            actualTitles.add(each.getText());
        }
        System.out.println("expectedTitles = " + expectedTitles);
        System.out.println("actualTitles = " + actualTitles);
        Assert.assertEquals(expectedTitles,actualTitles);

    }

    @Then("the user verify that the drivers see the error message {string}")
    public void the_User_Verify_That_The_Drivers_See_The_Error_Message(String expectedTitle) {
        String actualTitle = dashboardPage.errorMessage.getText();

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
