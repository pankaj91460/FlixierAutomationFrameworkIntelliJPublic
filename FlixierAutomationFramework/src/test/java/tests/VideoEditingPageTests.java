package tests;

import framework.Drivers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountHomePage;
import pages.LoginPage;
import pages.VideoEditingPage;

public class VideoEditingPageTests extends Drivers {
    /**
     * Verify user is able to see Back to Projects, Saved, Undo, Redo, History icons on topbar.
     */
    @Test(groups = {"Smoke"})
    public void verifyBackToProjectsSavedUndoRedoHistoryIconsOnTopbar(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of Back to projects on topbar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.back_to_projects_on_topbar).isDisplayed());
        //verify presence of Saved on topbar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.saved_on_topbar).isDisplayed());
        //verify presence of Undo on topbar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.undo_on_topbar).isDisplayed());
        //verify presence of Redo on topbar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.redo_on_topbar).isDisplayed());
        //verify presence of History on topbar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.history_on_topbar).isDisplayed());
    }

    /**
     * Verify user is able to see notifications, get help, change language, Export, user account settings on topbar.
     */
    @Test(groups = {"Smoke"})
    public void verifyNotificationGetHelpChangeLanguageExportUserAccountSettingsOnTopbar(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of Notifications Bell icon on topbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.notifications_bell_icon_on_topbar).isDisplayed());
        //verify presence of Get Help icon on topbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.get_help_icon_on_topbar).isDisplayed());
        //verify presence of Change Language icon on topbar
        Assert.assertTrue(findElementUntilElementVisible(AccountHomePage.change_language_icon_on_topbar).isDisplayed());
        //verify presence of user account settings icon on topbar
        Assert.assertTrue(findElementUntilElementVisible(LoginPage.profile_icon).isDisplayed());
        //verify presence of Export button on topbar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.export_button_on_topbar).isDisplayed());
        Assert.assertTrue(findElementUntilElementClickable(VideoEditingPage.export_button_on_topbar).isEnabled());
    }

    /**
     * Verify user is able to see All, Videos, Audio, Images options in library navigation bar.
     */
    @Test(groups = {"Smoke"})
    public void verifyAllVideosAudioImagesOptionsInLibraryNavigationBar(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of All filter in library navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.all_filter_library_navigation_bar).isDisplayed());
        //verify presence of Videos filter in library navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.videos_filter_in_library_navigation_bar).isDisplayed());
        //verify presence of Audio filter in library navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.audio_filter_in_library_navigation_bar).isDisplayed());
        //verify presence of Images filter in library navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.images_filter_in_library_navigation_bar).isDisplayed());
    }

    /**
     * Verify search field and Date option in library section.
     */
    @Test(groups = {"Smoke"})
    public void verifySearchFieldDateOptionInLibrarySection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of search text field in library section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_in_library_section).isDisplayed());
        //verify presence of Date drop-down button in library section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.date_drop_down_button_in_library_section).isDisplayed());
    }

    /**
     * Verify presence of Library, Stock, Audio, Motion, Test, Subtitles, Stages, Transitions on the left of library section.
     */
    @Test(groups = {"Smoke"})
    public void verifyLibraryStockAudioMotionTestSubtitlesStagesTransitionsOnLeftOfLibrarySectionOnVideoEditingPage(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of library option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.library_option_in_left_navigation_bar).isDisplayed());
        //verify presence of stock option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.stock_option_in_left_navigation_bar).isDisplayed());
        //verify presence of audio option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.audio_option_in_left_navigation_bar).isDisplayed());
        //verify presence of motion option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.motion_option_in_left_navigation_bar).isDisplayed());
        //verify presence of text option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.text_option_in_left_navigation_bar).isDisplayed());
        //verify presence of subtitles option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.subtitles_option_in_left_navigation_bar).isDisplayed());
        //verify presence of stages option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.stages_option_in_left_navigation_bar).isDisplayed());
        //verify presence of transitions option on left navigation bar on video editings page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.transitions_option_in_left_navigation_bar).isDisplayed());
    }

    /**
     * Verify user should successfully see the canvas on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifiyCanvasOnVideoEditingPage(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of canvas on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.canvas_on_video_editing_page).isDisplayed());
    }

    /**
     * Verify user should successfully see the play controls on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyPlayControlsOnVideoEditingPage(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of video timer1 play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.video_timer1_play_control_icon).isDisplayed());
        //verify presence of video timer2 play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.video_timer2_play_control_icon).isDisplayed());
        //verify presence of seel playhead to prev object play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.seek_playhead_to_prev_object_play_control_icon).isDisplayed());
        //verify presence of rewind play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.rewind_play_control_icon).isDisplayed());
        //verify presence of Play play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.play_play_control_icon).isDisplayed());
        //verify presence of forward play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.forward_play_control_icon).isDisplayed());
        //verify presence of seek playhead to next object play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.seek_playhead_to_next_object_play_control_icon).isDisplayed());
        //verify presence of percentage play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.percentage_play_control_icon).isDisplayed());
        //verify presence of Full screen play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.full_screen_play_control_icon).isDisplayed());
        //verify presence of left-right gain control play control icon on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.left_right_gain_contol_play_control_icon).isDisplayed());
    }

    /**
     * Verify user should successfully see Resolution, Background Color, Show Safe Zones in settings section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyResolutionBackgroundColorShowSafeZones(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify resolution label in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.resolution_label_in_settings_section).isDisplayed());
        //verify resolution field button in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.resolution_button_in_settings_section).isDisplayed());
        //verify background color label in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.background_color_label_in_settings_section).isDisplayed());
        //verify background color picker in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.background_color_picker_in_settings_section).isDisplayed());
        //verify Show Safe Zones in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.show_safe_zones_label_in_settings_label).isDisplayed());
    }

    /**
     * Verify user should successfully see Canvas highlighter controls (None, All, Title Area, Action Area) in settings section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyNoneAllTitleAreaActionAreaInSettingsSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of None button in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.none_button_in_settings_section).isDisplayed());
        //verify presence of All button in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.all_button_in_settings_section).isDisplayed());
        //verify presence of Title Area button in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.title_area_button_in_settings_section).isDisplayed());
        //verify presence of Action Area button in settings section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.action_area_button_in_settings_section).isDisplayed());
    }

    /**
     * Verify user should successfully see View More drop-down button and it's sub content in settings section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyViewMoreSubContentInSettingsSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of View More drop-down button
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.view_more_drop_down_in_settings_section).isDisplayed());
        //click View More drop-down button
        findElementUntilElementClickable(VideoEditingPage.view_more_drop_down_in_settings_section).click();
        //verify presence of Preview Mode in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.preview_mode_in_settings_section).isDisplayed());
        //verify presence of Floating Toolbar in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.floating_toolbar_in_settings_section).isDisplayed());
        //scroll to Vertical lines in settings section
        scrollToElement(VideoEditingPage.vertical_lines_in_settings_section);
        //verify presence of Grid in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.grid_in_settings_section).isDisplayed());
        //verify presence of Show grid in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.show_grid_in_settings_section).isDisplayed());
        //verify presence of Horizontal lines in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.horizontal_lines_in_settings_section).isDisplayed());
        //verify presence of Vertical lines in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.vertical_lines_in_settings_section).isDisplayed());
        //scroll to Adjust snap to crop in settings section
        scrollToElement(VideoEditingPage.adjust_snap_to_crop_in_settings_section);
        //verify presence of Snap Options in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.snap_options_in_settings_section).isDisplayed());
        //verify presence of Snap to stage in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.snap_to_stage_in_settings_section).isDisplayed());
        //verify presence of Snap when resizing in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.snap_when_resizing_in_settings_section).isDisplayed());
        //verify presence of Snap to other objects in settings sectino
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.snap_to_other_objects_in_settings_section).isDisplayed());
        //verify presence of Adjust snap to crop in settings section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.adjust_snap_to_crop_in_settings_section).isDisplayed());
    }

    /**
     * Verify user should successfully see Click & Drag slider, Record and Import buttons in library section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyClickAndDragSliderInLibrarySection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of Record button
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.record_button).isDisplayed());
        //verify presence of Import button
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.import_button).isDisplayed());
    }

    /**
     * Verify user should successfully see tracks in timeline left header section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyTracksInTimelineLeftHeaderSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of first default track in timeline left header section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.first_default_track_in_timeline_left_header_section).isDisplayed());
        //verify presence of second default track in timeline left header section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.second_default_track_in_timeline_left_header_section).isDisplayed());
        //verify presence of third default track in timeline left header section on video editing page
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.third_default_track_in_timeline_left_header_section).isDisplayed());
    }

    /**
     * Verify user should successfully see collapse controls in timeline left header section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyCollapseControlsInTimelineLeftHeaderSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of Delete collapse control option
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.delete_collapse_control_icon).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.delete_collapse_control_icon).isEnabled());
        //verify presence of Cut collapse control option
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.cut_collapse_control_icon).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.cut_collapse_control_icon).isEnabled());
    }

    /**
     * Verify user should successfully see Add drop-down button in timeline left header section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyAddDropDownButtonInTimelineLeftHeaderSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of Add dropdown button in timeline left header section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.add_drop_down_button).isDisplayed());
        Assert.assertTrue(findElementUntilElementClickable(VideoEditingPage.add_drop_down_button).isEnabled());
    }

    /**
     * Verify user should successfully see track name and dragger button in timeline left header section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyTrackNameAndDraggerButtonInTimelineLeftHeaderSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of track1 dragger in timeline left header section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.track1_dragger_in_timeline_left_header_section).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.track1_dragger_in_timeline_left_header_section).isEnabled());
        //verify presence of track1 name in timeline left header section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.track1_name_in_timeline_left_header_section).isDisplayed());
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.track1_name_in_timeline_left_header_section).isEnabled());
    }

    /**
     * Verify user should successfully see hide, mute, lock, delete buttons in timeline left header section on video editing page.
     */
    @Test(groups = {"Smoke"})
    public void verifyHideMuteLockDeleteButtonsInTimelineLeftHeader(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //verify presence of Hide-Unhide icon in track1 in timeline left header
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.hide_unhide_icon_track1_in_timeline_left_header).isDisplayed());
        //verify presence of Mute-Unmute icon in track1 in timeline left header
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.mute_unmute_icon_track1_in_timeline_left_header).isDisplayed());
        //verify presence of Lock-Unlock icon in track1 in timeline left header
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lock_unlock_icon_track1_in_timeline_left_header).isDisplayed());
        //verify presence of Delete icon in track1 in timeline left header
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.delete_icon_track1_in_timeline_left_header).isDisplayed());
    }

    /**
     * Verify user is able to see Videos, Images, Gifs tabs in Stock option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyVideosImagesGifsTabsInStockOption(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Stock option on left navigation bar
        videoEditingPage.clickStockOptionOnLeftNavigationBar();
        //verify presence of Videos tab in stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.videos_tab_in_stock_section).isDisplayed());
        //verify presence of Images tab in stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.images_tab_in_stock_section).isDisplayed());
        //verify presence of Gifs tab in stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.gifs_tab_in_stock_section).isDisplayed());
    }

    /**
     * Verify user is able to see All, Music, Sound Effects tabs in Audio option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyAllMusicSoundEffectsTabsInAudioSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Audio section on left navigation bar
        videoEditingPage.clickAudioOptionOnLeftNavigationBar();
        //verify presence of All tab in Audio section in left navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.all_tab_in_audio_section).isDisplayed());
        //verify presence of Music tab in Audio section in left navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.music_tab_in_audio_section).isDisplayed());
        //verify presence of Sound Effects tab in Audio section in left navigation bar
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.sound_effects_tab_in_audio_section).isDisplayed());
    }

    /**
     * Verify user is able to see Titles, Graphics, Overlays tabs in Motion option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifyTitlesGraphicsOverlayTabsInMotionSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Motion option on left navigation bar
        videoEditingPage.clickMotionOptionOnLeftNavigationBar();
        //verify presence of Titles tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.titles_tab_in_motion_section).isDisplayed());
        //verify presence of Graphics tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.graphics_tab_in_motion_section).isDisplayed());
        //verify presence of Overlays tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.overlays_tab_in_motion_section).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Videos tab in Stock option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderVideosTabInStockSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //Navigate to Stock section on left navigation bar
        videoEditingPage.clickStockOptionOnLeftNavigationBar();
        //click Videos tab in Stock section
        videoEditingPage.clickVideosTabInStockSection();
        //verify presence of lens search icon
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //Videos content section under Videos tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Images tab in Stock section on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderImagesTabInStockSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //Navigate to Stock section on left navigation bar
        videoEditingPage.clickStockOptionOnLeftNavigationBar();
        //navigate to Images tab in Stock section
        videoEditingPage.clickImagesTabInStockSection();
        //verify presence of lens search icon under Images tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Images tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of images content section under Images tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());

    }

    /**
     * Verify user is able to see sub content under Gifs tab in Stock section on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderGifsTabInStockSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //Navigate to Stock section on left navigation bar
        videoEditingPage.clickStockOptionOnLeftNavigationBar();
        //click Gifs tab in Stock section
        videoEditingPage.clickGifsTabInStockSection();
        //verify presence of lens search icon under Gifs tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Gifs tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under Gifs tab in Stock section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under All tab in Audio section on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderAllTabInAudioSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Audio option on left navigation bar
        videoEditingPage.clickAudioOptionOnLeftNavigationBar();
        //click All tab in Audio section
        videoEditingPage.clickAllTabInAudioSection();
        //verify presence of lens search icon under All tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under All tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under All tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Music tab in Audio option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderMusicTabInAudioSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Audio option on left navigation bar
        videoEditingPage.clickAudioOptionOnLeftNavigationBar();
        //click Music tab in Audio section
        videoEditingPage.clickMusicTabInAudioSection();
        //verify presence of lens search icon under Music tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Music tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under Music tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Sound Effects tab in Audio option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderSoundEffectsTabInAudioSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Audio option on left navigation bar
        videoEditingPage.clickAudioOptionOnLeftNavigationBar();
        //click Sound Effects tab in Audio section
        videoEditingPage.clickSoundEffectsTabInAudioSection();
        //verify presence of lens search icon under Sound Effects tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Sound Effects tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under Sound Effects tab in Audio section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Titles tab in Motion option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderTitlesTabInMotionSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Motion option on left navigation bar
        videoEditingPage.clickMotionOptionOnLeftNavigationBar();
        //click Titles tab
        videoEditingPage.clickTitlesTabInMotionSection();
        //verify presence of lens search icon under Titles tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Titles tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under Titles tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_in_motion_Section).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Graphics tab in Motion option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderGraphicsTabInMotionSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Motion option in left navigation bar
        videoEditingPage.clickMotionOptionOnLeftNavigationBar();
        //click Graphics tab under Motion section
        videoEditingPage.clickGraphicsTabInMotionSection();
        //verify presence of lens search icon under Graphics tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Graphics tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under Graphics tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_in_motion_Section).isDisplayed());
    }

    /**
     * Verify user is able to see sub content under Overlays tab in Motion option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderOverlaysTabInMotionSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Motion option in left navigation bar
        videoEditingPage.clickMotionOptionOnLeftNavigationBar();
        //click Overlays tab in Motion section
        videoEditingPage.clickOverlaysTabInMotionSection();
        //verify presence of lens search icon under Overlays tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field under Overlays tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section under Overlays tab in Motion section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_in_motion_Section).isDisplayed());
    }

    /**
     * Verify user is able to see sub content in Text option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderTextSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Text option on left navigation bar
        videoEditingPage.clickTextOptionOnLeftNavigationBar();
        //verify presence of T Text in content section of Text section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.t_text_in_content_section_in_text_section).isDisplayed());
        //verify presence of Headline Title in content section of Text section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.headline_title_button_in_content_section_in_text_section).isDisplayed());
        //verify presence of Regular Text in content section of Text section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.regular_text_button_in_content_section_in_text_section).isDisplayed());
        //verify presence of Body text in content section of Text section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.body_text_button_in_content_section_in_text_section).isDisplayed());
    }

    /**
     * Verify user is able to see sub content in Subtitles option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentUnderSubTitlesSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Subtitles option on left navigation bar
        videoEditingPage.clickSubtitlesOptionOnLeftNavigationBar();
        //verify presence of Subtitles title in Subtitles section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.subtitles_title_in_subtitles_section).isDisplayed());
        //verify presence of content section in Subtitles section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_in_subtitles_section).isDisplayed());
        //verify presence of Auto Subtitle in content section in Subtitles section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.auto_subtitle_button_in_content_section_in_subtitles_section).isDisplayed());
        //verify presence of Manual Subtitle in content section in Subtitles section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.manual_subtitle_button_in_content_section_in_subtitles_section).isDisplayed());
        //verify presence of Upload Subtitle in content section in Subtitles section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.upload_subtitle_button_in_content_section_in_subtitles_section).isDisplayed());
    }

    /**
     * Verify user is able to see sub content in Shapes option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentInShapesSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Shapes option on left navigation bar
        videoEditingPage.clickShapesSectionOnLeftNavigationBar();
        //verify presence of Shapes title in Shapes section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.shapes_title_in_shapes_section).isDisplayed());
        //verify presence of shapes buttons section in Shapes section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.shapes_buttons_section_in_shapes_section).isDisplayed());
        //verify presence of Shapes lens search icon in Shapes section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.lens_search_icon_for_navigation_bar_options).isDisplayed());
        //verify presence of search text field in Shapes section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.search_text_field_for_navigation_bar_options).isDisplayed());
        //verify presence of content section in Shapes section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_for_navigation_bar_options).isDisplayed());
    }

    /**
     * Verify user is able to see sub content in Transitions option on left navigation pane.
     */
    @Test(groups = {"Smoke"})
    public void verifySubContentInTransitionsSection(){
        //create LoginPage object
        LoginPage loginPage = new LoginPage();
        //create AccountHomePage object
        AccountHomePage accountHomePage = new AccountHomePage();
        //create VideoEditingPage object
        VideoEditingPage videoEditingPage = new VideoEditingPage();
        //launch login page
        launchLoginPage();
        //login with existing user
        loginPage.loginWithExistingUser();
        //verify successful login with existing user
        Assert.assertTrue(loginPage.isLoginSuccessful());
        //click existing project
        videoEditingPage.clickExistingProject();
        //click Transitions option on left navigation bar
        videoEditingPage.clickTransitionsOptionOnLeftNavigationBar();
        //verify presence of Transitions title in Transitions section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.transitions_title_in_transitions_section).isDisplayed());
        //verify presence of content section in Transitions section
        Assert.assertTrue(findElementUntilElementVisible(VideoEditingPage.content_section_in_transitions_section).isDisplayed());
    }



}
