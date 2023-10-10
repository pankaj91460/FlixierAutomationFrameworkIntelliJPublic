package tests;

import framework.Drivers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class HomePageTests extends Drivers {
    /**
     * Verify the presence of Tools, Create, Pricing, Templates, Blog, SignIn tabs and on HomePage
     */
    @Test(groups = {"Smoke"})
    public void verifyPresenceOfDifferentTabsInHeaderSection(){
        //creating object of home page
        HomePage homePage = new HomePage();
        //navigate to launch page
        launchHomePage();
        //assert presence of flixier to verify user is redirected to correct home page
        Assert.assertTrue(homePage.isFlixierLogoPresentInHeader());
        //assert presence of Tools drop down in header section
        Assert.assertTrue(homePage.isToolsDropDownPresentInHeader());
        //assert presence of Create drop down in header section
        Assert.assertTrue(homePage.isCreateDropDownPresentInHeader());
        //assert presence of Pricing tab in header section
        Assert.assertTrue(homePage.isPricingTabPresentInHeader());
        //assert presence of Templates tab in header section
        Assert.assertTrue(homePage.isTemplatesTabPresentInHeader());
        //assert presence of Blog tab in header section
        Assert.assertTrue(homePage.isBlogTabPresentInHeader());
        //assert presence of Sign In button in header section
        Assert.assertTrue(homePage.isSignInButtonPresentInHeader());
    }

    /**
     * Verify the presence of YouTube videos, Online Course, Webinars, Twitch streams, Zoom recordings, Marketing videos and their respective icons on Home Page.
     */
    @Test(groups = {"Smoke"})
    public void verifyLabelsAndRespectiveIconsOnHomePage(){
        //navigate to home page of the application
        launchHomePage();
        //home page object creation
        HomePage homePage = new HomePage();
        //verify presence of YouTube videos icon
        Assert.assertTrue(homePage.isYouTubeVideosIconPresent());
        //verify presence of YouTube link
        Assert.assertTrue(homePage.isYouTubeVideosLinkPresent());
        //verify presence of online course icon
        Assert.assertTrue(homePage.isOnlineCourseIconPresent());
        //verify presence of online course link
        Assert.assertTrue(homePage.isOnlineCourseLinkPresent());
        //verify presence of webinars icon
        Assert.assertTrue(homePage.isWebinarsIconPresent());
        //verify presence of webinars link
        Assert.assertTrue(homePage.isWebinarsLinkPresent());
        //verify presence of Twitch Streams icon
        Assert.assertTrue(homePage.isTwitchStreamsIconPresent());
        //verify presence of Twitch Streams link
        Assert.assertTrue(homePage.isTwitchStreamLinkPresent());
        //verify presence of zoom recordings icon
        Assert.assertTrue(homePage.isZoomRecordingsIconPresent());
        //verify presence of zoom recordings link
        Assert.assertTrue(homePage.isZoomRecordingLinkPresent());
        //verify presence of marketing videos icon
        Assert.assertTrue(homePage.isMarketingVideosIconPresent());
        //verify presence of marketing videos link
        Assert.assertTrue(homePage.isMarketingVideosLinkPresent());
    }

    /**
     * Verify the user is redirected to the correct page after clicking on YouTube videos, Online Course, Webinars, Twitch streams, Zoom recordings, Marketing videos links on Home page.
     */
    @Test(groups = {"Smoke"})
    public void verifyFunctionalityOfMultipleLinksOnHomePage(){
        //home page object creation
        HomePage homePage = new HomePage();
        //launch home page of the application
        launchHomePage();
        //click YouTube videos link text
        homePage.clickYouTubeVideosLinkText();
        //verify present of edit youtube videos online and publish title
        Assert.assertTrue(homePage.isEDitYouTubeVideosOnlineAndPublishTitlePresent());
        //navigate back to home page
        driver.navigate().back();
        //verify if user is landed on home page again
        homePage.isFlixierLogoPresentInHeader();
        //click on Online course link text
        homePage.clickOnlineCourseLinkText();
        //verify presence of how to make online course easily title
        Assert.assertTrue(homePage.isHowToMakeOnlineCoursesEasilyTitlePresent());
        //navigate back to the home page
        driver.navigate().back();
        //verifying if user is navigated to the home page
        homePage.isFlixierLogoPresentInHeader();
        //click Webinars link text
        homePage.clickWebinarsLinkText();
        //verifying presence of edit webinars recordings online title
        Assert.assertTrue(homePage.isHowToEditWebinarsRecordingOnlineTitlePresent());
        //navigate back to home page
        driver.navigate().back();
        //verify if use is navigated back to home page
        homePage.isFlixierLogoPresentInHeader();
        //click Twitch Streams link text
        homePage.clickTwitchStreamsLinkText();
        //verifying presence of edit twitch videos title
        Assert.assertTrue(homePage.isEditTwitchVideosTitlePresent());
        //navigate back to home page
        driver.navigate().back();
        //verify if use has landed back on to the home page
        homePage.isFlixierLogoPresentInHeader();
        //click zoom recordings link text
        homePage.clickZoomRecordingsLinkText();
        //verify presence of edit zoom recordings online title
        Assert.assertTrue(homePage.isEditZoomRecordingsOnlineTitlePresent());
        //navigate back to home page
        driver.navigate().back();
        //verify if user has returned back to the home page
        homePage.isFlixierLogoPresentInHeader();
        //click Marketing videos link text
        homePage.clickMarketingVideosLinkText();
        //verify presence of super easy to use video title
        Assert.assertTrue(homePage.isSuperEasyToUseVideoTitlePresent());
    }

    /**
     * Verify the presence of flixier logo, Get Started and Sign Up For Free buttons that redirects user to the correct page.
     */
    @Test(groups = {"Smoke"})
    public void verifyFunctionalityOfButtonsOnHomePage(){
        //home page object creation
        HomePage homePage = new HomePage();
        //login page object creation
        LoginPage loginPage = new LoginPage();
        //launch home page of the application
        launchHomePage();
        //verify presence of flixier logo in header section
        Assert.assertTrue(homePage.isFlixierLogoPresentInHeader());
        //click SignIn button on home page
        homePage.clickSignInButton();
        //verify presence of Login button on login page
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());
        //navigate back to the home page
        driver.navigate().back();
        //verify that user is successfully returned back to the home page
        homePage.isSignInButtonPresentInHeader();
        //click Get Started button
        homePage.clickGetStartedButton();
        //verify presence of Import window on Get Started page
        Assert.assertTrue(homePage.isImportWindowPresent());
    }

    /**
     * Verify user is able to see flixier logo in footer section of the Home Page.
     */
    @Test(groups = {"Smoke"})
    public void verifyFlixierLogoInFooterSection(){
        //home page object creation
        HomePage homePage = new HomePage();
        //launch home page of the application
        launchHomePage();
        //verify presence of Tools drop-down in header section
        Assert.assertTrue(homePage.isToolsDropDownPresentInHeader());
        //scroll to footer section
        homePage.scrollToFooterSection();
        //verify presence of Flixier logo in footer section of the page
        Assert.assertTrue(homePage.isFlixierLogoPresentInFooter());
    }

    /**
     * Verify user is able to see the social media icons in the footer section and redirects to the correct page.
     */
    @Test(groups = {"Smoke"})
    public void verifySocialMediaIconsInFooterSection(){
        //HomePage object creation
        HomePage homePage = new HomePage();
        //navigate to home page of the application
        launchHomePage();
        //navigate to footerr section of home page
        homePage.scrollToFooterSection();
        //click on Twitter icon
        homePage.clickTwitterIconFooter();
        //switching to child window
        switchToChildWindow();
        //verify user is redirected to flixier Twitter page
        Assert.assertTrue(homePage.isXIconTwitterPresent());
        //switching to parent window
        switchToParentWindow();
        //click on instagram icon in footer section
        homePage.clickIntagramIconFooter();
        //switch to child window
        switchToChildWindow();
        //verify user is redirected to flixier instagram page
        Assert.assertTrue(homePage.isInstagramLogoPresent());
        //switch to parent window
        switchToParentWindow();
        //click on facebook icon in footer section
        homePage.clickFacebookIconFooter();
        //switch to child window
        switchToChildWindow();
        //verify user is redirected to flixier facebook page
        Assert.assertTrue(homePage.isConnectWithFlixierOnFacebookTitlePresent());
        //switch to parent window
        switchToParentWindow();
        //click to youtube icon in footer section
        homePage.clickYouTubeIconFooter();
        //switch to child window
        switchToChildWindow();
        //verify user is redirected to flixier yoututbe page
        Assert.assertTrue(homePage.isFlixierLogoOnYoutubePagePresent());
        //switch to parent window
        switchToParentWindow();
        //click on tiktok icon in footer section
        homePage.clickTiktokIconFooter();
        //switch to child window
        switchToChildWindow();
        //verify user is redirected to flixier tiktok page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(homePage.isTikTokPagePresent());
    }

    /**
     * Verify user is able to change language from the language selector button in footer section of Home Page.
     */
    @Test(groups = {"Smoke"})
    public void verifyLanguageChangingFunctionalityFromFooterSection(){
        //HomePage object creation
        HomePage homePage = new HomePage();
        //navigate to home page of the application
        launchHomePage();
        //navigate to footer section of home page
        homePage.scrollToFooterSection();
        //change and verify web page language to spanish
        Assert.assertTrue(homePage.verifyChangeLangugeToSpanish());
        //navigate to footer section of home page
        homePage.scrollToFooterSection();
        //change and verify web page language to Portuguese
        Assert.assertTrue(homePage.verifyChangeLanguageToPortuguese());
        //navigate to footer section of home page
        homePage.scrollToFooterSection();
        //change and verify web page language to German
        Assert.assertTrue(homePage.verifyChangeLanguageToGerman());
        //navigate to footer section of home page
        homePage.scrollToFooterSection();
        //change and verify web page language to English
        Assert.assertTrue(homePage.verifyChangeLanguageToEnglish());
    }



    /**
     * Verify user is able to see Guide Center, Tools and Company labels in footer section of Home Page.
     */
    @Test(groups = {"Smoke"})
    public void verifyLabelsInFooterSection(){
        //HomePage object creation
        HomePage homePage = new HomePage();
        //navigate to home page of the application
        launchHomePage();
        //navigate to footerr section of home page
        homePage.scrollToFooterSection();
        //verify presence of Guide Center label in footer section
        Assert.assertTrue(homePage.isGuideCenterLabelFooterPresent());
        //verify presence of Tools label in footer section
        Assert.assertTrue(homePage.isToolsLabelFooterPresent());
        //verify presence of Company label in footer section
        Assert.assertTrue(homePage.isCompanyLabelFooterPresent());
    }

    /**
     * Verify user is able to see Get Started with Flixier, Video Editing Basics, Create videos faster with your own templates, Flixier Timeline tips and tricks, Publish video to YouTube, Make Pro looking videos links under Guide Center label in the footer section and redirects to the correct page.
     */
    @Test(groups = {"Smoke"})
    public void verifyGuideCenterFooterLinks(){
        //HomePage object creation
        HomePage homePage = new HomePage();
        //navigate to home page of the application
        launchHomePage();
        //verify availability of Get Started with Flixier footer link and it's functionality
        homePage.scrollToFooterSection();
        Assert.assertTrue(isTextpresent(HomePage.get_started_with_flixier_str));
        clickText(HomePage.get_started_with_flixier_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_guide_center_page).isDisplayed());
        //Verify availability of Video Editing Basics footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.video_editing_basis_str).isDisplayed());
        clickText(HomePage.video_editing_basis_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_guide_center_page).isDisplayed());
        //Verify availability of Create videos faster with your own templates footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.create_videos_faster_with_your_own_templates_str).isDisplayed());
        clickText(HomePage.create_videos_faster_with_your_own_templates_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_guide_center_page).isDisplayed());
        //Verify availability of Flixier Timeline tips and tricks footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.flixier_timeline_tips_and_trick_str).isDisplayed());
        clickText(HomePage.flixier_timeline_tips_and_trick_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_guide_center_page).isDisplayed());
        //Verify availability of Publish video to YouTube footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.publish_video_to_youtube_str).isDisplayed());
        clickText(HomePage.publish_video_to_youtube_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_guide_center_page).isDisplayed());
        //Verify availability of Make Pro looking videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.make_pro_looking_videos).isDisplayed());
        clickText(HomePage.make_pro_looking_videos);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_guide_center_page).isDisplayed());
    }

    /**
     * Verify user is able to see All Tools, Add Audio To Video, Add Image To Video, Add Subtitles to Videos, Add Text To Video, Collaborate on Videos, Blur or Pixelate Videos, Crop Video, Cut Video, Glitching Effect, Green Screen Videos, Photo Slideshow Video, Picture in Picture Videos, Speed Up/Down Videos, Text to Speech Videos, Video Splitter, Video Trimmer, Screen Recorder, Zoom Recordings links under Tools label in the footer section and redirects to the correct page.
     */
    @Test(groups = {"Smoke"})
    public void verifyToolsFooterLinks(){
        //HomePage object creation
        HomePage homePage = new HomePage();
        //navigate to home page of the application
        launchHomePage();
        //Verify availability of All Tools footer link and it's functionality
        homePage.scrollToFooterSection();
        Assert.assertTrue(findText(HomePage.all_tools_str).isDisplayed());
        clickText(HomePage.all_tools_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Add Audio To Video footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.add_audio_to_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.add_audio_to_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Add Image To Video footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.add_image_to_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.add_image_to_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availbility of Add Subtitles to Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.add_subtitles_to_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.add_subtitles_to_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Add Text To Video footer linka and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.add_text_to_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.add_text_to_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verfiy availability of Collaborate on Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.collaborate_on_videos_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.collaborate_on_videos_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Blur or Pixelate Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.blur_or_pixelate_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.blur_or_pixelate_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Crop Video footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.crop_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.crop_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Cut Video footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.cut_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.cut_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Glitching Effect footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.glitching_effect_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.glitching_effect_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Green Screen Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.green_screen_videos_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.green_screen_videos_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Photo Slideshow Video footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.photo_slideshow_video_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.photo_slideshow_video_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Picture in Picture Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.picture_in_picture_videos_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.picture_in_picture_videos_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Speed Up/Down Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.speed_up_down_videos_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.speed_up_down_videos_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Text to Speech Videos footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.text_to_speech_videos_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.text_to_speech_videos_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Video Splitter footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.video_splitter_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.video_splitter_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Video Trimmer footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.video_trimmer_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.video_trimmer_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Screen Recorder footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.screen_recorder_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.screen_recorder_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
        //Verify availability of Zoom Recordings footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.zoom_recordings_footer).isDisplayed());
        findElementUntilElementVisible(HomePage.zoom_recordings_footer).click();
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_tools_page).isDisplayed());
    }

    /**
     * Verify user is able to see Jobs, Pricing, Changelog, Help Center, Affiliate Program, Press Kit, Privacy Policy, Terms and Conditions, Contact Us links under Company label in the footer section and redirects to the correct page.
     */
    @Test(groups = {"Smoke"})
    public void verifyCompanyFooterLinks(){
        //HomePage object creation
        HomePage homePage = new HomePage();
        //navigate to home page of the application
        launchHomePage();
        //Verify availability of All Tools footer link and it's functionality
        homePage.scrollToFooterSection();
        Assert.assertTrue(findText(HomePage.jobs_str).isDisplayed());
        clickText(HomePage.jobs_str);
// Assert.assertTrue(findElementUntilElementVisible(HomePage.well_found_on_jobs_page).isDisplayed());
        //verify presence of Pricing footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findExactText(HomePage.pricing_str).isDisplayed());
        clickExactText(HomePage.pricing_str);
        findElementUntilElementVisible(findText(HomePage.than_any_other_video_tool_str));
        Assert.assertTrue(findElementUntilElementVisible(HomePage.header_flixier_logo).isDisplayed());
        //verify presence of Changelog footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.changelog_str).isDisplayed());
        clickText(HomePage.changelog_str);
        findElementUntilElementVisible(findText(HomePage.enhance_audio_from_editor_str));
        Assert.assertTrue(findElementUntilElementVisible(HomePage.header_flixier_logo).isDisplayed());
        //verify presence of Help Center footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.help_center_str).isDisplayed());
        clickText(HomePage.help_center_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_company_page_fancy1_looking).isDisplayed());
        //verify presence of Affiliate Program footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.affiliate_program_str).isDisplayed());
        clickText(HomePage.affiliate_program_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.flixier_logo_affiliate_program_page_header).isDisplayed());
        //verify presence of Press Kit footer link and it's functionality
        homePage.navigateBackAndScrollToFooterSection();
        Assert.assertTrue(findText(HomePage.press_kit_str).isDisplayed());
        clickText(HomePage.press_kit_str);
        switchToChildWindow();
        if(platform_properties.getProperty("browser").equalsIgnoreCase("firefox")){
            Assert.assertTrue(findElementUntilElementVisible(HomePage.pdf_on_webpage_firefox).isDisplayed());
        }
        else{
            Assert.assertTrue(findElementUntilElementVisible(HomePage.pdf_on_webpage).isDisplayed());
        }

        //verify presence of Privacy Policy footer link and it's functionality
        switchToParentWindow();
        Assert.assertTrue(findExactText(HomePage.privacy_policy_str).isDisplayed());
        clickExactText(HomePage.privacy_policy_str);
        switchToChildWindow();
        findText(HomePage.introduction_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.header_flixier_logo).isDisplayed());
        //verify presence of Terms and Conditions footer link and it's functionality
        switchToParentWindow();
        Assert.assertTrue(findExactText(HomePage.terms_and_conditions_str).isDisplayed());
        clickExactText(HomePage.terms_and_conditions_str);
        switchToChildWindow();
        findText(HomePage.introduction_str);
        Assert.assertTrue(findElementUntilElementVisible(HomePage.header_flixier_logo).isDisplayed());
        //verify presence of Contact Us footer link
        switchToParentWindow();
        Assert.assertTrue(findText(HomePage.contact_us_str).isDisplayed());
    }


}
