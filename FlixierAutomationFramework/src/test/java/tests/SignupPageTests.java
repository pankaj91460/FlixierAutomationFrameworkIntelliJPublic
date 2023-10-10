package tests;

import framework.Drivers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;

public class SignupPageTests extends Drivers {
    /**
     * Verify successful registration of new user
     */
    @Test(groups = {"Smoke"})
    public void verifySuccessfulRegristraionOfNewUser(){
        SignupPage signupPage = new SignupPage();
        launchSignupPage();
        signupPage.fillRegistrationFormforNewUser();
        signupPage.clickRegisterButtonOnSignupPage();
        signupPage.verifyPresenceOfNewProjectText();
    }

    /**
     * Verify presence of all elements on Signup Page viz: Connect With Google button, Connect With Facebook button, Email address field, flixier logo, Full name field, Password field, Register button, Register label, log in link.
     */
    @Test(groups = {"Smoke"})
    public void verifyAvailabilityOfAllElementsOnSignupPage(){
        SignupPage signupPage = new SignupPage();
        LoginPage loginPage = new LoginPage();
        launchSignupPage();
        Assert.assertTrue(loginPage.isConnectWithGoogleButtonDisplayed());
        Assert.assertTrue(loginPage.isConnectWithFacebookButtonDisplayed());
        Assert.assertTrue(loginPage.isEmailAddressTextFieldDisplayed());
        Assert.assertTrue(loginPage.isflixierLogoDisplayed());
        Assert.assertTrue(signupPage.isFullNameTextFieldDisplayed());
        Assert.assertTrue(signupPage.isPasswordTextFieldDisplayed());
        Assert.assertTrue(signupPage.isRegisterButtonDisplayed());
        Assert.assertTrue(signupPage.isRegisterLabelDisplayed());
        Assert.assertTrue(signupPage.isLogInLinkDisplayed());
    }


}
