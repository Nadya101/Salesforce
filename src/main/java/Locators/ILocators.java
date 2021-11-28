package Locators;

import org.openqa.selenium.By;

public interface ILocators {
    String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    String INPUT_ACCOUNT_NAME_XPATH = "//*[contains(text(),'Account Name')]/ancestor::div[contains(@class,'uiInput')]//input";
    String HOME_PAGE_URL = "https://dms4.lightning.force.com/lightning/page/home";
    String NEW_ACCOUNT_URL = "https://dms4.lightning.force.com/lightning/o/Account/new";
    String textField = "//*[contains(text(), '%s')]/ancestor::force-highlights-details-item";
    String accountName_xpath = "//*[contains(@class,'custom-truncate uiOutputText')]";
    String BASE_URL = "https://dms4.my.salesforce.com/";
    By SAVE_MODAL_BUTTON = By.xpath("//*[contains(@class,'forceActionButton')]//*[text()='Save']");
    By LOGIN_INPUT_FIELD = By.id("username");
    By PASSWORD_INPUT_FIELD = By.id("password");
    By LOGIN_BUTTON = By.id("Login");
}
