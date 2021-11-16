package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class AccountTests extends BaseTest {

    public static final String login = "nadya101-p6wc@force.com";
    public static final String password = "Gq2KPsXekAb*ySd%";

    public String getAccountName(){
        return driver.findElement(By.xpath("//*[contains(@class,'custom-truncate uiOutputText')]")).getText();
    }

    @Test
    public void createAccountTest() {
        loginPage.openLoginPage()
                .fillInLoginField(login)
                .fillInPasswordField(password)
                .clickLoginButton();
        newAccountModalPage.openNewAccountModal()
                .createAccount("Account 19", "www.101.ua", "This is my account",
                        "Ukraina");
       Assert.assertEquals(getAccountName(), "Account 19");
    }
}