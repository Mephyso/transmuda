package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PinbarHelpPage extends BasePage {

    @FindBy (xpath = "//h3[.='How To Use Pinbar']")
    public WebElement pinbarHeader;

    @FindBy (xpath = "//p[contains(text(),'Use pin icon on the right top corner of page to create fast access link in the pinbar.')]")
    public WebElement pinbarExplanation;

    @FindBy (xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement pinbarImage;
}
