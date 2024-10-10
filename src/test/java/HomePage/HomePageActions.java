package HomePage;
import Locators.HomePageLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Utils.ElementHelper;
public class HomePageActions {

    WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    ElementHelper elementHelper;

    String selectedDay = "10";
    String selectedYear = "2002";
    String selectedMonth = "January";
    String streetAddress = "Soğanlık Yeni, Pamukkale Sk. No: 11, 34880 Kartal/İstanbul";
    String companyName = "TESTINIUM";
    String country = "Canada";
    String realCountry = "TURKEY";
    String city = "İSTANBUL";
    String postaCode = "34899";
    String Number = "5011322154";
    String myName = "yusuf";
    String mySurName="AYDIN";


    public HomePageActions(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
        PageFactory.initElements(driver, this);

    }

    public void addProductOneToCart() {


        elementHelper.click(HomePageLocators.productOne);
        elementHelper.click(HomePageLocators.addToCart);
        logger.info("Ürün Sepete Eklendi ");
    }

    public void continueShopping() {
        elementHelper.click(HomePageLocators.continueShopping);
        logger.info("Alışverişe Devam Edildi ");
    }

    public void proceedToCheckout() {

        elementHelper.click(HomePageLocators.proceedToCheckout);
        logger.info("Ödeme İşlemine Geçildi ");
    }

    public void navigateToRegisterLogin() {

        elementHelper.click(HomePageLocators.registerLogin);
        logger.info("Giriş Yapa Tıklandı ");
    }

    public void clickMister() {

        elementHelper.click(HomePageLocators.clickMister);
        logger.info("Cinsiyet Seçildi. ");
    }

    public void password(String realPassword) {

        elementHelper.sendKeys(HomePageLocators.password, realPassword);
        logger.info("Şifre Girildi.");
    }
    public void selectDay() {
        Select dayDropdown = new Select(driver.findElement(HomePageLocators.day));
        dayDropdown.selectByVisibleText(selectedDay);
        logger.info("Gün seçildi: " + selectedDay);
    }
    public void selectMonth() {
        Select monthDropdown = new Select(driver.findElement(HomePageLocators.month));
        monthDropdown.selectByVisibleText(selectedMonth);
        logger.info("Ay seçildi: " + selectedMonth);
    }
    public void selectYear() {
        Select yearDropdown = new Select(driver.findElement(HomePageLocators.year));
        yearDropdown.selectByVisibleText(selectedYear);
        logger.info("Yıl seçildi: " + selectedYear);
    }
    public void signUpFor() {

        elementHelper.click(HomePageLocators.signUpFor);
    }
    public void signUpFor2() {
        elementHelper.click(HomePageLocators.signUpFor2);
    }
    public void firstName() {
        elementHelper.sendKeys(HomePageLocators.firstName,myName);
        logger.info("isim girildi:  " + myName);
    }
    public void surName(){
        elementHelper.sendKeys(HomePageLocators.surName,mySurName);
        logger.info("Soy isim girildi: " + mySurName);
    }
    public void companyName(){
        elementHelper.sendKeys(HomePageLocators.company,companyName);
        logger.info("Şirket ismi girildi : " + companyName);
    }
    public void address() {

        driver.findElement(HomePageLocators.address).sendKeys(
                streetAddress,
                Keys.TAB,
                companyName,
                Keys.TAB,
                country,
                Keys.TAB,
                realCountry,
                Keys.TAB,
                city,
                Keys.TAB,
                postaCode,
                Keys.TAB,
                Number,
                Keys.TAB,
                Keys.ENTER
        );
        logger.info("Hesap Oluşturuldu");
    }

    public void clickTheButton() {

        elementHelper.click(HomePageLocators.clickTheButton);
    }

    public void nameOnContinue() {
        elementHelper.click(HomePageLocators.nameOnContinue);
        logger.info("Ana Sayfaya Dönüldü.  ");
    }
}
