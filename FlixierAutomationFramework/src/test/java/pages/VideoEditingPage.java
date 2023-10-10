package pages;

import framework.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VideoEditingPage extends Drivers {
    //existing project
    @FindBy(css = "[class = 'card project-card'] > a[href = '/projects/989fefae-8de9-6127-5893-d5c8b4aeffd1']")
    public static WebElement existing_project_under_projects_tab;
    //Back to project
    @FindBy(css = "[class = 'bg-transparent text-white border-0']")
    public static WebElement back_to_projects_on_topbar;
    //Saved on topbar
    @FindBy(css = "[class = 'e-toolbar-section e-btn-group d-flex toolbar-save color6'] > div > button > span")
    public static WebElement saved_on_topbar;
    //Undo on topbar
    @FindBy(css = "[class = 'e-btn btn px-2 py-2'][title = 'Undo']")
    public static WebElement undo_on_topbar;
    //Redo on topbar
    @FindBy(css = "[class = 'e-btn btn px-2 py-2'][title = 'Redo']")
    public static WebElement redo_on_topbar;
    //History on topbar
    @FindBy(css = "[class = 'e-btn btn px-2 py-2'][title = 'Version History']")
    public static WebElement history_on_topbar;
    //Export button on topbar
    @FindBy(css = "[class = 'btn-sm btn-rounded btn-primary text-white shadow-none px-2']")
    public static WebElement export_button_on_topbar;
    //All library filter in library navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'All']")
    public static WebElement all_filter_library_navigation_bar;
    //Videos library filter in library navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Videos']")
    public static WebElement videos_filter_in_library_navigation_bar;
    //Audio library filter in library navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Audio']")
    public static WebElement audio_filter_in_library_navigation_bar;
    //Images library filter in library navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Images']")
    public static WebElement images_filter_in_library_navigation_bar;
    //Search text field in library section
    @FindBy(css = "[class = 'e-panel-section mt-px d-flex flex-shrink-0 justify-content-between pl-2 py-2 mb-px'] [placeholder = 'Search...']")
    public static WebElement search_text_field_in_library_section;
    //Date drop-down button in library section
    @FindBy(css = "[class = 'e-panel-section mt-px d-flex flex-shrink-0 justify-content-between pl-2 py-2 mb-px'] [title = 'Sort assets']")
    public static WebElement date_drop_down_button_in_library_section;
    //library option on left navigation bar
    @FindBy(css = "[class = 'btn e-btn p-2 rounded active']")
    public static WebElement library_option_in_left_navigation_bar;
    //Stock option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-books fa-w-18 fa-fw fa-lg']")
    public static WebElement stock_option_in_left_navigation_bar;
    //Audio option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-music fa-w-16 fa-fw fa-lg']")
    public static WebElement audio_option_in_left_navigation_bar;
    //Motion option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-motiongraphics fa-w-14 fa-fw fa-lg']")
    public static WebElement motion_option_in_left_navigation_bar;
    //Text option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-text fa-w-14 fa-fw fa-lg']")
    public static WebElement text_option_in_left_navigation_bar;
    //Subtitles option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-subtitles fa-w-20 fa-fw fa-lg']")
    public static WebElement subtitles_option_in_left_navigation_bar;
    //Stages option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-shapes fa-w-16 fa-fw fa-lg']")
    public static WebElement stages_option_in_left_navigation_bar;
    //Transitions option in left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-transition fa-w-16 fa-fw fa-lg']")
    public static WebElement transitions_option_in_left_navigation_bar;
    //canvas on video editing page
    @FindBy(css = "[class = 'upper-canvas ']")
    public static WebElement canvas_on_video_editing_page;
    //video timer 1 play control icon on video editing page
    @FindBy(css = "[class = 'text-white text-xl mx-3']")
    public static WebElement video_timer1_play_control_icon;
    //video timer 2 play control icon on video editing page
    @FindBy(css = "[class = 'gray-500 text-xl']")
    public static WebElement video_timer2_play_control_icon;
    //seek playhead to prev object play control icon on video editing page
    @FindBy(css = "[class = 'svg-inline--fa fa-step-backward fa-w-14 fa-fw']")
    public static WebElement seek_playhead_to_prev_object_play_control_icon;
    //Rewind play control icon on video editing page
    @FindBy(css = "[class = 'svg-inline--fa fa-backward fa-w-16 fa-fw']")
    public static WebElement rewind_play_control_icon;
    //Play play control icon on video editing page
    @FindBy(css = "[class = 'svg-inline--fa fa-play fa-w-14 fa-fw']")
    public static WebElement play_play_control_icon;
    //Forward play control icon on video editing page
    @FindBy(css = "[class = 'svg-inline--fa fa-forward fa-w-16 fa-fw']")
    public static WebElement forward_play_control_icon;
    //seek playhead to next object play control icon on video editing page
    @FindBy(css = "[class = 'svg-inline--fa fa-step-forward fa-w-14 fa-fw']")
    public static WebElement seek_playhead_to_next_object_play_control_icon;
    //%age play control icon on video editing page
    @FindBy(css = "[class = 'horizontal-slider select-none text-center text-white border-0']")
    public static WebElement percentage_play_control_icon;
    //Full screen play control icon on video editing page
    @FindBy(css = "[class = 'btn bg-transparent text-white shadow-none text-xl']")
    public static WebElement full_screen_play_control_icon;
    //Left Right gain controller play control icon on video editing page
    @FindBy(css = "[class = 'meter-bars d-flex h-100']")
    public static WebElement left_right_gain_contol_play_control_icon;
    //Resolution label in settings section on video editing page
    @FindBy(css = "[class = 'e-prop-group align-items-center resolution-section text-lg py-3'] [class = 'e-prop-label font-weight-bold']")
    public static WebElement resolution_label_in_settings_section;
    //Resolution field button in settings section on video editing page
    @FindBy(css = "[class = 'e-prop-group align-items-center resolution-section text-lg py-3'] [class = 'e-btn btn dropdown-toggle no-caret w-100 text-left px-2 p-1 truncate']")
    public static WebElement resolution_button_in_settings_section;
    //Background color label in settings section on video editing page
    @FindBy(css = "[class = 'px-3'] > div + div [class = 'e-prop-label font-weight-bold text-lg']")
    public static WebElement background_color_label_in_settings_section;
    //Background color picker in settings section on video editing page
    @FindBy(css = "[class = 'color-picker-preview color-picker-icon d-block cursor-pointer']")
    public static WebElement background_color_picker_in_settings_section;
    //Show Safe Zones label in settings section on viedo editing page
    @FindBy(css = "[class = 'e-prop-label font-weight-bold text-lg mb-2']")
    public static WebElement show_safe_zones_label_in_settings_label;
    //None button in settings section on video editing page
    @FindBy(xpath = "//*[@class = 'd-flex mt-2']//child::button//child::span[contains(text(), 'None')]")
    public static WebElement none_button_in_settings_section;
    //All button in settings section on video editing page
    @FindBy(xpath = "//*[@class = 'd-flex mt-2']//child::button//child::span[contains(text(), 'All')]")
    public static WebElement all_button_in_settings_section;
    //Title Area button in settings section on video editing page
    @FindBy(xpath = "//*[@class = 'd-flex mt-2']//child::button//child::span[contains(text(), 'Title Area')]")
    public static WebElement title_area_button_in_settings_section;
    //Action Area button in settings section on video editing page
    @FindBy(xpath = "//*[@class = 'd-flex mt-2']//child::button//child::span[contains(text(), 'Action Area')]")
    public static WebElement action_area_button_in_settings_section;
    //View more drop-down button in settings section
    @FindBy(css = "[class = 'gray-300 text-lg']")
    public static WebElement view_more_drop_down_in_settings_section;
    //Preview Mode in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::div[contains(text(), 'Preview Mode')]")
    public static WebElement preview_mode_in_settings_section;
    //Floating Toolbar in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::div[contains(text(), 'Floating Toolbar')]")
    public static WebElement floating_toolbar_in_settings_section;
    //Grid in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Grid')]")
    public static WebElement grid_in_settings_section;
    //Show grid in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Show grid')]")
    public static WebElement show_grid_in_settings_section;
    //Horizontal lines in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Horizontal lines')]")
    public static WebElement horizontal_lines_in_settings_section;
    //Vertical lines in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Vertical lines')]")
    public static WebElement vertical_lines_in_settings_section;
    //Snap Options in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Snap Options')]")
    public static WebElement snap_options_in_settings_section;
    //Snap to stage in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Snap to stage')]")
    public static WebElement snap_to_stage_in_settings_section;
    //Snap when resizing in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Snap when resizing')]")
    public static WebElement snap_when_resizing_in_settings_section;
    //Snap to other objects in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Snap to other objects')]")
    public static WebElement snap_to_other_objects_in_settings_section;
    //View more in settings section
    @FindBy(xpath = "//*[@class = 'collapsable-section__content']//following::*[contains(text(), 'Adjust snap to crop')]")
    public static WebElement adjust_snap_to_crop_in_settings_section;
    //Click and drag slider
    @FindBy(css = "[class = 'my-1 vue-slider vue-slider-ltr']")
    public static WebElement click_and_drag_slider;
    //Record button
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-dot-circle fa-w-16 fa-fw']")
    public static WebElement record_button;
    //Import button
    @FindBy(css = "[class = 'mr-1 svg-inline--fa fa-cloud-upload-alt fa-w-20 fa-fw']")
    public static WebElement import_button;
    //First default track in timeline left header section
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child")
    public static WebElement first_default_track_in_timeline_left_header_section;
    //Second default track in timeline left header section
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:nth-child(2)")
    public static WebElement second_default_track_in_timeline_left_header_section;
    //Third default track in timeline left header section
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:nth-child(3)")
    public static WebElement third_default_track_in_timeline_left_header_section;
    //Delete collapse control icon
    @FindBy(css = "[class = 'ml-auto my-auto svg-inline--fa fa-trash fa-w-14 fa-fw']")
    public static WebElement delete_collapse_control_icon;
    //Cut collapse control icon
    @FindBy(css = "[class = 'ml-auto my-auto svg-inline--fa fa-cut fa-w-14 fa-fw']")
    public static WebElement cut_collapse_control_icon;
    //Add drop-down button in timeline left control section
    @FindBy(css = "[class = 'e-btn e-btn-light btn btn-sm p-1 dropdown-toggle align-self-start']")
    public static WebElement add_drop_down_button;
    //Track1 dragger in timeline left header section
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child [class = 'ml-auto my-auto cursor-move svg-inline--fa fa-grip-lines fa-w-14 fa-fw']")
    public static WebElement track1_dragger_in_timeline_left_header_section;
    //Track1 name in timeline left header section
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child [class = 'd-flex align-items-center edit-name ml-2 flex-grow-1 h-100'] [class = 'w-100 truncate']")
    public static WebElement track1_name_in_timeline_left_header_section;
    //Hide-Unhide icon in timeline left header
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child [class = 'd-flex align-items-center edit-name ml-2 flex-grow-1 h-100'] + div button:nth-child(1)")
    public static WebElement hide_unhide_icon_track1_in_timeline_left_header;
    //Mute-Unmute icon in timeline left header
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child [class = 'd-flex align-items-center edit-name ml-2 flex-grow-1 h-100'] + div button:nth-child(2)")
    public static WebElement mute_unmute_icon_track1_in_timeline_left_header;
    //lock-unlock icon in timeline left header
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child [class = 'd-flex align-items-center edit-name ml-2 flex-grow-1 h-100'] + div button:nth-child(3)")
    public static WebElement lock_unlock_icon_track1_in_timeline_left_header;
    //Delete icon in timeline left header
    @FindBy(css = ".e-timeline__left__body > div > div > div:first-child > div:first-child [class = 'd-flex align-items-center edit-name ml-2 flex-grow-1 h-100'] + div button:nth-child(4)")
    public static WebElement delete_icon_track1_in_timeline_left_header;
    //Videos tab in Stock section
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Videos']")
    public static WebElement videos_tab_in_stock_section;
    //Images tab in Stock section
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Images']")
    public static WebElement images_tab_in_stock_section;
    //Gifs tab in Stock section
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Gifs']")
    public static WebElement gifs_tab_in_stock_section;
    //All tab in Audio section on left navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'All']")
    public static WebElement all_tab_in_audio_section;
    //Music tab in Audio section on left navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Music']")
    public static WebElement music_tab_in_audio_section;
    //Sound Effects in Audio section on left navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0'] [title = 'Sound Effects']")
    public static WebElement sound_effects_tab_in_audio_section;
    //Titles tab in Motion section on left navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0 p-0'] [title = 'Titles']")
    public static WebElement titles_tab_in_motion_section;
    //Graphics tab in Motion section on left navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0 p-0'] [title = 'Graphics']")
    public static WebElement graphics_tab_in_motion_section;
    //Overlays tab in Motion section on left navigation bar
    @FindBy(css = "[class = 'e-library__filter-tab e-panel-section d-flex flex-shrink-0 p-0'] [title = 'Overlays']")
    public static WebElement overlays_tab_in_motion_section;
    //lens search icon
    @FindBy(css = "[class = 'btn-empty text-white']")
    public static WebElement lens_search_icon_for_navigation_bar_options;
    //search text field in Under Videos tab in Stock section
    @FindBy(css = "[class = 'form-control border-0 py-1 pr-4']")
    public static WebElement search_text_field_for_navigation_bar_options;
    //videos content section under Videos tab in Stock section
    @FindBy(css = "[class = 'external-assets e-library-assets e-library-assets--grid']")
    public static WebElement content_section_for_navigation_bar_options;
    //content section under Titles tab in Motion section
    @FindBy(css = "[class = 'e-library-assets position-relative e-library-assets--grid']")
    public static WebElement content_section_in_motion_Section;
    //content section in Text section
    @FindBy(css = "[class ='text-presets library-body overflow-x-auto scrollbar px-2' ]")
    public static WebElement content_section_in_text_section;
    //Headline Title button in content section in text section
    @FindBy(css = "[class = 'text-presets-button--single font-weight-bold mx-2']")
    public static WebElement headline_title_button_in_content_section_in_text_section;
    //Regular text in conent section in text section
    @FindBy(css = "[class = 'text-presets-button--single font-weight-light text-sm mx-2']")
    public static WebElement regular_text_button_in_content_section_in_text_section;
    //Body text in content section in text section
    @FindBy(css = "[class = 'text-presets-button--single font-weight-normal text-sm mx-2']")
    public static WebElement body_text_button_in_content_section_in_text_section;
    //T Text title in content section of text section
    @FindBy(css = "[class = 'e-panel-section text-center p-2']")
    public static WebElement t_text_in_content_section_in_text_section;
    //Subtitles title in Subtitles section
    @FindBy(css = "[class = 'e-panel-section text-center p-2']")
    public static WebElement subtitles_title_in_subtitles_section;
    //content section in Subtitles section
    @FindBy(css = "[class = 'ps library-body px-3 subtitles-tab']")
    public static WebElement content_section_in_subtitles_section;
    //Auto Subtitle button in content section in Subtitles section
    @FindBy(css = "[class = 'mb-1 w-100']")
    public static WebElement auto_subtitle_button_in_content_section_in_subtitles_section;
    //Manual Subtitle button in content section in Subtitles section
    @FindBy(css = "[class = 'd-flex justify-content-between'] [class = 'mr-2']")
    public static WebElement manual_subtitle_button_in_content_section_in_subtitles_section;
    //Upload Subtitle button in content section in Subtitles section
    @FindBy(css = "[class = 'm-0 cursor-pointer']")
    public static WebElement upload_subtitle_button_in_content_section_in_subtitles_section;
    //Shapes option on left navigation bar
    @FindBy(css = "[class = 'svg-inline--fa fa-shapes fa-w-16 fa-fw fa-lg']")
    public static WebElement shapes_option_on_left_navigation_bar;
    //Shapes title in Shapes section
    @FindBy(css = "[class = 'e-panel-section text-center p-2']")
    public static WebElement shapes_title_in_shapes_section;
    //Shapes title in Shapes section
    @FindBy(css = "[class = 'e-panel-section text-center d-flex justify-content-around py-2']")
    public static WebElement shapes_buttons_section_in_shapes_section;
    //Transitions title in Transitions section
    @FindBy(css = "[class = 'e-panel-section text-center p-2']")
    public static WebElement transitions_title_in_transitions_section;
    //content section in Transitions section
    @FindBy(css = "[class = 'custom-ps library-body ps ps--active-y']")
    public static WebElement content_section_in_transitions_section;


    //Initializing PageFactory elements with driver reference variable
    public VideoEditingPage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * click existing project
     */
    public void clickExistingProject(){
        Assert.assertTrue(findElementUntilElementVisible(existing_project_under_projects_tab).isDisplayed());
        existing_project_under_projects_tab.click();
    }

    /**
     * click Stock option on left navigation pane on video editing page
     */
    public void clickStockOptionOnLeftNavigationBar(){
        findElementUntilElementVisible(stock_option_in_left_navigation_bar).isDisplayed();
        stock_option_in_left_navigation_bar.click();
    }

    /**
     * click Audio option on left navigation bar on video editing page
     */
    public void clickAudioOptionOnLeftNavigationBar(){
        findElementUntilElementVisible(audio_option_in_left_navigation_bar).isDisplayed();
        audio_option_in_left_navigation_bar.click();
    }

    /**
     * click Motion option on left navigation bar
     */
    public void clickMotionOptionOnLeftNavigationBar(){
        findElementUntilElementVisible(motion_option_in_left_navigation_bar).isDisplayed();
        motion_option_in_left_navigation_bar.click();
    }

    /**
     * click Videos tab in Stock section in navigation bar
     */
    public void clickVideosTabInStockSection(){
        findElementUntilElementVisible(videos_tab_in_stock_section).isDisplayed();
        videos_tab_in_stock_section.click();
    }

    /**
     * click Images tab in stock section in navigation bar
     */
    public void clickImagesTabInStockSection(){
        findElementUntilElementVisible(images_tab_in_stock_section).isDisplayed();
        images_tab_in_stock_section.click();
    }

    /**
     * click Gifs tab in Stock section in navigation bar
     */
    public void clickGifsTabInStockSection(){
        findElementUntilElementVisible(gifs_tab_in_stock_section).isDisplayed();
        gifs_tab_in_stock_section.click();
    }

    /**
     * click All tab in Audio section
     */
    public void clickAllTabInAudioSection(){
        findElementUntilElementVisible(all_tab_in_audio_section).isDisplayed();
        all_tab_in_audio_section.click();
    }

    /**
     * click Music tab in Audio section
     */
    public void clickMusicTabInAudioSection(){
        findElementUntilElementVisible(music_tab_in_audio_section).isDisplayed();
        music_tab_in_audio_section.click();
    }

    /**
     * click Sound Effects tab in Audio section
     */
    public void clickSoundEffectsTabInAudioSection(){
        findElementUntilElementVisible(sound_effects_tab_in_audio_section).isDisplayed();
        sound_effects_tab_in_audio_section.click();
    }

    /**
     * click Titles tab in Motion section
     */
    public void clickTitlesTabInMotionSection(){
        findElementUntilElementVisible(titles_tab_in_motion_section).isDisplayed();
        titles_tab_in_motion_section.click();
    }

    /**
     * click Graphics tab in Motion section
     */
    public void clickGraphicsTabInMotionSection(){
        findElementUntilElementVisible(graphics_tab_in_motion_section).isDisplayed();
        graphics_tab_in_motion_section.click();
    }

    /**
     * click Overlays tab in Motion section
     */
    public void clickOverlaysTabInMotionSection(){
        findElementUntilElementVisible(overlays_tab_in_motion_section);
        overlays_tab_in_motion_section.click();
    }

    /**
     * click Text option in left navigation bar
     */
    public void clickTextOptionOnLeftNavigationBar(){
        findElementUntilElementVisible(text_option_in_left_navigation_bar);
        text_option_in_left_navigation_bar.click();
    }

    /**
     * click Subtitles option on left navigation bar
     */
    public void clickSubtitlesOptionOnLeftNavigationBar(){
        findElementUntilElementVisible(subtitles_option_in_left_navigation_bar);
        subtitles_option_in_left_navigation_bar.click();
    }

    /**
     * click Shapes section on left navigation bar
     */
    public void clickShapesSectionOnLeftNavigationBar(){
        findElementUntilElementVisible(shapes_option_on_left_navigation_bar).isDisplayed();
        shapes_option_on_left_navigation_bar.click();
    }

    /**
     * click Transitions option on left navigation bar
     */
    public void clickTransitionsOptionOnLeftNavigationBar(){
        findElementUntilElementVisible(transitions_option_in_left_navigation_bar).isDisplayed();
        transitions_option_in_left_navigation_bar.click();
    }

}
