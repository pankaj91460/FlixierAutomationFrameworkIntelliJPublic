package pages;

import framework.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Drivers {
    //email address field
    @FindBy(css = "#email")
    public static WebElement email_text_field;
    //Login button
    @FindBy(css = "button[class = 'py-2-5 px-5 btn mt-3 w-100 d-block btn btn-primary']")
    public static WebElement login_button;
    //password field
    @FindBy(css = "#password")
    public static WebElement password_text_field;
    //profile icon after successful login
    @FindBy(css = "[class = \"navbar__user-menu is--hidden-from-menu navbar-nav d-flex flex-row justify-content-between align-items-center\"]>li[class = \"nav-item dropdown user-profile\"]")
    public static WebElement profile_icon;
    //Connect With Google button
    @FindBy(id ="login-google")
    public static WebElement connect_with_google_button;
    //Connect With Facebook button
    @FindBy(id="login-facebook")
    public static WebElement connect_with_facebood_button;
    //flixier logo on login page
    @FindBy(css = "a[class = \"auth-logo-default position-absolute router-link-active\"]")
    public static WebElement flixier_logo;
    //Forgot your password link
    @FindBy(linkText = "Forgot password?")
    public static WebElement forgot_password_link;
    //Remember me checkbox
    @FindBy(xpath = "//span[contains(text(), 'Remember me')]//parent::label//child::input[@type='checkbox']")
    public static WebElement remember_me_checkbox;
    //create an account link
    @FindBy(linkText = "create an account")
    public static WebElement create_an_account_link;
    // login label
    @FindBy(css = "[class=\"auth-title\"]")
    public static WebElement login_label;



    //constructor to initialize PageFactory elements
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * login with existing user
     */
    public void loginWithExistingUser(){
        findElementUntilElementVisible(email_text_field).sendKeys(credentials_properties.getProperty("existing_user1"));
        findElementUntilElementClickable(login_button).click();
        findElementUntilElementVisible(password_text_field).sendKeys(credentials_properties.getProperty("password"));
        findElementUntilElementClickable(login_button).click();
    }

    /**
     * verify successful login of existing user
     */
    public boolean isLoginSuccessful(){
        return findElementUntilElementVisible(profile_icon).isDisplayed();
    }

    /**
     * verify presence of Connect With Google
     */
    public boolean isConnectWithGoogleButtonDisplayed(){
        return connect_with_google_button.isDisplayed();
    }

    /**
     * verify persence of Connect With Facebook
     */
    public boolean isConnectWithFacebookButtonDisplayed(){
        return connect_with_facebood_button.isDisplayed();
    }

    /**
     * Verify presence of email address text field
     */
    public boolean isEmailAddressTextFieldDisplayed(){
        return email_text_field.isDisplayed();
    }

    /**
     * Verify presence of Login Button
     */
    public boolean isLoginButtonDisplayed(){
        findElementUntilElementVisible(login_button);
        return login_button.isDisplayed();
    }

    /**
     * Verify presence of flixier logo
     */
    public boolean isflixierLogoDisplayed(){
        return flixier_logo.isDisplayed();
    }

    /**
     * Verify presence of ForgetPassword link
     */
    public boolean isForgotPasswordLinkDisplayed(){
        return forgot_password_link.isDisplayed();
    }

    /**
     * verify presence of Remember me checkbox
     */
    public boolean isRememberMeCheckboxDisplayed(){
        return remember_me_checkbox.isDisplayed();
    }

    /**
     * Verify presence of Create an account link
     */
    public boolean isCreateAnAccountLinkDisplayed(){
        return create_an_account_link.isDisplayed();
    }

    /**
     * Verify presence of Login label
     */
    public boolean isLoginLabelDisplayed(){
        return login_label.isDisplayed();
    }



}
