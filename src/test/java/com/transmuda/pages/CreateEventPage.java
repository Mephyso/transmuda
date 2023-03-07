package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

// page_url = https://qa.transmuda.com/calendar/event/create
public class CreateEventPage extends BasePage{

    public CreateEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "span[class='title title-level-1']")
    public List<WebElement> menuOptions;
    @FindBy(css = "input.recurrence-subview-control__number")
    public WebElement inputInterval;

    @FindBy(xpath = "//*[text() = 'This value should not be blank.']")
    public WebElement spanThisValueShouldNot;

    @FindBy(css = "span[style='top: 361px; left: 182px;'] span")
    public WebElement spanThisValueShouldNot2;

    @FindBy(css = "span.title.title-level-1")
    public WebElement spanActivities;
    @FindBy(xpath = "//span[@class='title title-level-2'][contains(.,'Calendar Events')]")
    public WebElement calenderEvent;

    @FindBy(xpath = "//*[text() = 'Calendar Events']")
    public WebElement h1CalendarEvents;

    @FindBy(css = "a[class*='btn-primary']")
    public WebElement linkCreateCalendarEvent;
    @FindBy(id = "recurrence-repeat-view1103")
    public WebElement btn_repeat;
    @FindBy(xpath = "//input[@checked='checked']")
    public  WebElement btn_checked;

    @FindBy(css = "[data-name = 'recurrence-repeat']")
    public WebElement inputRecurrenceRepeat;

    @FindBy(css = "input[data-validation='{\"NotBlank\":{},\"Number\":{\"min\":1,\"max\":99},\"Type\":{\"type\":\"integer\"}}']")
    public WebElement inputInterval2;

    @FindBy(xpath = "//*[text() = 'This value should not be blank.']")
    public WebElement spanThisValueShouldNot3;

    WebElement loaderMask;
    public void waitUntilLoaderScreenDisappear() {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToModule (String tab, String module){
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)), 5);
        }
    }
}
