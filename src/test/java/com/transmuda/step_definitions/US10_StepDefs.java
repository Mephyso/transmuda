package com.transmuda.step_definitions;

import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
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


import java.time.Duration;

import java.util.List;
public class US10_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
        CreateEventPage createEventPage=new CreateEventPage();
        @Given("the user logged in as Activities")
        public void the_user_logged_in_as_Activities() {
            dashboardPage.waitUntilLoaderScreenDisappear();
            createEventPage.spanActivities.click();
            BrowserUtils.clickWithJS(dashboardPage.activitiesModule);
            BrowserUtils.clickWithJS(dashboardPage.calenderEvent);
            BrowserUtils.sleep(5);

        }

        @When("the user navigates to Activities,Calendar Events")
        public void theUserNavigatesToModule(String tab, String module) {
            createEventPage.waitUntilLoaderScreenDisappear();
            createEventPage.navigateToModule(tab, module);
            createEventPage.waitUntilLoaderScreenDisappear();

        }

        @And("Click the “Calendar Events” under the Activities")
        public void click_the_calendar_events_under_the_activities() {
            Actions actions = new Actions(Driver.getDriver());
            List<WebElement> menuOptions = createEventPage.menuOptions;
            for (WebElement each_menu : menuOptions) {
                actions.moveToElement(each_menu).perform();
                BrowserUtils.sleep(1);

            }

        }
        @And("Click the “Create Calendar Event” button")
        public void click_the_create_calendar_event_button() {
            BrowserUtils.clickWithJS(createEventPage.linkCreateCalendarEvent);
            BrowserUtils.sleep(3);
            System.out.println("Click the “Create Calendar Event” button");
        }
        @Then("User saves the typed note with Save and Close")
                public void User_saves_the_typed_note_with_Save_and_Close(){
                BrowserUtils.clickWithJS(createEventPage.linkCreateCalendarEvent);
                BrowserUtils.sleep(3);
            System.out.println("User saves the typed note with Save and Close");

            }

        }