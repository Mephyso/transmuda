package com.transmuda.step_definitions;

import com.transmuda.pages.FleetVehiclePages;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.Random;

public class US7_StepDefs {
    FleetVehiclePages fleetVehiclePages=new FleetVehiclePages();
    @Then("once the users launch on the Vehicle page, all the checkboxes should be unchecked")
    public void onceTheUsersLaunchOnTheVehiclePageAllTheCheckboxesShouldBeUnchecked() {
        boolean result=true;
        for (WebElement element:fleetVehiclePages.allCheckBoxes)
            if (element.isSelected()) result=false;

        Assert.assertTrue(result);
    }

    @Then("user checks the first checkbox to check all the cars")
    public void userChecksTheFirstCheckboxToCheckAllTheCars() {
        BrowserUtils.clickWithJS(fleetVehiclePages.firstCheckBox);

        boolean result=true;
        for (WebElement element:fleetVehiclePages.allCheckBoxes)
            if (!element.isSelected()) result=false;

        Assert.assertTrue(result);
    }

    @Then("users can select any car")
    public void usersCanSelectAnyCar() {
        Random rand = new Random();
        int index = rand.nextInt(fleetVehiclePages.allCheckBoxes.size());
        BrowserUtils.clickWithJS(fleetVehiclePages.allCheckBoxes.get(index));

        boolean result=false;
        for (WebElement element:fleetVehiclePages.allCheckBoxes)
            if (element.isSelected()) { result=true; break;}

        Assert.assertTrue(result);

    }
}
