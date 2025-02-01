package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Util.ElementHelper;

public class LoginPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver= driver;
        this.wait= new WebDriverWait(driver, 10);
        this.elementHelper= new ElementHelper(driver);

    }

    static By username = By.cssSelector("[placeholder='Username']");
    static By password = By.cssSelector("[placeholder='Password']");
    static By login = By.cssSelector(".r-1i6wzkk");
    static By homepage = By.xpath("//div[.='Company name: Testinium']");
    static By errorMessage = By.cssSelector(".r-howw7u");


    public static void HomePage() {
    }

    public static void Username() {
        elementHelper.sendKeys(username,   "elflyd");
    }

    public static void Password() {
        elementHelper.sendKeys(password, "elosh2413");
    }

    public static void Login() {
        elementHelper.click(login);
    }

    public static void checkTheHomePage() {
        elementHelper.click(homepage);
    }
    public static void invalidUsername() {
        elementHelper.sendKeys(username, "elf");
    }

    public static void invalidPassword() {
        elementHelper.sendKeys(password, "elf");
    }

    public static void checkTheErrorMessage() {
        elementHelper.click(errorMessage);
    }

}