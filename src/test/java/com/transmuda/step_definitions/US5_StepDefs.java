package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class US5_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user clicks the Vehicle Model under the Fleet")
    public void the_user_clicks_the_vehicle_model_under_the_fleet() {
        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1'][normalize-space()='Fleet']")));
        BrowserUtils.sleep(5);
        dashboardPage.vehiclesModel.click();
        BrowserUtils.sleep(5);


    }
    @Then("the user verifies managers see {int} columns in the web-table")
    public void the_user_verifies_managers_see_columns_in_the_web_table(Integer int1) {

    }

}
