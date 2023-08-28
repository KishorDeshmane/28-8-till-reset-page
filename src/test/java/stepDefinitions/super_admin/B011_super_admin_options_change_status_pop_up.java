package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Users_all_users_page_objects;
import com.pages.Users_change_status_pop_up_objects;
import com.pages.Users_create_users_page_objects;
import com.pages.Users_delete_pop_up_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B011_super_admin_options_change_status_pop_up {

	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Users_all_users_page_objects saalluser = new Users_all_users_page_objects(DriverFactory.getDriver());
	private Users_change_status_pop_up_objects sastatus= new Users_change_status_pop_up_objects(DriverFactory.getDriver());
	private Users_create_users_page_objects sacreate = new Users_create_users_page_objects(DriverFactory.getDriver());
	private Users_delete_pop_up_objects sadelete = new Users_delete_pop_up_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B011_super_admin_options_change_status_pop_up.class);

	
	/*
	 * 
	 * 
	 * 
	 * SCR
	 * 
	 * 
	 * 
	 */

	
	
	@Given("Verify that super admin user is on the users all users actions options change status page as expected page title {string}")
	public void verify_that_super_admin_user_is_on_the_users_all_users_actions_options_change_status_page_as_expected_page_title(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_users_button();
		samain.super_admin_logger_mouser_users_all_users_is_clicked();
		saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
		saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("user click on the change status button from the super admin change status pop up")
	public void user_click_on_the_change_status_button_from_the_super_admin_dashboard_all_users_actions_option_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up should be displayed in the super admin change status pop up")
	public void verify_that_the_pop_up_should_be_displayed_in_the_super_admin_dashbaord_all_users_actions_option_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up title change status of the user should be displayed in super admin change status pop up")
	public void verify_that_the_pop_up_title_change_status_of_the_user_should_be_displayed_in_super_admin_dashbaord_all_users_actions_options_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_title_change_status_of_the_user_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up cross button should be clickable in super admin change status pop up")
	public void verify_that_the_pop_up_cross_button_should_be_clickable_in_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up cross button click as expected pop up is not displayed in super admin change status pop up")
	public void verify_that_the_pop_up_cross_button_click_as_expected_pop_up_is_not_displayed_in_super_admin_dashboard_all_users_actions_options_button() {
		sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button_is_click();
		boolean actual = saalluser.super_admin_users_all_users_actions_options_3_dots_is_clickable();
		Assert.assertEquals(actual, true);
		saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
		saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up switch button should be clickable in the super admin change status pop up")
	public void verify_that_the_pop_up_switch_button_should_be_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up switch button side text should be displayed in the super admin change status pop up")
	public void verify_that_the_pop_up_switch_button_side_text_should_be_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_side_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up switch button side text active or inactive is displayed in the super admin change status pop up")
	public void verify_that_the_pop_up_switch_button_side_text_active_or_inactive_is_displayed_in_the_super_admin_dashboard_all_users_actions_button() {
		sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click();
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_side_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up submit mouse hover is possible in the super admin change status pop up")
	public void verify_that_the_pop_up_submit_mouse_hover_is_possible_in_the_super_admin_dashboard_all_users_actions_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_mouse_hover_is_possible();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up cancel button mouse hover is possible in the super admin change status pop up")
	public void verify_that_the_pop_up_cancel_button_mouse_hover_is_possible_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button_mouse_hover_is_possible();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the pop up close button should be close the pop up in the super admin change status pop up")
	public void verify_that_the_pop_up_close_button_should_be_close_the_pop_up_in_the_super_admin_dashboard_all_users_users_actions_button() {
//		System.out.println("1");
//		saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
//		System.out.println("2");
//		saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
//		System.out.println("3");
		sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button_is_click();
		System.out.println("4");
		boolean actual = saalluser.super_admin_users_all_users_actions_options_3_dots_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

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
	 * SCR 03
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
	
	@Given("Verify that super_admin is on the super_admin log in page as expected page title is {string} with new created user")
	public void verify_that_user_is_on_the_super_admin_log_in_page_as_expected_page_title_is_with_new_created_user(String titles) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		String title = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(title, titles);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("Verify that after super_admin enter the super_admin {string} into the email user field with new created user")
	public void verify_that_after_user_enter_the_valid_super_admin_credentials_into_the_email_user_field_with_new_created_user(String email) {
		salogin.administrator_log_enter_email_into_the_user_field(email);
		String gettext = salogin.administrator_entered_email_text();
		Assert.assertEquals(gettext, email);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("Verify that after super_admin enter the super_admin {string} into the password user field with new created user")
	public void verify_that_after_user_enter_the_valid_super_admin_credentials_into_the_password_user_field_with_new_created_user(String password) {
		salogin.administrator_log_enter_password_into_the_user_field(password);
		String gettext = salogin.administrator_entered_password_text();
		Assert.assertEquals(gettext, password);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that after super_admin entering the valid super_admin credentials into the email and password user is able to click on the sign in button with new created user")
	public void verify_that_after_super_admin_entering_the_valid_super_admin_credentials_into_the_email_and_password_user_is_able_to_click_on_the_sign_in_button_with_new_created_user() {
		salogin.administrator_sign_in_button_is_clicked();
		boolean actuals = salogin.administrator_log_in_note_in_top_corner_is_displayed();
		Assert.assertEquals(actuals, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin is log in super_admin successfully with the expected page tilte {string} with new created user")
	public void verify_that_super_admin_is_log_in_super_admin_successfully_with_the_expected_page_tilte_with_new_created_user(String string) {
		boolean actual = samain.super_admin_logger_the_main_logo_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/*
	 * 
	 * 
	 * 
	 * change to inactive
	 * 
	 * 
	 */
	
	@Then("Verify that super_admin should be able change the status of the user in all user page for new user")
	public void verify_that_user_should_be_able_change_the_status_of_the_user_in_all_user_page_for_new_user() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click_two_times();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_is_click();
	    boolean actual=saalluser.super_admin_user_all_users_thread_column_user_status_inactive_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
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
	 * 
	 * 
	 */
	
	@Then("Verify that super_admin is not log in super_admin successfully with the expected page tilte {string} with new user")
	public void verify_that_super_admin_is_not_log_in_super_admin_successfully_with_the_expected_page_tilte_with_new_user(String string) {
		salogin.administrator_sign_in_button_is_clicked();
		boolean actual = salogin.administrator_log_in_user_not_found_text_is_displayed();
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
	
	@Given("Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title {string} for change status")
	public void verify_that_super_admin_is_on_the_super_admin_dashboard_users_all_users_create_user_page_as_expected_page_title_for_change_Status(String title) {
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
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * USER
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	
	@Then("Verify that super_admin enter the first name as {string} in create user page for change status")
	public void verify_that_super_admin_enter_the_first_name_as_in_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_first_name_user_field_send_text(string);
		String value= sacreate.super_admin_logger_create_user_entered_first_name_text();
		Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter the last name as  {string} in create user page for change status")
	public void verify_that_super_admin_enter_the_last_name_as_in_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_last_name_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_last_name_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter the email as {string} in create user page for change status")
	public void verify_that_super_admin_enter_the_email_as_in_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that super_admin select the country code {string} in create user page for change status")
	public void verify_that_super_admin_select_the_country_code_uae_in_create_user_page(String uaes) {
		sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
	    sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
	    String uae=sacreate.super_admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
	    Assert.assertEquals(uae, uaes);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	

	
	
	
	
	
	@Then("Verify that super_admin enter the mobile number as {string} in create user page for change status")
	public void verify_that_super_admin_enter_the_mobile_number_as_in_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_mobile_number_user_field_send_text(string);
	    String act =sacreate.super_admin_logger_create_user_entered_mobile_number_text();
	    Assert.assertEquals(act, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter date of birth as {string} in the create user page for change status")
	public void verify_that_super_admin_enter_date_of_birth_as_in_the_create_user_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String value = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin send the profile image as jpg in create user page for change status")
	public void verify_that_super_admin_send_the_profile_image_as_jpg_in_create_user_page() {
	    boolean ac=sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
	    Assert.assertEquals(ac, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin select the gender as male from the radio button in create user page for change status")
	public void verify_that_super_admin_select_the_gender_as_male_from_the_radio_button_in_create_user_page() {
	    sacreate.super_admin_logger_create_users_page_gender_male_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter password as {string} in the create user page for change status")
	public void verify_that_super_admin_enter_password_as_in_the_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter comfirmed password as same as {string} in the create user page for change status")
	public void verify_that_super_admin_enter_comfirmed_password_as_same_as_in_the_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_comfirm_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_comfirm_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin select the assigned role as {string} in the create user page super admin for change status")
	public void verify_that_super_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_super_admin(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that super_admin select the assigned role as {string} in the create user page admin for change status")
	public void verify_that_super_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_admin_for_change_status(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	


	@Then("Verify that the super_admin submit the button should create a new user in the all users page for change status")
	public void verify_that_the_super_admin_submit_the_button_should_create_a_new_user_in_the_all_users_page() {
		sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		boolean actual=saalluser.super_admin_user_all_users_search_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	@Then("Verify that super_admin search button is able to search the user with {string} name of user in all users page for change status")
	public void verify_that_super_admin_search_button_is_able_to_search_the_user_with_name_of_user_in_all_users_page(String string) {
	    saalluser.super_admin_user_all_users_search_userfield_sendText(string);
	    saalluser.super_admin_user_all_users_search_button_is_click();
	    boolean actual = saalluser.super_admin_user_all_users_column_list_expected_user_name_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should be able change the status of the user in all user page for change status")
	public void verify_that_user_should_be_able_change_the_status_of_the_user_in_all_user_page() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_is_click();
	    boolean actual=saalluser.super_admin_user_all_users_thread_column_user_status_active_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should be able to delete the user from the all users page for change status")
	public void verify_that_user_should_be_able_to_delete_the_user_from_the_all_users_page() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_delete_is_click();
	    sadelete.super_admin_users_all_users_actions_option_yes_delete_it_pop_up_is_click();
	    boolean actual = sadelete.super_admin_users_all_users_actions_option_delete_successfully_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Given("Verify that super_admin user is on the users all users page as expected page title {string} for change status")
	public void verify_that_super_admin_user_is_on_the_users_all_users_page_as_expected_page_title_for_change_status(String title) {
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
	
	
}
