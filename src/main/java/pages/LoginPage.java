package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final String BASE_URL = "https://dms4.my.salesforce.com/";
    public By LOGIN_INPUT_FIELD = By.id("username");
    public By PASSWORD_INPUT_FIELD = By.id("password");
    public By LOGIN_BUTTON = By.id("Login");

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
    public HomePage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }

}