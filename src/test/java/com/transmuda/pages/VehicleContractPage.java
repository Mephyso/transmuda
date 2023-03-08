package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleContractPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='Vehicle Contracts']")
    public WebElement contractButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Contracts']")
    public WebElement vehicleContPage;


}
