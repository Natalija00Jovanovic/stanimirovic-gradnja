package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ONamaPage {

    WebDriver driver;

    WebElement oNamaWrapperElement;

    String oNamaURL;

    public ONamaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getONamaWrapperElement() {
        return driver.findElement(By.id("vhOgUa"));
    }

    public String getONamaURL() {
        return "https://stanimirovicgradnja.rs/o-nama/";
    }

}
