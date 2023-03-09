package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleOdoPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_StepDefs {


    VehicleOdoPage vehicleOdoPage = new VehicleOdoPage();


    @Then("the user should see error message {string}")
    public void the_user_should_see_error_message(String expectedTitle) {
        String actualTitle = vehicleOdoPage.errorMessage.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
        BrowserUtils.sleep(5);

    }


    @Then("verify the default page as {int}")
    public void verifyTheDefaultPageAs(int pageNumber) {
        vehicleOdoPage.pageNumber.getAttribute("value");
        BrowserUtils.sleep(5);
        Assert.assertEquals("1",vehicleOdoPage.pageNumber.getAttribute("value"));
        BrowserUtils.sleep(5);
    }



    @Then("verify the View Per Page is {int}")
    public void verifyTheViewPerPageIs(int viewPageButton) {
        vehicleOdoPage.viewPageButton.getText();
        BrowserUtils.sleep(5);
    Assert.assertEquals("25", vehicleOdoPage.viewPageButton.getText());
        BrowserUtils.sleep(5);
    }


}



