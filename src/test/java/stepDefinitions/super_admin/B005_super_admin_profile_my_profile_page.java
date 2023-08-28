package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Profile_my_profile_page_objects;
import com.pages.Users_create_users_page_objects;
import com.pages.Users_edit_or_update_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B005_super_admin_profile_my_profile_page {
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Profile_my_profile_page_objects saprof = new Profile_my_profile_page_objects(DriverFactory.getDriver());
	private Users_create_users_page_objects sacreate=new Users_create_users_page_objects(DriverFactory.getDriver());
	private Users_edit_or_update_page_objects saedit = new Users_edit_or_update_page_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B005_super_admin_profile_my_profile_page.class);
	
	
	/*
	 * 
	 * 
	 * 
	 * SCR 01
	 * 
	 * 
	 */
	
	@Given("Verify that user is on the super admin dashboard my profile page as expected page title {string}")
	public void verify_that_user_is_on_the_super_admin_dashboard_my_profile_page_as_expected_page_title(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_first_profile_dropdown_button_is_clicked();
		
//		samain.super_admin_logger_profile_dropdown_my_profile_is_clicked();
		
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
    @Then("Verify that page header my profile title text is displayed from super admin dashboard my profile page")
    public void verify_that_page_header_my_profile_title_text_is_displayed_from_super_admin_dashboard_my_profile_page() {
        boolean actual=saprof.super_admin_logger_my_profile_page_header_my_profile_title_text_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that page breadcrum list should be displayed from the super admin dashboard my profile page")
    public void verify_that_page_breadcrum_list_should_be_displayed_from_the_super_admin_dashboard_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_breadcrum_list_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that page breadcrum dashborad button should be clickable from the super admin dashboard my profile page")
    public void verify_that_page_breadcrum_dashborad_button_should_be_clickable_from_the_super_admin_dashboard_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_breadcrum_dashboard_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that page breadcrum my profile text is displayed from the super admin dashboard my profile page")
    public void verify_that_page_breadcrum_my_profile_text_is_displayed_from_the_super_admin_dashboard_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_breadcrum_my_profile_text_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user last log in date should be displayed from the super admin dashboard my profile page")
    public void verify_that_user_last_log_in_date_should_be_displayed_from_the_super_admin_dashboard_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_last_log_in_date_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user last log in time should be displayed from the super admin dashboard my profile page")
    public void verify_that_user_last_log_in_time_should_be_displayed_from_the_super_admin_dashboard_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_last_log_in_time_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user ip address should be displayed from the super admin dashboard my profile page")
    public void verify_that_user_ip_address_should_be_displayed_from_the_super_admin_dashboard_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_ip_address_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user agent should be displayed from the super admin my profile page")
    public void verify_that_user_agent_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_agent_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user image in round circle is displayed from the super admin my profile page")
    public void verify_that_user_image_in_round_circle_is_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_image_in_round_circle_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user name below image should be displayed from the super admin my profile page")
    public void verify_that_user_name_below_image_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_name_below_image_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user role below image should be displayed from the super admin my profile page")
    public void verify_that_user_role_below_image_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_role_below_image_should_be_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that tick mark below image should be displayed from the super admin my profile page")
    public void verify_that_tick_mark_below_image_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_tick_mark_below_image_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that personal information header should be displayed from the super admin my profile page")
    public void verify_that_personal_information_header_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_personal_information_header_text_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that first name text above user field should be displayed from the super admin my profile page")
    public void verify_that_first_name_text_above_user_field_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_first_name_text_above_user_field_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that first name user field should be clickable from the super admin my profile page")
    public void verify_that_first_name_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_first_name_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that first name user field place holder value should be {string} from the super admin my profile page")
    public void verify_that_first_name_user_field_place_holder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_first_name_user_field_place_holder_value_is_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that last name text above user field should be displayed from the super admin my profile page")
    public void verify_that_last_name_text_above_user_field_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_last_name_text_above_user_field_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that last name user field should be clickable from the super admin my profile page")
    public void verify_that_last_name_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_last_name_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that last name user field place holder value should be {string} from the super admin my profile page")
    public void verify_that_last_name_user_field_place_holder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_last_name_user_field_place_holder_value_is_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user name text above user field should be displayed from the super admin my profile page")
    public void verify_that_user_name_text_above_user_field_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_name_text_above_user_field_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user name user field should be clickable from the super admin my profile page")
    public void verify_that_user_name_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_user_name_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that user name user field place holder value should be {string} from the super admin my profile page")
    public void verify_that_user_name_user_field_place_holder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_user_name_user_field_place_holder_value_should_be_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that email text above user field should be displayed from the super admin my profile page")
    public void verify_that_email_text_above_user_field_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_email_text_above_user_field_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that email user field should be clickable from the super admin my profile page")
    public void verify_that_email_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_email_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that email user field place holder value should be {string} from the super admin my profile page")
    public void verify_that_email_user_field_place_holder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_email_user_field_place_holder_value_is_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that email user field verify button should be displayed from the super admin my profile page")
    public void verify_that_email_user_field_verify_button_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_email_user_field_verify_button_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that email user field verify button should be clickable from the super admin my profile page")
    public void verify_that_email_user_field_verify_button_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_email_user_field_verify_button_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number text above the user field should be displayed from the super admin my profile page")
    public void verify_that_mobile_number_text_above_the_user_field_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_mobile_number_text_above_the_user_field_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number country code user field should be clickable from the super admin my profile page")
    public void verify_that_mobile_number_country_code_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_mobile_number_country_code_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number country code user field place holder value should be {string} from the super admin my profile page")
    public void verify_that_mobile_number_country_code_user_field_place_holder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_mobile_number_country_code_user_field_place_holder_value_is_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number user field should be clickable from the super admin my profile page")
    public void verify_that_mobile_number_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_mobile_number_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number user field placeholder value should be {string} from the super admin my profile page")
    public void verify_that_mobile_number_user_field_placeholder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_mobile_number_user_field_placeholder_value_is_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number verify button should be displayed from the super admin my profile page")
    public void verify_that_mobile_number_verify_button_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_mobile_number_verify_button_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that mobile number verify button should be clickable from the super admin my profile page")
    public void verify_that_mobile_number_verify_button_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_mobile_number_verify_button_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that profile image text above the user field should be displayed from the super admin my profile page")
    public void verify_that_profile_image_text_above_the_user_field_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_profile_image_text_above_the_user_field_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that profile image user field should be clickable from the super admin my profile page")
    public void verify_that_profile_image_user_field_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_profile_image_user_field_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that profile image user field place holder value should be {string} from the super admin my profile page")
    public void verify_that_profile_image_user_field_place_holder_value_should_be_something_from_the_super_admin_my_profile_page(String strArg1) {
    	String actual=saprof.super_admin_logger_my_profile_page_profile_image_user_field_place_holder_value_is_something();
        Assert.assertEquals(actual, strArg1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that save button should be clickable from the super admin my profile page")
    public void verify_that_save_button_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_save_button_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
    
    @Then("Verify that save button should be displayed from the super admin my profile page")
    public void verify_that_save_button_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_save_button_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that save button should be able to mouse hover from the super admin my profile page")
    public void verify_that_save_button_should_be_able_to_mouse_hover_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_save_button_is_able_to_mouse_hover();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
    
    @Then("Verify that cancel button should be displayed from the super admin my profile page")
    public void verify_that_cancel_button_should_be_displayed_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_cancel_button_should_be_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that cancel button should be clickable from the super admin my profile page")
    public void verify_that_cancel_button_should_be_clickable_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_cancel_button_should_be_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that cancel button should be able to mouse hover from the super admin my profile page")
    public void verify_that_cancel_button_should_be_able_to_mouse_hover_from_the_super_admin_my_profile_page() {
    	boolean actual=saprof.super_admin_logger_my_profile_page_cancel_button_should_be_able_to_mouse_hover();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
    
    
    
    /*
     * 
     * 
     * First name
     * 
     * 
     * 
     */
    
    
    
	@When("super_admin enter first name {string} and click on submit button from my profile page")
	public void super_admin_enter_first_name_and_click_on_submit_button_from_my_profile_page(String string) {
		sacreate.super_admin_logger_create_user_first_name_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_first_name_user_field_send_text(string);
		String actual = sacreate.super_admin_logger_create_user_entered_first_name_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the first name user field from my profile page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_first_name_user_field_from_my_profile_page() {
		boolean actual=sacreate.super_admin_logger_create_user_first_name_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the first name user field from my profile page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_first_name_user_field_from_my_profile_page() {
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
	 * Last name
	 * 
	 * 
	 * 
	 */
	
	@When("super_admin enter last name {string} and click on submit button from my profile page")
	public void super_admin_enter_last_name_and_click_on_submit_button_from_my_profile_page(String string) {
		sacreate.super_admin_logger_create_user_last_name_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_last_name_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_last_name_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the last name user field from my profile page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_last_name_user_field_from_my_profile_page() {
		boolean actual=sacreate.super_admin_logger_create_user_last_name_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the last name user field from my profile page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_last_name_user_field_from_my_profile_page() {
		boolean actual=sacreate.super_admin_logger_create_user_last_name_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	/*
	 * 
	 * 
	 * Email
	 * 
	 * 
	 * 
	 * 
	 */
	

	@When("super_admin enter email {string} and click on submit button from my profile page")
	public void super_admin_enter_email_and_click_on_submit_button_from_my_profile_page(String string) {
		sacreate.super_admin_logger_create_user_email_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_email_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the email user field from my profile page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_email_user_field_from_my_profile_page() {
		boolean actual=sacreate.super_admin_logger_create_user_email_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the email user field from my profile page")
	public void verify_that_super_admin_should_get_the_red_tick_and_note_below_the_email_user_field_from_my_profile_page() {
		boolean actual=sacreate.super_admin_logger_create_user_email_userfield_below_note_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@When("super_admin enter email with 255 characters and click on submit button from my profile page")
	public void super_admin_enter_email_with_255_characters_and_click_on_submit_button_from_my_profile_page() {
		sacreate.super_admin_logger_create_user_email_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email with 200 characters and click on submit button from my profile page")
	public void super_admin_enter_email_with_200_characters_and_click_on_submit_button_from_my_profile_page() {
		sacreate.super_admin_logger_create_user_email_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_200_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_200_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email with 100 characters and click on submit button from my profile page")
	public void super_admin_enter_email_with_100_characters_and_click_on_submit_button_from_my_profile_page() {
		sacreate.super_admin_logger_create_user_email_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_100_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_100_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email with 50 characters and click on submit button from my profile page")
	public void super_admin_enter_email_with_50_characters_and_click_on_submit_button_from_my_profile_page() {
		sacreate.super_admin_logger_create_user_email_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_email_user_field_send_text(AppHooks.tdata.getProperty("email_50_characters"));
	    String actual = sacreate.super_admin_logger_create_user_entered_email_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_50_characters"));
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super_admin enter email more than 255 character and click on submit button from my profile page")
	public void super_admin_enter_email_more_than_255_character_and_click_on_submit_button_from_my_profile_page() {
		sacreate.super_admin_logger_create_user_email_user_field_is_cleared();
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
     * mobile number
     * 
     * 
     */
    
	@When("super_admin enter mobile number user field {string} and click on submit button from my profile page")
	public void super_admin_enter_mobile_number_user_field_and_click_on_submit_button_from_my_profile_page(String string) {
		ElementUtil.eu.scroll_up_body_click(3, DriverFactory.getDriver());
		sacreate.super_admin_logger_create_user_mobile_number_user_field_is_cleared();
		sacreate.super_admin_logger_create_user_mobile_number_user_field_send_text(string);
	    String actual = sacreate.super_admin_logger_create_user_entered_mobile_number_text();
	    Assert.assertEquals(actual, string);
	    sacreate.super_admin_logger_create_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin should not get the red tick and note below the mobile number user field from my profile page")
	public void verify_that_super_admin_should_not_get_the_red_tick_and_note_below_the_mobile_number_user_field_from_my_profile_page() {
		boolean actual=sacreate.super_admin_logger_create_user_mobile_number_userfield_below_note_text_is_not_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that super_admin should get the red tick and note below the mobile number user field from my profile page")
	public void verify_that_user_should_get_the_red_tick_and_note_below_the_mobile_number_user_field_from_my_profile_page() {
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
	
	@Then("Verify that the image should be uploaded from my profile page for super_admin user")
	public void verify_that_the_image_should_be_uploaded_from_my_profile_page() {
	    boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the jpeg image should be uploaded from my profile page for super_admin user")
	public void verify_that_the_jpeg_image_should_be_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpeg"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the png image should be uploaded from my profile page for super_admin user")
	public void verify_that_the_png_image_should_be_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_png"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the jpg image should be uploaded from my profile page for super_admin user")
	public void verify_that_the_jpg_image_should_be_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_image_is_uploaded(AppHooks.tdata.getProperty("location_jpg"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that the pdf file should be not uploaded from my profile page for super_admin user")
	public void verify_that_the_pdf_file_should_be_not_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_pdf"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the logs file should be not uploaded from my profile page for super_admin user")
	public void verify_that_the_logs_file_should_be_not_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_log"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the html file should be not uploaded from my profile page for super_admin user")
	public void verify_that_the_html_file_should_be_not_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_html"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that more than 1 mb jpeg image should be not uploaded from my profile page for super_admin user")
	public void verify_that_more_than_1_mb_jpeg_image_should_be_not_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_jpeg"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that more than 1 mb png image should be not uploaded from my profile page for super_admin user")
	public void verify_that_more_than_1_mb_png_image_should_be_not_uploaded_from_my_profile_page() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver()); 
		boolean actual = sacreate.super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(AppHooks.tdata.getProperty("location_1+_mb_png"));
		 Assert.assertEquals(actual, true);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that more than 1 mb jpg image should be not uploaded from my profile page for super_admin user")
	public void verify_that_more_than_1_mb_jpg_image_should_be_not_uploaded_from_my_profile_page() {
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
	
	@Then("Verify that the gender header text of the radio button should be displayed from my profile page for super_admin user")
	public void verify_that_the_gender_header_text_of_the_radio_button_should_be_displayed_from_my_profile_page() {
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_header_text_of_the_radio_button_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender male text should be displayed from my profile page for super_admin user")
	public void verify_that_the_gender_male_text_should_be_displayed_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender female text should be displayed from my profile page for super_admin user")
	public void verify_that_the_gender_female_text_should_be_displayed_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender others text should be displayed from my profile page for super_admin user")
	public void verify_that_the_gender_others_text_should_be_displayed_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender male button should be clickable from my profile page for super_admin user")
	public void verify_that_the_gender_male_button_should_be_clickable_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender female button should be clickable from my profile page for super_admin user")
	public void verify_that_the_gender_female_button_should_be_clickable_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the gender others button should be clickable from my profile page for super_admin user")
	public void verify_that_the_gender_others_button_should_be_clickable_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_button_is_clickable();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is click on the male button then check the male radio button is selected from my profile page for super_admin user")
	public void user_is_click_on_the_male_button_then_check_the_male_radio_button_is_selected_from_my_profile_page() {
	    sacreate.super_admin_logger_create_users_page_gender_male_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is click on the female button then check the female radio button is selected from my profile page for super_admin user")
	public void user_is_click_on_the_female_button_then_check_the_female_radio_button_is_selected_from_my_profile_page() {
		sacreate.super_admin_logger_create_users_page_gender_female_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_button_is_selected();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is click on the other radio button then check the others radio button is selected from my profile page for super_admin user")
	public void user_is_click_on_the_other_radio_button_then_check_the_others_radio_button_is_selected_from_my_profile_page() {
		sacreate.super_admin_logger_create_users_page_gender_others_button_is_click();
	    boolean actual = sacreate.super_admin_logger_create_users_page_gender_others_button_is_selected();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the male radio button is not selected that time from my profile page for super_admin user")
	public void verify_that_the_male_radio_button_is_not_selected_that_time_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_male_button_is_selected();
	    Assert.assertEquals(actual, false);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the female radio button is not selected that time from my profile page for super_admin user")
	public void verify_that_the_female_radio_button_is_not_selected_that_time_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_gender_female_button_is_selected();
	    Assert.assertEquals(actual, false);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the others radio button is not selected that time from my profile page for super_admin user")
	public void verify_that_the_others_radio_button_is_not_selected_that_time_from_my_profile_page() {
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
	 * date of birth 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Then("Verify that user is able to click in the date of birth then calender should be displayed from my profile page for super_admin user")
	public void verify_that_user_is_able_to_click_in_the_date_of_birth_then_calender_should_be_displayed_from_my_profile_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_click();
		boolean actual= sacreate.super_admin_logger_create_users_page_date_of_birth_calender_is_displayed();
		Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is select the 2005 year in the calender dob user field from my profile page for super_admin user")
	public void verify_that_user_is_select_the_year_in_the_calender_dob_user_field_from_my_profile_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_year_down_arrow_is_clicked();
		boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_year_2005_displayed();
		Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that User is select the date as 15 from the calender dob user field from my profile page for super_admin user")
	public void verify_that_user_is_select_the_date_as_from_the_calender_dob_user_field_from_my_profile_page() {
		boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_date_15_clickable();
		sacreate.super_admin_logger_create_users_page_date_of_birth_calender_select_date_15();
	    Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is select the date of month is december in the calender dob user field from my profile page for super_admin user")
	public void verify_that_user_is_select_the_date_of_month_is_december_in_the_calender_dob_user_field_from_my_profile_page() {
		sacreate.super_admin_logger_create_users_page_date_of_birth_calender_select_month_december();
		boolean actual = sacreate.super_admin_logger_create_users_page_date_of_birth_calender_select_month_december_is_dispalyed();
		Assert.assertEquals(actual, true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the entered value in the dob user field should {string} from my profile page for super_admin user")
	public void verify_that_the_value_enter_in_the_dob_user_field_should_from_my_profile_page(String string) {
	    String actual = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	
	@Then("Verify that the bate of birth userfield send the valid date {string} from my profile page for super_admin user")
	public void verify_that_the_bate_of_birth_userfield_send_the_valid_date_from_my_profile_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String actual = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}
	
	@Then("Verify that the bate of birth userfield send the invalid date {string} from my profile page for super_admin user")
	public void verify_that_the_bate_of_birth_userfield_send_the_invalid_date_from_my_profile_page(String string) {
	    sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_send_text(string);
	    String actual = sacreate.super_admin_logger_create_users_page_date_of_birth_userfield_text_value();
	    Assert.assertNotEquals(actual, string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * RADIO button test cases
	 * 
	 * 
	 * 
	 * 
	 */

	@Then("Verify that the address home radio button is already selected from my profile page for super_admin user")
	public void verify_that_the_address_home_radio_button_is_already_selected_from_my_profile_page() {
		boolean actual = saedit.super_admin_logger_update_users_page_address_type_home_radio_button_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the address office radio button is already selected from my profile page for super_admin user")
	public void verify_that_the_address_office_radio_button_is_already_selected_from_my_profile_page() {
		boolean actual = saedit.super_admin_logger_update_users_page_address_type_office_radio_button_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the address others radio button is already selected from my profile page for super_admin user")
	public void verify_that_the_address_others_radio_button_is_already_selected_from_my_profile_page() {
		boolean actual = saedit.super_admin_logger_update_users_page_address_type_others_radio_button_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the address office radio button is not selected that time from my profile page for super_admin user")
	public void verify_that_the_address_office_radio_button_is_not_selected_that_time_from_my_profile_page() {
	    boolean actual =saedit.super_admin_logger_update_users_office_radio_button_is_selected();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that the address others radio button is not selected that time from my profile page for super_admin user")
	public void verify_that_the_address_others_radio_button_is_not_selected_that_time_from_my_profile_page() {
		boolean actual =saedit.super_admin_logger_update_users_others_radio_button_is_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that the address home radio button is not selected that time from my profile page for super_admin user")
	public void verify_that_the_address_home_radio_button_is_not_selected_that_time_from_my_profile_page() {
		boolean actual =saedit.super_admin_logger_update_users_home_radio_button_is_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	/*
	 * 
	 * 
	 * address line 1
	 * 
	 * 
	 * 
	 * 
	 */
	


	@When("super_admin is enter the address line one as {string} and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_one_as_and_click_on_submit_button_from_my_profile_page(String string) {
		saedit.super_admin_logger_create_user_address_line_one_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_one_user_field_send_text(string);
		String actual = saedit.super_admin_logger_update_user_entered_address_line_one_text();
		Assert.assertEquals(actual, string);
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin should not get any red tick and note below the address line one user field from my profile page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_address_line_one_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_address_line_one_userfield_below_note_text_is_not_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@Then("Verify that super_admin should get any red tick and note below the address line one user field from my profile page")
	public void verify_that_super_admin_should_get_any_red_tick_and_note_below_the_address_line_one_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_address_line_one_userfield_below_note_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@When("super_admin is enter the address line one as more than 255 characters and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_one_as_more_than_255_characters_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_one_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("255_plus_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_one_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_plus_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super_admin is enter the address line one as 255 and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_one_as_255_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_one_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("255_character_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_one_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_character_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super_admin is enter the address line one as 150 and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_one_as_150_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_one_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("150_character_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_one_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("150_character_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super_admin is enter the address line one as 50 and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_one_as_50_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_one_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_one_user_field_send_text(AppHooks.tdata.getProperty("50_character_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_one_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("50_character_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	

	/*
	 * 
	 * address line 2
	 * 
	 * 
	 * 
	 */


	@When("super_admin is enter the address line two as {string} and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_two_as_and_click_on_submit_button_from_my_profile_page(String string) {
		saedit.super_admin_logger_create_user_address_line_two_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_two_user_field_send_text(string);
		String actual = saedit.super_admin_logger_update_user_entered_address_line_two_text();
		Assert.assertEquals(actual, string);
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin should not get any red tick and note below the address line two user field from my profile page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_address_line_two_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_address_line_two_userfield_below_note_text_is_not_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@Then("Verify that super_admin should get any red tick and note below the address line two user field from my profile page")
	public void verify_that_super_admin_should_get_any_red_tick_and_note_below_the_address_line_two_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_address_line_two_userfield_below_note_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@When("super_admin is enter the address line two as more than 255 characters and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_two_as_more_than_255_characters_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_two_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("255_plus_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_two_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_plus_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super_admin is enter the address line two as 255 and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_two_as_255_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_two_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("255_character_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_two_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("255_character_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super_admin is enter the address line two as 150 and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_two_as_150_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_two_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("150_character_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_two_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("150_character_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super_admin is enter the address line two as 50 and click on submit button from my profile page")
	public void super_admin_is_enter_the_address_line_two_as_50_and_click_on_submit_button_from_my_profile_page() {
		saedit.super_admin_logger_create_user_address_line_two_user_field_is_cleared();
		saedit.super_admin_logger_update_user_address_line_two_user_field_send_text(AppHooks.tdata.getProperty("50_character_address"));
		String actual = saedit.super_admin_logger_update_user_entered_address_line_two_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("50_character_address"));
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * country
	 * 
	 * 
	 */

	@Then("Verify that the country dropdown value should be selected {string} from my profile page for super_admin user")
	public void verify_that_the_country_dropdown_value_should_be_selected_from_my_profile_page(String string) {
		saedit.super_admin_logger_update_users_page_country_userfield_dropdown_is_click();
		String actual=saedit.super_admin_logger_update_users_page_country_dropdown_uae_is_selected();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}	
	
	
	
	

	/*
	 * 
	 * State
	 * 
	 * 
	 */
	


	@When("super_admin is enter the state as {string} and click on submit button from my profile page")
	public void super_admin_is_enter_the_state_as_and_click_on_submit_button_from_my_profile_page(String string) {
		saedit.super_admin_logger_create_user_state_user_field_is_cleared();
		saedit.super_admin_logger_update_user_state_user_field_send_text(string);
		String actual = saedit.super_admin_logger_update_user_entered_state_text();
		Assert.assertEquals(actual, string);
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin should not get any red tick and note below the state user field from my profile page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_state_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_state_userfield_below_note_text_is_not_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@Then("Verify that super_admin should get any red tick and note below the state user field from my profile page")
	public void verify_that_super_admin_should_get_any_red_tick_and_note_below_the_state_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_state_userfield_below_note_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	
	

	/*
	 * 
	 * 
	 * 
	 * City
	 * 
	 * 
	 */


	@When("super_admin is enter the city as {string} and click on submit button from my profile page")
	public void super_admin_is_enter_the_city_as_and_click_on_submit_button_from_my_profile_page(String string) {
		saedit.super_admin_logger_create_user_city_user_field_is_cleared();
		saedit.super_admin_logger_update_user_city_user_field_send_text(string);
		String actual = saedit.super_admin_logger_update_user_entered_city_text();
		Assert.assertEquals(actual, string);
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin should not get any red tick and note below the city user field from my profile page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_city_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_city_userfield_below_note_text_is_not_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@Then("Verify that super_admin should get any red tick and note below the city user field from my profile page")
	public void verify_that_super_admin_should_get_any_red_tick_and_note_below_the_city_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_city_userfield_below_note_text_is_displayed();
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
	 * Zip code
	 *
	 * 
	 * 
	 * 
	 * 
	 */
	

	@When("super_admin is enter the zip code as {string} and click on submit button from my profile page")
	public void super_admin_is_enter_the_zip_code_as_and_click_on_submit_button_from_my_profile_page(String string) {
		saedit.super_admin_logger_create_user_zip_code_user_field_is_cleared();
		
		saedit.super_admin_logger_update_user_zip_code_user_field_send_text(string);
		String actual = saedit.super_admin_logger_update_user_entered_zip_code_text();
		Assert.assertEquals(actual, string);
		saedit.super_admin_logger_update_users_page_submit_button_with_js_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super_admin should not get any red tick and note below the zip code user field from my profile page")
	public void verify_that_super_admin_should_not_get_any_red_tick_and_note_below_the_zip_code_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_zip_code_userfield_below_note_text_is_not_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
	}

	@Then("Verify that super_admin should get any red tick and note below the zip code user field from my profile page")
	public void verify_that_super_admin_should_get_any_red_tick_and_note_below_the_zip_code_user_field_from_my_profile_page() {
		boolean actual=saedit.super_admin_logger_update_user_zip_code_userfield_below_note_text_is_displayed();
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
     */
	
	
	

    @When("super_admin is click on the cancel button")
    public void user_is_click_on_the_cancel_button() {
    	saprof.super_admin_logger_my_profile_page_cancel_button_is_clicked();
    }
    
    @Then("Verify that cancel button should navigate to the dashborad page for super_admin user")
    public void verify_that_cancel_button_should_navigate_to_the_dashborad_page() {
        boolean actual=samain.super_admin_logger_image_in_the_card_box_is_displayed();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
    
}
