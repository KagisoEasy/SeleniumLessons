package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

import java.io.IOException;

public class LoginTest extends BaseClass {
    ConfigReader configReader = new ConfigReader();
    @Test
    public void loginTest() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }

}
