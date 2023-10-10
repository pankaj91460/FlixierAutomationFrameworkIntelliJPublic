package tests;

import framework.Drivers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountHomePage;
import pages.HomePage;
import pages.LoginPage;

public class AccountHomePageTests extends Drivers {
    /**
     * Verify the presence of My Team, Free Plan, Home, Quick Tools, Billings and Plan, Storage, Export Time on the left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyOptionsOnLeftNavigationPane(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //verify presence of My Team
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.my_team).isDisplayed());
        //verify presence of Free Plan text (plan type)
        Assert.assertTrue(findText(AccountHomePage.free_plan_str).isDisplayed());
        //verify presence of home icon
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.home_icon).isDisplayed());
        //verify presence of Home text
        Assert.assertTrue(findText(AccountHomePage.home_str).isDisplayed());
        //verify presence of Quick Tools icon
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.quick_tools_icon).isDisplayed());
        //verify presence of Quick Tools string
        Assert.assertTrue(findText(AccountHomePage.quick_tools_str).isDisplayed());
        //verify presence of Billing and Plans icon
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.billing_and_plans_icon).isDisplayed());
        //verify presence of Billing and Plans string
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.billing_and_plans_text).isDisplayed());
        //Verify presence of Storage text
        Assert.assertTrue(findText(AccountHomePage.storage_str).isDisplayed());
        //verify presence of Export Time text
        Assert.assertTrue(findText(AccountHomePage.export_time).isDisplayed());
    }

    /**
     * Verify the presence of Projects, Media Library, Review Links, Exports, Templates, Brand Kit tabs in Home of the navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyTabsUnderHomeOption(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Home option on left navigation pane
        accountHomePage.clickHomeOption();
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of Create Project text
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isDisplayed());
        //verify presence of Project tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.projects_tab).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.projects_tab).isEnabled());
        //verify presence of Media Library tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.media_library_tab).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.media_library_tab).isEnabled());
        //verify presence of Review Links tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.review_links_tab).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.review_links_tab).isEnabled());
        //verify presence of Exports tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.exports_tab).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.exports_tab).isEnabled());
        //verify presence of Templates tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.templates_tab).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.templates_tab).isEnabled());
        //verify presence of Brand Kit tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.brand_kit_tab).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.brand_kit_tab).isEnabled());
    }

    /**
     * Verify the presence of Create Project under Projects tab in Home of the navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyCreateProjectButton(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Home option on left navigation pane
        accountHomePage.clickHomeOption();
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of Create Project button
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isDisplayed());
        //verify Create Project button is enabled
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isEnabled());
    }

    /**
     * Verify the functionality of Projects, Media Library, Review Links, Exports, Templates, Brand Kit tabs and redirects to correct page in Home of the navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyTabsFunctionalityUnderHomeOption(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Home option on left navigation pane
        accountHomePage.clickHomeOption();
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of Create Project text
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isDisplayed());
        //click Media Library tab
        accountHomePage.clickMediaLibraryTab();
        //verify presence of it's empty in here icon
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.its_empty_in_here_icon_in_media_library_tab).isDisplayed());
        //click Review Links tab
        accountHomePage.clickReviewLinksTab();
        //verify presence of link icon
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.link_icon_in_review_links_tab).isDisplayed());
        //click Exports tab
        accountHomePage.clickExportsTab();
        //verify presence of video icon
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.video_icon_in_exports_tab).isDisplayed());
        //click Templates tab
        accountHomePage.clickTepmplatesTab();
        //verify presence of templates container for Templates tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.templates_container_in_templates_tab).isDisplayed());
        //click Brand Kit tab
        accountHomePage.clickBrandKitTab();
        //verify presence of brand kit container for Brand Kit tab
        Assert.assertTrue((findElementUntilElementVisible(AccountHomePage.brand_kit_content_container_in_brand_kit_tab).isDisplayed()));
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of Create Project string
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isDisplayed());
    }

    /**
     * Verify user is able to change options to Name, Date, Duration, Ascending, Descending from drop-down menu under Projects tab in Home of left the navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyNameDateDurationAscendingDescendingFunctionality(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Home option on left navigation pane
        accountHomePage.clickHomeOption();
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of drop-down arrow
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.drop_down_arrow).isDisplayed());
        //select Name menu item from drop-down menu
        accountHomePage.selectOptionFromDropDownArrowMenuItems(AccountHomePage.name_str);
        //verify selection of Name menu item
        Assert.assertTrue(AccountHomePage.drop_down_arrow.getText().contains(AccountHomePage.name_str));
        //select Date menu item from drop-down menu
        accountHomePage.selectOptionFromDropDownArrowMenuItems(AccountHomePage.date_str);
        //verify selection of Date menu item
        Assert.assertTrue(AccountHomePage.drop_down_arrow.getText().contains(AccountHomePage.date_str));
        //select Duration menu item from drop-down menu
        accountHomePage.selectOptionFromDropDownArrowMenuItems(AccountHomePage.duration_str);
        //verify selection of Duration menu item
        Assert.assertTrue(AccountHomePage.drop_down_arrow.getText().contains(AccountHomePage.duration_str));
        //select Ascending menu item from drop-down menu
        accountHomePage.selectOptionFromDropDownArrowMenuItems(AccountHomePage.ascending_str);
        //verify selection of Ascending menu item
        accountHomePage.clickDropDownArrow();
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.ascending_drop_down_menu_item).getAttribute(AccountHomePage.class_str).contains(AccountHomePage.active_attribute_value_str));
        //select Descending menu item from drop-down menu
        accountHomePage.selectOptionFromDropDownArrowMenuItems(AccountHomePage.descending_str);
        //verify selection of Descending menu item
        accountHomePage.clickDropDownArrow();
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.descending_drop_down_menu_item).getAttribute(AccountHomePage.class_str).contains(AccountHomePage.active_attribute_value_str));
    }

    /**
     * Verify user is able to create new folder from New Folder button under Projects tab in Home of the left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyCreateNewFolderFunctionality(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Home option on left navigation pane
        accountHomePage.clickHomeOption();
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of Create Project button
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isDisplayed());
        //create New Folder
        accountHomePage.createNewFolder(AccountHomePage.folder1_str);
        //verify creation of new folder
        Assert.assertTrue(findText(AccountHomePage.folder1_str).isDisplayed());
        //delete folder
        accountHomePage.deleteFolder(AccountHomePage.folder1_str);
    }

    /**
     * Verify user is able to create a Project via Create Project button under Projects tab in Home of the left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyProjectCreationUnderProjectsTab(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //random project name generation
        String project_name = generateRandomString();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Home option on left navigation pane
        accountHomePage.clickHomeOption();
        //click Projects tab
        accountHomePage.clickProjectsTab();
        //verify presence of Create Project button
        Assert.assertTrue(findText(AccountHomePage.create_project_str).isDisplayed());
        //create new project with random name
        accountHomePage.createProject(project_name);
        //verify if user is navigated to video editor page after new project creation
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.canvas_container_in_video_editor_page).isDisplayed());
        //verify successful creation of new project on Account Home Page
        navigateBack();
        Assert.assertTrue(findText(project_name).isDisplayed());
    }

    /**
     * Verify All Tools tab under Quick Tools option in navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyAllToolsUnderQuickToolsSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Quick Tools section on navigation paen
        accountHomePage.clickQuickToolsOption();
        //verify presence of All Tools tab
        Assert.assertTrue(findText(HomePage.all_tools_str).isDisplayed());
    }

    /**
     * Verify Screen Recorder, Enhance Audio, Video Compress and Generate Transcript under All Tools tab in Quick Tools section that redirects user to the expected page.
     */
    @Test(groups = {"Smoke"})
    public void verifyAllToolsTabContentFunctionalityUnderQuickToolsSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Quick Tools section on navigation pane
        accountHomePage.clickQuickToolsOption();
        //verify presenc eof Screen Recorder string
        Assert.assertTrue(isTextpresent(AccountHomePage.screen_recorder_str));
        //verify presence of Enhance Audio string
        Assert.assertTrue(isTextpresent(AccountHomePage.enhance_audio_str));
        //verify presence of Video Compressor string
        Assert.assertTrue(isTextpresent(AccountHomePage.video_compressor_str));
        //verify presence of Generate Transcript string
        Assert.assertTrue(isTextpresent(AccountHomePage.generate_transcript_str));
        //click Screen Recorder
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.screen_recorder_image).isDisplayed());
        clickText(AccountHomePage.screen_recorder_str);
        //verify presence of user is redirected to Screen Recorder page
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.pick_a_layout_text).isDisplayed());
        Assert.assertTrue(isTextpresent(AccountHomePage.pick_a_layout_str));
        //click Enhance Audio string
        navigateBack();
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.screen_recorder_image).isDisplayed());
        Assert.assertTrue(isTextpresent(AccountHomePage.enhance_audio_str));
        clickText(AccountHomePage.enhance_audio_str);
        //verify user is redirected to Enhance Audio page
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.upload_icon_cloud).isDisplayed());
        //click Video Compressor
        navigateBack();
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.screen_recorder_image).isDisplayed());
        Assert.assertTrue(isTextpresent(AccountHomePage.video_compressor_str));
        clickText(AccountHomePage.video_compressor_str);
        //verify user is redirected to Video Compressor page
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.upload_icon_cloud).isDisplayed());
        //click Generate Transcript
        navigateBack();
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.screen_recorder_image).isDisplayed());
        Assert.assertTrue(isTextpresent(AccountHomePage.generate_transcript_str));
        clickText(AccountHomePage.generate_transcript_str);
        //verify user is redirected to Generate Transcript page
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.upload_icon_cloud).isDisplayed());
    }

    /**
     * Verify Overview, Invoices and Bonuses tabs under Billing and Plans option in navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyOverviewInvoicesAndBonusesTabs(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //navigate to Billing and Plans section
        accountHomePage.clickBillingAndPlansOption();
        //verify presence of Overview tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.invoices_tab_in_billing_and_plans).isDisplayed());
        //verify presence of Invoices tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).isDisplayed());
        //verify presence of Bonuses tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.bonuses_tab_in_billing_and_plans).isDisplayed());
    }

    /**
     * Verify Current Plan, Go Pro and Go Business plans under Overview tab in Billing and Plans section.
     */
    @Test(groups = "Smoke")
    public void verifyPlansUnderOverviewTabInBussinessAnsPlansSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //navigate to Billing and Plans section
        accountHomePage.clickBillingAndPlansOption();
        //verify presence of Overview tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).isDisplayed());
        //click Overview tab
        findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).click();
        //verfiy presence of 10xfaster text
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.faster_10x_text).isDisplayed());
        //verify presence of free plan section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.free_plan_section).isDisplayed());
        //verify presence of Pro plan section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.pro_plan_section).isDisplayed());
        //verify presence of Business plan section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.business_plan_section).isDisplayed());
    }

    /**
     * Verify expected content under Invoices and Bonuses tabs in Billing and Plans section.
     */
    @Test(groups = {"Smoke"})
    public void verifyInvoicesAndBonusesTabContent(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //navigate to Billing and Plans section
        accountHomePage.clickBillingAndPlansOption();
        //verify presence of Overview tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).isDisplayed());
        //click Invoices tab
        accountHomePage.clickInvoicesTab();
        //verify presence of Invoices tab content
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.you_do_not_have_invoices_yet_text).isDisplayed());
        //click Bonuses tab
        accountHomePage.clickBonusesTab();
        //verify presence of Bonuses tab content
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.earn_more_storage_and_render_time_text).isDisplayed());
    }

    /**
     * Verify notification, get help, change language and user account settings icon on the topbar of the account home page.
     */
    @Test(groups = {"Smoke"})
    public void verifyTopbarElementsOnAccountHomePage(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //verify presence of notifications bell icon on tapbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.notifications_bell_icon_on_topbar).isDisplayed());
        //verify presence of get help icon on tapbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.get_help_icon_on_topbar).isDisplayed());
        //verify presence of change language icon on tapbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.change_language_icon_on_topbar).isDisplayed());
        //verify presence of user account settings icon on tapbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.user_account_settings_icon_on_topbar).isDisplayed());
    }

    /**
     * Verify Notifiactions icon and it's drop-down menu items on the topbar of account home page.
     */
    @Test(groups = {"Smoke"})
    public void verifyNotificationsDropDownMenuItemsOnTopbar(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click notifications bell icon on topbar
        accountHomePage.clickNotificationsIconOnTopbar();
        //verify presence of notification window
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.notifications_drop_down_window).isDisplayed());
        //verify Notifications label in notifications window
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.notifications_label_in_notifications_window).isDisplayed());
    }

    /**
     * Verify Get Help icon and it's drop-down menu items on the topbar of account home page.
     */
    @Test(groups = {"Smoke"})
    public void verifyGetHelpDropDownMenu(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click Get Help icon on topbar
        accountHomePage.clickGetHelpIconOnTopbar();
        //verify presence of Get Help menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.get_help_menu_item).isDisplayed());
        //verify presence of Feedback menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.feedback_menu_item).isDisplayed());
        //verify presence of What's new menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.what_new_menu_item).isDisplayed());
    }

    /**
     * Verify Change Language icon and it's drop-down menu items on the topbar of account home page.
     */
    @Test(groups = {"Smoke"})
    public void verifyChangeLanguageDropDownMenu(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click change language icon on topbar
        accountHomePage.clickChangeLanguageIconOnTopbar();
        //verify presence of change language drop-down menu
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.change_language_drop_down_window).isDisplayed());
        //verify presence of Espanol menu item
        Assert.assertTrue(findText(AccountHomePage.espanol_str).isDisplayed());
        //verify presence of Portuguese menu item
        Assert.assertTrue(findText(AccountHomePage.portuguese_str).isDisplayed());
        //verify presence of Deutsh menu item
        Assert.assertTrue(findText(AccountHomePage.deutsch_str).isDisplayed());
    }

    /**
     * Verify user account settings icon and it's drop-down menu items on the topbar of account home page.
     */
    @Test(groups = {"Smoke"})
    public void verfiyUserAccountSettingsDropDownMenu(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click user account settings icon on topbar
        accountHomePage.clickUserAccountSettingsIconOnTopbar();
        //verify presence of Account Settings menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.account_settings_menu_item).isDisplayed());
        //verify presence of Team Settings menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.team_settings_menu_item).isDisplayed());
        //verify presence of Billing and Plans menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.billing_and_plans_menu_item).isDisplayed());
        //verify presence of Logout menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.logout_menu_item).isDisplayed());
    }

    /**
     * Verify My Team icon and it's drop-down menu items in the drop-down window on account home page.
     */
    @Test(groups = {"Smoke"})
    public void verifyMyTeamDropDownMenuItems(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        accountHomePage.clickMyTeam();
        //verify presence of My Team menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.my_team_menu_item).isDisplayed());
        //verify presence of Create New Team menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.create_new_team_menu_item).isDisplayed());
        //verify presence of Team Settings menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.team_settings_menu_item_edit_team_in_my_team_drop_down).isDisplayed());
        //verify presence of Team Members menu item
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.team_members_menu_item).isDisplayed());

    }

    /**
     * Verify Feature Comparison section and it's sub-content under Overview tab in Business and Plans section.
     */
    @Test(groups = {"Smoke"})
    public void verifFeatureComparisonSectionAndItsContentUnderOverviewTab(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //navigate to Billing and Plans section
        accountHomePage.clickBillingAndPlansOption();
        //verify presence of Overview tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).isDisplayed());
        //click Overview tab
        findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).click();
        //verify user successfully navigated to 10x faster content
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.faster_10x_text).isDisplayed());
        //Scroll to Feature Comparison section
        scrollToElement(AccountHomePage.current_plan_in_feature_comparison_section);
        //verify presence of Current Plan content
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.current_plan_in_feature_comparison_section).isDisplayed());
        //verify presence of Go Pro content in feature comparison section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.go_pro_in_feature_comparison_section).isDisplayed());
        //verify presence of Go Business content in feature comparison section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.go_business_in_feature_comparison_section).isDisplayed());
        //verify presence of Enterprise content in feature comparison section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.enterprise_in_feature_comparison_section).isDisplayed());
    }

    /**
     * Verify Frequently Asked Questions section under Overview tab in Business and Plans section.
     */
    @Test(groups = {"Smoke"})
    public void verifyFAQUnderOverviewTabInBussinessAndPlansSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //navigate to Billing and Plans section
        accountHomePage.clickBillingAndPlansOption();
        //verify presence of Overview tab
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).isDisplayed());
        //click Overview tab
        findElementUntilElementVisible(AccountHomePage.overview_tab_in_billing_and_plans).click();
        //verify user successfully navigated to 10x faster content
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.faster_10x_text).isDisplayed());
        //scroll to Frequently Asked Questions section
        scrollToElement(AccountHomePage.frequently_asked_questions_section_in_overview_tab);
        //verify presence of frequently asked questions section
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.frequently_asked_questions_section_in_overview_tab).isDisplayed());
    }



}
