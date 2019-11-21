import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends AutomationBasePage {

    @FindBy(xpath = "/html/body/div/header/div[1]/div[1]")
    WebElement interaptLogo;

    @FindBy(xpath = "/html/body/div/header/div[1]/div[2]/nav/ul/li[1]/a")
    WebElement homeBtn;

    @FindBy(xpath = "/html/body/div/header/div[1]/div[2]/nav/ul/li[2]/a")
    WebElement whatWeDoMenu;

    @FindBy(xpath = "/html/body/div/header/div[1]/div[2]/nav/ul/li[3]/a")
    WebElement aboutBtn;

    @FindBy(xpath = "/html/body/div/header/div[1]/div[2]/nav/ul/li[4]/a")
    WebElement contactBtn;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[1]/div/div/div/div[1]")
    WebElement cardBox;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[3]/div/div[2]/div[2]/div")
    WebElement strategicDesignContainer;


    public LandingPage(WebDriver driver, WebDriverWait wait, Actions action) { super (driver, wait, action); }


    public void locateElements() {
        waitXTime (1500);
        interaptLogo.isDisplayed ();
        homeBtn.isDisplayed ();

    }


}
