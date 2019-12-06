import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.openqa.selenium.remote.CapabilityType.ELEMENT_SCROLL_BEHAVIOR;


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
    public void verifyInitialPageLoad(){

        landingPage = new LandingPage (driver, wait, action);
        landingPage.headerElementsPresent ();
        landingPage.carousel ();
        landingPage.backgroundImageVisible ();
        System.out.println ("Landing page is loaded.");
    }

    @Test
    public void verifyMissionStatement(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.scrollByPixel ();
        landingPage.checkMissionStatment ();

    }

    @Test
    public void verifyWhatWeDo(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.scrollByPixel ();
        landingPage.whatWeDo ();
    }

    @Test
    public void verifySoftwareDevelopmentContainter(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.softwareDevelopment ();
    }

    @Test
    public void verifyStrategicDesignContainer(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.strategicDesign ();
    }

    @Test
    public void verifyWorkforceDevelopment(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.workforceDevelopment ();
    }

    @Test
    public void verifyAboutImage(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.scrollByPixel ();
        landingPage.aboutImageContainer ();
    }

    @Test
    public void verifyAboutInformation(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.aboutInformation ();
    }

    @Test
    public void verifyContactUs(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.scrollByPixel ();
        landingPage.contactUs ();
    }

    @Test
    public void verifyContactInfo(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.scrollByPixel ();
        landingPage.contactInfo ();
    }

    @Test
    public void verifyNewsletterSignUpForm(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.newsletterSignUp ();
    }

    @Test
    public void verifyFollowUsVisible(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.followUs ();
    }

    @Test
    public void verifyCopyright(){
        landingPage = new LandingPage (driver, wait, action);
        landingPage.copyright ();
    }



    @AfterTest
    public void end() {
        driver.quit();
    }

}
