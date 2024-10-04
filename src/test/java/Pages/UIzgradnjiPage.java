package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UIzgradnjiPage {

    WebDriver driver;

    WebElement uIzgradnjiWrapperElement;

    String uIzgradnjiURL;

    public UIzgradnjiPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUIzgradnjiWrapperElement() {
        return driver.findElement(By.id("vhOgUa"));
    }

    public String getUIzgradnjiURL() {
        return "https://stanimirovicgradnja.rs/u-izgradnji/";
    }

}
