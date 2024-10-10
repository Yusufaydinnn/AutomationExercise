package Locators;

import org.openqa.selenium.By;

public class AccountPageLocators {

    public static final By deleteAccount = By.xpath("//a[contains(.,'Delete Account')]");
    public static final By accountDeleted = By.xpath("//b[.='Account Deleted!']");
}
