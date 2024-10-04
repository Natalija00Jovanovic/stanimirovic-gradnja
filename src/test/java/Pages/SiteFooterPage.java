package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiteFooterPage {

    WebDriver driver;

    WebElement kontaktMessage;

    WebElement kontaktButton;

    WebElement logoInFooter;

    WebElement meniArea;

    WebElement meniAreaPocetnaElement;

    WebElement meniAreaProjektiUIzgradnjiElement;

    WebElement meniAreaIzgradjeniObjektiElement;

    WebElement meniAreaONamaElement;

    WebElement meniAreaKontaktElement;

    WebElement footerWebDesignInfo;

    WebElement footerCopyrightInfo;

    WebElement poslednjePostavljenaVestArea;

    WebElement phoneOptionIcon;

    public SiteFooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getKontaktMessage() {
      //  return driver.findElement(By.id("PmosRe"));  // sa ovim lokatorom test pada, kaze da ne moze da locira elemetn preko csslokatora, svasta
        return driver.findElement(By.xpath("/html/body/div[1]/div[8]/section/div[4]/div[1]/div[2]/div/h2"));
    }

    public WebElement getKontaktButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[8]/section/div[4]/div[2]/div[2]/div/div/a"));  // promeni lokator
    }

    public WebElement getLogoInFooter() {
        return driver.findElement(By.xpath("/html/body/div[1]/footer/div/section/div[4]/div/div[2]/div/div[1]/section/div[4]/div[1]/div[2]/div/div[1]/a/img"));
    }

    public WebElement getMeniArea() {
        return driver.findElement(By.cssSelector(".wp-block-gutenverse-heading.guten-element.guten-sO3d36"));
    }

    public WebElement getMeniAreaPocetnaElement() {
        return driver.findElement(By.id("guten-eQhJYV"));
    }

    public WebElement getMeniAreaProjektiUIzgradnjiElement() {
        return driver.findElement(By.id("guten-f22zGk"));
    }

    public WebElement getMeniAreaIzgradjeniObjektiElement() {
        return driver.findElement(By.id("guten-GoLOd5"));
    }

    public WebElement getMeniAreaONamaElement() {
        return driver.findElement(By.id("guten-7e8WIC"));
    }

    public WebElement getMeniAreaKontaktElement() {
        return driver.findElement(By.id("guten-Nvf4Am"));
    }

    public WebElement getFooterWebDesignInfo() {
        return driver.findElement(By.cssSelector(".guten-element.gutenverse-text-editor.guten-ZVsZIs"));
    }

    public WebElement getFooterCopyrightInfo() {
        return driver.findElement(By.xpath("/html/body/div[1]/footer/div/section/div[4]/div/div[2]/div/div[3]/section/div[4]/div[2]/div[2]/div/div/div/p/strong"));
    }

    public WebElement getPoslednjePostavljenaVestArea() {
        return driver.findElement(By.cssSelector(".guten-AijI1l.guten-post-block.guten-element"));
    }

    public WebElement getPhoneOptionIcon() {
        return driver.findElement(By.cssSelector(".cnb-inside-item"));
    }

}
