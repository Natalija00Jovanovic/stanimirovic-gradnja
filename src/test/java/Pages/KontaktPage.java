package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KontaktPage {

    WebDriver driver;

    WebElement kontaktWrapperElement;

    WebElement kontaktFormArea;

    WebElement imeField;

    WebElement prezimeField;

    WebElement emailField;

    WebElement porukaField;

    WebElement posaljiButton;

    WebElement stupiteUKontaktArea;

    WebElement stupiteUKontaktTitle;

    WebElement messageToUserArea;

    WebElement kontaktPerson1Area;

    WebElement kontaktPerson1Name;

    WebElement kontaktPerson1PhoneNumber;

    WebElement kontaktPerson1Email;

    WebElement kontaktPerson2Area;

    WebElement kontaktPerson2Name;

    WebElement kontaktPerson2PhoneNumber;

    WebElement kontaktPerson2Email;

    String kontaktPerson1NameText;

    String kontaktPerson2NameText;

    String kontaktEmailText;

    String kontaktPageURL;

    public KontaktPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getKontaktWrapperElement() {
        return driver.findElement(By.id("vhOgUa"));
    }

    public WebElement getKontaktFormArea() {
        return driver.findElement(By.id("wpforms-form-195"));
    }

    public WebElement getImeField() {
        return driver.findElement(By.id("wpforms-195-field_0"));
    }

    public WebElement getPrezimeField() {
        return driver.findElement(By.id("wpforms-195-field_0-last"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("wpforms-195-field_1"));
    }

    public WebElement getPorukaField() {
        return driver.findElement(By.id("wpforms-195-field_2"));
    }

    public WebElement getPosaljiButton() {
        return driver.findElement(By.id("wpforms-submit-195"));
    }

    public WebElement getStupiteUKontaktArea() {
        return driver.findElement(By.id("nLuSof"));
    }

    public WebElement getStupiteUKontaktTitle() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div[4]/div[2]/div[2]/div/h2"));
    }

    public WebElement getMessageToUserArea() {
        return driver.findElement(By.className("text-content-inner"));
    }

    public WebElement getKontaktPerson1Area() {
        return driver.findElement(By.id("Cl47t1"));
    }

    public WebElement getKontaktPerson1Name() {
        return driver.findElement(By.cssSelector(".guten-element.gutenverse-text-editor.guten-3CN8uB"));
    }

    public WebElement getKontaktPerson1PhoneNumber() {
        return driver.findElement(By.id("guten-n9cKcb"));
    }

    public WebElement getKontaktPerson1Email() {
        return driver.findElement(By.id("guten-cKB64d"));
    }

    public WebElement getKontaktPerson2Name() {
        return driver.findElement(By.cssSelector(".guten-element.gutenverse-text-editor.guten-t7io2W"));
    }

    public WebElement getKontaktPerson2PhoneNumber() {
        return driver.findElement(By.id("guten-kjJn5P"));
    }

    public WebElement getKontaktPerson2Email() {
        return driver.findElement(By.id("guten-y1fVLm"));
    }

    public WebElement getKontaktPerson2Area() {
        return driver.findElement(By.id("EEO4TN"));
    }

    public String kontaktPerson1NameText() {
        return "Slaviša Stanimirović";
    }

    public String kontaktPerson2NameText() {
        return "Marko Stanimirović";
    }

    public String kontaktEmailText() {
        return "info@stanimirovicgradnja.rs";
    }

    public String getKontaktPageURL() {
        return "https://stanimirovicgradnja.rs/kontakt/";
    }

}
