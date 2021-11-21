package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class AccountTests extends BaseTest {

    public static final String login = "nadya101-p6wc@force.com";
    public static final String password = "Gq2KPsXekAb*ySd%";

    @Test
    public void createAccountTest() {
        loginPage.openLoginPage()
                .fillInLoginField(login)
                .fillInPasswordField(password)
                .clickLoginButton();
        newAccountModalPage.openNewAccountModal()
                .createAccount("Account 23", "www.101.ua", "This is my account",
                        "Ukraina");
       Assert.assertEquals(accountPage.getAccountName() , "Account 23");
    }
}