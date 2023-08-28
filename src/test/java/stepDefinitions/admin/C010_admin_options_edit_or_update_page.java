//package stepDefinitions.admin;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//
//import com.applicationHooks.AppHooks;
//import com.pages.Landing_page_objects;
//import com.pages.admin.C001_admin_log_in_page_objects;
//import com.pages.admin.C002_admin_dashboard_main_page_objects;
//import com.pages.admin.C006_admin_all_users_page_objects;
//import com.pages.admin.C009_admin_create_users_page_objects;
//import com.pages.admin.C010_admin_options_edit_or_update_page_objects;
//import com.qa.factory.DriverFactory;
//import com.qa.utility.ElementUtil;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class C010_admin_options_edit_or_update_page {
//
//	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
//	private C001_admin_log_in_page_objects adlogin = new C001_admin_log_in_page_objects(DriverFactory.getDriver());
//	private C002_admin_dashboard_main_page_objects admain = new C002_admin_dashboard_main_page_objects(DriverFactory.getDriver());
//	private C006_admin_all_users_page_objects adalluser = new C006_admin_all_users_page_objects(DriverFactory.getDriver());
//	private C010_admin_options_edit_or_update_page_objects adedit= new C010_admin_options_edit_or_update_page_objects(DriverFactory.getDriver());
//	private C009_admin_create_users_page_objects adcreate = new C009_admin_create_users_page_objects(DriverFactory.getDriver());
//	
//	Logger logger = LogManager.getLogger(C010_admin_options_edit_or_update_page.class);
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * SCR
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	
//	
//	@Given("Verify that admin user is on the users all users actions options edit page as expected page title {string}")
//	public void verify_that_admin_user_is_on_the_users_all_users_actions_options_edit_page_as_expected_page_title(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		admain.admin_logger_mouser_hover_on_users_button();
//		admain.admin_logger_mouser_users_all_users_is_clicked();
//		adalluser.admin_user_all_users_search_userfield_sendText(AppHooks.prop.getProperty("admin_email"));
//	    adalluser.admin_user_all_users_search_button_is_click();
//		adalluser.admin_users_all_users_actions_options_3_dots_is_click();
//		adalluser.admin_users_all_users_actions_option_edit_is_click();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that the user is on the update user page in the admin dashboard all users actions edit button")
//	public void verify_that_the_user_is_on_the_update_user_page_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_page_header_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that the breadcrum is displayed in the admin dashboard all users action edit button")
//	public void verify_that_the_breadcrum_is_displayed_in_the_admin_dashboard_all_users_action_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_breadcrum_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that the breadcrum all users is displayed in the admin dashboard all users action edit button")
//	public void verify_that_the_breadcrum_all_users_is_displayed_in_the_admin_dashboard_all_users_action_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_breadcrum_all_user_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the breadcrum all users is clickable in the admin dashboard all users action edit button")
//	public void verify_that_the_breadcrum_all_users_is_clickable_in_the_admin_dashboard_all_users_action_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_breadcrum_all_user_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the breadcrum update user text is displayed in the admin dashbaord all users action edit button")
//	public void verify_that_the_breadcrum_update_user_text_is_displayed_in_the_admin_dashbaord_all_users_action_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_breadcrum_update_user_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that the card body personnel information header should be displayed in the admin all users actions edit button")
//	public void verify_that_the_card_body_personnel_information_header_should_be_displayed_in_the_admin_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_card_body_personnel_information_header_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that first name text above users field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_first_name_text_above_users_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_first_name_text_above_users_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that first name users field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_first_name_users_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_first_name_users_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that first name users field placeholder value should be  {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_first_name_users_field_placeholder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_first_name_users_field_placeholder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that last name text above users field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_last_name_text_above_users_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_last_name_text_above_users_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that last name users field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_last_name_users_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_last_name_users_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that last name users field placeholder value should be  {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_last_name_users_field_placeholder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_last_name_users_field_placeholder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that email text above users field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_email_text_above_users_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_email_text_above_users_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that email users field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_email_users_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_email_users_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that email users field placeholder value should be  {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_email_users_field_placeholder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_email_users_field_placeholder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that mobile number text above the users field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_mobile_number_text_above_the_users_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_mobile_number_text_above_users_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that mobile number country code dropdown should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_mobile_number_country_code_dropdown_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_mobile_number_country_code_dropdown_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that mobile number country code dropdown list should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_mobile_number_country_code_dropdown_list_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_mobile_number_country_code_dropdown_list_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that mobile number users field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_mobile_number_users_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_mobile_number_users_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that mobile number users field place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_mobile_number_users_field_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_mobile_number_users_field_placeholder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	
//	@Then("Verify that date of birth text above the user field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_date_of_birth_text_above_the_user_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_date_of_birth_text_above_the_user_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the date of birth button should be clickable in the admin users all users actions edit button")
//	public void verify_that_the_date_of_birth_button_should_be_clickable_in_the_admin_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_date_of_birth_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that date of birth userfield should be displayed in the admin users all users actions edit button")
//	public void verify_that_date_of_birth_userfield_should_be_displayed_in_the_admin_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_date_of_birth_userfield_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that date of birth userfield should be clickable in the admin users all users actions edit button")
//	public void verify_that_date_of_birth_userfield_should_be_clickable_in_the_admin_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_date_of_birth_userfield_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that date of birth placeholder value should be {string} in the admin users all users action edit button")
//	public void verify_that_date_of_birth_placeholder_value_should_be_in_the_admin_users_all_users_action_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_date_of_birth_userfeld_placeholder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the profile image title text above the userfield should be displayed in the admin dashboard all users actions edit button")
//	public void verify_that_the_profile_image_title_text_above_the_userfield_should_be_displayed_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_profile_image_title_text_above_the_userfield_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the profile image userfield button should be displayed in the admin dashboard all users actions edit buttin")
//	public void verify_that_the_profile_image_userfield_button_should_be_displayed_in_the_admin_dashboard_all_users_actions_edit_buttin() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_profile_image_userfield_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the profile image userfield button should be clickable in the admin dashboard all users actions edit button")
//	public void verify_that_the_profile_image_userfield_button_should_be_clickable_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_profile_image_userfield_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the profile image userfield button placeholder value should be {string} in admin dashboard all users actions edit button")
//	public void verify_that_the_profile_image_userfield_button_placeholder_value_should_be_in_admin_dashboard_all_users_actions_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_profile_image_userfield_button_placeholder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender radio button title text is displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_the_gender_radio_button_title_text_is_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_radio_button_title_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender male button should be clickable in the admin dashboard all users actions edit button")
//	public void verify_that_the_gender_male_button_should_be_clickable_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_radio_male_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender male side text should be displayed in the admin dashboard all users actions edit buton")
//	public void verify_that_the_gender_male_side_text_should_be_displayed_in_the_admin_dashboard_all_users_actions_edit_buton() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_male_side_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender female button should be clickable in the admin dashboard all users actions edit button")
//	public void verify_that_the_gender_female_button_should_be_clickable_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_radio_female_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender female side text should be displayed in the admin dashboard all users actions edit button")
//	public void verify_that_the_gender_female_side_text_should_be_displayed_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_female_side_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender others button should be clickable in the admin dashbaord all users actions edit button")
//	public void verify_that_the_gender_others_button_should_be_clickable_in_the_admin_dashbaord_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_radio_others_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the gender others side text should be displayed in the admin dashboard all users actions edit button")
//	public void verify_that_the_gender_others_side_text_should_be_displayed_in_the_admin_dashboard_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_gender_others_side_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	
//	
//	@Then("Verify that card body role information header should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_card_body_role_information_header_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_card_body_role_information_header_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that assigned roles text above user field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_assigned_roles_text_above_user_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_text_above_user_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that assigned roles user field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_assigned_roles_user_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_user_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that assigned roles drop down should be clickable in the admin dashboard users all user actions edit button")
//	public void verify_that_assigned_roles_drop_down_should_be_clickable_in_the_admin_dashboard_users_all_user_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that assigned roles dropdown place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_assigned_roles_dropdown_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_dropdown_place_holder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that assigned roles drop down admin should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_assigned_roles_drop_down_admin_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_admin_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
////	@Then("Verify that assigned roles drop down customer should be clickable in the admin dashboard users all users actions edit button")
////	public void verify_that_assigned_roles_drop_down_customer_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
////		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_customer_is_clickable();
////		Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//	
////	@Then("Verify that assigned roles drop down guest should be clickable in the admin dashboard users all users actions edit button")
////	public void verify_that_assigned_roles_drop_down_guest_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
////		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_guest_is_clickable();
////		Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//	
////	@Then("Verify that assigned roles drop down partner admin should be clickable in the admin dashboard users all users actions edit button")
////	public void verify_that_assigned_roles_drop_down_partner_admin_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
////		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_partner_admin_is_clickable();
////		Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//	
////	@Then("Verify that assigned roles drop down partner executive should be clickable in the admin dashboard users all users actions edit button")
////	public void verify_that_assigned_roles_drop_down_partner_executive_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
////		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_partner_executive_is_clickable();
////		Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//	
//	@Then("Verify that assigned roles drop down super admin should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_assigned_roles_drop_down_super_admin_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_super_admin_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
////	@Then("Verify that assigned roles drop down technician should be clickable in the admin dashboard users all users actions edit button")
////	public void verify_that_assigned_roles_drop_down_technician_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
////		boolean actual = adedit.admin_logger_all_users_actions_option_update_user_assigned_roles_drop_down_technician_is_clickable();
////		Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
///*
// * 
// * 
// * address
// * 
// * 
// */
//
//
//
//
//	@Then("Verify that card body address information header should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_card_body_address_information_header_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_card_body_address_information_header_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	
//	
//
//	@Then("Verify that add new button should be displayed in the address information from admin dashboard users all users actions edit button")
//	public void verify_that_add_new_button_should_be_displayed_in_the_address_information_from_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_card_body_add_new_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that add new button should be clickable in the address information from admin dashbaord users all users actions edit button")
//	public void verify_that_add_new_button_should_be_clickable_in_the_address_information_from_admin_dashbaord_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_card_body_add_new_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that the remove button should be displayed in the address information from admin dashboard users all users actions edit button")
//	public void verify_that_the_remove_button_should_be_displayed_in_the_address_information_from_admin_dashboard_users_all_users_actions_edit_button() {
//		adedit.admin_logger_update_users_page_card_body_add_new_button_is_click();
//		boolean actual=adedit.admin_logger_update_users_page_card_body_remove_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	@Then("Verify that the remove button should be clickable in the address information from admin dashboard users all users actions edit button")
//	public void verify_that_the_remove_button_should_be_clickable_in_the_address_information_from_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_card_body_remove_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	
//	@Then("Verify that address line 1 text above the userfield should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_address_line_1_text_above_the_userfield_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_line_1_text_above_the_userfield_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address line 1 userfield should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_address_line_1_userfield_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_line_1_userfield_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address line 1 userfield place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_address_line_1_userfield_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual=adedit.admin_logger_update_users_page_address_line_1_userfield_place_holder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address line 2 text above the user field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_address_line_2_text_above_the_user_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_line_2_text_above_the_user_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address line 2 user field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_address_line_2_user_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_line_2_user_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address line 2 user field place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_address_line_2_user_field_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual=adedit.admin_logger_update_users_page_address_line_2_user_field_place_holder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that country text above the user field should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_country_text_above_the_user_field_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_country_text_above_the_user_field_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that country userfield should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_country_userfield_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_country_userfield_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that country dropdown uae should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_country_dropdown_uae_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_country_dropdown_uae_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that state text above the userfield should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_state_text_above_the_userfield_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_state_text_above_the_userfield_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that state userfield should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_state_userfield_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_state_userfield_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that state userfield place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_state_userfield_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual=adedit.admin_logger_update_users_page_state_userfield_place_holder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that city text above the userfield should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_city_text_above_the_userfield_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_city_text_above_the_userfield_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that city user field should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_city_user_field_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_city_user_field_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that city user field place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_city_user_field_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual=adedit.admin_logger_update_users_page_city_user_field_place_holder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that zip code text above userfield should be displayed in the admin dashbaord users all users actions edit button")
//	public void verify_that_zip_code_text_above_userfield_should_be_displayed_in_the_admin_dashbaord_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_zip_code_text_above_userfield_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that zip code text userfield should be clickable in the admin dashbaord users all users actions edit button")
//	public void verify_that_zip_code_text_userfield_should_be_clickable_in_the_admin_dashbaord_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_zip_code_userfield_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that zip code place holder value should be {string} in the admin dashboard users all users actions edit button")
//	public void verify_that_zip_code_place_holder_value_should_be_in_the_admin_dashboard_users_all_users_actions_edit_button(String string) {
//		String actual=adedit.admin_logger_update_users_page_zip_code_place_holder_value();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address type text above radio button should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_text_above_radio_button_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_text_above_radio_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address type home radio button should be selected in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_home_radio_button_should_be_selected_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_home_radio_button_is_preSelected();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that address type home radio button should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_home_radio_button_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_home_radio_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that address type home radio button text should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_home_radio_button_text_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_home_radio_button_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address type office radio button should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_office_radio_button_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_office_radio_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that address type office radio button text should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_office_radio_button_text_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_office_radio_button_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that address type others radio button should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_others_radio_button_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_others_radio_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that address type others radio button text should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_address_type_others_radio_button_text_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_address_type_others_radio_button_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that submit button should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_submit_button_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_submit_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that submit button should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_submit_button_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_submit_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that cancel button should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_cancel_button_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_cancel_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that cancel button should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_cancel_button_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_cancel_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that back to top arrow button should be displayed in the admin dashboard users all users actions edit button")
//	public void verify_that_back_to_top_arrow_button_should_be_displayed_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_back_to_top_arrow_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that back to top arrow button should be clickable in the admin dashboard users all users actions edit button")
//	public void verify_that_back_to_top_arrow_button_should_be_clickable_in_the_admin_dashboard_users_all_users_actions_edit_button() {
//		boolean actual=adedit.admin_logger_update_users_page_back_to_top_arrow_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	
//	@Then("Verify that admin all users breadcrumb button should navigated to the all users page from the edit or update page")
//	public void verify_that_admin_all_users_breadcrumb_button_should_navigated_to_the_all_users_page_from_the_edit_or_update_page() {
//		adedit.admin_logger_all_users_actions_option_update_user_breadcrum_all_user_is_click();
//	    boolean actual = adalluser.admin_user_all_users_search_button_is_clickable();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	/*
//	 * 
//	 * 
//	 * cancel button working
//	 * 
//	 * 
//	 * 
//	 */
//	
//	
//	@Then("Verify that admin all users cancel button should navigated to the all users page from the edit or update page")
//	public void verify_that_admin_all_users_cancel_button_should_navigated_to_the_all_users_page_from_the_edit_or_update_page() {
//		adedit.admin_logger_all_users_actions_option_update_user_cancel_button_is_click();
//	    boolean actual = adalluser.admin_user_all_users_search_button_is_clickable();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * First name
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@When("admin enter first name {string} and click on submit button for edit user page")
//	public void admin_enter_first_name_and_click_on_submit_button_for_edit_user_page(String string) {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_first_name_user_field_is_cleared();
//		adcreate.admin_logger_create_user_first_name_user_field_send_text(string);
//		String actual = adcreate.admin_logger_create_user_entered_first_name_text();
//	    Assert.assertEquals(actual, string);
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin should not get the red tick and note below the first name user field for edit user page")
//	public void verify_that_admin_should_not_get_the_red_tick_and_note_below_the_first_name_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_first_name_userfield_below_note_text_is_not_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should get the red tick and note below the first name user field for edit user page")
//	public void verify_that_admin_should_get_the_red_tick_and_note_below_the_first_name_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_first_name_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * Last name
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@When("admin enter last name {string} and click on submit button for edit user page")
//	public void admin_enter_last_name_and_click_on_submit_button_for_edit_user_page(String string) {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_last_name_user_field_is_cleared();
//		adcreate.admin_logger_create_user_last_name_user_field_send_text(string);
//	    String actual = adcreate.admin_logger_create_user_entered_last_name_text();
//	    Assert.assertEquals(actual, string);
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin should not get the red tick and note below the last name user field for edit user page")
//	public void verify_that_admin_should_not_get_the_red_tick_and_note_below_the_last_name_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_last_name_userfield_below_note_text_is_not_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should get the red tick and note below the last name user field for edit user page")
//	public void verify_that_admin_should_get_the_red_tick_and_note_below_the_last_name_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_last_name_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	
//	
//	
//	
//	
//	
//	/*
//	 * 
//	 * 
//	 * Email
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//
//	@When("admin enter email {string} and click on submit button for edit user page")
//	public void admin_enter_email_and_click_on_submit_button_for_edit_user_page(String string) {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_email_user_field_is_cleared();
//		adcreate.admin_logger_create_user_email_user_field_send_text(string);
//	    String actual = adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(actual, string);
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin should not get the red tick and note below the email user field for edit user page")
//	public void verify_that_admin_should_not_get_the_red_tick_and_note_below_the_email_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_email_userfield_below_note_text_is_not_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should get the red tick and note below the email user field for edit user page")
//	public void verify_that_admin_should_get_the_red_tick_and_note_below_the_email_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_email_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@When("admin enter email with 255 characters and click on submit button for edit user page")
//	public void admin_enter_email_with_255_characters_and_click_on_submit_button_for_edit_user_page() {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_email_user_field_is_cleared();
//		adcreate.admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_characters"));
//	    String actual = adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_characters"));
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin enter email with 200 characters and click on submit button for edit user page")
//	public void admin_enter_email_with_200_characters_and_click_on_submit_button_for_edit_user_page() {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_email_user_field_is_cleared();
//		adcreate.admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_200_characters"));
//	    String actual = adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_200_characters"));
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin enter email with 100 characters and click on submit button for edit user page")
//	public void admin_enter_email_with_100_characters_and_click_on_submit_button_for_edit_user_page() {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_email_user_field_is_cleared();
//		adcreate.admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_100_characters"));
//	    String actual = adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_100_characters"));
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin enter email with 50 characters and click on submit button for edit user page")
//	public void admin_enter_email_with_50_characters_and_click_on_submit_button_for_edit_user_page() {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_email_user_field_is_cleared();
//		adcreate.admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_50_characters"));
//	    String actual = adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_50_characters"));
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin enter email more than 255 character and click on submit button for edit user page")
//	public void admin_enter_email_more_than_255_character_and_click_on_submit_button_for_edit_user_page() {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_email_user_field_is_cleared();
//		adcreate.admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_plus_characters"));
//	    String actual = adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_plus_characters"));
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//
//	
//	
//
//    /*
//     * 
//     * 
//     * 
//     * 
//     * mobile number
//     * 
//     * 
//     */
//	
//	@Then("Verify that admin mobile number select option dropdown place hover value shuld be {string} for edit user page")
//	public void verify_that_admin_mobile_number_select_option_dropdown_place_hover_value_shuld_be_for_edit_user_page(String string) {
//	    adcreate.admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
//	    String actual=adcreate.admin_logger_create_users_page_mobile_number_country_code_dropdown_selected_value();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	    
//	
//	@Then("Verify that admin mobile number drop down uae option is selected for edit user page {string}")
//	public void verify_that_admin_mobile_number_drop_down_uae_option_is_selected_for_edit_user_page(String str) {
//	    adcreate.admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
//	    String actual=adcreate.admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
//	    Assert.assertEquals(actual, str);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	@When("admin enter mobile number user field {string} and click on submit button for edit user page")
//	public void admin_enter_mobile_number_user_field_and_click_on_submit_button_for_edit_user_page(String string) {
//		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
//		adcreate.admin_logger_create_user_mobile_number_user_field_is_cleared();
//		adcreate.admin_logger_create_user_mobile_number_user_field_send_text(string);
//	    String actual = adcreate.admin_logger_create_user_entered_mobile_number_text();
//	    Assert.assertEquals(actual, string);
//	    adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin should not get the red tick and note below the mobile number user field for edit user page")
//	public void verify_that_admin_should_not_get_the_red_tick_and_note_below_the_mobile_number_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_mobile_number_userfield_below_note_text_is_not_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should get the red tick and note below the mobile number user field for edit user page")
//	public void verify_that_admin_should_get_the_red_tick_and_note_below_the_mobile_number_user_field_for_edit_user_page() {
//		boolean actual=adcreate.admin_logger_create_user_mobile_number_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	
//	
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * date of birth 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//
//	
//	@Then("Verify that admin is able to click in the date of birth then calender should be displayed for edit user page")
//	public void verify_that_admin_is_able_to_click_in_the_date_of_birth_then_calender_should_be_displayed_for_edit_user_page() {
//		adcreate.admin_logger_create_users_page_date_of_birth_userfield_click();
//		boolean actual= adcreate.admin_logger_create_users_page_date_of_birth_calender_is_displayed();
//		Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin is select the 2005 year in the calender dob user field for edit user page")
//	public void verify_that_admin_is_select_the_year_in_the_calender_dob_user_field_for_edit_user_page() {
//		adcreate.admin_logger_create_users_page_date_of_birth_year_down_arrow_is_clicked();
//		boolean actual = adcreate.admin_logger_create_users_page_date_of_birth_year_2005_displayed();
//		Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin is select the date as 15 from the calender dob user field for edit user page")
//	public void verify_that_admin_is_select_the_date_as_from_the_calender_dob_user_field_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_date_of_birth_date_15_clickable();
//		adcreate.admin_logger_create_users_page_date_of_birth_calender_select_date_15();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin is select the date of month is december in the calender dob user field for edit user page")
//	public void verify_that_admin_is_select_the_date_of_month_is_december_in_the_calender_dob_user_field_for_edit_user_page() {
//		adcreate.admin_logger_create_users_page_date_of_birth_calender_select_month_december();
//		boolean actual = adcreate.admin_logger_create_users_page_date_of_birth_calender_select_month_december_is_dispalyed();
//		Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin entered value in the dob user field should {string} for edit user page")
//	public void verify_that_admin_value_enter_in_the_dob_user_field_should_for_edit_user_page(String string) {
//	    String actual = adcreate.admin_logger_create_users_page_date_of_birth_userfield_text_value();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	
//	@Then("Verify that admin bate of birth userfield send the valid date {string} for edit user page")
//	public void verify_that_admin_bate_of_birth_userfield_send_the_valid_date_for_edit_user_page(String string) {
//	    adcreate.admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
//	    String actual = adcreate.admin_logger_create_users_page_date_of_birth_userfield_text_value();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin bate of birth userfield send the invalid date {string} for edit user page")
//	public void verify_that_admin_bate_of_birth_userfield_send_the_invalid_date_for_edit_user_page(String string) {
//	    adcreate.admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
//	    String actual = adcreate.admin_logger_create_users_page_date_of_birth_userfield_text_value();
//	    Assert.assertNotEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	
//	
//	
//	
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * Profile image uploaded
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@Then("Verify that admin image should be uploaded for edit user page")
//	public void verify_that_admin_image_should_be_uploaded_for_edit_user_page() {
//	    boolean actual = adcreate.admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin jpeg image should be uploaded for edit user page")
//	public void verify_that_admin_jpeg_image_should_be_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//		boolean actual = adcreate.admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpeg"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin png image should be uploaded for edit user page")
//	public void verify_that_admin_png_image_should_be_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//		boolean actual = adcreate.admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_png"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin jpg image should be uploaded for edit user page")
//	public void verify_that_admin_jpg_image_should_be_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	
//	
//	@Then("Verify that admin pdf file should be not uploaded for edit user page")
//	public void verify_that_admin_pdf_file_should_be_not_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_pdf"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin logs file should be not uploaded for edit user page")
//	public void verify_that_admin_logs_file_should_be_not_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_log"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin html file should be not uploaded for edit user page")
//	public void verify_that_admin_html_file_should_be_not_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_html"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	@Then("Verify that admin more than 1 mb jpeg image should be not uploaded for edit user page")
//	public void verify_that_admin_more_than_1_mb_jpeg_image_should_be_not_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_jpeg"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin more than 1 mb png image should be not uploaded for edit user page")
//	public void verify_that_admin_more_than_1_mb_png_image_should_be_not_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_png"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin more than 1 mb jpg image should be not uploaded for edit user page")
//	public void verify_that_admin_more_than_1_mb_jpg_image_should_be_not_uploaded_for_edit_user_page() {
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
//		boolean actual = adcreate.admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_jpg"));
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * Radio button gender
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@Then("Verify that admin gender header text of the radio button should be displayed for edit user page")
//	public void verify_that_admin_gender_header_text_of_the_radio_button_should_be_displayed_for_edit_user_page() {
//	    boolean actual = adcreate.admin_logger_create_users_page_gender_header_text_of_the_radio_button_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin gender male text should be displayed for edit user page")
//	public void verify_that_admin_gender_male_text_should_be_displayed_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_male_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin gender female text should be displayed for edit user page")
//	public void verify_that_admine_gender_female_text_should_be_displayed_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_female_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin gender others text should be displayed for edit user page")
//	public void verify_that_admin_gender_others_text_should_be_displayed_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_others_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin gender male button should be clickable for edit user page")
//	public void verify_that_admin_gender_male_button_should_be_clickable_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_male_button_is_clickable();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin gender female button should be clickable for edit user page")
//	public void verify_that_admin_gender_female_button_should_be_clickable_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_female_button_is_clickable();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin gender others button should be clickable for edit user page")
//	public void verify_that_admin_gender_others_button_should_be_clickable_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_others_button_is_clickable();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin is click on the male button then check the male radio button is selected for edit user page")
//	public void admin_is_click_on_the_male_button_then_check_the_male_radio_button_is_selected_for_edit_user_page() {
//	    adcreate.admin_logger_create_users_page_gender_male_button_is_click();
//	    boolean actual = adcreate.admin_logger_create_users_page_gender_male_button_is_selected();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin is click on the female button then check the female radio button is selected for edit user page")
//	public void admin_is_click_on_the_female_button_then_check_the_female_radio_button_is_selected_for_edit_user_page() {
//		adcreate.admin_logger_create_users_page_gender_female_button_is_click();
//	    boolean actual = adcreate.admin_logger_create_users_page_gender_female_button_is_selected();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("admin is click on the other radio button then check the others radio button is selected for edit user page")
//	public void admin_is_click_on_the_other_radio_button_then_check_the_others_radio_button_is_selected_for_edit_user_page() {
//		adcreate.admin_logger_create_users_page_gender_others_button_is_click();
//	    boolean actual = adcreate.admin_logger_create_users_page_gender_others_button_is_selected();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin male radio button is not selected that time for edit user page")
//	public void verify_that_admin_male_radio_button_is_not_selected_that_time_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_male_button_is_selected();
//	    Assert.assertEquals(actual, false);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin female radio button is not selected that time for edit user page")
//	public void verify_that_admin_female_radio_button_is_not_selected_that_time_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_female_button_is_selected();
//	    Assert.assertEquals(actual, false);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin others radio button is not selected that time for edit user page")
//	public void verify_that_admin_others_radio_button_is_not_selected_that_time_for_edit_user_page() {
//		boolean actual = adcreate.admin_logger_create_users_page_gender_others_button_is_selected();
//	    Assert.assertEquals(actual, false);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//
//	
//	
//	/*
//	 * 
//	 * 
//	 * Assigned roles
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	
//	@Then("Verify that admin assigned roles information dropdown value should be selected Admin {string} for edit user page")
//	public void verify_that_the_assigned_roles_information_dropdown_value_should_be_selected_as_admin_for_edit_user_page(String string) {
//	    adcreate.admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
//	    String actual=adcreate.admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}	
//	
//	@Then("Verify that admin assigned roles information dropdown value should be selected Super Admin {string} for edit user page")
//	public void verify_that_the_assigned_roles_information_dropdown_value_should_be_selected_as_super_admin_for_edit_user_page(String string) {
//		adcreate.admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
//	    String actual=adcreate.admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	
//	
//	/*
//	 * 
//	 * 
//	 * RADIO button test cases
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//
//	@Then("Verify that admin address home radio button is already selected for edit user page")
//	public void verify_that_admin_address_home_radio_button_is_already_selected_for_edit_user_page() {
//		boolean actual = adedit.admin_logger_update_users_page_address_type_home_radio_button_is_selected();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin address office radio button is already selected for edit user page")
//	public void verify_that_admin_address_office_radio_button_is_already_selected_for_edit_user_page() {
//		boolean actual = adedit.admin_logger_update_users_page_address_type_office_radio_button_is_selected();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin address others radio button is already selected for edit user page")
//	public void verify_that_admin_address_others_radio_button_is_already_selected_for_edit_user_page() {
//		boolean actual = adedit.admin_logger_update_users_page_address_type_others_radio_button_is_selected();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin address office radio button is not selected that time for edit user page")
//	public void verify_that_admin_address_office_radio_button_is_not_selected_that_time_for_edit_user_page() {
//	    boolean actual =adedit.admin_logger_update_users_office_radio_button_is_selected();
//	    Assert.assertEquals(actual, false);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin address others radio button is not selected that time for edit user page")
//	public void verify_that_admin_address_others_radio_button_is_not_selected_that_time_for_edit_user_page() {
//		boolean actual =adedit.admin_logger_update_users_others_radio_button_is_selected();
//		Assert.assertEquals(actual, false);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin address home radio button is not selected that time for edit user page")
//	public void verify_that_admin_address_home_radio_button_is_not_selected_that_time_for_edit_user_page() {
//		boolean actual =adedit.admin_logger_update_users_home_radio_button_is_selected();
//		Assert.assertEquals(actual, false);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	
//	
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * address line 1
//	 * 
//	 * 
//	 */
//
//
//	@When("admin is enter the address line one as {string} and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_one_as_and_click_on_submit_button_for_edit_user_page(String string) {
//		adedit.admin_logger_create_user_address_line_one_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_one_user_field_send_text(string);
//		String actual = adedit.admin_logger_update_user_entered_address_line_one_text();
//		Assert.assertEquals(actual, string);
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin should not get any red tick and note below the address line one user field for edit user page")
//	public void verify_that_admin_should_not_get_any_red_tick_and_note_below_the_address_line_one_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_address_line_one_userfield_below_note_text_is_not_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@Then("Verify that admin should get any red tick and note below the address line one user field for edit user page")
//	public void verify_that_admin_should_get_any_red_tick_and_note_below_the_address_line_one_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_address_line_one_userfield_below_note_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@When("admin is enter the address line one as more than 255 characters and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_one_as_more_than_255_characters_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_one_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("255_plus_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_one_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_plus_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin is enter the address line one as 255 and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_one_as_255_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_one_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("255_character_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_one_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_character_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin is enter the address line one as 150 and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_one_as_150_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_one_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("150_character_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_one_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("150_character_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin is enter the address line one as 50 and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_one_as_50_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_one_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("50_character_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_one_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("50_character_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	/*
//	 * 
//	 * address line 2
//	 * 
//	 * 
//	 * 
//	 */
//
//
//	@When("admin is enter the address line two as {string} and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_two_as_and_click_on_submit_button_for_edit_user_page(String string) {
//		
//		adedit.admin_logger_create_user_address_line_two_user_field_is_cleared();
//		
//		adedit.admin_logger_update_user_address_line_two_user_field_send_text(string);
//		String actual = adedit.admin_logger_update_user_entered_address_line_two_text();
//		Assert.assertEquals(actual, string);
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin should not get any red tick and note below the address line two user field for edit user page")
//	public void verify_that_admin_should_not_get_any_red_tick_and_note_below_the_address_line_two_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_address_line_two_userfield_below_note_text_is_not_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@Then("Verify that admin should get any red tick and note below the address line two user field for edit user page")
//	public void verify_that_admin_should_get_any_red_tick_and_note_below_the_address_line_two_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_address_line_two_userfield_below_note_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@When("admin is enter the address line two as more than 255 characters and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_two_as_more_than_255_characters_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_one_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("255_plus_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_two_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_plus_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin is enter the address line two as 255 and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_two_as_255_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_two_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("255_character_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_two_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_character_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin is enter the address line two as 150 and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_two_as_150_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_two_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("150_character_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_two_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("150_character_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin is enter the address line two as 50 and click on submit button for edit user page")
//	public void admin_is_enter_the_address_line_two_as_50_and_click_on_submit_button_for_edit_user_page() {
//		adedit.admin_logger_create_user_address_line_two_user_field_is_cleared();
//		adedit.admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("50_character_address"));
//		String actual = adedit.admin_logger_update_user_entered_address_line_two_text();
//		Assert.assertEquals(actual, AppHooks.tdata.getProperty("50_character_address"));
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	/*
//	 * 
//	 * 
//	 * country
//	 * 
//	 * 
//	 */
//
//	@Then("Verify that admin country dropdown value should be selected {string} for edit user page")
//	public void verify_that_admin_country_dropdown_value_should_be_selected_for_edit_user_page(String string) {
//		adedit.admin_logger_update_users_page_country_userfield_dropdown_is_click();
//		String actual=adedit.admin_logger_update_users_page_country_dropdown_uae_is_selected();
//		Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}	
//
//	/*
//	 * 
//	 * State
//	 * 
//	 * 
//	 */
//
//
//	@When("admin is enter the state as {string} and click on submit button for edit user page")
//	public void admin_is_enter_the_state_as_and_click_on_submit_button_for_edit_user_page(String string) {
//		adedit.admin_logger_create_user_state_user_field_is_cleared();
//		adedit.admin_logger_update_user_state_user_field_send_text(string);
//		String actual = adedit.admin_logger_update_user_entered_state_text();
//		Assert.assertEquals(actual, string);
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin should not get any red tick and note below the state user field for edit user page")
//	public void verify_that_admin_should_not_get_any_red_tick_and_note_below_the_state_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_state_userfield_below_note_text_is_not_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@Then("Verify that admin should get any red tick and note below the state user field for edit user page")
//	public void verify_that_admin_should_get_any_red_tick_and_note_below_the_state_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_state_userfield_below_note_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	/*
//	 * 
//	 * City
//	 * 
//	 * 
//	 */
//
//
//	@When("admin is enter the city as {string} and click on submit button for edit user page")
//	public void admin_is_enter_the_city_as_and_click_on_submit_button_for_edit_user_page(String string) {
//		adedit.admin_logger_create_user_city_user_field_is_cleared();
//		
//		adedit.admin_logger_update_user_city_user_field_send_text(string);
//		String actual = adedit.admin_logger_update_user_entered_city_text();
//		Assert.assertEquals(actual, string);
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin should not get any red tick and note below the city user field for edit user page")
//	public void verify_that_admin_should_not_get_any_red_tick_and_note_below_the_city_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_city_userfield_below_note_text_is_not_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@Then("Verify that admin should get any red tick and note below the city user field for edit user page")
//	public void verify_that_admin_should_get_any_red_tick_and_note_below_the_city_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_city_userfield_below_note_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	/*
//	 * 
//	 * 
//	 * Zip code
//	 * 
//	 */
//
//	@When("admin is enter the zip code as {string} and click on submit button for edit user page")
//	public void admin_is_enter_the_zip_code_as_and_click_on_submit_button_for_edit_user_page(String string) {
//		adedit.admin_logger_create_user_zip_code_user_field_is_cleared();
//		
//		adedit.admin_logger_update_user_zip_code_user_field_send_text(string);
//		String actual = adedit.admin_logger_update_user_entered_zip_code_text();
//		Assert.assertEquals(actual, string);
//		adedit.admin_logger_update_users_page_submit_button_with_js_is_click();
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin should not get any red tick and note below the zip code user field for edit user page")
//	public void verify_that_admin_should_not_get_any_red_tick_and_note_below_the_zip_code_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_zip_code_userfield_below_note_text_is_not_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@Then("Verify that admin should get any red tick and note below the zip code user field for edit user page")
//	public void verify_that_admin_should_get_any_red_tick_and_note_below_the_zip_code_user_field_for_edit_user_page() {
//		boolean actual=adedit.admin_logger_update_user_zip_code_userfield_below_note_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//
//
//	
//}
