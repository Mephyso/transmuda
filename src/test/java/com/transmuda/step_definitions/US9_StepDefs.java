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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US9_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    CreateEventPage createEventPage=new CreateEventPage();
    @Given("User are on the homepage")
    public void users_are_on_the_homepage() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        createEventPage.spanActivities.click();
        BrowserUtils.clickWithJS(dashboardPage.activitiesModule);
        BrowserUtils.clickWithJS(dashboardPage.calenderEvent);
        BrowserUtils.sleep(5);
    }

    @And("the user navigates to {string} - {string}")
    public void theUserNavigatesToModule(String tab, String module) {
        createEventPage.waitUntilLoaderScreenDisappear();
        createEventPage.navigateToModule(tab, module);
        createEventPage.waitUntilLoaderScreenDisappear();
    }

    @When("Click the “Calendar Events” under the Activities")
    public void click_the_calendar_events_under_the_activities() {
        Actions actions = new Actions(Driver.getDriver());

        List<WebElement> menuOptions = createEventPage.menuOptions;
        for (WebElement each_menu : menuOptions) {
            actions.moveToElement(each_menu).perform();
            BrowserUtils.sleep(1);
        }

    }
    @When("Click the “Create Calendar Event” button")
    public void click_the_create_calendar_event_button() {
        BrowserUtils.clickWithJS(createEventPage.linkCreateCalendarEvent);
        BrowserUtils.sleep(3);

    }
    @When("Check the Repeat checkbox")
    public void check_the_repeat_checkbox() {

        BrowserUtils.clickWithJS(createEventPage.btn_repeat);

        BrowserUtils.sleep(3);
        BrowserUtils.clickWithJS(createEventPage.btn_checked);

    }

    @Then("Verify the repeat number is {int}")
    public void verify_the_repeat_number_is(Integer int1) {
        BrowserUtils.sleep(3);
        createEventPage.inputInterval.getAttribute("value");
        Assert.assertEquals("-2",createEventPage.inputInterval.getAttribute("value"));
    }


    @And("see error messages for entering invalid integers")
    public void seeErrorMessagesForEnteringInvalidIntegers(Integer int1) {
        BrowserUtils.sleep(3);
        createEventPage.inputInterval2.clear();
    }


    @Then("Verify the app displays {string}")
    public void verifyTheAppDisplays(String arg0) {
            BrowserUtils.sleep(3);
            createEventPage.spanThisValueShouldNot3.getText();
            Assert.assertEquals(createEventPage.spanThisValueShouldNot3.getText(),"The value have not to be more than 99.");
        }

    @And("See error messages for entering invalid integers")
    public void seeErrorMessagesForEnteringInvalidIntegers() {
    }
}
