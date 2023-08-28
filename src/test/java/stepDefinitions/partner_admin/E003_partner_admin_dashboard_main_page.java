package stepDefinitions.partner_admin;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Partner_log_in_page_objects;
import com.pages.Z999_mailtrap_objects;
import com.pages.Partner_dashboard_page_objects;
import com.pages.Partner_onboarding_page_objects;
import com.pages.Dashboard_notification_page_objects;
import com.pages.Profile_my_profile_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E003_partner_admin_dashboard_main_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Partner_log_in_page_objects plp = new Partner_log_in_page_objects(DriverFactory.getDriver());
	private Partner_dashboard_page_objects pdash = new Partner_dashboard_page_objects(DriverFactory.getDriver());
	private Partner_onboarding_page_objects ponbo = new Partner_onboarding_page_objects(DriverFactory.getDriver());
	private Dashboard_notification_page_objects pnoti = new Dashboard_notification_page_objects(DriverFactory.getDriver());
	private Profile_my_profile_page_objects pprof= new Profile_my_profile_page_objects(DriverFactory.getDriver());
	
	private Z999_mailtrap_objects mailtrap=new Z999_mailtrap_objects(DriverFactory.getDriver());
	Logger logger=LogManager.getLogger(E003_partner_admin_dashboard_main_page.class);
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Given("Verify that user is on the partner dashboard page as expected page title is {string}")
	public void verify_that_user_is_on_the_partner_dashboard_page_as_expected_page_title_is(String string) {
		 DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		    lp.landing_page_log_in_button_is_clicked();
		    lp.landing_page_log_in_as_partner_button_is_clicked();
		    plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(AppHooks.prop.getProperty("partner_email"));
		    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
		    ElementUtil.eu.opened_second_tab_with_parent_tab();
			ElementUtil.eu.switch_handel_to_the_second_tab(DriverFactory.getDriver());
			DriverFactory.getDriver().get(AppHooks.prop.getProperty("mailtrapURL"));
		    mailtrap.mailtrap_user_click_on_log_in_button();
		    mailtrap.mailtrap_user_enter_email_into_the_user_field(AppHooks.prop.getProperty("mailtrapEmail"));
		    mailtrap.mailtrap_user_click_the_next_button();
		    mailtrap.mailtrap_user_enter_password_into_the_user_field(AppHooks.prop.getProperty("mailtrapPassword"));
		    mailtrap.mailtrap_user_click_on_log_in_button_before_scroll_down();
		    mailtrap.mailtrap_user_email_testing_is_click();
		    mailtrap.mailtrap_user_inbox_is_click();
		    mailtrap.mailtrap_user_demo_inbox_is_click();
		    mailtrap.mailtrap_get_the_mail_with_subject_title_click();
		    String actual = mailtrap.mailtrap_send_mail_otp_is_copied();
		    plp.switch_to_parent_window();
		    plp.partner_log_in_otp_page_otp_user_fields_pasted_otp_into_user_fields(actual);
		    plp.partner_log_in_otp_page_verify_otp_is_clicked();
		    
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    String strings =ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		    Assert.assertEquals(strings, string);
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
			AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		}
	
	
	@Then("Verify that header shield main logo should be displayed in the partner dashboard page")
	public void verify_that_header_shield_main_logo_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_shield_main_logo_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header shield main logo should be clickable in the partner dashboard page")
	public void verify_that_header_shield_main_logo_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_shield_main_logo_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon should be displayed in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon should be clickable in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon should be able to mouse hover in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_should_be_able_to_mouse_hover_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon should have count displayed over bell in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_should_have_count_displayed_over_bell_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_should_have_count_displayed_over_bell();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon having you have dot notifications text should be displayed in partner dashbaord page")
	public void verify_that_header_notification_bell_icon_having_you_have_dot_notifications_text_should_be_displayed_in_partner_dashbaord_page() {
		pdash.partner_dashboard_header_notification_bell_icon_is_click();
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon having you have dot notifications text should be clickable in partner dashbaord page")
	public void verify_that_header_notification_bell_icon_having_you_have_dot_notifications_text_should_be_clickable_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon having view all button should be displayed in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_having_view_all_button_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_having_view_all_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon having view all button should be clickable in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_having_view_all_button_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_having_view_all_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon having view all notifications button should be displayed in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_having_view_all_notifications_button_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header notification bell icon having view all notifications button should be clickable in the partner dashboard page")
	public void verify_that_header_notification_bell_icon_having_view_all_notifications_button_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should be displayed in the partner dashbaord page")
	public void verify_that_header_profile_dropdown_should_be_displayed_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should be clickable in the partner dashboard page")
	public void verify_that_header_profile_dropdown_should_be_clickable_in_the_partner_dashbaord_page() {
		pdash.partner_dashboard_header_profile_dropdown_is_click();
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown icon having text of the user should be displayed in partner dashboard page")
	public void verify_that_header_profile_dropdown_icon_having_text_of_the_user_should_be_displayed_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_icon_having_text_of_the_user_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have role should be displayed in partner dashbaord page")
	public void verify_that_header_profile_dropdown_should_have_role_should_be_displayed_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_is_have_role_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have last log in date and time should be displayed in partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_last_log_in_date_and_time_should_be_displayed_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_is_have_last_log_in_date_and_time_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have my profile button should be displayed in partner dashborad page")
	public void verify_that_header_profile_dropdown_should_have_my_profile_button_should_be_displayed_in_partner_dashborad_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have my profile button should be clickable in partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_my_profile_button_should_be_clickable_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have my profile button able to mouse hover in partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_my_profile_button_able_to_mouse_hover_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have change password button should be displayed in partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_change_password_button_should_be_displayed_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_change_password_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have change password button should be clickable in partner dashbaord page")
	public void verify_that_header_profile_dropdown_should_have_change_password_button_should_be_clickable_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_change_password_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have change password button able to mouse hover in partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_change_password_button_able_to_mouse_hover_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_change_password_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have sign out button should be displayed in the partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_sign_out_button_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_sign_out_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have sign out button should be clickable in the partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_sign_out_button_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_sign_out_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that header profile dropdown should have sign out button should be able to mouse hover in partner dashboard page")
	public void verify_that_header_profile_dropdown_should_have_sign_out_button_should_be_able_to_mouse_hover_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_header_profile_dropdown_have_sign_out_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that dashboard button should be displayed in the partner dashboard page")
	public void verify_that_dashboard_button_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_dashboard_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that dashboard button should be clickable on the partner dashbaord page")
	public void verify_that_dashboard_button_should_be_clickable_on_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_dashboard_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that dashboard button should be able to mouse hover in the partner dashbaord page")
	public void verify_that_dashboard_button_should_be_able_to_mouse_hover_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_dashboard_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that my application button should be displayed in the partner dashboard page")
	public void verify_that_my_application_button_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_my_application_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that my application button should be clickable on the partner dashbaord page")
	public void verify_that_my_application_button_should_be_clickable_on_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_my_applications_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that my application button should be able to mouse hover in the partner dashbaord page")
	public void verify_that_my_application_button_should_be_able_to_mouse_hover_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_my_applications_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	
	
	@Then("Verify that mid Welcome to dashboard text should be displayed in the partner dashboard page")
	public void verify_that_mid_welcome_to_dashboard_text_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_welcome_to_dashboard_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid track your application should be displayed in the partner dashbaord page")
	public void verify_that_mid_track_your_application_should_be_displayed_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_track_your_application_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid track your application should be clickable in the partner dashbaord page")
	public void verify_that_mid_track_your_application_should_be_clickable_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_track_your_application_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid track your appliaction should be able to mouse hover in the partner dashbaord page")
	public void verify_that_mid_track_your_appliaction_should_be_able_to_mouse_hover_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_track_your_application_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid fill out the application and submit the documents for verification text should be displayed in partner dashbaord page")
	public void verify_that_mid_fill_out_the_application_and_submit_the_documents_for_verification_text_should_be_displayed_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_fill_out_the_application_and_submit_the_documents_for_verification_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid get started button should be displayed in the partner dashboard page")
	public void verify_that_mid_get_started_button_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_get_started_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid get started button should be clickable in partner dashbaord page")
	public void verify_that_mid_get_started_button_should_be_clickable_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_get_started_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid get started button should be able to mouse hover in partner dashboard page")
	public void verify_that_mid_get_started_button_should_be_able_to_mouse_hover_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_get_started_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid card body image should be displayed in partner dashbaord page")
	public void verify_that_mid_card_body_image_should_be_displayed_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_card_body_image_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid card body user name should be displayed in partner dashboard page")
	public void verify_that_mid_card_body_user_name_should_be_displayed_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_card_body_user_name_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid card body subtitle line should be displayed in partner dashbaord page")
	public void verify_that_mid_card_body_subtitle_line_should_be_displayed_in_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_mid_card_body_subtitle_line_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid card body subtitle line percentage should be displayed in partner dashboard page")
	public void verify_that_mid_card_body_subtitle_line_percentage_should_be_displayed_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_card_body_subtitle_line_percentage_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid back to top arrow should be displayed in the partner dashboard page")
	public void verify_that_mid_back_to_top_arrow_should_be_displayed_in_the_partner_dashboard_page() {
		ElementUtil.eu.scroll_end_of_page_with_keyboard_click(1);
		boolean actual = pdash.partner_dashboard_mid_back_to_top_arrow_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid back to top arrow should be clickable in the partner dashboard page")
	public void verify_that_mid_back_to_top_arrow_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_back_to_top_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mid back to top arrow should be able to mouse hover in partner dashboard page")
	public void verify_that_mid_back_to_top_arrow_should_be_able_to_mouse_hover_in_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_mid_back_to_top_arrow_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that footer line text should be displayed in partner dashboard page")
	public void verify_that_footer_line_text_should_be_displayed_in_partner_dashboard_page() {
		ElementUtil.eu.scroll_end_of_page_with_keyboard_click(1);
		boolean actual = pdash.partner_dashboard_footer_line_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that footer shield link should be displayed in the partner dashbaord page")
	public void verify_that_footer_shield_link_should_be_displayed_in_the_partner_dashbaord_page() {
		boolean actual = pdash.partner_dashboard_footer_shield_link_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that footer shield link should be clickable in the partner dashboard page")
	public void verify_that_footer_shield_link_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_footer_shield_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that footer iffort link should be displayed in the partner dashboard page")
	public void verify_that_footer_iffort_link_should_be_displayed_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_footer_iffort_link_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that footer iffort link should be clickable in the partner dashboard page")
	public void verify_that_footer_iffort_link_should_be_clickable_in_the_partner_dashboard_page() {
		boolean actual = pdash.partner_dashboard_footer_iffort_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@When("user is on the partner onboarding page and click on the shield header main logo link from partner dashboard page")
	public void user_is_on_the_partner_onboarding_page_and_click_on_the_shield_header_main_logo_link_from_partner_dashboard_page() {
	    pdash.partner_dashboard_mid_get_started_button_is_click();
	    boolean actual=ponbo.partner_onboarding_header_text_above_breadcrumb_is_displayed();
	    Assert.assertEquals(actual, true);
	    pdash.partner_dashboard_header_shield_main_logo_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should navigate to the partner dashboard page as expected")
	public void verify_that_user_should_navigate_to_the_partner_dashboard_page_as_expected() {
	    boolean actual=pdash.partner_dashboard_mid_get_started_button_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	@When("user click on the notification bell pop view all notification button is clicked from partner dashboard page")
	public void user_click_on_the_notification_bell_pop_view_all_notification_button_is_clicked_from_partner_dashboard_page() {
	    pdash.partner_dashboard_header_notification_bell_icon_is_click();
	    boolean actual =pdash.partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    pdash.partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_click();
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should naviagated to the notification list page from partner dashboard page")
	public void verify_that_user_should_naviagated_to_the_notification_list_page_from_partner_dashboard_page() {
//		boolean actual=pnoti.partner_notification_list_header_text_above_breadcrumb_is_displayed();
//	    Assert.assertEquals(actual, true);
	    pdash.partner_dashboard_header_shield_main_logo_is_click();
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the notification bell pop view all button is clicked from partner dashboard page")
	public void user_click_on_the_notification_bell_pop_view_all_button_is_clicked_from_partner_dashboard_page() {
		pdash.partner_dashboard_header_notification_bell_icon_is_click();
	    boolean actual =pdash.partner_dashboard_header_notification_bell_icon_having_view_all_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    pdash.partner_dashboard_header_notification_bell_icon_having_view_all_button_is_click();
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@When("user click on the profile icon pop up should opened and then click on the my profile button from partner dashboard page")
	public void user_click_on_the_profile_icon_pop_up_should_opened_and_then_click_on_the_my_profile_button_from_partner_dashboard_page() {
	    pdash.partner_dashboard_header_profile_dropdown_is_click();
	    boolean actual=pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_clickable();
	    pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_click();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should navigated to the my profile page from the partner dashboard page")
	public void verify_that_user_should_navigated_to_the_my_profile_page_from_the_partner_dashboard_page() {
//	    boolean actual = pprof.partner_my_profile_header_text_is_displayed();
//	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		pdash.partner_dashboard_header_shield_main_logo_is_click();
	}
	
	@When("user click on the profile icon pop up should opened and then click on the change password button from the partner dashboard page")
	public void user_click_on_the_profile_icon_pop_up_should_opened_and_then_click_on_the_change_password_button_from_the_partner_dashboard_page() {
		pdash.partner_dashboard_header_profile_dropdown_is_click();
	    boolean actual=pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_clickable();
	    pdash.partner_dashboard_header_profile_dropdown_have_change_password_button_is_click();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
//	@Then("Verify that user should naviagated to the change password page from the partner dashbaord page")
//	public void verify_that_user_should_naviagated_to_the_change_password_page_from_the_partner_dashbaord_page() {
//		boolean actual = pcpass.partner_change_password_header_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		pdash.partner_dashboard_header_shield_main_logo_is_click();
//	}
	
	@When("user click on the profile icon pop up should opened and then click on the sign out button from partner dashboard page")
	public void user_click_on_the_profile_icon_pop_up_should_opened_and_then_click_on_the_sign_out_button_from_partner_dashboard_page() {
		pdash.partner_dashboard_header_profile_dropdown_is_click();
	    boolean actual=pdash.partner_dashboard_header_profile_dropdown_have_my_profile_button_is_clickable();
	    pdash.partner_dashboard_header_profile_dropdown_have_sign_out_button_is_click();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should navigate to the partner log in page from the partner dashboard page")
	public void verify_that_user_should_navigate_to_the_partner_log_in_page_from_the_partner_dashboard_page() {
	    boolean actual=plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
}
