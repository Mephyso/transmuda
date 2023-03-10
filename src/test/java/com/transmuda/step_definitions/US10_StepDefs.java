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

    CreateEventPage createEventPage=new CreateEventPage();
    private String expectedText ="This is an example text for our test case.";

    @And("writes a note to the description")
    public void writesANoteToTheDescription() {
    createEventPage.descriptionBox.sendKeys(expectedText);
    }

    @Then("User saves the typed note with Save and Close")
    public void User_saves_the_typed_note_with_Save_and_Close(){
        BrowserUtils.clickWithJS(createEventPage.saveAndClose);
        BrowserUtils.sleep(5);
        String actualText = createEventPage.descriptionBox.getText();
        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);
        Assert.assertEquals(expectedText,actualText);
    }


}