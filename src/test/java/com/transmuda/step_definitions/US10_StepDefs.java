package com.transmuda.step_definitions;

import com.transmuda.pages.CreateEventPage;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10_StepDefs {

    CreateEventPage createEventPage=new CreateEventPage();

    @Then("writes {string} to the description box")
    public void writesToTheDescriptionBox(String expectedText) {
        createEventPage.waitUntilLoaderScreenDisappear();

        Driver.getDriver().switchTo().frame(0);

        createEventPage.descriptionBox.click();
        createEventPage.descriptionBox.sendKeys(expectedText);
        String actualText = createEventPage.descriptionBoxText.getText();

        Assert.assertEquals(expectedText,actualText);
    }
}