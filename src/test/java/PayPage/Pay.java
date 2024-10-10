package PayPage;
import Locators.HomePageLocators;
import Locators.PayPageLocators;
import Utils.ElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Pay  {
    WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    public ElementHelper elementHelper;

    public Pay (WebDriver driver) {
        this.driver = driver;
        this.elementHelper  = new ElementHelper(driver);
    }
    public void clickTheProceedToCheckout() {

        elementHelper.click(PayPageLocators.proceedToCheckout);
        logger.info("Ödeme İşlemine Geçildi.");
    }

    public void comment() {
        String comment = "Merhaba Testinium";
        elementHelper.sendKeys(PayPageLocators.comment,comment);
        logger.info("Yorum Yapıldı");
    }

    public void placeOrder() {

        elementHelper.click(PayPageLocators.placeOrder);
    }

    public void nameOnCard() {
        String cardName = "Yusuf AYDIN ";
        String cardNumber = "1111 2222 3333 4444";
        String cvcNumber = "342";
        String expiration1 = "11";
        String expiration2 = "27";
        driver.findElement(HomePageLocators.nameOnCard).sendKeys(
                cardName,
                Keys.TAB,
                cardNumber,
                Keys.TAB,
                cvcNumber,
                Keys.TAB,
                expiration1,
                Keys.TAB,
                expiration2,
                Keys.TAB,
                Keys.ENTER);
        logger.info("Ödeme İşleminiz Başarıyla Oluşturuldu.");
    }
    public void downloadInvoice(){
        elementHelper.click(HomePageLocators.downloadInovice);
        logger.info("Faturanız Başarıyla İndirildi.");
    }

}
