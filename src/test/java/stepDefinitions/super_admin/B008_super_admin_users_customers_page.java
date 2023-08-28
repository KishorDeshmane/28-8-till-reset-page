package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Users_customers_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B008_super_admin_users_customers_page {

	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Users_customers_page_objects sacust =new Users_customers_page_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B008_super_admin_users_customers_page.class);

	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Given("Verify that super admin user is on the customers user page as expected page title {string}")
	public void verify_that_super_admin_user_is_on_the_customerss_user_page_as_expected_page_title(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_users_button();
		samain.super_admin_logger_mouser_users_customers_users_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	

//	
//	@Given("Verify that admin user is on the users customers user page as expected page title {string}")
//	public void verify_that_admin_user_is_on_the_users_customerss_user_page_as_expected_page_title(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_super_admin_page();
//		adlogin.super_admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.super_admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.super_admin_sign_in_button_is_clicked();
//		admain.super_admin_logger_mouser_hover_on_users_button();
//		admain.super_admin_logger_mouser_users_customers_users_is_clicked();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
	
	
	@Then("Verify that super admin user customers header text should be displayed in customers page")
	public void verify_that_super_admin_user_customers_header_text_should_be_displayed_in_customerss_page() {
	    boolean actual = sacust.super_admin_user_customers_page_customers_header_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrumb should be displayed in the super admin customers page")
	public void verify_that_breadcrumb_should_be_displayed_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_customers_breadcrumb_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb dashboard button should be displayed in super admin customers page")
	public void verify_that_breadcrumb_dashboard_button_should_be_displayed_in_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_customers_breadcrumb_dashboard_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb dashboard button should be clickable in super admin customers page")
	public void verify_that_breadcrumb_dashboard_button_should_be_clickable_in_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_customers_breadcrumb_dashboard_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb dashboard button should be able to mouse hover in super admin customers page")
	public void verify_that_breadcrumb_dashboard_button_should_be_able_to_mouse_hover_in_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_customers_breadcrumb_dashboard_button_is_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb customers button should be displayed in the super admin customers page")
	public void verify_that_breadcrumb_customers_button_should_be_displayed_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_customers_breadcrumb_customers_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search user field should be displayed in the super admin customers page")
	public void verify_that_search_user_field_should_be_displayed_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_search_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search user field should be clickable in the super admin customers page")
	public void verify_that_search_user_field_should_be_clickable_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_search_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search user field place holder value should be {string} in super admin customers page")
	public void verify_that_search_user_field_place_holder_value_should_be_in_super_admin_customers_page(String string) {
		String actual = sacust.super_admin_user_customers_page_search_user_field_place_holder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search button should be displayed in the super admin customers page")
	public void verify_that_search_button_should_be_displayed_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_search_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search button should be clickable in the super admin customers page")
	public void verify_that_search_button_should_be_clickable_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_search_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that search button should be able to mouse hover in the super admin customers page")
	public void verify_that_search_button_should_be_able_to_mouse_hover_in_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_search_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_list_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column name should be displayed from the super admin customers page")
	public void verify_that_thread_column_name_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_name_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column email should be displayed from the super admin customers page")
	public void verify_that_thread_column_email_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_email_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column mobile number should be displayed from the super admin customers page")
	public void verify_that_thread_column_mobile_number_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_mobile_number_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column type should be displayed from the super admin customers page")
	public void verify_that_thread_column_type_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_type_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column status should be displayed from the super admin customers page")
	public void verify_that_thread_column_status_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_status_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list action should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_action_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list name up-down arrow should be clickable from the super admin customers page")
	public void verify_that_thread_column_list_name_up_down_arrow_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_name_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list email up-down arrows should be clickable from the super admin customers page")
	public void verify_that_thread_column_list_email_up_down_arrows_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_email_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list mobile number up-down arrows should be clickable from the super admin customers page")
	public void verify_that_thread_column_list_mobile_number_up_down_arrows_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_mobile_number_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list type up-down arrows should be clickable from the super admin customers page")
	public void verify_that_thread_column_list_type_up_down_arrows_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_type_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list status up-down arrow should be clickable from the super admin customers page")
	public void verify_that_thread_column_list_status_up_down_arrow_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_status_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list name up-down arrow should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_name_up_down_arrow_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_name_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list email up-down arrows should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_email_up_down_arrows_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_email_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list mobile number up-down arrows should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_mobile_number_up_down_arrows_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_mobile_number_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list type up-down arrows should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_type_up_down_arrows_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_type_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that thread column list status up-down arrow should be displayed from the super admin customers page")
	public void verify_that_thread_column_list_status_up_down_arrow_should_be_displayed_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_status_up_down_arrow_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions options 3 dots should be displayed from the super admin customers page")
	public void verify_that_actions_options_dots_should_be_displayed_from_the_super_admin_customers_page() {
		sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_click();
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions options 3 dots should be clickable from the super admin customers page")
	public void verify_that_actions_options_dots_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions options {int} dots should be able to mouse hover from the super admin customers page")
	public void verify_that_actions_options_dots_should_be_able_to_mouse_hover_from_the_super_admin_customers_page(Integer int1) {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option edit should be clickable from the super admin customers page")
	public void verify_that_actions_option_edit_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_edit_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option change status should be clickable from the super admin customers page")
	public void verify_that_actions_option_change_status_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_change_status_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option delete should be clickable from the super admin customers page")
	public void verify_that_actions_option_delete_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_delete_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option resend email verification link should be clickable from the super admin customers page")
	public void verify_that_actions_option_resend_email_verification_link_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_resend_email_verification_link_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions option change password should be clickable from the super admin customers page")
	public void verify_that_actions_option_change_password_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_change_password_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that actions manage roles and permissions should be clickable from the super admin customers page")
	public void verify_that_actions_manage_roles_and_permissions_should_be_clickable_from_the_super_admin_customers_page() {
		boolean actual = sacust.super_admin_user_customers_page_thread_column_actions_options_3_dots_manage_roles_and_permissions_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
	
}
