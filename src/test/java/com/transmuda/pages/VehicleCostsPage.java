package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostsPage extends BasePage{
    @FindBy(xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> allVehicleCostsTablesHeaders;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> allCheckBoxes;

}
