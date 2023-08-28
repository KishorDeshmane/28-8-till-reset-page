package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Users_all_users_page_objects;
import com.pages.Users_create_users_page_objects;
import com.pages.Users_delete_pop_up_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B006_super_admin_users_all_users_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Users_all_users_page_objects saalluser = new Users_all_users_page_objects(DriverFactory.getDriver());
	private Users_create_users_page_objects sacreate=new Users_create_users_page_objects(DriverFactory.getDriver());
	private Users_delete_pop_up_objects sadelete= new Users_delete_pop_up_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B006_super_admin_users_all_users_page.class);

	/*
	 * 
	 * 
	 * 
	 * SCR 01
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Given("Verify that super admin user is on the all users page as expected page title {string}")
	public void verify_that_super_admin_user_is_on_the_users_all_users_page_as_expected_page_title(String title) {
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
	
	@Given("Verify that user is on the super admin dashboard users all users create user page as expected page title {string} for all users page")
	public void verify_that_user_is_on_the_super_admin_dashboard_users_all_users_create_user_page_as_expected_page_title(String title) {
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
	
	@Then("Verify that super admin user all users headers text should be displayed from the all users page")
	public void verify_that_super_admin_user_all_users_headers_text_should_be_displayed_from_the_all_users_page() {
	    boolean actual=saalluser.super_admin_user_all_users_headers_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum should be displayed from super admin all users page")
	public void verify_that_super_admin_user_all_users_breadcrum_should_be_displayed_from_all_user_page() {
		boolean actual=saalluser.super_admin_user_all_users_breadcrum_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum dashboard button should be displayed from super admin all users page")
	public void verify_that_breadcrum_dashboard_button_should_be_displayed_from_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_breadcrum_dashboard_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum dashboard button should be clickable from the super admin all users page")
	public void verify_that_breadcrum_dashboard_button_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_breadcrum_dashboard_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum users text should be displayed from the super admin all users page")
	public void verify_that_breadcrum_users_text_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_breadcrum_users_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search button should be displayed from the super admin all users page")
	public void verify_that_search_button_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_search_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search button should be clickable from the super admin all users page")
	public void verify_that_search_button_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_search_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search button should be able mouse hover from super admin all users page")
	public void Verify_that_search_button_should_be_able_mouse_hover_from_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_search_button_should_be_able_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search userfield should be clickable from the super admin all users page")
	public void verify_that_search_userfield_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_search_userfield_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search userfield placeholder value should be {string} from super admin all users page")
	public void verify_that_search_userfield_placeholder_value_should_be_from_super_admin_user_all_users_page(String string) {
		String actual=saalluser.super_admin_user_all_users_search_userfield_is_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create user button should be displayed from the super admin all users page")
	public void verify_that_create_user_button_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_create_user_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that create user button should be clickble from the super admin all users page")
	public void verify_that_create_user_button_should_be_clickble_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_create_user_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that create user button should be able to do mouser hover from the super admin all users page")
	public void verify_that_create_user_button_should_be_able_to_do_mouser_hover_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_create_user_button_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list should be displayed from the super admin all users page")
	public void verify_that_thread_column_list_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list name up-down arrow should be clickable from the super admin all users page")
	public void verify_that_thread_column_list_name_up_down_arrow_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_name_up_down_arrow_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list email up-down arrows should be clickable from the super admin all users page")
	public void verify_that_thread_column_list_email_up_down_arrows_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_email_up_down_arrow_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list mobile number up-down arrows should be clickable from the super admin all users page")
	public void verify_that_thread_column_list_mobile_number_up_down_arrows_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_mobile_number_up_down_arrow_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list type up-down arrows should be clickable from the super admin all users page")
	public void Verify_that_thread_column_list_type_up_down_arrows_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_type_up_down_arrows_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list status up-down arrow should be clickable from the super admin all users page")
	public void verify_that_thread_column_list_status_up_down_arrow_should_be_clickabale_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_status_up_down_arrow_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list name up-down arrow should be displayed from the super admin all users page")
	public void verify_that_thread_column_list_name_up_down_arrow_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_name_up_down_arrow_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list email up-down arrows should be displayed from the super admin all users page")
	public void verify_that_thread_column_list_email_up_down_arrows_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_email_up_down_arrow_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list mobile number up-down arrows should be displayed from the super admin all users page")
	public void verify_that_thread_column_list_mobile_number_up_down_arrows_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_mobile_number_up_down_arrow_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list type up-down arrows should be displayed from the super admin all users page")
	public void Verify_that_thread_column_list_type_up_down_arrows_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_type_up_down_arrows_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list status up-down arrow should be displayed from the super admin all users page")
	public void verify_that_thread_column_list_status_up_down_arrow_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_status_up_down_arrow_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list action should be displayed from the super admin all users page")
	public void verify_that_thread_column_list_action_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_column_list_action_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column name should be displayed from the super admin all users page")
	public void verify_that_thread_column_name_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_thread_column_name_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column email should be displayed from the super admin all users page")
	public void verify_that_thread_column_email_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_thread_column_email_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column mobile number should be displayed from the super admin all users page")
	public void verify_that_thread_column_mobile_number_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_thread_column_mobile_number_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column type should be displayed from the super admin all users page")
	public void Verify_that_thread_column_type_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_thread_column_type_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column status should be displayed from the super admin all users page")
	public void verify_that_thread_column_status_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual=saalluser.super_admin_user_all_users_thread_column_status_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that actions options 3 dots should be clickable from the super admin all users page")
	public void verify_that_actions_options_3_dots_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_options_3_dots_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions options 3 dots should be able to mouse hover from the super admin all users page")
	public void verify_that_actions_options_3_dots_should_be_able_to_mouse_hover_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_options_3_dots_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option edit should be clickable from the super admin all users page")
	public void verify_that_actions_option_edit_should_be_clickable_from_the_super_admin_user_all_users_page() {
		saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
		boolean actual =saalluser.super_admin_users_all_users_actions_option_edit_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option change status should be clickable from the super admin all users page")
	public void verify_that_actions_option_change_status_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_option_change_status_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option delete should be clickable from the super admin all users page")
	public void verify_that_actions_option_delete_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_option_delete_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option resend email verification link should be clickable from the super admin all users page")
	public void verify_that_actions_option_resend_email_verification_link_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_option_resend_email_verification_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that actions option change password should be clickable from the super admin all users page")
	public void verify_that_actions_option_change_password_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_option_change_password_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions manage roles and permissions should be clickable from the super admin all users page")
	public void verify_that_actions_manage_roles_and_permissions_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual =saalluser.super_admin_users_all_users_actions_manage_roles_and_permissions_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination left arrow should be displayed from the super admin all users page")
	public void verify_that_pagination_left_arrow_should_be_displayed_from_the_super_admin_user_all_user_all_users_page() {
	    boolean actual = saalluser.super_admin_users_all_users_pagination_left_arrow_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination left arrow should be clickable from the super admin all users page")
	public void verify_that_pagination_left_arrow_should_be_clickable_from_the_super_admin_user_all_user_all_users_page() {
	    boolean actual = saalluser.super_admin_users_all_users_pagination_left_arrow_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination left arrow should be able to mouse hover from super admin all users page")
	public void verify_that_pagination_left_arrow_should_be_able_to_mouse_hover_from_the_super_admin_user_all_user_all_users_page() {
	    boolean actual = saalluser.super_admin_users_all_users_pagination_left_arrow_is_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination numbers 1 should be selected from the super admin all users page")
	public void verify_that_pagination_numbers_1_should_be_selected_from_the_super_admin_user_all_users_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_numbers_one_should_be_selected_by_default();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that pagination numbers should be displayed from the super admin all users page")
	public void verify_that_pagination_numbers_should_be_displayed_from_the_super_admin_user_all_users_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_numbers_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination numbers should be clickable from the super admin all users page")
	public void verify_that_pagination_numbers_should_be_clickable_from_the_super_admin_user_all_users_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_numbers_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination numbers should be able to mouse hover from the super admin all users page")
	public void verify_that_pagination_numbers_should_be_able_to_mouse_hover_from_the_super_admin_user_all_user_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_numbers_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination right arrow should be displayed from the super admin all users page")
	public void verify_that_pagination_right_arrow_should_be_displayed_from_the_super_admin_user_all_user_all_users_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_right_arrow_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination right arrow should be clickable from the super admin all users page")
	public void verify_that_pagination_right_arrow_should_be_clickable_from_the_super_admin_user_all_user_all_users_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_right_arrow_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that pagination right arrow should be able to mouse hover from the super admin all users page")
	public void verify_that_pagination_right_arrow_should_be_able_to_mouse_hover_from_the_super_admin_user_all_user_all_users_page() {
		boolean actual = saalluser.super_admin_users_all_users_pagination_right_arrow_is_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that pagination count size should be {int} from the super admin all users page")
	public void verify_that_pagination_count_size_should_be_from_the_super_admin_user_all_user_all_users_page(Integer int1) {
		int actual = saalluser.super_admin_users_all_users_pagination_members_count_is();
		Assert.assertSame(int1, actual);
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
	 */
	
	@Then("Verify that the breadcrumb dashboard button should be navigated to the dashboard page from super_admin users all users page")
	public void verify_that_the_breadcrumb_dashboard_button_should_be_navigated_to_the_dashboard_page_from_super_admin_users_all_users_page() {
	    saalluser.super_admin_user_all_users_breadcrum_dashboard_is_click();
	    boolean actual = samain.super_admin_logger_projects_percentages_in_the_card_box_is_displayed();
	    Assert.assertSame(true, actual);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that the create users button should navigated to the create user page from super_admin users all users page")
	public void Verify_that_the_create_users_button_should_navigated_to_the_create_user_page_from_super_admin_users_all_users_page() {
		saalluser.super_admin_user_all_users_create_user_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_title_text_above_the_user_field_is_displayed();
	    Assert.assertSame(true, actual);
	    sacreate.super_admin_logger_create_users_page_breadcrum_all_users_is_click();
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
	 */
	
	@Then("Verify that super_admin search button is display the name of the user as {string} in all users page")
	public void verify_that_super_admin_search_button_is_display_the_name_of_the_user_as_in_all_users_page(String string) {
	    String actual =saalluser.super_admin_users_all_users_search_button_is_display_the_name_of_the_user();
	    System.out.println(actual);
	    Assert.assertEquals(actual, string);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is able to search the user with {string} name of user in all users page")
	public void verify_that_super_admin_search_button_is_able_to_search_the_user_with_name_of_user_in_all_users_page(String string) {
	    saalluser.super_admin_user_all_users_search_userfield_sendText(string);
	    saalluser.super_admin_user_all_users_search_button_is_click();
	    boolean actual = saalluser.super_admin_user_all_users_column_list_expected_user_name_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is display the email of the user as {string} in all users page")
	public void verify_that_super_admin_search_button_is_display_the_email_of_the_user_as_in_all_users_page(String string) {
	    String actual =saalluser.super_admin_users_all_users_search_button_is_display_the_email_of_the_user();
	    System.out.println(actual);
	    Assert.assertEquals(actual, string);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is display the number of the user as {string} in all users page")
	public void verify_that_super_admin_search_button_is_display_the_number_of_the_user_as_in_all_users_page(String string) {
	    String actual =saalluser.super_admin_users_all_users_search_button_is_display_the_number_of_the_user();
	    System.out.println(actual);
	    Assert.assertEquals(actual, string);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is able to search the user with {string} invalid user in all users page")
	public void verify_that_super_admin_search_button_is_able_to_search_the_user_with_invalid_user_in_all_users_page(String string) {
	    saalluser.super_admin_user_all_users_search_userfield_sendText(string);
	    saalluser.super_admin_user_all_users_search_button_is_click();
	    String actual =saalluser.super_admin_user_all_users_search_userfield_is_entered_value(); 
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is display the text of the user as {string} in all users page")
	public void verify_that_super_admin_search_button_is_display_the_text_of_the_user_as_in_all_users_page(String string) {
	    String actual =saalluser.super_admin_users_all_users_search_button_is_display_the_text_of_the_no_records_were_found();
	    System.out.println(actual);
	    Assert.assertEquals(actual, string);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	@Then("Verify that user enter the first name as {string} in create user page for all user search field")
	public void verify_that_user_enter_the_first_name_as_in_create_user_page_for_all_user_search_field(String string) {
		sacreate.super_admin_logger_create_user_first_name_user_field_send_text(string);
		String value= sacreate.super_admin_logger_create_user_entered_first_name_text();
		Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user enter the last name as  {string} in create user page for all user search field")
	public void verify_that_user_enter_the_last_name_as_in_create_user_page_for_all_user_search_field(String string) {
	    sacreate.super_admin_logger_create_user_last_name_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_last_name_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user enter the email as {string} in create user page for all user search field")
	public void verify_that_user_enter_the_email_as_in_create_user_page_for_all_user_search_field(String string) {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user select the country code {string} in create user page for all user search field")
	public void verify_that_user_select_the_country_code_uae_in_create_user_page_for_all_user_search_field(String uaes) {
		sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
	    sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
	    String uae=sacreate.super_admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
	    Assert.assertEquals(uae, uaes);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user enter the mobile number as {string} in create user page for all user search field")
	public void verify_that_user_enter_the_mobile_number_as_in_create_user_page_for_all_user_search_field(String string) {
	    sacreate.super_admin_logger_create_user_mobile_number_user_field_send_text(string);
	    String act =sacreate.super_admin_logger_create_user_entered_mobile_number_text();
	    Assert.assertEquals(act, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user enter date of birth as {string} in the create user page for all user search field")
	public void verify_that_user_enter_date_of_birth_as_in_the_create_user_page_for_all_user_search_field(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String value = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that user send the profile image as jpg in create user page for all user search field")
	public void verify_that_user_send_the_profile_image_as_jpg_in_create_user_page_for_all_user_search_field() {
	    boolean ac=sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
	    Assert.assertEquals(ac, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user select the gender as male from the radio button in create user page for all user search field")
	public void verify_that_user_select_the_gender_as_male_from_the_radio_button_in_create_user_page_for_all_user_search_field() {
	    sacreate.super_admin_logger_create_users_page_gender_male_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user enter password as {string} in the create user page for all user search field")
	public void verify_that_user_enter_password_as_in_the_create_user_page_for_all_user_search_field(String string) {
	    sacreate.super_admin_logger_create_user_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user enter comfirmed password as same as {string} in the create user page for all user search field")
	public void verify_that_user_enter_comfirmed_password_as_same_as_in_the_create_user_page_for_all_user_search_field(String string) {
		sacreate.super_admin_logger_create_user_comfirm_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_comfirm_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user select the assigned role as {string} in the create user page super admin for all user search field")
	public void verify_that_user_select_the_assigned_role_as_super_admin_in_the_create_user_page_super_admin_for_all_user_search_field(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user select the assigned role as {string} in the create user page admin for all user search field")
	public void verify_that_user_select_the_assigned_role_as_super_admin_in_the_create_user_page_admin_for_all_user_search_field(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that the user submit the button should create a new user in the all users page for all user search field")
	public void verify_that_the_user_submit_the_button_should_create_a_new_user_in_the_all_users_page_for_all_user_search_field() {
		sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		boolean actual=saalluser.super_admin_user_all_users_search_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	@Then("Verify that super_admin should be able to delete the user from the all users page for all user search field")
	public void verify_that_super_admin_should_be_able_to_delete_the_user_from_the_all_users_page_for_all_user_search_field() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_delete_is_click();
	    sadelete.super_admin_users_all_users_actions_option_yes_delete_it_pop_up_is_click();
	    boolean actual = sadelete.super_admin_users_all_users_actions_option_delete_successfully_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
}
