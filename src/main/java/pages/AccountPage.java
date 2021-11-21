package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage openHomePage() {
        openPage(HOME_PAGE_URL);
        return this;
    }

    public String getAccountName() {
       waitForElementLocated(By.xpath(accountName_xpath),15);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver.findElement(By.xpath(accountName_xpath)).getText();
    }

    public String getValueFieldByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(textField, fieldName))).getAttribute("getInnerText");
    }

}