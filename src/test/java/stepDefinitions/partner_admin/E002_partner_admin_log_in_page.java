package stepDefinitions.partner_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Partner_log_in_page_objects;
import com.pages.Z999_mailtrap_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E002_partner_admin_log_in_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Partner_log_in_page_objects plp = new Partner_log_in_page_objects(DriverFactory.getDriver());
	private Z999_mailtrap_objects mailtrap=new Z999_mailtrap_objects(DriverFactory.getDriver());
	
	
	Logger logger = LogManager.getLogger(E002_partner_admin_log_in_page.class);

	
	/**
	 * 
	 * 
	 * 
	 * 
	 * SCR
	 * 
	 * 
	 *    
	 */
	
	@Given("Verify that user is on the partner log in page as expected page title is {string}")
	public void verify_that_user_is_on_the_partner_log_in_page_as_expected_page_title_is(String string) {
	    DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
	    lp.landing_page_log_in_button_is_clicked();
	    lp.landing_page_log_in_as_partner_button_is_clicked();
	    String actual=ElementUtil.eu.current_page_title(DriverFactory.getDriver());
	    Assert.assertEquals(actual, actual);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that sign in to your account title text should be displayed in partner log in page")
	public void verify_that_sign_in_to_your_account_title_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_to_your_account_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in to manage your business text should be displayed in partner log in page")
	public void verify_that_sign_in_to_manage_your_business_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_to_manage_your_business_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that left side shield title text should be displayed in partner log in page")
	public void verify_that_left_side_shield_title_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_left_side_shield_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side shield logo should be displayed in partner log in page")
	public void verify_that_left_side_shield_logo_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_left_side_shield_logo_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side sign in to your account text should be displayed in partner log in page")
	public void verify_that_left_side_sign_in_to_your_account_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_left_side_sign_in_to_your_account_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side sign in to manage your business text should be displayed in partner log in page")
	public void verify_that_left_side_sign_in_to_manage_your_business_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_left_side_sign_in_to_manage_your_business_text_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
	@Then("Verify that sign in using email button should be displayed in partner log in page")
	public void verify_that_sign_in_using_email_button_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email button should be clickable in partner log in page")
	public void verify_that_sign_in_using_email_button_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email button should be able mouse hover in partner log in page")
	public void verify_that_sign_in_using_email_button_should_be_able_mouse_hover_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_button_should_be_able_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having email title text should be displayed in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_email_title_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_title_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having email asterisk should be displayed in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_email_asterisk_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_asterisk_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having email userfield should be displayed in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_email_userfield_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having email userfield should be clickable in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_email_userfield_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having email userfield placeholder value should be {string} in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_email_userfield_placeholder_value_should_be_in_partner_log_in_page(String string) {
		String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having get otp button should be displayed in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_get_otp_button_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having get otp button should be clickable in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_get_otp_button_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using email selected having get otp button should be able mouse hover in partner log in page")
	public void verify_that_sign_in_using_email_selected_having_get_otp_button_should_be_able_mouse_hover_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_able_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	
	@Then("Verify that sign in using mobile button should be displayed in partner log in page")
	public void verify_that_sign_in_using_mobile_button_should_be_displayed_in_partner_log_in_page() {
		plp.partner_log_in_page_sign_in_using_mobile_button_clicked();
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile button should be clickable in partner log in page")
	public void verify_that_sign_in_using_mobile_button_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile button should be able mouse hover in partner log in page")
	public void verify_that_sign_in_using_mobile_button_should_be_able_mouse_hover_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_button_should_be_able_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having mobile number title text should be displayed in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_mobile_number_title_text_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_title_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having mobile number asterisk should be displayed in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_mobile_number_asterisk_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_asterisk_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile dropdown should be displayed in partner log in page")
	public void verify_that_sign_in_using_mobile_dropdown_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_dropdown_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile dropdown user field should be clickable in partner log in page")
	public void verify_that_sign_in_using_mobile_dropdown_user_field_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_dropdown_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile dropdown list should be clickable in partner log in page")
	public void verify_that_sign_in_using_mobile_dropdown_list_should_be_clickable_in_partner_log_in_page() {
		plp.partner_log_in_page_sign_in_using_mobile_dropdown_should_be_click();
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_dropdown_list_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having mobile number userfield should be displayed in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_mobile_number_userfield_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having mobile number userfield should be clickable in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_mobile_number_userfield_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having mobile number userfield placeholder value should be {string} in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_mobile_number_userfield_placeholder_value_should_be_in_partner_log_in_page(String string) {
		String actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having get otp button should be displayed in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_get_otp_button_should_be_displayed_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having get otp button should be clickable in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_get_otp_button_should_be_clickable_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in using mobile selected having get otp button should be able mouse hover in partner log in page")
	public void verify_that_sign_in_using_mobile_selected_having_get_otp_button_should_be_able_mouse_hover_in_partner_log_in_page() {
		boolean actual = plp.partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_should_be_able_mouse_hover();
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
	 * 
	 * 
	 * 
	 */
	
	@When("user enter the credential into the email user field {string} and click on the get otp button")
	public void user_enter_the_credential_into_the_email_user_field_and_click_on_the_get_otp_button(String string) {
	    plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(string);
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text();
	    Assert.assertEquals(actual, string);
	    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in the email user field from the partner log in page")
	public void verify_that_user_should_get_the_green_tick_in_the_email_user_field_from_the_partner_log_in_page() {
	    boolean actual=plp.partner_log_in_should_get_the_green_tick_in_the_email_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the email user field from the partner log in page")
	public void verify_that_user_should_get_the_red_tick_in_the_email_user_field_from_the_partner_log_in_page() {
		boolean actual=plp.partner_log_in_should_get_the_red_tick_in_the_email_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the credential into the email user field 255 plus char and click on the get otp button")
	public void user_enter_the_credential_into_the_email_user_field_255_plus_char_and_click_on_the_get_otp_button() {
		plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(AppHooks.tdata.getProperty("email_255_plus_characters"));
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_plus_characters"));
	    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the credential into the email user field 255 char and click on the get otp button")
	public void user_enter_the_credential_into_the_email_user_field_255_char_and_click_on_the_get_otp_button() {
		plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(AppHooks.tdata.getProperty("email_255_characters"));
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_255_characters"));
	    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the credential into the email user field 200 char and click on the get otp button")
	public void user_enter_the_credential_into_the_email_user_field_200_char_and_click_on_the_get_otp_button() {
		plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(AppHooks.tdata.getProperty("email_200_characters"));
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_200_characters"));
	    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the credential into the email user field 100 char and click on the get otp button")
	public void user_enter_the_credential_into_the_email_user_field_100_char_and_click_on_the_get_otp_button() {
		plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(AppHooks.tdata.getProperty("email_100_characters"));
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_100_characters"));
	    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the credential into the email user field 50 char and click on the get otp button")
	public void user_enter_the_credential_into_the_email_user_field_50_char_and_click_on_the_get_otp_button() {
		plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(AppHooks.tdata.getProperty("email_50_characters"));
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text();
	    Assert.assertEquals(actual, AppHooks.tdata.getProperty("email_50_characters"));
	    plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
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
	
	
	@When("user enter the mobile number into the mobile number user field {string} and click on the get otp button")
	public void user_enter_the_mobile_number_into_the_mobile_number_user_field_and_click_on_the_get_otp_button(String string) {
		plp.partner_log_in_page_sign_in_using_mobile_button_clicked();
		plp.partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_send_text(string);
	    String actual = plp.partner_log_in_page_sign_in_using_email_selected_having_mobile_number_userfield_entered_text();
	    Assert.assertEquals(actual, string);
	    plp.partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the green tick in the mobile number user field from the partner log in page")
	public void verify_that_user_should_get_the_green_tick_in_the_mobile_number_user_field_from_the_partner_log_in_page() {
		boolean actual=plp.partner_log_in_should_get_the_green_tick_in_the_mobile_number_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the red tick in the mobile number user field from the partner log in page")
	public void verify_that_user_should_get_the_red_tick_in_the_mobile_number_user_field_from_the_partner_log_in_page() {
		boolean actual=plp.partner_log_in_should_get_the_red_tick_in_the_mobile_number_user_field_is_displayed();
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
	 */
	
	@Then("Verify that user is on the same page due to inactive status of the user from the partner log in page")
	public void verify_that_user_is_on_the_same_page_due_to_inactive_status_of_the_user_from_the_partner_log_in_page() {
	    boolean actual = plp.partner_log_in_get_otp_page_pop_up_user_is_not_active_should_be_displayed();
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
	 */
	
	
	@When("user navigate to the mailtrap inbox with valid credentials")
	public void user_navigate_to_the_mailtrap_inbox_with_valid_credentials() {
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
	}
	
	@Then("Verify that user should get the mail for verfication of your email address")
	public void verify_that_user_should_get_the_mail_for_verfication_of_your_email_address() {
		boolean actual=mailtrap.mailtrap_verify_email_address_link_is_clickable();
		mailtrap.mailtrap_verify_email_address_link_is_clicked();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that Verify email address link should open in new tab as expected email verify successfully pop up should be displayed in partner log in page")
	public void verify_that_verify_email_address_link_should_open_in_new_tab_as_expected_email_verify_successfully_pop_up_should_be_displayed_in_partner_log_in_page() {
	    boolean actual = plp.partner_log_in_page_email_verified_successfully_pop_up_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the partner log in page as expected sign in button should be displayed from partner log in page")
	public void verify_that_user_is_on_the_partner_log_in_page_as_expected_sign_in_button_should_be_displayed_from_partner_log_in_page() {
		boolean gettext = plp.partner_log_in_page_sign_in_using_email_selected_having_email_title_text_should_be_displayed();
		Assert.assertEquals(gettext, true);
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
	 * 
	 * 
	 */
	
	@When("again click due to un authentication pop up")
	public void again_click_due_to_un_authentication_pop_up() {
		plp.partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked();
	}
	
	@Then("Verify that sign in into your account title text is displayed from partner log in otp page")
	public void verify_that_sign_in_into_your_account_title_text_is_displayed_from_partner_log_in_otp_page() {
	    boolean actual = plp.partner_log_in_otp_page_sign_in_into_your_account_title_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that sign in into manage your business text should be displayed from the partner log in otp page")
	public void verify_that_sign_in_into_manage_your_business_text_should_be_displayed_from_the_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_sign_in_into_manage_your_business_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that please enter six digit otp sent to your email mobile text above user field is displayed in partner log in otp page")
	public void verify_that_please_enter_six_digit_otp_sent_to_your_email_mobile_text_above_user_field_is_displayed_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_please_enter_six_digit_otp_sent_to_your_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side shield title text should be displayed in partner log in otp page")
	public void verify_that_left_side_shield_title_text_should_be_displayed_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_left_side_shield_title_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verfiy that left side shield logo should be displayed in partner log in otp page")
	public void verfiy_that_left_side_shield_logo_should_be_displayed_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_left_side_shield_logo_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side sign in into your account text is displayed in partner log in otp page")
	public void verify_that_left_side_sign_in_into_your_account_text_is_displayed_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_left_side_sign_in_into_your_account_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that left side sign in into manage your business text is displayed in partner log in otp page")
	public void verify_that_left_side_sign_in_into_manage_your_business_text_is_displayed_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_left_side_sign_in_into_manage_your_business_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that otp user fields counts should be {int} in partner log in otp page")
	public void verify_that_otp_user_fields_counts_should_be_in_partner_log_in_otp_page(Integer int1) {
		int actual = plp.partner_log_in_otp_page_otp_user_fields_counts_is();
	    Assert.assertSame(actual, int1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user field placeholder value should be {string} in partner log in otp page")
	public void verify_that_user_field_placeholder_value_should_be_in_partner_log_in_otp_page(String string) {
		String actual = plp.partner_log_in_otp_page_otp_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that otp user fields should be clickable in partner log in otp page")
	public void verify_that_otp_user_fields_should_be_clickable_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_otp_user_fields_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that verify otp button should be displayed in partner log in otp page")
	public void verify_that_verify_otp_button_should_be_displayed_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_verify_otp_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that verify otp button should be clickable in partner log in otp page")
	public void verify_that_verify_otp_button_should_be_clickable_in_partner_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_verify_otp_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that verify otp button should be able to mouse hover in log in otp page")
	public void verify_that_verify_otp_button_should_be_able_to_mouse_hover_in_log_in_otp_page() {
		boolean actual = plp.partner_log_in_otp_page_verify_otp_button_is_able_to_mouse();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	@When("user navigate to new tab mailtrap inbox with valid credentials")
	public void user_navigate_to_new_tab_mailtrap_inbox_with_valid_credentials() {
		ElementUtil.eu.opened_second_tab_with_parent_tab();
		ElementUtil.eu.switch_handel_to_the_second_tab(DriverFactory.getDriver());
		System.out.println("New tab opened perfectly");
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
	}
	
	@Then("Copy the otp from the mail box and paste it into the otp user field from the partner log otp in page as expected title {string}")
	public void copy_the_otp_from_the_mail_box_and_paste_it_into_the_otp_user_field_from_the_partner_log_otp_in_page(String title) {
	    String actual = mailtrap.mailtrap_send_mail_otp_is_copied();
	    System.out.println(actual);
	    plp.switch_to_parent_window();
	    plp.partner_log_in_otp_page_otp_user_fields_pasted_otp_into_user_fields(actual);
	    plp.partner_log_in_otp_page_verify_otp_is_clicked();
	    String string =ElementUtil.eu.current_page_title(DriverFactory.getDriver());
	    Assert.assertEquals(string, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Copy the wrong otp {string} from the mail box and paste it into the otp user field from the partner log otp in page as expected title {string}")
	public void copy_the_wrong_otp_from_the_mail_box_and_paste_it_into_the_otp_user_field_from_the_partner_log_otp_in_page(String int1 , String title) {
	    String actual = int1;
	    System.out.println(actual);
	    plp.partner_log_in_otp_page_otp_user_fields_pasted_otp_into_user_fields(actual);
	    plp.partner_log_in_otp_page_verify_otp_is_clicked();
	   boolean actual1 = plp.partner_log_in_otp_page_wrong_password_pop_up_is_displayed();
	    Assert.assertEquals(actual1, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
