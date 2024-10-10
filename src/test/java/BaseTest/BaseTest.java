package BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;



public class BaseTest {
    public WebDriver driver;
    public  String baseURL = "https://www.automationexercise.com";
    public String name = "Yusuf";
    public String mail = "Yusuff52ff@gmail.com";
    public String password = "dasdasd";

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {

        }
    }
}