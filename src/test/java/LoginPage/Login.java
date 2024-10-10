package LoginPage;
import Locators.HomePageLocators;
import Locators.LoginPageLocators;
import Utils.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Login {
    WebDriver driver;

    protected Logger logger = LoggerFactory.getLogger(getClass());
    public ElementHelper elementHelper;

    public Login (WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }
    public void enterAccountName(String name) {
        elementHelper.sendKeys(LoginPageLocators.accountName,name);
        logger.info("Hesap Adı Girildi : " + name);
    }

    public void enterEmail(String email) {
        elementHelper.sendKeys(LoginPageLocators.eMailFailed,email);
        logger.info("Mail Girildi :  " + email);
    }

    public void clickTheSignUp() {
        elementHelper.click(LoginPageLocators.goToAhead);
        logger.info("Mail Ve Şifre Girildikten Sonra Giriş Tuşuna Tıklandı.");
    }
}
