package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{


    @FindBy(css = "span.title-level-1")
    public List<WebElement> modulesNames;


}

