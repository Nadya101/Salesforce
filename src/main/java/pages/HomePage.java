package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;
    public static final String HOME_PAGE_URL = "https://dms4.lightning.force.com/lightning/page/home";
    String textField = "//*[contains(text(), '%s')]/ancestor::force-highlights-details-item";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        openPage(HOME_PAGE_URL);
        return this;
    }

    String accountName_xpath = "//*[contains(@class,'custom-truncate uiOutputText')]";

    public String getAccountName() {
        return driver.findElement(By.xpath(accountName_xpath)).getText();
    }

    public String getValueFieldByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(textField, fieldName))).getAttribute("getInnerText");
    }

}