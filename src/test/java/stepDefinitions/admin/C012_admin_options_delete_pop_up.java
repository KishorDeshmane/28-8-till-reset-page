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
//import com.pages.admin.C011_admin_options_change_status_pop_up_objects;
//import com.pages.admin.C012_admin_options_delete_pop_up_objects;
//import com.qa.factory.DriverFactory;
//import com.qa.utility.ElementUtil;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class C012_admin_options_delete_pop_up {
//
//	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
//	private C001_admin_log_in_page_objects adlogin = new C001_admin_log_in_page_objects(DriverFactory.getDriver());
//	private C002_admin_dashboard_main_page_objects admain = new C002_admin_dashboard_main_page_objects(DriverFactory.getDriver());
//	private C006_admin_all_users_page_objects adalluser = new C006_admin_all_users_page_objects(DriverFactory.getDriver());
//	private C009_admin_create_users_page_objects adcreate = new C009_admin_create_users_page_objects(DriverFactory.getDriver());
//	private C011_admin_options_change_status_pop_up_objects adstatus = new C011_admin_options_change_status_pop_up_objects(DriverFactory.getDriver());
//	private C012_admin_options_delete_pop_up_objects addelete= new C012_admin_options_delete_pop_up_objects(DriverFactory.getDriver());
//	
//	Logger logger = LogManager.getLogger(C012_admin_options_delete_pop_up.class);
//
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * SCR
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//
//	@Given("Verify that admin user is on the users all users actions options delete page as expected page title {string}")
//	public void verify_that_admin_user_is_on_the_users_all_users_actions_options_delete_page_as_expected_page_title(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		admain.admin_logger_mouser_hover_on_users_button();
//		admain.admin_logger_mouser_users_all_users_is_clicked();
//		adalluser.admin_users_all_users_actions_options_3_dots_is_click();
//		adalluser.admin_users_all_users_actions_option_delete_is_click();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@When("admin click on the delete button from the admin dashboard all users actions options button")
//	public void user_click_on_the_delete_button_from_the_admin_dashboard_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_bigger_i_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin comfirmation pop displayed having are you sure text from all users actions options button")
//	public void verify_that_admin_comfirmation_pop_displayed_having_are_you_sure_text_from_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_are_you_sure_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin comfirmation pop up you want to delete this user text is displayed in the all users actions options button")
//	public void verify_that_admin_comfirmation_pop_up_you_want_to_delete_this_user_text_is_displayed_in_the_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_you_want_to_delete_this_user_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin comfirmation pop up yes delete it button is clickable in the all users actions options button")
//	public void verify_that_admin_comfirmation_pop_up_yes_delete_it_button_is_clickable_in_the_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_yes_delete_it_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin comfirmation pop up yes delete it button is displayed in the all users actions options button")
//	public void verify_that_admin_comfirmation_pop_up_yes_delete_it_button_is_displayed_in_the_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_yes_delete_it_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin comfirmation pop up cancel button is displayed in the all users actions options button")
//	public void verify_that_admin_comfirmation_pop_up_cancel_button_is_displayed_in_the_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_cancel_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin comfirmation pop up cancel button is clickable in the all users actions options button")
//	public void verify_that_admin_comfirmation_pop_up_cancel_button_is_clickable_in_the_all_users_actions_options_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_cancel_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin comfirmation pop up name of the user is displayed in the all users actions button")
//	public void verify_that_admin_omfirmation_pop_up_name_of_the_user_is_displayed_in_the_all_users_actions_button() {
//		boolean actual = addelete.admin_users_all_users_actions_option_name_of_the_user_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
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
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@Then("Verify that admin cancel button should cancel the pop an user is on all user page from optiion button")
//	public void verify_that_admin_cancel_button_should_cancel_the_pop_an_user_is_on_all_user_page_from_optiion_button() {
//		addelete.admin_users_all_users_actions_option_cancel_button_is_click();
//		boolean actual= adalluser.admin_users_all_users_actions_options_3_dots_is_clickable();
//		Assert.assertEquals(actual, true);
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
//	 * 
//	 * 
//	 * 
//	 * 
//	*
//	*
//	*/
//	
//	@Then("Verify that admin user not found text pop up while log in with delete user in admin log in page is displayed for delete pop up email {string} and pass {string}")
//	public void verify_that_admin_user_not_found_text_pop_up_while_log_in_with_delete_user_in_admin_log_in_page_is_displayed_for_delete_pop_up(String email , String pass) {
//	    admain.admin_logger_first_profile_dropdown_button_is_clicked();
//	    admain.admin_logger_profile_dropdown_item_sign_out_is_clicked();
//	    adlogin.admin_log_enter_email_into_the_user_field(email);
//	    adlogin.admin_log_enter_password_into_the_user_field(pass);
//	    adlogin.admin_sign_in_button_is_clicked();
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	    boolean actual = adlogin.admin_log_in_user_not_found_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
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
//	@Given("Verify that admin is on the admin dashboard users all users create user page as expected page title {string} for delete pop up")
//	public void verify_that_admin_is_on_the_admin_dashboard_users_all_users_create_user_page_as_expected_page_title_for_delete_pop_up(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		admain.admin_logger_mouser_hover_on_users_button();
//		admain.admin_logger_mouser_users_all_users_is_clicked();
//		adalluser.admin_user_all_users_create_user_button_is_click();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//
//	@Then("Verify that admin enter the first name as {string} in create user page for delete pop up")
//	public void verify_that_admin_enter_the_first_name_as_in_create_user_page(String string) {
//		adcreate.admin_logger_create_user_first_name_user_field_send_text(string);
//		String value= adcreate.admin_logger_create_user_entered_first_name_text();
//		Assert.assertEquals(value, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin enter the last name as  {string} in create user page for delete pop up")
//	public void verify_that_admin_enter_the_last_name_as_in_create_user_page(String string) {
//	    adcreate.admin_logger_create_user_last_name_user_field_send_text(string);
//	    String value=adcreate.admin_logger_create_user_entered_last_name_text();
//	    Assert.assertEquals(value, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin enter the email as {string} in create user page for delete pop up")
//	public void verify_that_admin_enter_the_email_as_in_create_user_page(String string) {
//		adcreate.admin_logger_create_user_email_user_field_send_text(string);
//	    String value=adcreate.admin_logger_create_user_entered_email_text();
//	    Assert.assertEquals(value, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	@Then("Verify that admin select the country code {string} in create user page for delete pop up")
//	public void verify_that_admin_select_the_country_code_uae_in_create_user_page(String uaes) {
//		adcreate.admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click();
//	    adcreate.admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click();
//	    String uae=adcreate.admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected();
//	    Assert.assertEquals(uae, uaes);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	@Then("Verify that admin enter the mobile number as {string} in create user page for delete pop up")
//	public void verify_that_admin_enter_the_mobile_number_as_in_create_user_page(String string) {
//	    adcreate.admin_logger_create_user_mobile_number_user_field_send_text(string);
//	    String act =adcreate.admin_logger_create_user_entered_mobile_number_text();
//	    Assert.assertEquals(act, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin enter date of birth as {string} in the create user page for delete pop up")
//	public void verify_that_admin_enter_date_of_birth_as_in_the_create_user_page(String string) {
//	    adcreate.admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
//	    String value = adcreate.admin_logger_create_users_page_date_of_birth_userfield_text_value();
//	    Assert.assertEquals(value, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin send the profile image as jpg in create user page for delete pop up")
//	public void verify_that_admin_send_the_profile_image_as_jpg_in_create_user_page() {
//	    boolean ac=adcreate.admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
//	    Assert.assertEquals(ac, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin select the gender as male from the radio button in create user page for delete pop up")
//	public void verify_that_admin_select_the_gender_as_male_from_the_radio_button_in_create_user_page() {
//	    adcreate.admin_logger_create_users_page_gender_male_button_is_click();
//	    boolean actual = adcreate.admin_logger_create_users_page_gender_male_button_is_selected();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin enter password as {string} in the create user page for delete pop up")
//	public void verify_that_admin_enter_password_as_in_the_create_user_page(String string) {
//	    adcreate.admin_logger_create_user_password_user_field_send_text(string);
//	    String actual = adcreate.admin_logger_create_user_entered_password_text();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin enter comfirmed password as same as {string} in the create user page for delete pop up")
//	public void verify_that_admin_enter_comfirmed_password_as_same_as_in_the_create_user_page(String string) {
//		adcreate.admin_logger_create_user_comfirm_password_user_field_send_text(string);
//	    String actual = adcreate.admin_logger_create_user_entered_comfirm_password_text();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin select the assigned role as {string} in the create user page super admin for delete pop up")
//	public void verify_that_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_super_admin(String string) {
//	    adcreate.admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
//	    String actual =adcreate.admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	@Then("Verify that admin select the assigned role as {string} in the create user page admin for delete pop up")
//	public void verify_that_admin_select_the_assigned_role_as_super_admin_in_the_create_user_page_admin(String string) {
//	    adcreate.admin_logger_create_users_page_assigned_roles_drop_down_is_clic();
//	    String actual =adcreate.admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that the admin submit the button should create a new user in the all users page for delete pop up")
//	public void verify_that_the_admin_submit_the_button_should_create_a_new_user_in_the_all_users_page() {
//		adcreate.admin_logger_create_users_page_submit_button_with_js_is_click();
//		boolean actual=adalluser.admin_user_all_users_search_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin search button is able to search the user with {string} name of user in all users page for delete pop up")
//	public void verify_that_admin_search_button_is_able_to_search_the_user_with_name_of_user_in_all_users_page(String string) {
//	    adalluser.admin_user_all_users_search_userfield_sendText(string);
//	    adalluser.admin_user_all_users_search_button_is_click();
//	    boolean actual = adalluser.admin_user_all_users_column_list_expected_user_name_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//
//	
//	
//	@Then("Verify that admin should be able change the status of the user in all user page for delete pop up")
//	public void verify_that_admin_should_be_able_change_the_status_of_the_user_in_all_user_page() {
//	    adalluser.admin_users_all_users_actions_options_3_dots_is_click();
//	    adalluser.admin_users_all_users_actions_option_change_status_is_click();
//	    adstatus.admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click();
//	    adstatus.admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_is_click();
//	    boolean actual=adalluser.admin_user_all_users_thread_column_user_status_active_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin should be able to delete the user from the all users page for delete pop up")
//	public void verify_that_admin_should_be_able_to_delete_the_user_from_the_all_users_page() {
//	    adalluser.admin_users_all_users_actions_options_3_dots_is_click();
//	    adalluser.admin_users_all_users_actions_option_delete_is_click();
//	    addelete.admin_users_all_users_actions_option_yes_delete_it_pop_up_is_click();
//	    boolean actual = addelete.admin_users_all_users_actions_option_delete_successfully_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin search email should not give any content into the table from all users page for delete pop up")
//	public void verify_that_admin_search_email_should_not_give_any_content_into_the_table_from_all_users_page() {
//	    adalluser.admin_user_all_users_search_button_is_click();
//		boolean actual = adalluser.admin_users_all_users_search_not_found_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
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
//}
