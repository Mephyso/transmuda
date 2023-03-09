package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;



public class VehicleOdoPage extends BasePage{

@FindBy(xpath = "//input[@value='1']")
    public WebElement pageNumber;
@FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPageButton;



}
