package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactHeaderPage {

    WebDriver driver;

    WebElement address;

//    WebElement phone1;

//    WebElement phone2;

    WebElement openHours;

    List<WebElement> listPhoneNumbers;

    String phoneNumber1;

    String phoneNumber2;

    String homePageURL;

    public ContactHeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddress() {
        return driver.findElement(By.id("guten-yPqWpN"));
    }
/*
    public WebElement getPhone1() {
        return driver.findElement(By.cssSelector(".+381.69.642.459"));
    }

    public WebElement getPhone2() {
        return driver.findElement(By.cssSelector(".+381.69.28.98.234"));
    }
*/
    public List<WebElement> getListPhoneNumbers() {
        return driver.findElements(By.cssSelector(".guten-element.guten-icon-list-item.guten-e12yYM"));
    }

    public WebElement getOpenHours() {
        return driver.findElement(By.id("guten-2brVCj"));
    }

    public String getPhoneNumber1() {
        return "+381 69 642 459";
    }

    public String getPhoneNumber2() {
        return "+381 69 28 98 234";
    }

    public String getOpenHoursText() {
        return "Radno vreme: Pon – Pet 08:00 – 16:00";
    }

    public String getHomePageURL() {
        return "https://stanimirovicgradnja.rs/";
    }

    //----------------------------------------------------



}
