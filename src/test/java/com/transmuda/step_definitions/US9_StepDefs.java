package com.transmuda.step_definitions;


import com.transmuda.pages.CreateEventPage;
import com.transmuda.pages.DashboardPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US9_StepDefs {

    CreateEventPage createEventPage = new CreateEventPage();


    @And("See error messages when entering {int} verify the app displays {string}")
    public void seeErrorMessagesWhenEnteringVerifyTheAppDisplays(int num, String message) {
        createEventPage.inputInterval.sendKeys(num+"");
        if (num<1){Assert.assertEquals(message, createEventPage.lessThan1Message.getText());}
        if (num>99){Assert.assertEquals(message, createEventPage.moreThan99Message.getText());}
    }

    @When("Click the {string} under the {string}")
    public void clickTheCalendarEventsUnderThe(String module, String tab) {
        createEventPage.navigateToModule(tab,module);
    }
}
