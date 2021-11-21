package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openLoginPage() {
        openPage(BASE_URL);
        return this;
    }

    public LoginPage fillInLoginField(String login) {
        driver.findElement(LOGIN_INPUT_FIELD).sendKeys(login);
        return this;
    }
    public LoginPage fillInPasswordField(String password) {
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        return this;
    }
    public AccountPage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        return new AccountPage(driver);
    }

}