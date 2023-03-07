package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.FleetVehiclePages;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US6_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    FleetVehiclePages fleetVehiclePages=new FleetVehiclePages();
    @Given("Click the Vehicles under the Fleet")
    public void click_the_vehicles_under_the_fleet() {

        BrowserUtils.sleep(1);
        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1'][normalize-space()='Fleet']")));
        BrowserUtils.sleep(5);
        fleetVehiclePages.vehicleButton.click();
        BrowserUtils.sleep(5);


    }
    @Then("user should see any car info has three dots “...”, and there are “view, edit, delete” icons.")
    public void userShouldSeeAnyCarInfoHasThreeDotsAndThereAreViewEditDeleteIcons( ) {

        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[21]/div[1]/div[1]/a[1]")));




        BrowserUtils.sleep(1);
        Assert.assertTrue( fleetVehiclePages.ViewButton.isDisplayed());
        BrowserUtils.sleep(1);
        Assert.assertTrue(fleetVehiclePages.EditButton.isDisplayed());
        BrowserUtils.sleep(1);
        Assert.assertTrue( fleetVehiclePages.DeleteButton.isDisplayed());

        System.out.println("is displayed");
    }
    }


