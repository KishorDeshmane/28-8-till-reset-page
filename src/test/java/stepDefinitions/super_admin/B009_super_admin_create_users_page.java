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

public class B009_super_admin_create_users_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Users_all_users_page_objects saalluser = new Users_all_users_page_objects(DriverFactory.getDriver());
	private Users_create_users_page_objects sacreate=new Users_create_users_page_objects(DriverFactory.getDriver());
	private Users_delete_pop_up_objects sadelete= new Users_delete_pop_up_objects(DriverFactory.getDriver());
	private Users_change_status_pop_up_objects sastatus= new Users_change_status_pop_up_objects(DriverFactory.getDriver());

	Logger logger = LogManager.getLogger(B009_super_admin_create_users_page.class);

	
	
	/*
	 * 
	 * 
	 * SCR 01
	
	 * 
	 */
	
	
	
	@Given("Verify that user is on the super_admin dashboard users all users create user page as expected page title {string}")
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
	
//	@Given("Verify that user is on the admin dashboard users all users create user page as expected page title {string}")
//	public void verify_that_user_is_on_the_admin_dashboard_users_all_users_create_user_page_as_expected_page_title(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_super_admin_page();
//		adlogin.super_admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.super_admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.super_admin_sign_in_button_is_clicked();
//		samain.super_admin_logger_mouser_hover_on_users_button();
//		samain.super_admin_logger_mouser_users_all_users_is_clicked();
//		saalluser.super_admin_user_all_users_create_user_button_is_click();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
	
	@Then("Verify that create users page header text should be displayed in the super admin create users page")
	public void verify_that_create_users_page_header_text_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
	    boolean actual=sacreate.super_admin_logger_create_users_page_create_users_page_header_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum should be displayed in the super admin create users page")
	public void verify_that_breadcrum_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_breadcrum_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum all users should be displayed in the super admin create users page")
	public void verify_that_breadcrum_all_users_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_breadcrum_all_users_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum all users should be clickable in the super admin create users page")
	public void verify_that_breadcrum_all_users_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_breadcrum_all_users_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrum create users text should be displayed in the super admin create users page")
	public void verify_that_breadcrum_create_users_text_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_breadcrum_create_users_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that card body personnel information header should be displayed in the super admin create users page")
	public void verify_that_card_body_personnel_information_header_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_card_body_personnel_information_header_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name text above users field should be displayed in the super admin create users page")
	public void verify_that_first_name_text_above_users_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_first_name_text_above_users_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_first_name_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_first_name_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name users field should be clickable in the super admin create users page")
	public void verify_that_first_name_users_field_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_first_name_users_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name users field placeholder value should be  {string} in the super admin create users page")
	public void verify_that_first_name_users_field_placeholder_value_should_be_in_the_super_admin_dashboard_users_all_users_create_users_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_first_name_users_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name text above users field should be displayed in the super admin create users page")
	public void verify_that_last_name_text_above_users_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_last_name_text_above_users_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_last_name_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_last_name_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name users field should be clickable in the super admin create users page")
	public void verify_that_last_name_users_field_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_last_name_users_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name users field placeholder value should be  {string} in the super admin create users page")
	public void verify_that_last_name_users_field_placeholder_value_should_be_in_the_super_admin_dashboard_users_all_users_create_users_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_last_name_users_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email text above users field should be displayed in the super admin create users page")
	public void verify_that_email_text_above_users_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_email_text_above_users_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_email_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_email_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email users field should be clickable in the super admin create users page")
	public void verify_that_email_users_field_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_email_users_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email users field placeholder value should be  {string} in the super admin create users page")
	public void verify_that_email_users_field_placeholder_value_should_be_in_the_super_admin_dashboard_users_all_users_create_users_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_email_users_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number text above the users field should be displayed in the super admin create users page")
	public void verify_that_mobile_number_text_above_the_users_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_mobile_number_text_above_the_users_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_mobile_number_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_mobile_number_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number country code dropdown should be displayed in the super admin create users page")
	public void verify_that_mobile_number_country_code_dropdown_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number country code dropdown list should be clickable in the super admin create users page")
	public void verify_that_mobile_number_country_code_dropdown_list_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_list_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number users field should be clickable in the super admin create users page")
	public void verify_that_mobile_number_users_field_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_mobile_number_users_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number users field place holder value should be {string} in the super admin create users page")
	public void verify_that_mobile_number_users_field_place_holder_value_should_be_in_the_super_admin_dashboard_users_all_users_create_users(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_mobile_number_users_field_place_holder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth title text above the user field should be displayed in the super admin create users page")
	public void verify_that_date_of_birth_title_text_above_the_user_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_title_text_above_the_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth user field should be displayed in the super_admin dashboard all users create users page")
	public void verify_that_date_of_birth_user_field_should_be_displayed_in_the_super_admin_dashboard_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth user field should be clickable in the super_admin dashbaord all users create users page")
	public void verify_that_date_of_birth_user_field_should_be_clickable_in_the_super_admin_dashbaord_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth placeholder value should be  {string} in super admin create users page")
	public void verify_that_date_of_birth_placeholder_value_should_be_in_super_admin_dashboard_all_users_create_users_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_date_of_birth_user_field_placeholder_value_is();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth left arrow should be clickable in super admin create users page")
	public void verify_that_date_of_birth_left_arrow_should_be_clickable_in_super_admin_dashboard_all_users_create_users_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_user_field_is_click();
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_left_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth right arrow should be clickable in super admin create users page")
	public void verify_that_date_of_birth_right_arrow_should_be_clickable_in_super_admin_dashbaord_all_users_create_users_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_left_arrow_is_click();
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_right_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth month down arrow should be clickable in super admin create users page")
	public void verify_that_date_of_birth_month_down_arrow_should_be_clickable_in_super_admin_dashboard_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_month_down_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth month should be clickable in the super admin create users page")
	public void verify_that_date_of_birth_month_should_be_clickable_in_the_super_admin_dashboard_all_users_create_users_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_month_down_arrow_is_click();
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_months_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth year down arrow should be clickable in super admin create users page")
	public void verify_that_date_of_birth_year_down_arrow_should_be_clickable_in_super_admin_dashbaord_all_users_create_users_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_user_field_is_click();
		sacreate.super_admin_logger_create_users_page_date_of_birth_year_first_down_arrow_is_click();
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_year_down_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that date of birth years should be clickable in super admin create users page")
	public void verify_that_date_of_birth_years_should_be_clickable_in_super_admin_dashboard_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_date_of_birth_years_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that profile image title text should be displayed in the super admin create users page")
	public void verify_that_profile_image_title_text_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_profile_image_title_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that profile image user field should be displayed in the super admin create users page")
	public void verify_that_profile_image_user_field_should_be_displayed_in_the_super_admin_dashboard_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_profile_image_user_field_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that profile image user field should be clickable in the super admin create users page")
	public void verify_that_profile_image_user_field_should_be_clickable_in_the_super_admin_dashboard_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_profile_image_user_field_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender text above the radio button should be displayed in the super admin create users page")
	public void verify_that_gender_text_above_the_radio_button_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_text_above_the_radio_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that gender male radio button should be clickable in the super admin create users page")
	public void verify_that_gender_male_radio_button_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_male_radio_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender male radio button should be displayed in the super admin create users page")
	public void verify_that_gender_male_radio_button_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_male_radio_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender male text should be displayed in the super admin create users page")
	public void verify_that_gender_male_text_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_male_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender female radio button should be clickable in the super admin create users page")
	public void verify_that_gender_female_radio_button_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_female_radio_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender female radio button should be displayed in the super admin create users page")
	public void verify_that_gender_female_radio_button_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_female_radio_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender female text should be displayed in the super admin create users page")
	public void verify_that_gender_female_text_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_female_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender others radio button should be clickable in the super admin create users page")
	public void verify_that_gender_others_radio_button_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_others_radio_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender others radio button should be displayed in the super admin create users page")
	public void verify_that_gender_others_radio_button_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_others_radio_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that gender others text should be displayed in the super admin create users page")
	public void verify_that_gender_others_text_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_gender_others_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	@Then("Verify that card body credential information header should be displayed in the super admin create users page")
	public void verify_that_card_body_credential_information_header_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_card_body_credential_information_header_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password text above the user field should be displayed in the super admin create users page")
	public void verify_that_password_text_above_the_user_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_password_text_above_the_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_password_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_password_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password user field should be clickable in the super admin create users page")
	public void verify_that_password_user_field_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_password_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password userfield placeholder value should be {string} in the super admin create users page")
	public void verify_that_password_userfield_placeholder_value_should_be_in_the_super_admin_dashboard_users_all_users_create_users_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_password_userfield_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password text above userfield should be displayed in the super admin create users page")
	public void verify_that_comfirm_password_text_above_userfield_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_comfirm_password_text_above_userfield_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_comfirm_password_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_comfirm_password_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password userfield should be clickable in the super admin create users page")
	public void verify_that_comfirm_password_userfield_should_be_clickable_in_the_super_admin_dashboard_usres_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_comfirm_password_userfield_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password userfield place holder value should be  {string} in the super admin create users page")
	public void verify_that_comfirm_password_userfield_place_holder_value_should_be_in_the_super_admin_dashboard_users_all_users_create_users_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_comfirm_password_userfield_place_holder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that card body role information header should be displayed in the super admin create users page")
	public void verify_that_card_body_role_information_header_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_card_body_role_information_header_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that assigned roles text above user field should be displayed in the super admin create users page")
	public void verify_that_assigned_roles_text_above_user_field_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_assigned_roles_text_above_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that assigned roles asterrisk symbol should be displayed in the super admin create users page")
	public void verify_that_assigned_roles_asterrisk_symbol_should_be_displayed_in_the_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_assigned_roles_asterrisk_symbol_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that assigned roles user field should be clickable in the super admin create users page")
	public void verify_that_assigned_roles_user_field_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_assigned_roles_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that assigned roles drop down should be clickable in the super admin create users page")
	public void verify_that_assigned_roles_drop_down_should_be_clickable_in_the_super_admin_dashboard_users_all_user_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that assigned roles dropdown place holder value should be {string} in the super admin create users page")
	public void Verify_that_assigned_roles_dropdown_place_holder_value_should_be_something_in_the_super_admin_dashboard_users_all_users_create_user_page(String string) {
		String actual=sacreate.super_admin_logger_create_users_page_assigned_roles_dropdown_place_holder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	  
	@Then("Verify that assigned roles drop down admin should be clickable in the super admin create users page")
	public void verify_that_assigned_roles_drop_down_admin_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that assigned roles drop down super admin should be clickable in the super admin create users page")
	public void verify_that_assigned_roles_drop_down_super_admin_should_be_clickable_in_the_super_admin_dashboard_users_all_users_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be displayed in super admin create users page")
	public void verify_that_submit_button_should_be_displayed_in_super_admin_dashboard_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_submit_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be clickable in super admin create users page")
	public void verify_that_submit_button_should_be_clickable_in_super_admin_dashbaord_users_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_submit_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be able to mouser hover in super admin create users page")
	public void verify_that_submit_button_should_be_able_to_mouser_hover_in_super_admin_dashboard_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_submit_button_is_able_to_mouser_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that cancel button should be displayed in the super admin create users page")
	public void verify_that_cancel_button_should_be_displayed_in_the_super_admin_dashboard_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_cancel_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that cancel button should be clickable in the super admin create users page")
	public void verify_that_cancel_button_should_be_clickable_in_the_super_admin_dashboard_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_cancel_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that cancel button should be able to mouse hover in super admin create users page")
	public void verify_that_cancel_button_should_be_able_to_mouse_hover_in_super_admin_all_users_create_users_page() {
		boolean actual=sacreate.super_admin_logger_create_users_page_cancel_button_is_able_to_mouse_hover();
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
	 */
	
	@Then("Verify that all users breadcrumb button should navigated to the all users page from the create users page for super_admin user")
	public void verify_that_all_users_breadcrumb_button_should_navigated_to_the_all_users_page_from_the_create_users_page() {
	    sacreate.super_admin_logger_create_users_page_breadcrum_all_users_is_click();
	    boolean actual = saalluser.super_admin_user_all_users_search_button_is_clickable();
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
	 * 
	 * 
	 * 
	 */

	
	@Then("Verify that super_admin enter the first name as {string} in create user page")
	public void verify_that_super_admin_enter_the_first_name_as_in_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_first_name_user_field_send_text(string);
		String value= sacreate.super_admin_logger_create_user_entered_first_name_text();
		Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter the last name as  {string} in create user page")
	public void verify_that_super_admin_enter_the_last_name_as_in_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_last_name_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_last_name_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter the email as {string} in create user page")
	public void verify_that_super_admin_enter_the_email_as_in_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(string);
	    String value=sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that super_admin select the country code {string} in create user page")
	public void verify_that_super_admin_select_the_country_code_uae_in_create_user_page(String uaes) {
		sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
	    sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
	    String uae=sacreate.super_admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
	    Assert.assertEquals(uae, uaes);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	

	
	
	
	
	
	@Then("Verify that super_admin enter the mobile number as {string} in create user page")
	public void verify_that_super_admin_enter_the_mobile_number_as_in_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_mobile_number_user_field_send_text(string);
	    String act =sacreate.super_admin_logger_create_user_entered_mobile_number_text();
	    Assert.assertEquals(act, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter date of birth as {string} in the create user page")
	public void verify_that_super_admin_enter_date_of_birth_as_in_the_create_user_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String value = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(value, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin send the profile image as jpg in create user page")
	public void verify_that_super_admin_send_the_profile_image_as_jpg_in_create_user_page() {
	    boolean ac=sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
	    Assert.assertEquals(ac, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin select the gender as male from the radio button in create user page")
	public void verify_that_super_admin_select_the_gender_as_male_from_the_radio_button_in_create_user_page() {
	    sacreate.super_admin_logger_create_users_page_gender_male_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter password as {string} in the create user page")
	public void verify_that_super_admin_enter_password_as_in_the_create_user_page(String string) {
	    sacreate.super_admin_logger_create_user_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin enter comfirmed password as same as {string} in the create user page")
	public void verify_that_super_admin_enter_comfirmed_password_as_same_as_in_the_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_comfirm_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_comfirm_password_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin select the assigned role as {string} in the create user page super admin")
	public void verify_that_super_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_super_admin(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that super_admin select the assigned role as {string} in the create user page admin")
	public void verify_that_super_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_admin(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual =sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the super_admin submit the button should create a new user in the all users page")
	public void verify_that_the_super_admin_submit_the_button_should_create_a_new_user_in_the_all_users_page() {
		sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		boolean actual=saalluser.super_admin_user_all_users_search_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search button is able to search the user with {string} name of user in all users page for create user page")
	public void verify_that_super_admin_search_button_is_able_to_search_the_user_with_name_of_user_in_all_users_page(String string) {
	    saalluser.super_admin_user_all_users_search_userfield_sendText(string);
	    saalluser.super_admin_user_all_users_search_button_is_click();
	    boolean actual = saalluser.super_admin_user_all_users_column_list_expected_user_name_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should be able change the status of the user in all user page")
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
	
	@Then("Verify that super_admin should be able to delete the user from the all users page")
	public void verify_that_super_admin_should_be_able_to_delete_the_user_from_the_all_users_page() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_delete_is_click();
	    sadelete.super_admin_users_all_users_actions_option_yes_delete_it_pop_up_is_click();
	    boolean actual = sadelete.super_admin_users_all_users_actions_option_delete_successfully_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin search email should not give any content into the table from all users page")
	public void verify_that_super_admin_search_email_should_not_give_any_content_into_the_table_from_all_users_page() {
	    saalluser.super_admin_user_all_users_search_button_is_click();
		boolean actual = saalluser.super_admin_users_all_users_search_not_found_is_displayed();
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
	 */
	
	@When("super_admin enter first name {string} and click on submit button from create user page")
	public void super_admin_enter_first_name_and_click_on_submit_button_from_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_first_name_user_field_send_text(string);
		String actual = sacreate.super_admin_logger_create_user_entered_first_name_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the first name user field from create user page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_first_name_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_first_name_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the first name user field from create user page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_first_name_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_first_name_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
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
	 * last name
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
	
	
	@When("super_admin enter last name {string} and click on submit button from create user page")
	public void super_admin_enter_last_name_and_click_on_submit_button_from_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_last_name_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_last_name_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the last name user field from create user page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_last_name_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_last_name_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the last name user field from create user page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_last_name_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_last_name_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
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
	 * Email
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

	@When("super_admin enter email {string} and click on submit button from create user page")
	public void super_admin_enter_email_and_click_on_submit_button_from_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the email user field from create user page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_email_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_email_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the email user field from create user page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_email_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_email_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@When("super_admin enter email with 255 characters and click on submit button from create user page")
	public void super_admin_enter_email_with_255_characters_and_click_on_submit_button_from_create_user_page() {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email with 200 characters and click on submit button from create user page")
	public void super_admin_enter_email_with_200_characters_and_click_on_submit_button_from_create_user_page() {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_200_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_200_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email with 100 characters and click on submit button from create user page")
	public void super_admin_enter_email_with_100_characters_and_click_on_submit_button_from_create_user_page() {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_100_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_100_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email with 50 characters and click on submit button from create user page")
	public void super_admin_enter_email_with_50_characters_and_click_on_submit_button_from_create_user_page() {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_50_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_50_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email more than 255 character and click on submit button from create user page")
	public void super_admin_enter_email_more_than_255_character_and_click_on_submit_button_from_create_user_page() {
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_plus_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_plus_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
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
	 * Mobile number
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
	
	
	@Then("Verify that mobile number select option dropdown place hover value shuld be {string} in super_admin dashboard users all users create user page")
	public void verify_that_mobile_number_select_option_dropdown_place_hover_value_shuld_be_in_super_admin_dashboard_users_all_users_create_user_page(String string) {
	    sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
	    String actual=sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_selected_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	    
	
	@Then("Verify that mobile number drop down uae option is selected in the super_admin dashboard users all users create user page {string}")
	public void verify_that_mobile_number_drop_down_uae_option_is_selected_in_the_super_admin_dashboard_users_all_users_create_user_page(String str) {
	    sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
	    String actual=sacreate.super_admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
	    Assert.assertEquals(actual, str);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@When("super_admin enter mobile number {string} and click on submit button from create user page")
	public void super_admin_enter_mobile_number_and_click_on_submit_button_from_create_user_page(String string) {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
		sacreate.super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
		sacreate.super_admin_logger_create_user_mobile_number_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_mobile_number_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the mobile number user field from create user page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_mobile_number_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_mobile_number_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the mobile number user field from create user page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_mobile_number_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_mobile_number_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * date of birth 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

	
	@Then("Verify that super_admin is able to click in the date of birth then calender should be displayed create users page")
	public void verify_that_super_admin_is_able_to_click_in_the_date_of_birth_then_calender_should_be_displayed_create_users_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_click();
		boolean actual= sacreate.super_admin_logger_create_users_page_date_of_birth_calender_is_displayed();
		Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin is select the 2005 year in the calender dob user field in create user field page")
	public void verify_that_super_admin_is_select_the_year_in_the_calender_dob_user_field_in_create_user_field_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_year_down_arrow_is_clicked();
		boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_year_2005_displayed();
		Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin is select the date as 15 from the calender dob user field in create user page")
	public void verify_that_super_admin_is_select_the_date_as_from_the_calender_dob_user_field_in_create_user_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_date_15_clickable();
		sacreate.super_admin_logger_create_users_page_date_of_birth_calender_select_date_15();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin is select the date of month is december in the calender dob user field in create user page")
	public void verify_that_super_admin_is_select_the_date_of_month_is_december_in_the_calender_dob_user_field_in_create_user_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_calender_select_month_december();
		boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_calender_select_month_december_is_dispalyed();
		Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin entered value in the dob user field should {string} in the create user field page")
	public void verify_that_super_admin_value_enter_in_the_dob_user_field_is_in_the_create_user_field_page(String string) {
	    String actual = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	
	@Then("Verify that super_admin bate of birth userfield send the valid date {string} in the super_admin users all users create users page")
	public void verify_that_super_admin_bate_of_birth_userfield_send_the_valid_date_in_the_super_admin_users_all_users_create_users_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String actual = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin bate of birth userfield send the invalid date {string} in the super_admin users all users create users page")
	public void verify_that_super_admin_bate_of_birth_userfield_send_the_invalid_date_in_the_super_admin_users_all_users_create_users_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String actual = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertNotEquals(actual, string);
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
	 * Profile image uploaded
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
	
	@Then("Verify that the image should be uploaded in the super_admin users all users create users page")
	public void verify_that_the_image_should_be_uploaded_in_the_super_admin_users_all_users_create_users_page() {
	    boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the jpeg image should be uploaded in the super_admin users all users create users page")
	public void verify_that_the_jpeg_image_should_be_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpeg"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the png image should be uploaded in the super_admin users all users create users page")
	public void verify_that_the_png_image_should_be_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_png"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the jpg image should be uploaded in the super_admin users all users create users page")
	public void verify_that_the_jpg_image_should_be_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	@Then("Verify that the pdf file should be not uploaded in the super_admin users all users create users page")
	public void verify_that_the_pdf_file_should_be_not_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_pdf"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the logs file should be not uploaded in the super_admin users all users create users page")
	public void verify_that_the_logs_file_should_be_not_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_log"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the html file should be not uploaded in the super_admin users all users create users page")
	public void verify_that_the_html_file_should_be_not_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_html"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that more than 1 mb jpeg image should be not uploaded in the super_admin users all users create users page")
	public void verify_that_more_than_1_mb_jpeg_image_should_be_not_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_jpeg"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that more than 1 mb png image should be not uploaded in the super_admin users all users create users page")
	public void verify_that_more_than_1_mb_png_image_should_be_not_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_png"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that more than 1 mb jpg image should be not uploaded in the super_admin users all users create users page")
	public void verify_that_more_than_1_mb_jpg_image_should_be_not_uploaded_in_the_super_admin_users_all_users_create_users_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_jpg"));
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
	 * Radio button gender
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
	
	@Then("Verify that the gender header text of the radio button should be displayed in the super_admin users all users create user page")
	public void verify_that_the_gender_header_text_of_the_radio_button_should_be_displayed_in_the_super_admin_users_all_users_create_user_page() {
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_header_text_of_the_radio_button_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender male text should be displayed in the super_admin users all users create users page")
	public void verify_that_the_gender_male_text_should_be_displayed_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender female text should be displayed in the super_admin users all users create users page")
	public void verify_that_the_gender_female_text_should_be_displayed_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender others text should be displayed in the super_admin users all users create users page")
	public void verify_that_the_gender_others_text_should_be_displayed_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender male button should be clickable in the super_admin users all users create users page")
	public void verify_that_the_gender_male_button_should_be_clickable_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender female button should be clickable in the super_admin users all users create users page")
	public void verify_that_the_gender_female_button_should_be_clickable_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender others button should be clickable in the super_admin users all users create users page")
	public void verify_that_the_gender_others_button_should_be_clickable_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is click on the male button then check the male radio button is selected in the super_admin users all users create user page")
	public void user_is_click_on_the_male_button_then_check_the_male_radio_button_is_selected_in_the_super_admin_users_all_users_create_user_page() {
	    sacreate.super_admin_logger_create_users_page_gender_male_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is click on the female button then check the female radio button is selected in the super_admin users all users page")
	public void user_is_click_on_the_female_button_then_check_the_female_radio_button_is_selected_in_the_super_admin_users_all_users_page() {
		sacreate.super_admin_logger_create_users_page_gender_female_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_button_is_selected();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is click on the other radio button then check the others radio button is selected in the super_admin user all users page")
	public void user_is_click_on_the_other_radio_button_then_check_the_others_radio_button_is_selected_in_the_super_admin_user_all_users_page() {
		sacreate.super_admin_logger_create_users_page_gender_others_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_button_is_selected();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the male radio button is not selected that time in the super_admin users all users create users page")
	public void verify_that_the_male_radio_button_is_not_selected_that_time_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, false);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the female radio button is not selected that time in the super_admin users all users create users page")
	public void verify_that_the_female_radio_button_is_not_selected_that_time_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_button_is_selected();
	    Assert.assertEquals(actual, false);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the others radio button is not selected that time in the super_admin users all users create users page")
	public void verify_that_the_others_radio_button_is_not_selected_that_time_in_the_super_admin_users_all_users_create_users_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_button_is_selected();
	    Assert.assertEquals(actual, false);
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
	 * password
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
	

	
	@Then("Verify that super_admin should not get any red tick and note below the password user field from create user page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_password_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_password_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@When("super_admin enter password {string} and click on submit button from create user page")
	public void super_admin_enter_password_and_click_on_submit_button_from_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_password_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin should get the red tick and note below the password user field from create user page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_password_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_password_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * comfirm password
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
	
	
	@When("super_admin is enter the password as {string} from create user page")
	public void super_admin_is_enter_the_password_as_from_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_password_text();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin is enter the comfirm password as {string} and click on submit button from create user page")
	public void super_admin_is_enter_the_comfirm_password_as_and_click_on_submit_button_from_create_user_page(String string) {
		sacreate.super_admin_logger_create_user_comfirm_password_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_comfirm_password_text();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
	}
	
	@Then("Verify that super_admin should not get any red tick and note below the comfirm password user field from create user page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_comfirm_password_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_comfirm_password_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get any red tick and note below the comfirm password user field from create user page")
	public void verify_that_super_admin_should_get_any_red_tick_and_note_below_the_comfirm_password_user_field_from_create_user_page() {
		boolean actual=sacreate.super_admin_logger_create_user_comfirm_password_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Assigned roles
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
	
	
	@Then("Verify that assigned roles information dropdown value should be selected Admin {string} in super_admin dashboard users all users create users page")
	public void verify_that_the_assigned_roles_information_dropdown_value_should_be_selected_as_admin_in_super_admin_dashboard_users_all_users_create_users_page(String string) {
	    sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual=sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}	
	
	@Then("Verify that assigned roles information dropdown value should be selected Super Admin {string} in super_admin dashboard users all users create users page")
	public void verify_that_the_assigned_roles_information_dropdown_value_should_be_selected_as_super_admin_in_super_admin_dashboard_users_all_users_create_users_page(String string) {
		sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
	    String actual=sacreate.super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	
}
