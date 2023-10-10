package tests;

import framework.Drivers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTests extends Drivers {
    /**
     * Verify successful login of existing user
     */
    @Test(groups = {"Smoke"})
    public void verifySuccessfulLoginOfExistingUser(){
        LoginPage login_page = new LoginPage();
        launchLoginPage();
        login_page.loginWithExistingUser();
        Assert.assertTrue(login_page.isLoginSuccessful());
    }

    /**
     * Verify the presence of major elements on login page viz: Connect With Google button, Connect With Facebook button, Email address field, Login button, Forgot password link, Remember me checkbox, Login label, flixier logo, create an account link.
     */
    @Test(groups = {"Smoke"})
    public void verifyAvailabilityOfAllElementsOnLoginPage(){
        launchLoginPage();
        LoginPage loginPage = new LoginPage();
        //check presence of Connect With Google button
        Assert.assertTrue(loginPage.isConnectWithGoogleButtonDisplayed());
        //check presence of Connect With Facebook button
        Assert.assertTrue(loginPage.isConnectWithFacebookButtonDisplayed());
        //Check presence of email address text field
        Assert.assertTrue(loginPage.isEmailAddressTextFieldDisplayed());
        //check presence of Login Button
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());
        //check presence of flixier logo
        Assert.assertTrue(loginPage.isflixierLogoDisplayed());
        //check presence of Forgot password? link
        Assert.assertTrue(loginPage.isForgotPasswordLinkDisplayed());
        //check presence of Remember me checkbox
        Assert.assertTrue(loginPage.isRememberMeCheckboxDisplayed());
        //check presence of create an account link
        Assert.assertTrue(loginPage.isCreateAnAccountLinkDisplayed());
        //check presence of Login label
        Assert.assertTrue(loginPage.isLoginLabelDisplayed());

    }

}
