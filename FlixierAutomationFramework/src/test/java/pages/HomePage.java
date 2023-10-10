package pages;

import framework.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Drivers {
    //flixier logo in header section
    @FindBy(css = "[src = 'https://df02ig60gv6ag.cloudfront.net/landing/img/logo-inverse.5b3e12f.svg']")
    public static WebElement header_flixier_logo;

    //flixier logo in footer section
    @FindBy(css = "[src = 'https://df02ig60gv6ag.cloudfront.net/landing/img/logo-footer.78c7fab.svg']")
    public static WebElement footer_flixier_logo;

    //Tools drop-down in header
    @FindBy(xpath = "//*[contains(text(), 'Tools') and @class='nav-link cursor-pointer']")
    public static WebElement tools_dropdown;

    //Create in header
    @FindBy(xpath = "//*[contains(text(), 'Create') and @class='nav-link cursor-pointer']")
    public static WebElement create_dropdown;

    //Pricing tab in header
    @FindBy(xpath = "//a[@class = 'nav-link' and contains(text(), 'Pricing')]")
    public static WebElement pricing_tab_header;

    //Templates tab in header
    @FindBy(xpath = "//a[@class = 'nav-link' and contains(text(), 'Templates')]")
    public static WebElement templates_tab_header;

    //Blog tab in header
    @FindBy(xpath = "//a[@class = 'nav-link' and contains(text(), 'Blog')]")
    public static WebElement blog_tab_header;

    //SignIn button in header
    @FindBy(xpath = "//a[@class = 'nav-link' and contains(text(), 'Sign In')]")
    public static WebElement signIn_button_header;

    //Get Started button in header section
    @FindBy(css = "[class = 'btn btn-outline-primary-dark']")
    public static WebElement get_started_button_header;

    //YouTube videos icon
    @FindBy(css = "[class = 'fa-3x svg-inline--fa fa-youtube fa-w-18 fa-fw']")
    public static WebElement youtube_videos_icon;

    //Online Course label

    //Online Course Icon
    @FindBy(css = "[class = 'users-icon user-icon-courses']")
    public static WebElement online_course_icon;

    //Webinars label

    //Webinars Icon
    @FindBy(css = "[class = 'users-icon user-icon-webinars']")
    public static WebElement webinars_icon;

    //Twitch Streams label

    //Twitch Streams Icon
    @FindBy(css = "[class = 'users-icon user-icon-twitch']")
    public static WebElement twitch_streams_icon;

    //Zoom recordings label

    //Zoom recordings Icon
    @FindBy(css = "[class = 'users-icon user-icon-zoom']")
    public static WebElement zoom_recordings_icon;

    //Marketing label

    //Marketing Icon
    @FindBy(css = "[class = 'users-icon user-icon-marketing']")
    public static WebElement marketing_icon;

    //Edit YouTube videos online and publish them in minutes title
    @FindBy(css = "[class = 'animate-in-first']")
    public static WebElement edit_youtube_videos_online_and_publish_title;

    //How to make online courses easily
    @FindBy(css = "[class = 'display-heading-1 text-dark content-width-extra-large']")
    public static WebElement how_to_make_online_courses_easily_title;

    //how to edit webinar recording online title
    @FindBy(css = "[class = 'display-heading-1 text-dark content-width-extra-large']")
    public static WebElement how_to_edit_webinar_recording_online_title;

    //Edit Twitch videos with a few clicks title
    @FindBy(css = "[class = 'display-heading-1 text-dark content-width-extra-large']")
    public static WebElement edit_twitch_videos_title;

    //Edit Zoom Recordings online in minutes title
    @FindBy(css = "[class = 'display-heading-2 text-left']")
    public static WebElement edit_zoom_recordings_online_title;

    //Super easy to use Video Ad Maker title
    @FindBy(css = "[class = 'display-heading-2 text-left']")
    public static WebElement super_easy_to_use_video_ad_maker_title;

    //import window
    @FindBy(css = "[class = 'e-dropzone text-center position-relative d-flex']")
    public static WebElement import_window;

    //twitter icon
    @FindBy(css = "[data-icon = 'twitter']")
    public static WebElement twitter_icon_footer;

    //instagram icon
    @FindBy(css = "[data-icon = 'instagram']")
    public static WebElement instagram_icon_footer;

    //facebook icon
    @FindBy(css = "[data-icon = 'facebook-f']")
    public static WebElement facebook_icon_footer;

    //youtube icon
    @FindBy(css = "[class = 'fa-2x svg-inline--fa fa-youtube fa-w-18 fa-fw']")
    public static WebElement youtube_icon_footer;

    //titok icon
    @FindBy(css = "[class = 'fa-2x svg-inline--fa fa-tiktok fa-w-14 fa-fw']")
    public static WebElement tiktok_icon_footer;

    //'x' icon on Twitter Page
    @FindBy(css = "[class = 'r-18jsvk2 r-4qtqp9 r-yyyyoo r-16y2uox r-lwhw9o r-dnmrzs r-bnwqim r-1plcrui r-lrvibr']")
    public static WebElement x_icon_twitter_signin;

    //Instagram logo
    @FindBy(css = "[aria-label = 'Instagram']")
    public static WebElement instagram_logo_on_login_page;

    //Connect with Flixier on Facebook label on facebook page
    @FindBy(css = "[class = 'x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']")
    public static WebElement connect_with_flixier_on_facebook_title;

    //flixier logo on youtube page
    @FindBy(css = "[class = 'banner-visible-area style-scope ytd-c4-tabbed-header-renderer']")
    public static WebElement flixier_logo_on_youtube_page;

    //Language selector in footer section
    @FindBy(css = "[class = 'btn bg-dark text-white px-5 rounded mt-5']")
    public static WebElement language_selector;
    //flixier logo on Guide Center page
    @FindBy(css = "[src = 'https://global-uploads.webflow.com/6076d7de4e3890813de6dfe2/60b7b428c21e3ae710e431d7_logo-inverse.svg']")
    public static WebElement flixier_logo_guide_center_page;
    //flixier logo on Tools page
    @FindBy(css = "[src = 'https://global-uploads.webflow.com/6076d7de4e3890813de6dfe2/60a29b956a6be4e01c5463e0_Blue-transparent%20Logo.png']")
    public static WebElement flixier_logo_tools_page;
    //zoom recordings footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/create/edit-zoom-recording']")
    public static WebElement zoom_recordings_footer;
    //Add Audio to Video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/create/add-audio-to-video']")
    public static WebElement add_audio_to_video_footer;
    //Add Image to Video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/add-image-to-video']")
    public static WebElement add_image_to_video_footer;
    //Add Subtitles to video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/add-subtitle-to-video']")
    public static WebElement add_subtitles_to_video_footer;
    //Add Text to Video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/add-text-to-video']")
    public static WebElement add_text_to_video_footer;
    //Collaborate on Videos footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/video-collaboration']")
    public static WebElement collaborate_on_videos_footer;
    //Blur or pixelate videos
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/blur-or-pixelate-video']")
    public static WebElement blur_or_pixelate_video_footer;
    //Crop Video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/crop-video']")
    public static WebElement crop_video_footer;
    //Cut Video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/cut-videos']")
    public static WebElement cut_video_footer;
    //Glitching Effect footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/video-effects-editor/video-glitch-effect']")
    public static WebElement glitching_effect_footer;
    //Green Screen Videos footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/make-green-screen-video']")
    public static WebElement green_screen_videos_footer;
    //Photo Slideshow Video footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/create/slideshow-maker-online']")
    public static WebElement photo_slideshow_video_footer;
    //Picture in Picture Videos footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/picture-in-picture-video']")
    public static WebElement picture_in_picture_videos_footer;
    //Speed Up/Down Videos footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/speed-up-slow-down-video']")
    public static WebElement speed_up_down_videos_footer;
    //Text to Speech Videos footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/text-to-speech-videos']")
    public static WebElement text_to_speech_videos_footer;
    //Video Splitter footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/video-splitter']")
    public static WebElement video_splitter_footer;
    // Video Trimmer footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/video-trimmer']")
    public static WebElement video_trimmer_footer;
    //Screen Recorder footer
    @FindBy(css = ".footer-links [href = 'https://flixier.com/tools/online-screen-recorder']")
    public static WebElement screen_recorder_footer;
    @FindBy(css = "[src = 'https://global-uploads.webflow.com/6076d7de4e3890813de6dfe2/60b7b428c21e3ae710e431d7_logo-inverse.svg']")
    public static WebElement flixier_logo_company_page_fancy1_looking;
    //flixier logo affiliate program page
    @FindBy(css = "[src = 'https://global-uploads.webflow.com/6076d7de4e3890813de6dfe2/60b7b428c21e3ae710e431d7_logo-inverse.svg']")
    public static WebElement flixier_logo_affiliate_program_page_header;
    //pdf on web-page
    @FindBy(css = "[type = 'application/pdf']")
    public static WebElement pdf_on_webpage;
    //pdf on web-page firefox
    @FindBy(css = "[class = 'pdfViewer']")
    public static WebElement pdf_on_webpage_firefox;
    //well-found on jobs page
    @FindBy(css = "[class = 'captcha__header__container']")
    public static WebElement well_found_on_jobs_page;
    //YouTube videos label
    public static final String youTube_videos_str = "YouTube videos";
    //Online course label
    public static final String online_course_str = "Online course";
    //webinars labe
    public static final String webinars_str = "Webinars";
    //twitch streams labe
    public static final String twitch_streams_str = "Twitch streams";
    //zoom recordings label
    public static final String zoom_recordings_str = "Zoom recordings";
    //marketing videos label
    public static final String marketing_videos_str = "Marketing videos";
    //tiktok url
    public static final String tiktok_url_str = "https://www.tiktok.com/@flixier";
    //Guide Center label in footer section
    public static final String guide_center_str = "Guide Center";
    //Tools label in footer section
    public static final String tools_str = "Tools";
    //Company label in footer section
    public static final String company_str = "Company";
    //Spanish language menu item
    public static final String spanish_menu_item_str = "Español";
    //Portuguese language menu item
    public static final String portuguese_menu_item_str = "Português";
    //German language menu item
    public static final String german_menu_item_str = "Deutsch";
    //English language menu item
    public static final String english_menu_item_str = "English";
    //Portuguese string
    public static final String portuguese_str = "Portuguese";
    //Get Started with Flixier string
    public static final String get_started_with_flixier_str = "Get Started with Flixier";
    //Video Editing Basics string
    public static final String video_editing_basis_str = "Video Editing Basics";
    //Create videos faster with your own templates str
    public static final String create_videos_faster_with_your_own_templates_str = "Create videos faster with your own templates";
    //Flixier Timeline tips and tricks str
    public static final String flixier_timeline_tips_and_trick_str = "Flixier Timeline tips and tricks";
    //Publish video to YouTube str
    public static final String publish_video_to_youtube_str = "Publish video to YouTube";
    //Make Pro looking videos string
    public static final String make_pro_looking_videos = "Make Pro looking videos";
    //All Tools str
    public static final String all_tools_str = "All Tools";
    //Jobs String
    public static final String jobs_str = "Jobs";
    //Pricing string
    public static final String pricing_str = "Pricing";
    //Changelog string
    public static final String changelog_str = "Changelog";
    //Help Center string
    public static final String help_center_str = "Help Center";
    //Affiliate Program string
    public static final String affiliate_program_str = "Affiliate Program";
    //Press Kit string
    public static final String press_kit_str = "Press Kit";
    //Privacy Policy string
    public static final String privacy_policy_str = "Privacy Policy";
    //Terms and Conditions string
    public static final String terms_and_conditions_str = "Terms and Conditions";
    //Contact Us string
    public static final String contact_us_str = "Contact Us";
    //than any other video tool string
    public static final String than_any_other_video_tool_str = "than any other video tool";
    //Enhance audio from the Editor string
    public static final String enhance_audio_from_editor_str = "Enhance audio from the Editor";
    //Introduction string
    public static final String introduction_str = "Introduction";

    /**
     * Initialize elements via PageFactory class
     */
    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    /**
     * verify presence of flixier logo in header
     */
    public boolean isFlixierLogoPresentInHeader(){
        return findElementUntilElementVisible(header_flixier_logo).isDisplayed();
    }

    /**
     * verif presence of flixier logo in footer
     */
    public boolean isFlixierLogoPresentInFooter(){
        return findElementUntilElementVisible(footer_flixier_logo).isDisplayed();
    }

    /**
     * verify presence of Tools drop-down in header
     */
    public boolean isToolsDropDownPresentInHeader(){
        return findElementUntilElementVisible(tools_dropdown).isDisplayed();
    }

    /**
     * verify presence of Create drop-down in header
     */
    public boolean isCreateDropDownPresentInHeader(){
        return findElementUntilElementVisible(create_dropdown).isDisplayed();
    }

    /**
     * verify presence of Pricing tab in header
     */
    public boolean isPricingTabPresentInHeader(){
        return findElementUntilElementVisible(pricing_tab_header).isDisplayed();
    }

    /**
     * verify presence of Templates tab in header
     */
    public boolean isTemplatesTabPresentInHeader(){
        return findElementUntilElementVisible(templates_tab_header).isDisplayed();
    }

    /**
     * verify presence of Blog tab in header
     */
    public boolean isBlogTabPresentInHeader(){
        return findElementUntilElementVisible(blog_tab_header).isDisplayed();
    }

    /**
     * verify presence of SignIn button in header
     */
    public boolean isSignInButtonPresentInHeader(){
        return findElementUntilElementVisible(signIn_button_header).isDisplayed();
    }

    /**
     * verify presence of YouTube videos icon
     */
    public boolean isYouTubeVideosIconPresent(){
        return findElementUntilElementVisible(youtube_videos_icon).isDisplayed();
    }

    /**
     * verify presence of YouTube videos label
     */
    public boolean isYouTubeVideosLinkPresent(){
        return findText(youTube_videos_str).isDisplayed();
    }

    /**
     *verify presence of online course icon
     */
    public boolean isOnlineCourseIconPresent(){
        return findElementUntilElementVisible(online_course_icon).isDisplayed();
    }

    /**
     * verify presence of online course label
     */
    public boolean isOnlineCourseLinkPresent(){
        return findText(online_course_str).isDisplayed();
    }

    /**
     *verify presence of webinars icon
     */
    public boolean isWebinarsIconPresent(){
        return findElementUntilElementVisible(webinars_icon).isDisplayed();
    }

    /**
     * verify presence of webinars label
     */
    public boolean isWebinarsLinkPresent(){
        return findText(webinars_str).isDisplayed();
    }

    /**
     *verify presenc of Twitch streams icon
     */
    public boolean isTwitchStreamsIconPresent(){
        return findElementUntilElementVisible(twitch_streams_icon).isDisplayed();
    }

    /**
     * verify presence of Twitch Streams label
     */
    public boolean isTwitchStreamLinkPresent(){
        return findText(twitch_streams_str).isDisplayed();
    }

    /**
     *verify presence of Zoom recordings icon
     */
    public boolean isZoomRecordingsIconPresent(){
        return findElementUntilElementVisible(zoom_recordings_icon).isDisplayed();
    }

    /**
     * verify presence of zoom recordings label
     */
    public boolean isZoomRecordingLinkPresent(){
        return findText(zoom_recordings_str).isDisplayed();
    }

    /**
     *verify presence of Marketing videos icon
     */
    public boolean isMarketingVideosIconPresent(){
        return findElementUntilElementVisible(marketing_icon).isDisplayed();
    }

    /**
     * verify presence of markeitng videos link
     */
    public boolean isMarketingVideosLinkPresent(){
        return findText(marketing_videos_str).isDisplayed();
    }

    /**
     * Click YouTube videos link text
     */
    public void clickYouTubeVideosLinkText(){
        scrollToElement(youtube_videos_icon);
        findText(youTube_videos_str).click();
        findElementUntilElementVisible(edit_youtube_videos_online_and_publish_title).isDisplayed();
    }

    /**
     * verify presence of Edit YouTube videos online and publish them in minutes! title on YouTube videos link page
     */
    public boolean isEDitYouTubeVideosOnlineAndPublishTitlePresent(){
        return findElementUntilElementVisible(edit_youtube_videos_online_and_publish_title).isDisplayed();
    }

    /**
     * click Online course link text
     */
    public void clickOnlineCourseLinkText(){
        scrollToElement(online_course_icon);
        isOnlineCourseLinkPresent();
        findText(online_course_str).click();
        findElementUntilElementVisible(how_to_make_online_courses_easily_title).isDisplayed();
    }

    /**
     * Verify presence of Make online courses easily title
     */
    public boolean isHowToMakeOnlineCoursesEasilyTitlePresent(){
        return findElementUntilElementVisible(how_to_make_online_courses_easily_title).isDisplayed();
    }

    /**
     * click on Webinars link text
     */
    public void clickWebinarsLinkText(){
        scrollToElement(webinars_icon);
        isWebinarsIconPresent();
        findText(webinars_str).click();
        findElementUntilElementClickable(how_to_edit_webinar_recording_online_title).isDisplayed();
    }

    /**
     * verify presence of How to edit a webinar recording online title in Webinars link text page
     */
    public boolean isHowToEditWebinarsRecordingOnlineTitlePresent(){
        return findElementUntilElementVisible(how_to_edit_webinar_recording_online_title).isDisplayed();
    }

    /**
     * click Twitch Streams link text
     */
    public void clickTwitchStreamsLinkText(){
        scrollToElement(twitch_streams_icon);
        isTwitchStreamLinkPresent();
        findText(twitch_streams_str).click();
        findElementUntilElementVisible(edit_twitch_videos_title).isDisplayed();
    }

    /**
     * Verify presence of Edit Twitch videos with a few clicks title on Twitch Videos link text page
     */
    public boolean isEditTwitchVideosTitlePresent(){
        return findElementUntilElementVisible(edit_twitch_videos_title).isDisplayed();
    }

    /**
     * click on Zoom recordings link text
     */
    public void clickZoomRecordingsLinkText(){
        scrollToElement(zoom_recordings_icon);
        isZoomRecordingsIconPresent();
        findText(zoom_recordings_str).click();
        findElementUntilElementVisible(edit_zoom_recordings_online_title).isDisplayed();
    }

    /**
     * verify presence of Edit Zoom Recordings online in minutes title on zoom recordings link text page
     */
    public boolean isEditZoomRecordingsOnlineTitlePresent(){
        return findElementUntilElementVisible(edit_zoom_recordings_online_title).isDisplayed();
    }

    /**
     * click Marketing videos link text
     */
    public void clickMarketingVideosLinkText(){
        scrollToElement(marketing_icon);
        isMarketingVideosIconPresent();
        findText(marketing_videos_str).click();
        findElementUntilElementVisible(super_easy_to_use_video_ad_maker_title).isDisplayed();
    }

    /**
     * verify presence of Super easy to use Video Ad Maker title on Marketing videos link text page
     */
    public boolean isSuperEasyToUseVideoTitlePresent(){
        return findElementUntilElementVisible(super_easy_to_use_video_ad_maker_title).isDisplayed();
    }

    /**
     * click SignIn button in header section
     */
    public void clickSignInButton(){
        LoginPage loginPage = new LoginPage();
        scrollToElement(signIn_button_header);
        findElementUntilElementVisible(signIn_button_header).click();
        loginPage.isLoginButtonDisplayed();
    }

    /**
     * click Get Started button in header section
     */
    public void clickGetStartedButton(){
        scrollToElement(get_started_button_header);
        findElementUntilElementVisible(get_started_button_header).click();
    }

    /**
     * verify presence of import window
     */
    public boolean isImportWindowPresent(){
        return findElementUntilElementVisible(import_window).isDisplayed();
    }

    /**
     * Scroll to Header section
     */
    public void scrollToHeaderSection(){
        scrollToElement(header_flixier_logo);
    }

    /**
     * Scroll to Footer section
     */
    public void scrollToFooterSection(){
        scrollToElement(footer_flixier_logo);
    }

    /**
     * click twitter icon footer
     */
    public void clickTwitterIconFooter(){
        scrollToFooterSection();
        findElementUntilElementClickable(twitter_icon_footer).click();
    }

    /**
     * click instagram icon footer
     */
    public void clickIntagramIconFooter(){
        scrollToFooterSection();
        findElementUntilElementClickable(instagram_icon_footer).click();
    }

    /**
     * click facebook icon footer
     */
    public void clickFacebookIconFooter(){
        scrollToFooterSection();
        findElementUntilElementClickable(facebook_icon_footer).click();
    }

    /**
     * click youtubeIcon footer
     */
    public void clickYouTubeIconFooter(){
        scrollToFooterSection();
        findElementUntilElementClickable(youtube_icon_footer).click();
    }

    /**
     * click tiktok icon in footer
     */
    public void clickTiktokIconFooter(){
        scrollToFooterSection();
        findElementUntilElementClickable(tiktok_icon_footer).click();
    }

    /**
     * verify presence of 'x' icon on twitter login page
     */
    public boolean isXIconTwitterPresent(){
        return findElementUntilElementVisible(x_icon_twitter_signin).isDisplayed();
    }

    /**
     * verify presence of instagram logo on instagram login page
     */
    public boolean isInstagramLogoPresent(){
        return findElementUntilElementVisible(instagram_logo_on_login_page).isDisplayed();
    }

    /**
     * verify presence of Connect with Flixier on Facebook
     */
    public boolean isConnectWithFlixierOnFacebookTitlePresent(){
        return findElementUntilElementVisible(connect_with_flixier_on_facebook_title).isDisplayed();
    }

    /**
     * verify presence of flixier logo on youtube page
     */
    public boolean isFlixierLogoOnYoutubePagePresent(){
        return findElementUntilElementVisible(flixier_logo_on_youtube_page).isDisplayed();
    }

    /**
     * verify user is redirected to tiktok page
     */
    public boolean isTikTokPagePresent(){
        return getCurrentURL().equals(tiktok_url_str);
    }

    /**
     * verify presence of Guide Center label in footer section
     */
    public boolean isGuideCenterLabelFooterPresent(){
        return findText(guide_center_str).isDisplayed();
    }

    /**
     * verify presence of Tools label in footer section
     */
    public boolean isToolsLabelFooterPresent(){
        return findExactText(tools_str).isDisplayed();
    }
    /**
     * verify presence of Company label in footer section
     */
    public boolean isCompanyLabelFooterPresent(){
        return findText(company_str).isDisplayed();
    }

    /**
     * change web page language to Spanish and verify
     */
    public boolean verifyChangeLangugeToSpanish(){
        findElementUntilElementVisible(language_selector).click();
        findText(spanish_menu_item_str).isDisplayed();
        findText(spanish_menu_item_str).click();
        return findElementUntilElementVisible(language_selector).getText().contains(spanish_menu_item_str);
    }

    /**
     * change web page language to German and verify
     */
    public boolean verifyChangeLanguageToPortuguese(){
        findElementUntilElementVisible(language_selector).click();
        findText(portuguese_menu_item_str).isDisplayed();
        findText(portuguese_menu_item_str).click();
        return findElementUntilElementVisible(language_selector).getText().contains(portuguese_str);
    }

    /**
     * change web page language to Portuguese
     */
    public boolean verifyChangeLanguageToGerman(){
        findElementUntilElementVisible(language_selector).click();
        findText(german_menu_item_str).isDisplayed();
        findText(german_menu_item_str).click();
        return findElementUntilElementVisible(language_selector).getText().contains(german_menu_item_str);
    }

    /**
     * change web page language to English
     */
    public boolean verifyChangeLanguageToEnglish(){
        findElementUntilElementVisible(language_selector).click();
        findText(english_menu_item_str).isDisplayed();
        findText(english_menu_item_str).click();
        return findElementUntilElementVisible(language_selector).getText().contains(english_menu_item_str);
    }

    /**
     * navigate back and scroll to footer section
     */
    public void navigateBackAndScrollToFooterSection(){
        navigateBack();
        findElementUntilElementVisible(header_flixier_logo);
        scrollToFooterSection();
        findElementUntilElementVisible(footer_flixier_logo).isDisplayed();
    }



}
