package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.io.IOException;

public class BaseClass {
    public WebDriver driver;
    public ConfigReader configReader = new ConfigReader();

    @BeforeMethod
    public void setUp() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        
        driver = new ChromeDriver();
        driver.get(" https://www.saucedemo.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("www.saucedemo"), "User is not navigated to inventory page");
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"), "User is not navigated to inventory page");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
