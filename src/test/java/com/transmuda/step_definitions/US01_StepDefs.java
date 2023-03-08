package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    @Then("the user should see main module names as listed")
    public void the_user_should_see_main_module_names_as_listed(List<String> expectedModuleNames) {

        BrowserUtils.sleep(5);
        List<String> actualModuleNames = new ArrayList<>();
        for (WebElement each : dashboardPage.modulesNames) {
            actualModuleNames.add(each.getText());
        }

        Assert.assertEquals(expectedModuleNames,actualModuleNames);
    }


}
