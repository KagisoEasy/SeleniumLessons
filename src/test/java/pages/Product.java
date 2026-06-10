package pages;

public class Product {
    private WebDriver driver;
    private By products = By.cssSelector("#header_container > div.header_secondary_container > span");

    public Product(WebDriver driver){
        this.driver = driver;
    }


}
