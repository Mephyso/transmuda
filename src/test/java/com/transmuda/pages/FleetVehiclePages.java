package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FleetVehiclePages extends BasePage{

    @FindBy(xpath = "( //span[@class='title title-level-2'])[3]")
     public WebElement vehicleButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[21]/div[1]/div[1]/a[1]")
    public  WebElement threeDot;

    @FindBy(xpath = "(//a[@title= 'Edit'])[1]")
    public  WebElement EditButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[21]/div[1]/div[1]/a[1]")
    public  WebElement DeleteButton;

    @FindBy(xpath = "(//a[@title= 'View'])[1]")
    public  WebElement ViewButton;

    @FindBy(xpath = "//button[@data-toggle='dropdown']/input[@type='checkbox']")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> allCheckBoxes;

}
