package CartPage;
import Locators.CartPageLocators;
import Locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Utils.ElementHelper;


public class Cart {
    WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    public ElementHelper elementHelper;

    public Cart (WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);

    }
    public void goToCart() {
        elementHelper.click(CartPageLocators.cartLink);

        logger.info("Sepete Gidildi.");;
    }
    public void goToPay() {
        elementHelper.click(CartPageLocators.goToPay);
        logger.info("Sepete Girildi.");
    }

}