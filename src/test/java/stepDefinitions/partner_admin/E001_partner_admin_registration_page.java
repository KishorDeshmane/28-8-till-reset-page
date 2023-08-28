package stepDefinitions.partner_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Partner_log_in_page_objects;
import com.pages.Partner_registration_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E001_partner_admin_registration_page {
	
	private Landing_page_objects lp=new Landing_page_objects(DriverFactory.getDriver());
	private Partner_registration_page_objects prp = new Partner_registration_page_objects(DriverFactory.getDriver());
	private Partner_log_in_page_objects plp=new Partner_log_in_page_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(E001_partner_admin_registration_page.class);
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * SCR 01
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Given("Verify that user is on the partner registration page from landing page as expected page title {string}")
	public void verify_that_user_is_on_the_partner_registration_page_from_landing_page_as_expected_page_title(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.landing_page_register_as_partner_button_is_click();
		String str=ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(string, str);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that register as partner user page title text is displayed in the partner registration page")
	public void verify_that_register_as_partner_user_page_title_text_is_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_page_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that register to manage your business subtitle text is displayed in the partner registration page")
	public void verify_that_register_to_manage_your_business_subtitle_text_is_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_register_to_manage_your_business_subtitle_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that first name above the user field should be displayed in the partner registration page")
	public void verify_that_first_name_above_the_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_first_name_above_the_user_field_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name asterisk should be displayed in the registration page")
	public void verify_that_first_name_asterisk_should_be_displayed_in_the_registration_page() {
		boolean actual = prp.register_as_partner_first_name_asterisk_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name user field should be displayed in the partner registration page")
	public void verify_that_first_name_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_first_name_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name user field should be clickable in the partner registration page")
	public void verify_that_first_name_user_field_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_first_name_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that first name user field placeholder value should be {string} in partner registration page")
	public void verify_that_first_name_user_field_placeholder_value_should_be_in_partner_registration_page(String string) {
		String actual = prp.register_as_partner_first_name_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	@Then("Verify that last name above the user field should be displayed in the partner registration page")
	public void verify_that_last_name_above_the_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_last_name_above_the_user_field_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name asterisk should be displayed in the registration page")
	public void verify_that_last_name_asterisk_should_be_displayed_in_the_registration_page() {
		boolean actual = prp.register_as_partner_last_name_asterisk_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name user field should be displayed in the partner registration page")
	public void verify_that_last_name_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_last_name_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name user field should be clickable in the partner registration page")
	public void verify_that_last_name_user_field_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_last_name_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that last name user field placeholder value should be {string} in partner registration page")
	public void verify_that_last_name_user_field_placeholder_value_should_be_in_partner_registration_page(String string) {
		String actual = prp.register_as_partner_last_name_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	@Then("Verify that email above the user field should be displayed in the partner registration page")
	public void verify_that_email_above_the_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_email_above_the_user_field_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email asterisk should be displayed in the registration page")
	public void verify_that_email_asterisk_should_be_displayed_in_the_registration_page() {
		boolean actual = prp.register_as_partner_email_asterisk_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email user field should be displayed in the partner registration page")
	public void verify_that_email_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_email_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email user field should be clickable in the partner registration page")
	public void verify_that_email_user_field_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_email_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that email user field placeholder value should be {string} in partner registration page")
	public void verify_that_email_user_field_placeholder_value_should_be_in_partner_registration_page(String string) {
		String actual = prp.register_as_partner_email_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	@Then("Verify that mobile number above the user field should be displayed in the partner registration page")
	public void verify_that_mobile_number_above_the_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_mobile_number_above_the_user_field_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number asterisk should be displayed in the partner registration page")
	public void verify_that_mobile_number_asterisk_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_mobile_number_asterisk_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number dropdown should be clickable in the partner registration page")
	public void verify_that_mobile_number_dropdown_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_mobile_number_dropdown_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number dropdown list should be clickable in the partner registration page")
	public void verify_that_mobile_number_dropdown_list_should_be_clickable_in_the_partner_registration_page() {
		prp.register_as_partner_mobile_number_dropdown_is_clickable();
		boolean actual = prp.register_as_partner_mobile_number_dropdown_list_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number user field should be displayed in the partner registration page")
	public void verify_that_mobile_number_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_mobile_number_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number user field should be clickable in the partner registration page")
	public void verify_that_mobile_number_user_field_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_mobile_number_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mobile number user field placeholder value should be {string} in partner registration page")
	public void verify_that_mobile_number_user_field_placeholder_value_should_be_in_partner_registration_page(String string) {
		String actual = prp.register_as_partner_mobile_number_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	@Then("Verify that password above the user field should be displayed in the partner registration page")
	public void verify_that_password_above_the_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_password_above_the_user_field_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password asterisk should be displayed in the registration page")
	public void verify_that_password_asterisk_should_be_displayed_in_the_registration_page() {
		boolean actual = prp.register_as_partner_password_asterisk_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password user field should be displayed in the partner registration page")
	public void verify_that_password_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_password_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password user field should be clickable in the partner registration page")
	public void verify_that_password_user_field_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_password_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that password user field placeholder value should be {string} in partner registration page")
	public void verify_that_password_user_field_placeholder_value_should_be_in_partner_registration_page(String string) {
		String actual = prp.register_as_partner_password_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	@Then("Verify that comfirm password above the user field should be displayed in the partner registration page")
	public void verify_that_comfirm_password_above_the_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_comfirm_password_above_the_user_field_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password asterisk should be displayed in the registration page")
	public void verify_that_comfirm_password_asterisk_should_be_displayed_in_the_registration_page() {
		boolean actual = prp.register_as_partner_comfirm_password_asterisk_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password user field should be displayed in the partner registration page")
	public void verify_that_comfirm_password_user_field_should_be_displayed_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_comfirm_password_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password user field should be clickable in the partner registration page")
	public void verify_that_comfirm_password_user_field_should_be_clickable_in_the_partner_registration_page() {
		boolean actual = prp.register_as_partner_comfirm_password_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password user field placeholder value should be {string} in partner registration page")
	public void verify_that_comfirm_password_user_field_placeholder_value_should_be_in_partner_registration_page(String string) {
		String actual = prp.register_as_partner_comfirm_password_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that register button should be displayed in the register as partner page")
	public void verify_that_register_button_should_be_displayed_in_the_register_as_partner_page() {
		boolean actual = prp.register_as_partner_register_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that register button should be clickable in the register as parter page")
	public void verify_that_register_button_should_be_clickable_in_the_register_as_parter_page() {
		boolean actual = prp.register_as_partner_register_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that register button should be able to mouse hover in register as partner page")
	public void verify_that_register_button_should_be_able_to_mouse_hover_in_register_as_partner_page() {
		boolean actual = prp.register_as_partner_register_button_is_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side shield text should be displayed in the register as partner page")
	public void verify_that_left_side_shield_text_should_be_displayed_in_the_register_as_partner_page() {
		boolean actual = prp.register_as_partner_left_side_shield_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side shield logo should be displayed in the register as partner page")
	public void verify_that_left_side_shield_logo_should_be_displayed_in_the_register_as_partner_page() {
		boolean actual = prp.register_as_partner_left_side_shield_logo_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side register as partner text should displayed in the register as partner page")
	public void verify_that_left_side_register_as_partner_text_should_displayed_in_the_register_as_partner_page() {
		boolean actual = prp.register_as_partner_left_side_register_as_partner_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side register to manage text should displayed in the register as partner page")
	public void verify_that_left_side_register_to_manage_text_should_displayed_in_the_register_as_partner_page() {
		boolean actual = prp.register_as_partner_left_side_register_to_manage_text_is_displayed();
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
	 */
	
	@When("user enter the text into the first name user field as {string} and click on register button in register as partner page")
	public void user_enter_the_text_into_the_first_name_user_field_as_and_click_on_register_button_in_register_as_partner_page(String string) {
		prp.register_as_partner_first_name_user_field_send_text(string);
		String actual=prp.register_as_partner_first_name_entered_text();
		Assert.assertEquals(actual, string);
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in the first name user field from register as partner page")
	public void verify_that_user_should_get_the_green_tick_in_the_first_name_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_first_name_get_green_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the first name user field from register as partner page")
	public void verify_that_user_should_get_the_red_tick_in_the_first_name_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_first_name_get_red_tick_in_user_field();
		Assert.assertEquals(actual, true);
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@When("user enter the text into the last name user field as {string} and click on register button in register as partner page")
	public void user_enter_the_text_into_the_last_name_user_field_as_and_click_on_register_button_in_register_as_partner_page(String string) {
		prp.register_as_partner_last_name_user_field_send_text(string);
		String actual=prp.register_as_partner_last_name_entered_text();
		Assert.assertEquals(actual, string);
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in the last name user field from register as partner page")
	public void verify_that_user_should_get_the_green_tick_in_the_last_name_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_last_name_get_green_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the last name user field from register as partner page")
	public void verify_that_user_should_get_the_red_tick_in_the_last_name_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_last_name_get_red_tick_in_user_field();
		Assert.assertEquals(actual, true);
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@When("user enter the text into the email user field as {string} and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_email_user_field_as_and_click_on_the_register_button_in_register_as_partner_page(String string) {
		prp.register_as_partner_email_user_field_send_text(string);
		String actual=prp.register_as_partner_email_entered_text();
		Assert.assertEquals(actual, string);
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@When("user enter the text into the email user field 255 char and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_email_user_field_255_char_and_click_on_the_register_button_in_register_as_partner_page() {
		prp.register_as_partner_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_characters"));
		String actual=prp.register_as_partner_email_entered_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_characters"));
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the text into the email user field 200 char and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_email_user_field_200_char_and_click_on_the_register_button_in_register_as_partner_page() {
		prp.register_as_partner_email_user_field_send_text(AppHooks.tdata.getProperty("email_200_characters"));
		String actual=prp.register_as_partner_email_entered_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_200_characters"));
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the text into the email user field 100 char and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_email_user_field_100_char_and_click_on_the_register_button_in_register_as_partner_page() {
		prp.register_as_partner_email_user_field_send_text(AppHooks.tdata.getProperty("email_100_characters"));
		String actual=prp.register_as_partner_email_entered_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_100_characters"));
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the text into the email user field 50 char and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_email_user_field_50_char_and_click_on_the_register_button_in_register_as_partner_page() {
		prp.register_as_partner_email_user_field_send_text(AppHooks.tdata.getProperty("email_50_characters"));
		String actual=prp.register_as_partner_email_entered_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_50_characters"));
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the text into the email user field 255 plus char and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_email_user_field_255_plus_char_and_click_on_the_register_button_in_register_as_partner_page() {
		prp.register_as_partner_email_user_field_send_text(AppHooks.tdata.getProperty("email_255_plus_characters"));
		String actual=prp.register_as_partner_email_entered_text();
		Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_plus_characters"));
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that user should get the green tick in the email user field from register as partner page")
	public void verify_that_user_should_get_the_green_tick_in_the_email_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_email_get_green_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the email user field from register as partner page")
	public void verify_that_user_should_get_the_red_tick_in_the_email_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_email_get_red_tick_in_user_field();
		Assert.assertEquals(actual, true);
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@When("user enter the text into the mobile number user field as {string} and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_mobile_number_user_field_as_and_click_on_the_register_button_in_register_as_partner_page(String string) {
		prp.register_as_partner_mobile_number_user_field_send_text(string);
		String actual=prp.register_as_partner_mobile_number_entered_text();
		Assert.assertEquals(actual, string);
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in the mobile number user field from register as partner page")
	public void verify_that_user_should_get_the_green_tick_in_the_mobile_number_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_mobile_number_get_green_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the mobile number user field from register as partner page")
	public void verify_that_user_should_get_the_red_tick_in_the_mobile_number_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_mobile_number_get_red_tick_in_user_field();
		Assert.assertEquals(actual, true);
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
	 * 
	 * 
	 * 
	 * 
	 */
	
	@When("user enter the text into the password user field as {string} and click on the register button in register as partner page")
	public void user_enter_the_text_into_the_password_user_field_as_and_click_on_the_register_button_in_register_as_partner_page(String string) {
		prp.register_as_partner_password_user_field_send_text(string);
		String actual=prp.register_as_partner_password_entered_text();
		Assert.assertEquals(actual, string);
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in the password user field from register as partner page")
	public void verify_that_user_should_get_the_green_tick_in_the_password_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_password_get_green_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the password user field from register as partner page")
	public void verify_that_user_should_get_the_red_tick_in_the_password_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_password_get_red_tick_in_user_field();
		Assert.assertEquals(actual, true);
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@When("user enter the text into confirm password and password user field as {string} and click on the register button in register as partner page")
	public void user_enter_the_text_into_confirm_password_and_password_user_field_as_and_click_on_the_register_button_in_register_as_partner_page(String string) {
		prp.register_as_partner_password_user_field_send_text(string);
		prp.register_as_partner_confirm_password_user_field_send_text(string);
		String actual=prp.register_as_confirm_partner_password_entered_text();
		Assert.assertEquals(actual, string);
		prp.register_as_partner_register_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in confirm password user field from register as partner page")
	public void verify_that_user_should_get_the_green_tick_in_confirm_password_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_confirm_password_get_green_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in confirm password user field from register as partner page")
	public void verify_that_user_should_get_the_red_tick_in_confirm_password_user_field_from_register_as_partner_page() {
		boolean actual= prp.register_as_partner_confirm_password_get_red_tick_in_user_field();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the text into password user field as {string} confirm password {string} and click on the register button in register as partner page")
	public void user_enter_the_text_into_password_user_field_as_confirm_password_and_click_on_the_register_button_in_register_as_partner_page(String string, String string2) {
		prp.register_as_partner_password_user_field_send_text(string);
		prp.register_as_partner_confirm_password_user_field_send_text(string2);
		String actual=prp.register_as_confirm_partner_password_entered_text();
		Assert.assertEquals(actual, string2);
		prp.register_as_partner_register_button_is_click();
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
	 * 
	 * 
	 */
	
	@When("user enter first name into the user field as {string} into the partner registration page")
	public void user_enter_first_name_into_the_user_field_as_into_the_partner_registration_page(String string) {
	    prp.register_as_partner_first_name_user_field_send_text(string);
	    String actual=prp.register_as_partner_first_name_entered_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter last name into the user field as {string} into the partner registration page")
	public void user_enter_last_name_into_the_user_field_as_into_the_partner_registration_page(String string) {
		prp.register_as_partner_last_name_user_field_send_text(string);
	    String actual=prp.register_as_partner_last_name_entered_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter email into the user field as {string} into the partner registration page")
	public void user_enter_email_into_the_user_field_as_into_the_partner_registration_page(String string) {
		prp.register_as_partner_email_user_field_send_text(string);
	    String actual=prp.register_as_partner_email_entered_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter mobile number into the user field as {string} into the partner registration page")
	public void user_enter_mobile_number_into_the_user_field_as_into_the_partner_registration_page(String string) {
		prp.register_as_partner_mobile_number_user_field_send_text(string);
	    String actual=prp.register_as_partner_mobile_number_entered_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter password into the user field as {string} into the partner registration page")
	public void user_enter_password_into_the_user_field_as_into_the_partner_registration_page(String string) {
		prp.register_as_partner_password_user_field_send_text(string);
	    String actual=prp.register_as_partner_password_entered_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter confirm password into the user field as {string} into the partner registration page")
	public void user_enter_confirm_password_into_the_user_field_as_into_the_partner_registration_page(String string) {
		prp.register_as_partner_confirm_password_user_field_send_text(string);
	    String actual=prp.register_as_confirm_partner_password_entered_text();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click the register button from partner registration page")
	public void user_click_the_register_button_from_partner_registration_page() {
		boolean actual =prp.register_as_partner_register_button_is_clickable();
		prp.register_as_partner_register_button_is_click();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the partner log in page")
	public void verify_that_user_is_on_the_partner_log_in_page() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    boolean actual = plp.partner_log_page_get_otp_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	/*
	 * 
	 * 
	 * 
	 */
	
	
	@Then("user should get the partner created successfully and a verification mail has been sent to you pop up to the user in partner log in page")
	public void user_should_get_the_Partner_created_successfully_and_a_verification_mail_has_been_sent_to_you_pop_up_to_the_user_in_partner_log_in_page() {
	    boolean actual = plp.partner_log_in_pop_up_partner_created_successfully_and_a_verification_mail_has_been_sent_to_you_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	

	
	
	
	
}
