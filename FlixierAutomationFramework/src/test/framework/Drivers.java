package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class Drivers {
    //driver variable to launch browsers
    public static WebDriver driver;
    //wait reference variable to wait for elements
    public static WebDriverWait wait;
    //variable to perform actions
    public static Actions action;
    //variable corresponding to url.properties file
    public Properties url_properties;
    //variable corresponding to platform.properties file
    public Properties platform_properties;
    //variable corresponding to credentials.properties files
    public Properties credentials_properties;
    //variable to control keyboard events
    public Robot robot;
    //input stream to read respective properties file
    private FileInputStream url_file;
    //input stream to read respective properties file
    private FileInputStream credentials_file;
    //input stream to read respective properties file
    private FileInputStream platform_file;

    //softAssertion variable
    public SoftAssert softAssertion;

    protected static final String password = "tester@123";


    //constructor to initialize instance member variables
    public Drivers (){
        try{
            this.url_file = new FileInputStream("./src/test/properties/url.properties");
            this.credentials_file = new FileInputStream("./src/test/properties/credentials.properties");
            this.platform_file = new FileInputStream(("./src/test/properties/platform.properties"));
            url_properties = new Properties();
            url_properties.load(url_file);
            platform_properties = new Properties();
            platform_properties.load(platform_file);
            credentials_properties = new Properties();
            credentials_properties.load(credentials_file);
            robot = new Robot();
            softAssertion = new SoftAssert();
        }
        catch (Exception exp){
            exp.printStackTrace();
        }
    }

    //initial actions after launching driver for a browser
    private void initialActions(){
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    //launching respective browsers in respective modes
    @BeforeSuite(groups = {"Smoke"})
    public void launchDriver(){
        if(platform_properties.getProperty("browser").equalsIgnoreCase("chrome")){
            try {
                WebDriverManager.chromedriver().setup();
                try {
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments(platform_properties.getProperty("browser_mode"));
                    driver = new ChromeDriver(option);
                }catch(NullPointerException exp){
                    driver = new ChromeDriver();
                }
                initialActions();
            }
            catch(Exception exp){
                exp.printStackTrace();
            }
        } else if (platform_properties.getProperty("browser").equalsIgnoreCase("firefox")) {
            try {
                WebDriverManager.firefoxdriver().setup();
                try {

                    if (platform_properties.getProperty("browser_mode").equals("headless")){
                        FirefoxOptions option = new FirefoxOptions();
                        option.setHeadless(true);
                        driver = new FirefoxDriver(option);
                    }
                }catch(NullPointerException exp){
                    driver = new FirefoxDriver();
                }
                initialActions();
            }
            catch(Exception exp){
                exp.printStackTrace();
            }
        }
        else if (platform_properties.getProperty("browser").equalsIgnoreCase("edge")){
            try {
                WebDriverManager.edgedriver().setup();
                try {
                    EdgeOptions option = new EdgeOptions();
                    option.addArguments(platform_properties.getProperty("browser_mode"));
                    driver = new EdgeDriver(option);
                }catch(NullPointerException exp){
                    driver = new EdgeDriver();
                }
                initialActions();
            }
            catch (Exception exp){
                exp.printStackTrace();
            }
        }
    }

    //Perform residual actions after test execution
    @AfterSuite(groups = {"Smoke"})
    public void residualActions(){
        driver.quit();
    }

    /**
     * Method to retrieve current URL
     */
    public String getCurrentURL(){
        return this.driver.getCurrentUrl();
    }

    /**
     * Method to find element by ensuring it's visibility
     */
    public WebElement findElementUntilElementVisible(WebElement elm){
        try{
            return wait.until(ExpectedConditions.visibilityOf(elm));
        }
        catch(Exception exp){
            try{
                return wait.until(ExpectedConditions.visibilityOf(elm));
            }
            catch(Exception nested_exp){
                throw nested_exp;
            }
        }
    }

    /**
     * Method to find element by ensuring it's clickability
     */
    public WebElement findElementUntilElementClickable(WebElement elm){
        return wait.until(ExpectedConditions.elementToBeClickable(elm));
    }

    /**
     * Method wait until invisibility of element located
     */
    public void waitUntilInvisibilityOfElementLocated(WebElement elm) {
        wait.until(ExpectedConditions.invisibilityOf(elm));
    }

    /**
     * Method to scroll to any element
     */
    public void scrollToElement(WebElement elm){
        wait.until(ExpectedConditions.visibilityOf(elm));
        action.scrollToElement(elm);
    }

    /**
     * Method to hover over any element
     */
    public void hover(WebElement elm){
        wait.until(ExpectedConditions.visibilityOf(elm));
        action.moveToElement(elm).build().perform();
    }

    /**
     * Method to find text
     */
    public WebElement findText(String text){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '"+text+"')]")));
    }

    /**
     * Method to find exact text
     */
    public WebElement findExactText(String exactText){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+exactText+"']")));
    }

    /**
     * Generate Random String
     */
    public String generateRandomString(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 7;
        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
    }


    /**
     * Generate random unique email
     */
    public String randomEmail(){
        String randomString = generateRandomString();
        String randomEmail = randomString+ "@testing.com";
        return randomEmail;
    }

    /**
     * Generate random name
     * @return
     */
    public String randomFullName(){
        return generateRandomString();
    }

    /**
     * Launch Signup Page
     */
    public void launchSignupPage(){
        driver.navigate().to(url_properties.getProperty("flixier_signup_url"));
    }

    /**
     * Launch login page
     */
    public void launchLoginPage(){
        driver.navigate().to(url_properties.getProperty("flixier_login_url"));
    }

    /**
     * Launch homepage of the application
     */
    public void launchHomePage(){
        driver.navigate().to(url_properties.getProperty("flixier_homepage_url"));
    }

    /**
     * Switch to parent window
     */
    public void switchToParentWindow(){
        driver.close();
        Set<String> windows_list = driver.getWindowHandles();
        Iterator<String> it = windows_list.iterator();
        int i = 0;
        while (it.hasNext()){
            if(i==0){
                driver.switchTo().window(it.next());
                break;
            }
            i+=1;
        }
    }

    /**
     * Switch to child window
     */
    public void switchToChildWindow(){
        Set<String> windows_list = driver.getWindowHandles();
        Iterator <String> it = windows_list.iterator();
        int i = 0;
        while (it.hasNext()){
            if(i==(windows_list.size()-1)){
                driver.switchTo().window(it.next());
                break;
            }
            it.next();
            i+=1;
        }
    }

    /**
     * click text on page
     */
    public void clickText(String text){
        scrollToElement(findText(text));
        findText(text).isDisplayed();
        findText(text).click();
    }

    /**
     * click exact text on page
     */
    public void clickExactText(String exact_text){
        scrollToElement(findExactText(exact_text));
        findExactText(exact_text).isDisplayed();
        findExactText(exact_text).click();
    }

    /**
     * verify presence of text
     */
    public boolean isTextpresent(String text){
        return findText(text).isDisplayed();
    }

    /**
     * verify presence of exact text
     */
    public boolean isExactTextPresent(String exact_text){
        return findExactText(exact_text).isDisplayed();
    }

    /**
     * navigate back
     */
    public void navigateBack(){
        driver.navigate().back();
    }

    /**
     * navigate forward
     */
    public void navigateForward(){
        driver.navigate().forward();
    }



}
