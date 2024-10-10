package Locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public static final By goToAhead = By.xpath("//button[.='Signup']");
    public static final By accountName = By.xpath("//input[@name='name']");
    public static final By eMailFailed = By.xpath("//div[@class='signup-form']//input[@name='email']");

}
