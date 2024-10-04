package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UskoroUPonudiPage {

    WebDriver driver;

    WebElement uskoroUPonudiWrapperElement;

    String uskoroUPonudiURL;

    public UskoroUPonudiPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUskoroUPonudiWrapperElement() {
        return driver.findElement(By.id("vhOgUa"));
    }

    public String getUskoroUPonudiURL() {
        return "https://stanimirovicgradnja.rs/uskoro-u-ponudi/";
    }

}
