import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LandingPageTest {

    WebDriver driver;

    WebDriverWait wait;

    Actions action;

    LandingPage landingPage;

    @BeforeTest
    public void setup(){
        //ChromeDriverManager.getInstance().setup();
        WebDriverManager.chromedriver().version("2.42").setup();

        driver = new ChromeDriver ();
        driver.get("https://interapt.com");
        driver.manage().window().setSize(new Dimension (1300,990));
        wait = new WebDriverWait (driver, 15);
        action = new Actions (driver);
    }

    @Test
    public void pageLoad(){

        landingPage = new LandingPage (driver, wait, action);

        driver.findElement (By.xpath ("/html/body/div/header/div[1]/div[1]"));
        System.out.println ("Interapt Logo is visible.  ");

        driver.findElement (By.xpath ("/html/body/div/header/div[1]/div[2]/nav/ul/li[1]/a"));
        System.out.println ("Home button is visible");

        driver.findElement (By.xpath ("/html/body/div/header/div[1]/div[2]/nav/ul/li[2]/a"));
        System.out.println ("What We Do menu button is visible");

        driver.findElement (By.xpath ("/html/body/div/header/div[1]/div[2]/nav/ul/li[3]/a"));
        System.out.println ("About button is visible");

        driver.findElement (By.xpath ("/html/body/div/header/div[1]/div[2]/nav/ul/li[4]/a"));
        System.out.println ("Contact button is visible");

        landingPage.doPageScroll();

        driver.findElement (By.xpath ("/html/body/div/div/div[1]/article/div/div/div/div[3]/div/div[2]/div[2]/div"));

    }


    @AfterTest
    public void end() {
        driver.quit();
    }

}
