package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    public WebDriver driver;
    //Locators
    private By userNameTextField = By.xpath("//*[@id=\"user-name\"]");
    private By passwordTextField = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    //Actions
    public void enterUserName() {
        try {
            Assert.assertTrue(driver.findElement(userNameTextField).isDisplayed(), "Username testbox is not displayed");
            Assert.assertTrue(driver.findElement(userNameTextField).isEnabled(), "Username testbox is not enabled");
            String actualUserNamePlaceholder = driver.findElement(userNameTextField).getAttribute("placeholder");
            Assert.assertEquals(actualUserNamePlaceholder, "Username", "Username placeholder text is not correct");
            driver.findElement(userNameTextField).sendKeys("standard_user");

        } catch (Exception e) {
            System.out.println("Username text field is not found: " + e.getMessage());
        }
    }

    public void enterPassword() {
        try {
            Assert.assertTrue(driver.findElement(passwordTextField).isDisplayed(), "Password testbox is not displayed");
            driver.findElement(passwordTextField).sendKeys("secret_sauce");
        } catch (Exception e) {
            System.out.println("Password text field is not found: " + e.getMessage());
            Assert.fail("Password text field is not found: " + e.getMessage());System.out.println("");
        }
    }

    public void clickLoginButton() {
        try {
            Assert.assertTrue(driver.findElement(loginButton).isDisplayed(), "Login button is not displayed");
            Assert.assertTrue(driver.findElement(loginButton).isEnabled(), "Login button is not enabled");
//            String actualLoginButtonText = driver.findElement(loginButton).getText();
//            Assert.assertEquals(actualLoginButtonText, "Login", "Login button text is not correct");
            driver.findElement(loginButton).click();
        } catch (Exception e) {
            System.out.println("Login button is not found:    " + e.getMessage());
        }
    }

}
