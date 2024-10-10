package AccountPage;
import BasePage.BasePage;
import Locators.AccountPageLocators;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Utils.ElementHelper;

public class Account extends BasePage {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    public ElementHelper elementHelper;

    public Account (WebDriver driver) {
        super(driver);
        this.elementHelper = new ElementHelper(driver);

    }
    public void deleteAccount() {
        elementHelper.click(AccountPageLocators.deleteAccount);
        logger.info(" Hesabı Sile Tıklandı.   ");
    }
    public void isAccountDeleted() {
        elementHelper.click(AccountPageLocators.accountDeleted);
        logger.info("Hesap Başarıyla Silinmiştir");

    }
}


