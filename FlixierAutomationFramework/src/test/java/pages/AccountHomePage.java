package pages;

import framework.Drivers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountHomePage extends Drivers {
    //My Team Element (icon + text)
    @FindBy(css = "[class = 'btn d-flex justify-content-between align-items-center dropdown-toggle w-100 pr-0 no-caret team-switcher-button']")
    public static WebElement my_team;
    //Home icon
    @FindBy(css = "[class = 'mr-2 svg-inline--fa fa-home fa-w-18 fa-fw']")
    public static WebElement home_icon;
    //Quick Tools icon
    @FindBy(css = "[class = 'mr-2 svg-inline--fa fa-bolt fa-w-10 fa-fw']")
    public static WebElement quick_tools_icon;
    //Billing and Plans icon
    @FindBy(css = "[class = 'mr-2 svg-inline--fa fa-wallet fa-w-16 fa-fw']")
    public static WebElement billing_and_plans_icon;
    //Billing and Plans text
    @FindBy(css = ".dashboard-stats .menu [href = '/billing']")
    public static WebElement billing_and_plans_text;
    //Projects tab
    @FindBy(css = "[class = 'switch-panel mt-3 d-flex'] [href = '/home/projects']")
    public static WebElement projects_tab;
    //Media Library tab
    @FindBy(css = "[class = 'switch-panel mt-3 d-flex'] [href = '/home/library']")
    public static WebElement media_library_tab;
    //Review Links tab
    @FindBy(css = "[class = 'switch-panel mt-3 d-flex'] [href = '/home/review-links']")
    public static WebElement review_links_tab;
    //Exports tab
    @FindBy(css = "[class = 'switch-panel mt-3 d-flex'] [href = '/home/exports']")
    public static WebElement exports_tab;
    //Templates tab
    @FindBy(css = "[class = 'switch-panel mt-3 d-flex'] [href = '/home/templates']")
    public static WebElement templates_tab;
    //Brand Kit tab
    @FindBy(css = "[class = 'switch-panel mt-3 d-flex'] [href = '/home/brand-kit']")
    public static WebElement brand_kit_tab;
    //It's empty in here icon
    @FindBy(css = "[class = 'fa-5x mb-3 svg-inline--fa fa-file fa-w-12']")
    public static WebElement its_empty_in_here_icon_in_media_library_tab;
    //Link icon under Review Links tab
    @FindBy(css = "[class = 'fa-7x svg-inline--fa fa-link fa-w-16']")
    public static WebElement link_icon_in_review_links_tab;
    //Video icon in Exports tab
    @FindBy(css = "[class = 'fa-7x svg-inline--fa fa-video fa-w-18']")
    public static WebElement video_icon_in_exports_tab;
    //Templates container in Templates tab
    @FindBy(css = "[class = 'templates-dashboard dashboard-grid mt-3']")
    public static WebElement templates_container_in_templates_tab;
    //Brand Kit content container
    @FindBy(css = "[class = 'brandkit-dashboard px-4 mt-4-7 ml-3 position-relative']")
    public static WebElement brand_kit_content_container_in_brand_kit_tab;
    //drop-down arrow on Account Home page
    @FindBy(css = ".search-and-filter-controls [data-toggle = 'dropdown']")
    public static WebElement drop_down_arrow;
    //Name drop-down arrow menu item
    @FindBy(xpath = "//*[@class = 'dropdown-menu anim-scale-in show']//child::*[contains(text(), 'Name')]")
    public static WebElement name_drop_down_menu_item;
    //Date drop-down arrow menu item
    @FindBy(xpath = "//*[@class = 'dropdown-menu anim-scale-in show']//child::*[contains(text(), 'Date')]")
    public static WebElement date_drop_down_menu_item;
    //Duration drop-down arrow menu item
    @FindBy(xpath = "//*[@class = 'dropdown-menu anim-scale-in show']//child::*[contains(text(), 'Duration')]")
    public static WebElement duration_drop_down_menu_item;
    //Ascending drop-down arrow menu item
    @FindBy(xpath = "//*[@class = 'dropdown-menu anim-scale-in show']//child::*[contains(text(), 'Ascending')]")
    public static WebElement ascending_drop_down_menu_item;
    //Descending drop-down arrow menu item
    @FindBy(xpath = "//*[@class = 'dropdown-menu anim-scale-in show']//child::*[contains(text(), 'Descending')]")
    public static WebElement descending_drop_down_menu_item;
    //New Folder icon
    @FindBy(css = ".upload-button [data-icon = 'folder-open']")
    public static WebElement new_folder_icon;
    //New Folder'Name' text field
    @FindBy(css = "[class = 'modal fade e-modal text-white show'] [class = 'form-control']")
    public static WebElement name_text_field_new_folder;
    //Create button in New Folder window
    @FindBy(css = "[class = 'modal fade e-modal text-white show'] [class = 'btn btn-primary']")
    public static WebElement create_button_new_folder;
    //folder under Projects tab
    @FindBy(css = "[class = 'd-flex flex-shrink-1 flex-grow-1 flex-column justify-content-between dashboard-sub-panel h-0-for-ps w-100'] [class = 'text-center position-relative']")
    public static WebElement folder;
    //three dots icon of new folder
    @FindBy(css = "[class = 'btn-empty dropdown-btn']")
    public static WebElement dots_icon_folder;
    //dots menu of new folder
    @FindBy(css = "[class = 'dropdown-menu anim-scale-in show']")
    public static WebElement dots_menu_folder;
    //delete icon new folder dots menu
    @FindBy(css = "[class = 'dropdown-menu anim-scale-in show'] [data-icon = 'trash']")
    public static WebElement delete_icon_dots_menu_new_folder;
    //delete confirmation window new folder
    @FindBy(css = "[class = 'modal fade modal-danger show'] [class = 'modal-content']")
    public static WebElement delete_confirmation_window_new_folder;
    //delete button in delete confirmation window new folder
    @FindBy(css = "[class = 'modal fade modal-danger show'] [class = 'modal-content'] [class = 'btn btn-danger']")
    public static WebElement delete_button_in_delete_confirmation_window_new_folder;
    //Create Project overlay
    @FindBy(css = "[class = 'modal fade create-project-modal text-input-modal e-modal text-white show'] [class = 'modal-content']")
    public static WebElement create_project_overlay;
    //Project name text filed in Create Project overlay
    @FindBy(css = "[class = 'modal fade create-project-modal text-input-modal e-modal text-white show'] [class = 'modal-content'] input[placeholder = 'Project name']")
    public static WebElement project_name_tex_field_in_create_project;
    //Create button in Create Project overlay
    @FindBy(css = "[class = 'modal fade create-project-modal text-input-modal e-modal text-white show'] [class = 'modal-content'] button[class = 'btn btn-primary']")
    public static WebElement create_button_in_create_project_overlay;
    //Canvas container in video editor page
    @FindBy(css = "[class = 'canvas-container']")
    public static WebElement canvas_container_in_video_editor_page;
    //Screen Recorder image
    @FindBy(css = "[src = 'https://df02ig60gv6ag.cloudfront.net/quick-tools/screen-recorder-2.png']")
    public static WebElement screen_recorder_image;
    //upload cloud icon
    @FindBy(css = "[data-icon = 'cloud-upload-alt']")
    public static WebElement upload_icon_cloud;
    //Pick a layout text element
    @FindBy(css = "[class = 'text-center d-flex justify-content-between position-relative p-3']")
    public static WebElement pick_a_layout_text;
    //Overview tab in Biiling and Plans
    @FindBy(css = "[href = '/billing/overview']")
    public static WebElement overview_tab_in_billing_and_plans;
    //Invoices tab in Billing and Plans
    @FindBy(css = "[href = '/billing/history']")
    public static WebElement invoices_tab_in_billing_and_plans;
    //Bonuses tab in Billing and Plans
    @FindBy(css = "[href = '/billing/bonuses']")
    public static WebElement bonuses_tab_in_billing_and_plans;
    //10x faster text
    @FindBy(css = "[class = 'text-3xl text-cyan']")
    public static WebElement faster_10x_text;
    //You don't have any invoices yet. text
    @FindBy(css = "[class = 'p-5 text-white table-responsive']")
    public static WebElement you_do_not_have_invoices_yet_text;
    //Earn more storage and render time text
    @FindBy(css = "[class = 'mb-4']")
    public static WebElement earn_more_storage_and_render_time_text;
    //Free Plan section
    @FindBy(css = "[class = 'd-flex flex-wrap flex-lg-nowrap justify-content-center align-items-end mt-2'] [class = 'pricing-option is--free is--selected']")
    public static WebElement free_plan_section;
    //Pro plan section
    @FindBy(css = "[class = 'd-flex flex-wrap flex-lg-nowrap justify-content-center align-items-end mt-2'] [class = 'pricing-option is--creator']")
    public static WebElement pro_plan_section;
    //Business plan section
    @FindBy(css = "[class = 'd-flex flex-wrap flex-lg-nowrap justify-content-center align-items-end mt-2'] [class = 'pricing-option is--pro']")
    public static WebElement business_plan_section;
    //Notifications bell icon on topbar
    @FindBy(css = "[class = 'svg-inline--fa fa-bell fa-w-14 fa-fw']")
    public static WebElement notifications_bell_icon_on_topbar;
    //Get Help icon on topbar
    @FindBy(css = "[class = 'svg-inline--fa fa-question-circle fa-w-16 fa-fw']")
    public static WebElement get_help_icon_on_topbar;
    //Change language icon on topbar
    @FindBy(css = "[class = 'svg-inline--fa fa-globe fa-w-16 fa-fw']")
    public static WebElement change_language_icon_on_topbar;
    //User account settings icon on topbar
    @FindBy(css = "[class = 'nav-item dropdown user-profile']")
    public static WebElement user_account_settings_icon_on_topbar;
    //Notifications dropj-down window on topbar
    @FindBy(css = "[class = 'dropdown-menu py-0 show']")
    public static WebElement notifications_drop_down_window;
    //Notifications label in notification window on topbar
    @FindBy(css = "[class = 'mt-2 text-base']")
    public static WebElement notifications_label_in_notifications_window;
    //Get Help menu Item
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-comments-alt fa-w-18 fa-fw']")
    public static WebElement get_help_menu_item;
    //Feedback menu item
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-comment-alt-smile fa-w-16 fa-fw']")
    public static WebElement feedback_menu_item;
    //What's new menu item
    @FindBy(css = "[class = 'mr-1 text-danger svg-inline--fa fa-fire fa-w-12 fa-fw']")
    public static WebElement what_new_menu_item;
    //change language drop-down window
    @FindBy(css = "[class = 'dropdown-menu show']")
    public static WebElement change_language_drop_down_window;
    //Account Settings menu item
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-address-card fa-w-18 fa-fw']")
    public static WebElement account_settings_menu_item;
    //Team Settings menu item
    @FindBy(css = "[class = 'dropdown-item pl-3 py-2'] + a > svg[class = 'mr-1 svg-inline--fa fa-users fa-w-20 fa-fw']")
    public static WebElement team_settings_menu_item;
    //Billing and Plans menu item
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-wallet fa-w-16 fa-fw']")
    public static WebElement billing_and_plans_menu_item;
    //Logout menu item
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-sign-out-alt fa-w-16 fa-fw']")
    public static WebElement logout_menu_item;
    //My Team menu item
    @FindBy(css = "[class = 'dropdown-item__content__left__avatar']")
    public static WebElement my_team_menu_item;
    //Create New Team menu item
    @FindBy(css = "[class = 'new-team svg-inline--fa fa-plus fa-w-12 fa-fw']")
    public static WebElement create_new_team_menu_item;
    //Team Settings menu item
    @FindBy(css = "[class = 'svg-inline--fa fa-cog fa-w-16 fa-fw']")
    public static WebElement team_settings_menu_item_edit_team_in_my_team_drop_down;
    //Team Members menu item
    @FindBy(css = "[class = 'svg-inline--fa fa-user-plus fa-w-20 fa-fw']")
    public static WebElement team_members_menu_item;
    //Feature Comparison section
    @FindBy(css = "[class = 'feature-comparison mt-5']")
    public static WebElement feature_comparison_section;
    //Current Plan in Feature Comparison section
    @FindBy(css = "[class = 'is--free']")
    public static WebElement current_plan_in_feature_comparison_section;
    //Go Pro in Feature Comparison section
    @FindBy(css = ".table-header [class = 'is--creator']")
    public static WebElement go_pro_in_feature_comparison_section;
    //Go Business in Feature Comparison section
    @FindBy(css = ".table-header .is--pro [class = 'btn text-lg text-white']")
    public static WebElement go_business_in_feature_comparison_section;
    //Enterprise in Feature Comparison section
    @FindBy(css = ".table-header .is--enterprise [class = 'pricing-option__name']")
    public static WebElement enterprise_in_feature_comparison_section;
    //Frequently Asked Questions section
    @FindBy(css = "[class = 'faq w-100 mt-5 text-white']")
    public static WebElement frequently_asked_questions_section_in_overview_tab;


    //Free Plan string
    public static final String free_plan_str = "Free Plan";
    //Storage string
    public static final String storage_str = "Storage";
    //Export Time string
    public static final String export_time = "Export Time";
    //Home string
    public static final String home_str = "Home";
    //Quick Tools string
    public static final String quick_tools_str = "Quick Tools";
    //Create Project string
    public static final String create_project_str = "Create Project";
    //active attribute value string
    public static final String active_attribute_value_str = "active";
    //Name string
    public static final String name_str = "Name";
    //Date string
    public static final String date_str = "Date";
    //Duration string
    public static final String duration_str = "Duration";
    //Ascending string
    public static final String ascending_str = "Ascending";
    //Descending string
    public static final String descending_str = "Descending";
    //class string
    public static final String class_str = "class";
    //Folder1 string
    public static final String folder1_str = "Folder1";
    //Screen Recorder String
    public static final String screen_recorder_str = "Screen Recorder";
    //Enhance Audio string
    public static final String enhance_audio_str = "Enhance Audio";
    //Video Compressor string
    public static final String video_compressor_str = "Video Compressor";
    //Generate Transcript
    public static final String generate_transcript_str = "Generate Transcript";
    //Pick a layout
    public static final String pick_a_layout_str = "Pick a layout";
    //Espanol string
    public static final String espanol_str = "Español";
    //Português string
    public static final String portuguese_str = "Português";
    //Deutsch string
    public static final String deutsch_str = "Deutsch";

    //initialize page factory classes with elements
    public AccountHomePage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * click Home option on navigation pane on Account Home Page
     */
    public void clickHomeOption(){
        findElementUntilElementClickable(home_icon).isDisplayed();
        home_icon.click();
    }

    /**
     * click Quick Tools option on Account Home Page
     */
    public void clickQuickToolsOption(){
        findElementUntilElementVisible(quick_tools_icon).isDisplayed();
        quick_tools_icon.click();
    }

    /**
     * click Billing and Plans option on Account Home Page
     */
    public void clickBillingAndPlansOption(){
        findElementUntilElementVisible(billing_and_plans_icon).isDisplayed();
        billing_and_plans_icon.click();
    }

    /**
     * click My Team element on Account Home Page
     */
    public void clickMyTeam(){
        findElementUntilElementVisible(my_team).isDisplayed();
        my_team.click();
    }

    /**
     * click Projects tab
     */
    public void clickProjectsTab(){
        findElementUntilElementVisible(projects_tab).isDisplayed();
        projects_tab.click();
    }

    /**
     * click Mwdia Library tab
     */
    public void clickMediaLibraryTab(){
        findElementUntilElementClickable(media_library_tab).isDisplayed();
        media_library_tab.click();
    }

    /**
     * click Review Links tab
     */
    public void clickReviewLinksTab(){
        findElementUntilElementVisible(review_links_tab).isDisplayed();
        review_links_tab.click();
    }

    /**
     * clic Exports tab
     */
    public void clickExportsTab(){
        findElementUntilElementVisible(exports_tab).isDisplayed();
        exports_tab.click();
    }

    /**
     * click Templates tab
     */
    public void clickTepmplatesTab(){
        findElementUntilElementVisible(templates_tab).isDisplayed();
        templates_tab.click();
    }

    /**
     * click Brand Kit tab
     */
    public void clickBrandKitTab(){
        findElementUntilElementVisible(brand_kit_tab).isDisplayed();
        brand_kit_tab.click();
    }

    /**
     * Click Drop-down arrow
     */
    public void clickDropDownArrow(){
        findElementUntilElementVisible(drop_down_arrow).click();
    }

    /**
     * Click Drop-Down menu item on Account Home Page
     */
    public void clickDropDownMenuItem(String item){
        findElementUntilElementVisible(name_drop_down_menu_item).isDisplayed();
        if(item.equalsIgnoreCase(name_str)){
            name_drop_down_menu_item.click();
        }
        else if(item.equalsIgnoreCase(date_str)){
            date_drop_down_menu_item.click();
        }
        else if(item.equalsIgnoreCase(duration_str)){
            duration_drop_down_menu_item.click();
        }
        else if(item.equalsIgnoreCase(ascending_str)){
            ascending_drop_down_menu_item.click();
        }
        else if(item.equalsIgnoreCase(descending_str)){
            descending_drop_down_menu_item.click();
        }
    }

    /**
     * Select option from drop-down menu items
     */
    public void selectOptionFromDropDownArrowMenuItems(String item){
        action.sendKeys(Keys.ESCAPE).perform();
        clickDropDownArrow();
        findElementUntilElementVisible(name_drop_down_menu_item).isDisplayed();
        clickDropDownMenuItem(item);
    }

    /**
     * click New Folder icon
     */
    public void clickNewFolder(){
        findElementUntilElementVisible(new_folder_icon).isDisplayed();
        new_folder_icon.click();
    }

    /**
     * Create new folder
     */
    public void createNewFolder(String name){
        clickNewFolder();
        findElementUntilElementVisible(name_text_field_new_folder).sendKeys(name);
        findElementUntilElementClickable(create_button_new_folder).click();
    }

    /**
     * Delete folder
     */
    public void deleteFolder(String folder_name){
        findElementUntilElementVisible(folder).isDisplayed();
        hover(findElementUntilElementVisible(folder));
        findElementUntilElementVisible(dots_icon_folder).click();
        Assert.assertTrue(findElementUntilElementVisible(dots_menu_folder).isDisplayed());
        findElementUntilElementVisible(delete_icon_dots_menu_new_folder).click();
        Assert.assertTrue(findElementUntilElementVisible(delete_confirmation_window_new_folder).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(delete_button_in_delete_confirmation_window_new_folder).isDisplayed());
        delete_button_in_delete_confirmation_window_new_folder.click();
    }

    /**
     * Create Project under Projects tab
     */
    public void createProject(String project_name){
        findElementUntilElementVisible(findText(create_project_str)).isDisplayed();
        clickText(create_project_str);
        Assert.assertTrue(findElementUntilElementVisible(create_project_overlay).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(project_name_tex_field_in_create_project).isDisplayed());
        project_name_tex_field_in_create_project.sendKeys(project_name);
        create_button_in_create_project_overlay.click();
    }

    /**
     * click Overview tab
     */
    public void clickOverviewTab(){
        Assert.assertTrue(findElementUntilElementVisible(overview_tab_in_billing_and_plans).isDisplayed());
        overview_tab_in_billing_and_plans.click();
    }

    /**
     * click Invoices tab
     */
    public void clickInvoicesTab(){
        Assert.assertTrue(findElementUntilElementVisible(invoices_tab_in_billing_and_plans).isDisplayed());
        invoices_tab_in_billing_and_plans.click();
    }

    /**
     * click Bonuses tab
     */
    public void clickBonusesTab(){
        Assert.assertTrue(findElementUntilElementVisible(bonuses_tab_in_billing_and_plans).isDisplayed());
        bonuses_tab_in_billing_and_plans.click();
    }

    /**
     * click notifications bell icon on topbar
     */
    public void clickNotificationsIconOnTopbar(){
        Assert.assertTrue(findElementUntilElementVisible(notifications_bell_icon_on_topbar).isDisplayed());
        notifications_bell_icon_on_topbar.click();
    }

    /**
     * click GetHelp icon on topbar
     */
    public void clickGetHelpIconOnTopbar(){
        Assert.assertTrue(findElementUntilElementVisible(get_help_icon_on_topbar).isDisplayed());
        get_help_icon_on_topbar.click();
    }

    /**
     * click Change Language icon on topbar
     */
    public void clickChangeLanguageIconOnTopbar(){
        Assert.assertTrue(findElementUntilElementVisible(change_language_icon_on_topbar).isDisplayed());
        change_language_icon_on_topbar.click();
    }

    /**
     * click user account settings icon on topbar
     */
    public void clickUserAccountSettingsIconOnTopbar(){
        Assert.assertTrue(findElementUntilElementVisible(user_account_settings_icon_on_topbar).isDisplayed());
        user_account_settings_icon_on_topbar.click();
    }



}
