import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class LandingPage extends AutomationBasePage {

    // HEADER ELEMENTS
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

// PAGE ELEMENTS
    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[1]/div/div/div/div[1]")
    WebElement carosuelContainer;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[2]")
    WebElement missionStatementContainer;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[3]/div/div[1]")
    WebElement whatWeDoContainer;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[3]/div/div[2]/div[1]/div")
    WebElement softareDevelopment;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[3]/div/div[2]/div[2]/div")
    WebElement strategicDesign;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[3]/div/div[3]/div/div")
    WebElement workforceDevelopment;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[3]/div")
    WebElement aboutImageContainer;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[4]/div/div[2]")
    WebElement aboutInformation;

    @FindBy(xpath = "/html/body/div/div/div[1]/article/div/div/div/div[5]")
    WebElement contactUsContainer;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[2]/div[2]")
    WebElement contactInfo;


// NEWSLETTER OBJECTS
    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/table/tbody/tr/td/div[1]")
    WebElement newsletterSignUpTitle;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/table/tbody/tr/td/div[2]/form/div[2]")
    WebElement emailField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/table/tbody/tr/td/div[2]/form/div[3]")
    WebElement nameField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/table/tbody/tr/td/div[2]/form/div[4]")
    WebElement subscribeBtn;


    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[3]")
    WebElement followUs;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div[1]/div/div/p")
    WebElement copyright;



    public LandingPage(WebDriver driver, WebDriverWait wait, Actions action){ super (driver, wait, action); }


    public void headerElementsPresent(){
        waitXTime (500);
        interaptLogo.isDisplayed ();
        homeBtn.isDisplayed ();
        whatWeDoMenu.isDisplayed ();
        aboutBtn.isDisplayed ();
        contactBtn.isDisplayed ();
    }

    public void carousel(){
        waitXTime (500);
        carosuelContainer.isDisplayed ();

    }

    public void backgroundImageVisible(){
        driver.findElement (By.cssSelector ("#et-boc > div > div.et_pb_section.et_pb_section_0.et_pb_fullwidth_section.et_section_regular > div > div > div > div.carousel-images > div:nth-child(3)"));
        System.out.println ("Background image is displayed.");
    }

    public void checkMissionStatment(){
        missionStatementContainer.isDisplayed ();
        System.out.println ("Mission statement container is visible.");
        Assert.assertEquals (missionStatementContainer.getText (), "We create apps to drive business performance and provide " +
                "custom training to solve the tech talent gap. With a dedication to innovation and advancement, Interapt transforms " +
                "clients and empowers humans through technology. ");
    }

    public void whatWeDo(){
        whatWeDoContainer.isDisplayed ();
        Assert.assertEquals (whatWeDoContainer.getText (), "What We Do\n" +
                "We develop software, experiences and people. We will work with you to improve your business performance and " +
                "develop a new source of tech talent.\n" + "LEARN MORE");
        System.out.println ("What we do text is correct.");
    }

    public void softwareDevelopment(){
        softareDevelopment.isDisplayed ();
        Assert.assertEquals (softareDevelopment.getText (), "SOFTWARE DEVELOPMENT\n" +
                "Our team of professionals builds customized apps to solve your unique workflow and business challenges.\n" +
                "LEARN MORE »");
        System.out.println("Software Development text is correct.");
    }

    public void strategicDesign(){
        strategicDesign.isDisplayed ();
        Assert.assertEquals (strategicDesign.getText (), "STRATEGIC DESIGN\n" +
                "We take a unique approach to developing mobile and web experiences, driven by human-centered design.\n" +
                "LEARN MORE »");
        System.out.println ("Strategic Design text is correct.");

    }

    public void workforceDevelopment(){
        workforceDevelopment.isDisplayed ();
        Assert.assertEquals (workforceDevelopment.getText (), "WORKFORCE DEVELOPMENT\n" +
                "Our training programs and tailored curriculum will connect you with a diverse pool of talent to help your business succeed in the digital era.\n" +
                "LEARN MORE »");
        System.out.println ("Workforce development text is correct.");

    }

    public void aboutImageContainer(){
        aboutImageContainer.isDisplayed ();
        System.out.println ("About images are present");
    }

    public void aboutInformation(){
        Assert.assertEquals (aboutInformation.getText (), "About\n" +
                "Based in Louisville, Kentucky, Interapt is a technology services firm that also has an office in Atlanta, Georgia. " +
                "We are dedicated to using technology to create cutting-edge solutions and provide opportunities to overlooked " +
                "individuals. Learn how we can help you create an ethical, diverse and impactful workforce to fill your tech talent gap " +
                "or build an app to solve your business need. \n" +
                "ABOUT US");
        System.out.println ("About information is correct");
    }

    public void contactUs(){
        contactUsContainer.isDisplayed ();
        Assert.assertEquals (contactUsContainer.getText (),
                "READY TO GET STARTED?\n" +
                "Let's start solving your challenges today.\n" +
                "CONTACT US");
        System.out.println ("Contact us text is correct");
    }

    public void contactInfo(){
        contactInfo.isDisplayed ();
        Assert.assertEquals (contactInfo.getText (),
                "Address:\n" +
                "815 West Market Street\n" +
                "Louisville KY\n" +
                "Phone:\n" +
                "(502) 251-1511\n" +
                "Email:\n" +
                "info@interapt.com");
        System.out.println ("Contact info is correct");
    }

    public void newsletterSignUp(){
        newsletterSignUpTitle.isDisplayed ();
        emailField.isDisplayed ();
        nameField.isDisplayed ();
        subscribeBtn.isDisplayed ();
    }

    public void followUs(){
        followUs.isDisplayed ();
    }

    public void copyright(){
        copyright.isDisplayed ();
        Assert.assertEquals (copyright.getText (), "© 2019 Interapt - All Rights Reserved");
        System.out.println ("Copyright is correct");
    }

    public void scrollByPixel(){
        System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        waitXTime (2500);
    }

}





