package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickableHeaderPage {

    WebDriver driver;

    WebElement clickableLogo;

    WebElement pocetnaHeaderElement;

    WebElement projektiHeaderMenu;

    WebElement oNamaHeaderElement;

    WebElement kontaktHeaderElement;

    WebElement uIzgradnjiMenuOption;

    WebElement uskoroUPonudiMenuOption;

    WebElement izgradjeniObjektiMenuOption;

    public ClickableHeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getClickableLogo() {
        return driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div[4]/div[1]/div[2]/div/div/a/img"));
    }

    public WebElement getPocetnaHeaderElement() {
        return driver.findElement(By.id("menu-item-79"));
    }

    public WebElement getProjektiHeaderMenu() {
        return driver.findElement(By.id("menu-item-464"));
    }

    public WebElement getONamaHeaderElement() {
        return driver.findElement(By.id("menu-item-81"));
    }

    public WebElement getKontaktHeaderElement() {
        return driver.findElement(By.id("menu-item-80"));
    }

    public WebElement getUIzgradnjiMenuOption() {
        return driver.findElement(By.id("menu-item-461"));
    }

    public WebElement getUskoroUPonudiMenuOption() {
        return driver.findElement(By.id("menu-item-460"));
    }

    public WebElement getIzgradjeniObjektiMenuOption() {
        return driver.findElement(By.id("menu-item-459"));
    }

}
