package TestPage;
import BaseTest.BaseTest;
import org.junit.jupiter.api.Test;
import HomePage.HomePageActions;
import AccountPage.Account;
import CartPage.Cart;
import LoginPage.Login;
import PayPage.Pay;

public class TestCase extends BaseTest {

    @Test
    public void test01() {
        HomePageActions homePageActions = new HomePageActions(driver);
        Cart cart = new Cart(driver);
        Login login = new Login(driver);
        Pay pay = new Pay(driver);
        Account account = new Account(driver);


        homePageActions.addProductOneToCart();
        homePageActions.continueShopping();
        cart.goToCart();
        homePageActions.proceedToCheckout();
        homePageActions.navigateToRegisterLogin();
        login.enterAccountName(name);
        login.enterEmail(mail);
        login.clickTheSignUp();
        homePageActions.clickMister();
        homePageActions.password(password);
        homePageActions.selectDay();
        homePageActions.selectMonth();
        homePageActions.selectYear();
        homePageActions.signUpFor();
        homePageActions.signUpFor2();
        homePageActions.firstName();
        homePageActions.surName();
        homePageActions.companyName();
        homePageActions.address();
        homePageActions.clickTheButton();
        cart.goToPay();
        pay.clickTheProceedToCheckout();
        pay.comment();
        pay.placeOrder();
        pay.nameOnCard();
        pay.downloadInvoice();
        homePageActions.nameOnContinue();
        account.deleteAccount();
        account.isAccountDeleted();

    }
}
