package com.transmuda.step_definitions;

import com.transmuda.pages.VehicleContractPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US04_StepDefs {

    VehicleContractPage vehicleContractPage = new VehicleContractPage();
    @Then("the user click the Vehicle Contracts under the Fleet")
    public void the_user_click_the_vehicle_contracts_under_the_fleet() {
        BrowserUtils.hover(vehicleContractPage.fleetModule);
        BrowserUtils.sleep(5);
        vehicleContractPage.contractButton.click();
        BrowserUtils.sleep(5);


    }
    @Then("verify managers can access the Vehicle contracts page")
    public void verify_managers_can_access_the_vehicle_contracts_page() {

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);



    }
    @Then("the user clicks the Vehicle Contracts under the Fleet")
    public void the_user_clicks_the_vehicle_contracts_under_the_fleet() {

        BrowserUtils.hover(vehicleContractPage.fleetModule);
        BrowserUtils.sleep(5);
        vehicleContractPage.vehicleContPage.click();
        BrowserUtils.sleep(5);
    }


}
