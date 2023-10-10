package pages;

import framework.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignupPage extends Drivers {
    //Full name text field
    @FindBy(css = "#name")
    WebElement full_name;
    //Email address text field
    @FindBy(id="email")
    WebElement email;
    //Password text field
    @FindBy(id="password")
    WebElement password;
    //Register button for registration form submission
    @FindBy(css = "button[type='submit']")
    WebElement register_button;
    //NewProject element
    @FindBy(css = "[class = 'text-center pr-3 mx-auto']")
    WebElement new_project;

    //NewProject text value parent
    @FindBy(css = "[class = 'text-center pr-3 mx-auto']")
    WebElement new_project_text_value_parent;

    //Register label
    @FindBy(css = "[class = 'auth-title']")
    WebElement register_label;

    //NewProject text value
    public static final String new_project_text_value = "NewProject";

    //log in link
    @FindBy(linkText = "log in")
    WebElement login_link;


    //Initialize driver with PageFactory elements
    public SignupPage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * Method to fill registration form
     */
    public void fillRegistrationFormforNewUser(){
        findElementUntilElementVisible(full_name).sendKeys(randomFullName());
        findElementUntilElementVisible(email).sendKeys(randomEmail());
        findElementUntilElementVisible(password).sendKeys(Drivers.password);
    }

    /**
     * Method to click Register button on Signup Page
     */
    public void clickRegisterButtonOnSignupPage(){
        findElementUntilElementClickable(register_button).click();
    }

    /**
     * verify presence of NewProject text
     */
    public void verifyPresenceOfNewProjectText(){
        String retrieved_text = findElementUntilElementVisible(new_project_text_value_parent).getText();
        Assert.assertEquals(findElementUntilElementVisible(new_project_text_value_parent).getText(), new_project_text_value);
    }

    /**
     * Verify presence of Full name text field
     */
    public boolean isFullNameTextFieldDisplayed(){
        return findElementUntilElementVisible(full_name).isDisplayed();
    }

    /**
     * Verify presenence of Password text field
     */
    public boolean isPasswordTextFieldDisplayed(){
        return findElementUntilElementVisible(password).isDisplayed();
    }

    /**
     * Verify presenence of Register button
     */
    public boolean isRegisterButtonDisplayed(){
        return findElementUntilElementVisible(register_button).isDisplayed();
    }

    /**
     * Verify presence of Register label
     */
    public boolean isRegisterLabelDisplayed(){
        return findElementUntilElementVisible(register_label).isDisplayed();
    }

    /**
     * verify presence of log in link
     */
    public boolean isLogInLinkDisplayed(){
        return findElementUntilElementClickable(login_link).isDisplayed();
    }


}
