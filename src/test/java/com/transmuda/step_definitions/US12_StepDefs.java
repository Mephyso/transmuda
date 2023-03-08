package com.transmuda.step_definitions;

import com.transmuda.pages.CustomersPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US12_StepDefs {
   CustomersPage customersPage= new CustomersPage();
    @Given("the user Click the {string} under the Customers")
    public void the_user_click_the_under_the_customers(String string) {

        BrowserUtils.hover(customersPage.customersModule);
        BrowserUtils.sleep(5);
        customersPage.customPage.click();
        BrowserUtils.sleep(5);

    }
    @Given("the user Click the Filters button")
    public void the_user_click_the_button() {
        BrowserUtils.waitForClickablility(customersPage.filtersButton,10);
    customersPage.filtersButton.click();


    }
    @Then("the user should see following titles on the columns")
    public void the_user_should_see_following_titles_on_the_columns(List<String> expectedPageFiltersName) {

    List<String> actualPageFiltersName= new ArrayList<>();
        for (WebElement each : customersPage.manageFiltersButtons) {
            actualPageFiltersName.add(each.getText());
        }
        Assert.assertEquals(expectedPageFiltersName,actualPageFiltersName);
    }


}
