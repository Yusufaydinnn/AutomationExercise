package Locators;

import org.openqa.selenium.By;

public class PayPageLocators {

    public static final By comment = By.xpath("//textarea[@name='message']");
    public static final By placeOrder = By.xpath("//a[.='Place Order']");
    public static final By proceedToCheckout = By.xpath("//a[.='Proceed To Checkout']");

}
