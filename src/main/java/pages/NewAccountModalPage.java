package pages;

import elements.InputField;
import elements.TextAreaField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountModalPage openNewAccountModal() {
        driver.get(NEW_ACCOUNT_URL);
        return this;
    }

    public NewAccountModalPage clickSave() {
        driver.findElement(SAVE_MODAL_BUTTON).click();
        return this;
    }

    public AccountPage createAccount(String accountName, String website, String description, String billingAddress) {
        waitForElementLocated(By.xpath(INPUT_ACCOUNT_NAME_XPATH), 10);
        new InputField(driver, "Account Name").writeText(accountName);
        new InputField(driver, "Website").writeText(website);
        new TextAreaField(driver, "Description").writeText(description);
        new TextAreaField(driver, "Billing Street").writeText(billingAddress);
        clickSave();
        return new AccountPage(driver);
    }

}