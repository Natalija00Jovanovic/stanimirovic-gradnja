package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IzgradjeniObjektiPage {

    WebDriver driver;

    WebElement izgradjeniObjektiWrapperElement;

    String izgradjeniObjektiURL;

    public IzgradjeniObjektiPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getIzgradjeniObjektiWrapperElement() {
        return driver.findElement(By.id("vhOgUa"));
    }

    public String getIzgradjeniObjektiURL() {
        return "https://stanimirovicgradnja.rs/izgradeni-objekti/";
    }

}
