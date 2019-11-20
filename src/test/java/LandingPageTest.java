import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class LandingPageTest {

    WebDriver driver;

    WebDriverWait wait;

    Actions action;

    @BeforeTest
    public void setup() {
        //ChromeDriverManager.getInstance().setup();
        WebDriverManager.chromedriver().version("2.42").setup();
        driver = new ChromeDriver ();
        driver.get("https://interapt.dev.myprism.io/");
        driver.manage().window().setSize(new Dimension (1000,1000));
        wait = new WebDriverWait (driver, 15);
        action = new Actions (driver);
    }



}
