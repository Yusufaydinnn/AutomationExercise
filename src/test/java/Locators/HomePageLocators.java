package Locators;

import org.openqa.selenium.By;

public class HomePageLocators {

    public static final By productOne = By.xpath("//a[@href='/product_details/1']");
    public static final By addToCart = By.xpath("//button[@class='btn btn-default cart']");
    public static final By continueShopping = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    public static final By registerLogin = By.xpath("//u[.='Register / Login']");
    public static final By clickMister = By.xpath("//input[@value='Mr']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By day = By.xpath("//select[@id='days']");
    public static final By month = By.xpath("//select[@id='months']");
    public static final By year = By.xpath("//select[@id='years']");
    public static final By signUpFor = By.xpath("//input[@id='newsletter']");
    public static final By signUpFor2 = By.xpath("//input[@id='optin']");
    public static final By firstName = By.xpath("//input[@id='first_name']");
    public static final By surName = By.xpath("//input[@id='last_name']");
    public static final By company = By.xpath("//input[@id='company']");
    public static final By address = By.xpath("//p[4]/input[@class='form-control']");
    public static final By clickTheButton = By.xpath("//a[.='Continue']");
    public static final By nameOnCard = By.xpath("//input[@name='name_on_card']");
    public static final By nameOnContinue = By.xpath("//a[.='Continue']");
    public static final By downloadInovice = By.xpath("//a[.='Download Invoice']");
    public static final By proceedToCheckout = By.xpath("//a[.='Proceed To Checkout']");

}
