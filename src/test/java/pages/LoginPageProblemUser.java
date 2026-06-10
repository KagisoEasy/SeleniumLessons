package pages;

public class LoginPageProblemUser {

    public WebDriver driver;
    //Locators
    private By userNameTextField1 = By.xpath("//*[@id=\"user-name\"]");
    private By passwordTextField1 = By.xpath("//*[@id=\"password\"]");
    private By loginButton1 = By.id("login-button");

    public LoginPageProblemUser(WebDriver driver) {

        this.driver = driver;
    }

    public void enterUserNameProblemUSer(String inputUserName) {
            driver.findElement(userNameTextField1).sendKeys(inputUserName);

        }

    public void setPasswordTextField1(String inputPassword){
        driver.findElement(passwordTextField1).sendKeys(inputPassword);
    }

    public Product clickOnLogin(){
        driver.findElement(loginButton1).click();
        return new Product(driver);
    }

}
