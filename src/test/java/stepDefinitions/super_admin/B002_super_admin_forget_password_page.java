package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.*;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B002_super_admin_forget_password_page {

	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Forget_password_page_objects safp = new Forget_password_page_objects(DriverFactory.getDriver());
	private Z999_mailtrap_objects mailtrap=new Z999_mailtrap_objects(DriverFactory.getDriver());
	
	
	
	private Logger logger = LogManager.getLogger(B002_super_admin_forget_password_page.class);

	
	/**
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

	@Given("Verify that super admin into the forget password page as expected title {string}")
	public void verify_that_user_is_on_the_log_in_as_super_admin_into_the_forget_password_page(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_in_page_forget_password_link_is_clicked();
		String titles = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(titles, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that forget password title text should be displayed into the super admin forget password page")
	public void verify_that_forget_password_title_text_should_be_displayed_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_forget_password_title_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that forget password subtitle text should be displayed into the super admin forget password page")
	public void verify_that_forget_password_subtitle_text_should_be_displayed_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_forget_password_subtitle_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email title text should be displayed into the super admin forget password page")
	public void verify_that_email_title_text_should_be_displayed_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_email_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email user field should be placeholder value as expected {string} into the super admin forget password page")
	public void verify_that_email_user_field_should_be_placeholder_value_as_expected_into_the_super_admin_forget_password_page(
			String expected) {
		String actual = safp.user_forget_password_email_placeholder_value();
		Assert.assertEquals(actual, expected);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email user field should be clickable into the super admin forget password page")
	public void verify_that_email_user_field_should_be_clickable_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_email_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that request reset link should be clickable into the super admin forget password page")
	public void verify_that_request_reset_link_should_be_clickable_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_request_reset_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that request reset link button be able to mouse hover into the super admin forget password page")
	public void verify_that_request_reset_link_button_be_able_to_mouse_hover_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_request_reset_link_button_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that did you remember your password text should be displayed below the request link into the super admin forget password page")
	public void verify_that_did_you_remember_your_password_text_should_be_displayed_below_the_request_link_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_did_you_remember_your_password_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that try to sign in link should be clickable into the super admin forget password page")
	public void verify_that_try_to_sign_in_link_should_be_clickable_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_try_to_sign_in_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

//	@Then("Verify that shield title text should be displayed into the super admin forget password page")
//	public void verify_that_shield_title_text_should_be_displayed_into_the_super_admin_forget_password_page() {
//		boolean actual = safp.user_forget_password_shield_title_text_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}

	@Then("Verify that shield logo should be displayed into the super admin forget password page")
	public void verify_that_shield_logo_should_be_displayed_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_shield_logo_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that shield subtitle reset your password text should be displayed into the super admin forget password page")
	public void verify_that_shield_subtitle_reset_your_password_text_should_be_displayed_into_hte_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_shield_subtitle_reset_your_password_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that shield subtitle header section text should be displayed into the super admin forget password page")
	public void verify_that_shield_subtitle_header_section_text_should_be_displayed_into_the_super_admin_forget_password_page() {
		boolean actual = safp.user_forget_password_shield_subtitle_header_section_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	/**
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

	@When("super admin user enter only valid email and try to click on request set link in into app {string} from super admin forget password log in page")
	public void super_admin_user_enter_only_valid_email_and_try_to_click_on_request_set_link_in_into_app(String email) {
		safp.user_forget_password_enter_email_into_user_field(email);
		String value=safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, email);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super admin user should get the expected note link has been sent to your email address from super admin forget password log in page")
	public void Verify_that_super_admin_user_should_get_the_expected_note_link_has_been_sent_to_your_email_address(){
		boolean actual=safp.user_forget_password_link_has_been_sent_text_pop_up_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user is in the mailtrap inbox page with required credentials of the log in user from super admin forget password log in page")
	public void user_is_in_the_mailtrap_inbox_page_with_required_credentials_of_the_log_in_user() {
	    DriverFactory.getDriver().get(AppHooks.prop.getProperty("mailtrapURL"));
	    mailtrap.mailtrap_user_click_on_log_in_button();
	    mailtrap.mailtrap_user_enter_email_into_the_user_field(AppHooks.prop.getProperty("mailtrapEmail"));
	    mailtrap.mailtrap_user_click_the_next_button();
	    mailtrap.mailtrap_user_enter_password_into_the_user_field(AppHooks.prop.getProperty("mailtrapPassword"));
	    mailtrap.mailtrap_user_click_on_log_in_button_before_scroll_down();
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the mail with subject title is {string} from super admin forget password log in page")
	public void verify_that_user_should_get_the_mail_with_subject_title_is(String string) {
		mailtrap.mailtrap_user_email_testing_is_click();
		mailtrap.mailtrap_user_inbox_is_click();
		mailtrap.mailtrap_user_demo_inbox_is_click();
	   String actual= mailtrap.mailtrap_get_the_mail_with_subject_title();
	   Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that mail containing link text must be {string} from super admin forget password log in page")
	public void verify_that_mail_containing_link_text_must_be(String string) {
		mailtrap.mailtrap_get_the_mail_with_subject_title_click();
	    String actuals= mailtrap.mailtrap_mail_link_reset_password();
	    Assert.assertEquals(actuals, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that reset password email link should navigates to the change password page {string} from super admin forget password log in page")
	public void verify_that_reset_password_email_link_should_navigates_to_the_change_password_page(String string) {
		String actual =  mailtrap.mailtrap_mail_link_reset_password_click_and_get_title();
		Assert.assertEquals(actual, string);
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
	 */
	




	

	

	

	

	
	


	@Given("Verify that user is on the super admin log in forget password page as expected page title is {string}")
	public void verify_that_user_is_on_the_super_admin_log_in_forget_password_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_in_page_forget_password_link_is_clicked();
		String title = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(title, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("super admin user enter valid email and try to click on request reset link in into application {string} in super admin forget password log in page")
	public void super_admin_user_enter_valid_email_and_try_to_click_on_request_reset_link_in_into_application(String email) {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		safp.user_forget_password_enter_email_into_user_field(email);
		String value=safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, email);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super admin user should get the expected red tick in email user field in super admin log in page")
	public void verify_that_super_admin_user_should_get_the_expected_red_tick_in_email_user_field_in_super_admin_log_in_page() {
		safp.user_forget_password_request_reset_link_is_clicked();
		boolean value=safp.user_forget_password_red_tick_in_email_user_field_is_displayed();
		Assert.assertEquals(true, value);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super admin user enter invalid email and try to click on request reset link in into aplication {string} in super admin forget password log in page")
	public void super_admin_user_enter_invalid_email_and_try_to_click_on_request_reset_link_in_into_aplication(String email) {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		safp.user_forget_password_enter_email_into_user_field(email);
		String value=safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value.replaceAll(" ", ""), email.replaceAll(" ", ""));
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super admin user enter 190 characters into the email user field and try to click on request reset link in into the application")
	public void super_admin_user_enter_190_characters_into_the_email_user_field_and_try_to_click_on_request_reset_link_in_into_application() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		String email_190_characters=AppHooks.tdata.getProperty("email_190_characters");
		safp.user_forget_password_enter_email_into_user_field(email_190_characters);
		String value = safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, email_190_characters);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super admin user enter 100 characters into the email user field and try to click on request reset link in into the application")
	public void super_admin_user_enter_100_characters_into_the_email_user_field_and_try_to_click_on_request_reset_link_in_into_the_application() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		String email_100_characters=AppHooks.tdata.getProperty("email_100_characters");
		safp.user_forget_password_enter_email_into_user_field(email_100_characters);
		String value = safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, email_100_characters);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@When("super admin user enter 50 characters into the email user field and try to click on request reset link in into the application")
	public void super_admin_user_enter_50_characters_into_the_email_user_field_and_try_to_click_on_request_reset_link_in_into_the_application() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		String email_50_characters=AppHooks.tdata.getProperty("email_50_characters");
		safp.user_forget_password_enter_email_into_user_field(email_50_characters);
		String value = safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, email_50_characters);
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

	@When("partner user enter valid email and try to click on request reset link in into application")
	public void partner_user_enter_valid_email_and_try_to_click_on_request_reset_link_in_into_application() {
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		safp.user_forget_password_enter_email_into_user_field(AppHooks.prop.getProperty("partner_email"));
		String value=safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, AppHooks.prop.getProperty("partner_email"));
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user is on the super admin log in page and check email user field is empty")
	public void  verify_that_user_is_on_the_super_admin_log_in_page_and_check_email_user_field_is_empty() {
		boolean actual =salogin.administrator_user_email_userfield_is_cleared();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user is on the super admin log in page and check password user field is empty in super admin log in page")
	public void  verify_that_user_is_on_the_super_admin_log_in_page_and_check_password_user_field_is_empty() {
		boolean actual =salogin.administrator_user_password_userfield_is_cleared();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that super admin user get the active element on the email userfield in super admin forget password page")
	public void verify_that_super_admin_user_get_the_active_element_on_the_email_userfield() {
		WebElement active_element=DriverFactory.getDriver().switchTo().activeElement();
		active_element.sendKeys(AppHooks.tdata.getProperty("email_50_characters"));
		String value = safp.user_forget_password_entered_email_text();
		Assert.assertEquals(value, AppHooks.tdata.getProperty("email_50_characters"));
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

//	@Then("Verify that super admin user get the eye button in the password userfield in super admin forget password page")
//	public void Verify_that_super_admin_user_get_the_eye_button_in_the_password_userfield() {
//		boolean actual=safp.user_user_have_password_eye_button_in_the_userfield();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}

}
