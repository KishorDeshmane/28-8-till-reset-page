package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Users_all_users_page_objects;
import com.pages.Users_change_status_pop_up_objects;
import com.pages.Users_create_users_page_objects;
import com.pages.Users_resend_email_verification_link_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B013_super_admin_options_resend_email_verification_link {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Users_all_users_page_objects saalluser = new Users_all_users_page_objects(DriverFactory.getDriver());
	private Users_resend_email_verification_link_objects saemailverif =new Users_resend_email_verification_link_objects(DriverFactory.getDriver());
	private Users_create_users_page_objects sacreate = new Users_create_users_page_objects(DriverFactory.getDriver());
	private Users_change_status_pop_up_objects sastatus = new Users_change_status_pop_up_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B013_super_admin_options_resend_email_verification_link.class);

	/*
	 * 
	 * 
	 * 
	 * SCR
	 * 
	 * 
	 * 
	 * 
	 */

	@Given("Verify that super_admin user is on the users all users actions options resend email verification link as expected page title {string} for resend email verification link")
	public void verify_that_super_admin_user_is_on_the_users_all_users_actions_options_resend_email_verification_link_as_expected_page_title_for_resend_email_verification_link(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_users_button();
		samain.super_admin_logger_mouser_users_all_users_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Given("Verify that super_admin user is on the users all users actions options resend email verification link as expected create user title {string} for resend email verification link")
	public void verify_that_super_admin_user_is_on_the_users_all_users_actions_options_resend_email_verification_link_as_expected_create_user_title(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_users_button();
		samain.super_admin_logger_mouser_users_all_users_is_clicked();
		saalluser.super_admin_user_all_users_create_user_button_is_click();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is able to search the user with {string} name of user in all users page for resend email verification link")
	public void verify_that_super_admin_search_button_is_able_to_search_the_user_with_name_of_user_in_all_users_page_for_resend_email_verification_link(String string) {
	    saalluser.super_admin_user_all_users_search_userfield_sendText(string);
	    saalluser.super_admin_user_all_users_search_button_is_click();
	    boolean actual = saalluser.super_admin_user_all_users_column_list_expected_user_name_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("super_admin click on the action options and click on resend email verification link button")
	public void super_admin_click_on_the_action_options_and_click_on_resend_email_verification_link_button() {
		saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
		boolean actual = saalluser.super_admin_users_all_users_actions_option_resend_email_verification_link_is_clickable();
		saalluser.super_admin_users_all_users_actions_option_resend_email_verification_link_is_click();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("super_admin click on the resend email verification link button sent mail pop up already user is active displayed from the administrstor dashboard all users actions options button")
	public void super_admin_click_on_the_resend_email_verification_link_button_sent_mail_pop_up_already_user_is_active_displayed_from_the_administrstor_dashboard_all_users_actions_options_button() {
		boolean actual = saemailverif.super_admin_dashboard_all_users_actions_options_resend_email_verification_link_successfully_sent_pop_up_is_not_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("super_admin click on the resend email verification link button sent mail pop up email send successfully is displayed from the administrstor dashboard all users actions options button")
	public void super_admin_click_on_the_resend_email_verification_link_button_sent_mail_pop_up_email_send_successfully_is_displayed_from_the_administrstor_dashboard_all_users_actions_options_button() {
		boolean actual = saemailverif.super_admin_dashboard_all_users_actions_options_resend_email_verification_link_successfully_sent_pop_up_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	

	@Then("Verify that super_admin enter the first name as {string} in create user page for resend email verification link")
	public void verify_that_super_admin_enter_the_first_name_as_in_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_first_name_user_field_send_text(string);
		String value= sacreate.super_admin_logger_create_user_entered_first_name_text();
		Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter the last name as  {string} in create user page for resend email verification link")
	public void verify_that_super_admin_enter_the_last_name_as_in_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_last_name_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_last_name_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter the email as {string} in create user page for resend email verification link")
	public void verify_that_super_admin_enter_the_email_as_in_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that super_admin select the country code {string} in create user page for resend email verification link")
	public void verify_that_super_admin_select_the_country_code_uae_in_create_user_page(String uaes) {
		sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
	    sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
	    String uae=sacreate.super_admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
	    Assert.assertEquals(uae, uaes);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that super_admin enter the mobile number as {string} in create user page for resend email verification link")
	public void verify_that_super_admin_enter_the_mobile_number_as_in_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_mobile_number_user_field_send_text(string);
	    String act =sacreate.super_admin_logger_create_user_entered_mobile_number_text();
	    Assert.assertEquals(act, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter date of birth as {string} in the create user page for resend email verification link")
	public void verify_that_super_admin_enter_date_of_birth_as_in_the_create_user_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String value = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin send the profile image as jpg in create user page for resend email verification link")
	public void verify_that_super_admin_send_the_profile_image_as_jpg_in_create_user_page() {
	    boolean ac=sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
	    Assert.assertEquals(ac, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin select the gender as male from the radio button in create user page for resend email verification link")
	public void verify_that_super_admin_select_the_gender_as_male_from_the_radio_button_in_create_user_page() {
	    sacreate.super_admin_logger_create_users_page_gender_male_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter password as {string} in the create user page for resend email verification link")
	public void verify_that_super_admin_enter_password_as_in_the_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter comfirmed password as same as {string} in the create user page for resend email verification link")
	public void verify_that_super_admin_enter_comfirmed_password_as_same_as_in_the_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_comfirm_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_comfirm_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin select the assigned role as {string} in the create user page super admin for resend email verification link")
	public void verify_that_super_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_super_admin(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that super_admin select the assigned role as {string} in the create user page admin for resend email verification link")
	public void verify_that_super_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_admin(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the super_admin submit the button should create a new user in the all users page for resend email verification link")
	public void verify_that_the_super_admin_submit_the_button_should_create_a_new_user_in_the_all_users_page() {
		sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		boolean actual=saalluser.super_admin_user_all_users_search_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
//	@Then("Verify that search button is able to search the user with {string} name of user in all users page for resend email verification link")
//	public void verify_that_search_button_is_able_to_search_the_user_with_name_of_user_in_all_users_page(String string) {
//	    saalluser.super_admin_user_all_users_search_userfield_sendText(string);
//	    saalluser.super_admin_user_all_users_search_button_is_click();
//	    boolean actual = saalluser.super_admin_user_all_users_column_list_expected_user_name_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
	

	
	
	@Then("Verify that super_admin should be able change the status of the user in all user page for resend email verification link")
	public void verify_that_super_admin_should_be_able_change_the_status_of_the_user_in_all_user_page() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_is_click();
	    boolean actual=saalluser.super_admin_user_all_users_thread_column_user_status_active_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}



}
