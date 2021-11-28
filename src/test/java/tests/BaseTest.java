package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountPage;
import pages.LoginPage;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    NewAccountModalPage newAccountModalPage;
    LoginPage loginPage;
    AccountPage accountPage;


    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void afterMethod() {
         driver.quit();
    }
}