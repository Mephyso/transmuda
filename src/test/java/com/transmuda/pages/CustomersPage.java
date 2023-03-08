package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomersPage extends BasePage {
    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Accounts']")
    public WebElement customPage;


    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filtersButton;


    @FindBy(css = "div.btn.filter-criteria-selector.oro-drop-opener.oro-dropdown-toggle.filter-default-value")
    public List<WebElement> manageFiltersButtons;
}
