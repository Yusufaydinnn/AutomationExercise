package Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementHelper {

    WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void sendKeys(By locator, CharSequence... keysToSend) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(keysToSend);
    }

}
