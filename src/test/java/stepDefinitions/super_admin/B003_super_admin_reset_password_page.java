package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Forget_password_page_objects;
import com.pages.Reset_password_page_objects;
import com.pages.Z999_mailtrap_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B003_super_admin_reset_password_page {

	

	
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Forget_password_page_objects safp = new Forget_password_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Reset_password_page_objects respass=new Reset_password_page_objects(DriverFactory.getDriver());
	private Z999_mailtrap_objects mailtrap=new Z999_mailtrap_objects(DriverFactory.getDriver());
	
	
	
	private Logger logger = LogManager.getLogger(B003_super_admin_reset_password_page.class);

	
	
	
	
	
	
	
	
	
	@Then("Verify that title text of the page reset you password should be displayed in super admin reset your password page")
	public void verify_that_title_text_of_the_page_reset_you_password_should_be_displayed_in_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_title_text_of_the_page_reset_you_password_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	
	@Then("Verify that header sign in to manage text should be displayed in super admin reset your password page")
	public void verify_that_header_sign_in_to_manage_text_should_be_displayed_in_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_header_sign_in_to_manage_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that new password title text above user field is displayed in super admin reset your password page")
	public void verify_that_new_password_title_text_above_user_field_is_displayed_in_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_new_password_title_text_above_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that new password user field should be clickable in super admin reset your password page")
	public void verify_that_new_password_user_field_should_be_clickable_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_new_password_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that new password user field placeholder value should be {string} in super admin reset your password page")
	public void verify_that_new_password_user_field_placeholder_value_should_be_in_reset_your_password_page(String string) {
		String actual =  respass.mail_link_reset_password_click_new_password_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that confirm password title text above user field is displayed in super admin reset your password page")
	public void verify_that_confirm_password_title_text_above_user_field_is_displayed_in_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_confirm_password_title_text_above_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that comfirm password user field should be clickable in super admin reset your password page")
	public void verify_that_comfirm_password_user_field_should_be_clickable_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_comfirm_password_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that comfirm password user field placeholder value should be {string} in super admin reset your password page")
	public void verify_that_comfirm_password_user_field_placeholder_value_should_be_in_reset_your_password_page(String string) {
		String actual =  respass.mail_link_reset_password_click_comfirm_password_user_field_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be displayed in super admin reset your password page")
	public void verify_that_submit_button_should_be_displayed_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_submit_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be clickable in super admin reset your password page")
	public void verify_that_submit_button_should_be_clickable_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_submit_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be able to mouse hover in super admin reset your password page")
	public void verify_that_submit_button_should_be_able_to_mouse_hover_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_submit_button_should_be_able_to_mouse_hover();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that already have an account text should be displayed in super admin reset your password page")
	public void verify_that_already_have_an_account_text_should_be_displayed_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_already_have_an_account_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("VErify that sign in link should be displayed in super admin reset your password page")
	public void v_erify_that_sign_in_link_should_be_displayed_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_already_have_an_account_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that sign in link should be clickable in super admin reset your password page")
	public void verify_that_sign_in_link_should_be_clickable_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_sign_in_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that logo of shield should be displayed in super admin reset your password page")
	public void verify_that_logo_of_shield_should_be_displayed_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_logo_of_shield_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that logo header subtitle should be displayed in super admin reset your password page")
	public void verify_that_logo_header_subtitle_should_be_displayed_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_logo_header_subtitle_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that logo header subtitle second line text is displayed in super admin reset your password page")
	public void verify_that_logo_header_subtitle_second_line_text_is_displayed_in_the_reset_your_password_page() {
		boolean actual =  respass.mail_link_reset_password_click_logo_header_subtitle_second_line_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that user should get the green tick on the new password user fields in super admin reset your password page")
	public void verify_that_user_should_get_the_green_tick_on_the_new_password_user_fields() {
		boolean actual=respass.user_should_get_the_green_tick_on_the_new_password_user_fields();
	    Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	
	
	
	@When("user enters the new password into the new password user field as {string} click on the submit button in super admin reset your password page")
	public void user_enters_the_new_password_into_the_new_password_user_field_as_click_on_the_submit_button(String string) {
		respass.user_enters_the_new_password_into_the_new_password_user_field(string);
	    String actual=respass.user_entered_the_new_password_into_user_field();
	    Assert.assertEquals(actual, string);
	    respass.reset_your_password_submit_button_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that user should get the red tick on the new password user fields in super admin reset your password page")
	public void verify_that_user_should_get_the_red_tick_on_the_new_password_user_fields() {
		boolean actual=respass.user_should_get_the_red_tick_on_the_new_password_user_fields();
	    Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user click on sign in link it should navigated to the super admin sign in page in super admin reset your password page")
	public void verify_that_user_click_on_sign_in_link_it_should_navigated_to_the_super_admin_sign_in_page() {
		respass.mail_reset_password_page_user_click_on_sign_in_link_is_click();
		boolean actual=salogin.administrator_log_in_page_have_email_user_field_be_is_clickable();
		 Assert.assertEquals(actual, true);
		ElementUtil.eu.navigate_back(DriverFactory.getDriver());
		boolean actua=respass.mail_link_reset_password_click_new_password_user_field_is_clickable();
		 Assert.assertEquals(actua, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	


	
	
	
	@Then("Verify that user should get the red tick into the comfirm password user field in super admin reset your password page")
	public void verify_that_user_should_get_the_red_tick_into_the_comfirm_password_user_field() {
		respass.reset_your_password_submit_button_click();
	    boolean actual= respass.user_get_the_red_tick_into_the_comfirm_password_user_field();
	    Assert.assertEquals(actual, true);
	    ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	
	@When("user enters the new password into the new password user field as {string} in super admin reset your password page")
	public void user_enters_the_new_password_into_the_new_password_user_field_as(String string) {
		respass.user_enters_the_new_password_into_the_new_password_user_field(string);
		 String actual=respass.user_entered_the_new_password_into_user_field();
		 Assert.assertEquals(actual, string);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user enter the comfirm password into the comfirm password user field as {string} in super admin reset your password page")
	public void user_enter_the_comfirm_password_into_the_comfirm_password_user_field_as(String string) {
		respass.user_enters_the_comfirm_password_into_the_comfirm_password_user_field(string);
		 String actual=respass.user_entered_the_comfirm_password_into_user_field();
		 Assert.assertEquals(actual, string);
		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that user should get the green tick into the comfirm password user field in super admin reset your password page")
	public void verify_that_user_should_get_the_green_tick_into_the_comfirm_password_user_field() {
		respass.reset_your_password_submit_button_click();
		boolean actual= respass.user_get_the_green_tick_into_the_comfirm_password_user_field();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	
	@Then("Verify that user should also get the reset password successfully pop up into the page in super admin reset your password page")
	public void verify_that_user_should_also_get_the_reset_password_successfully_pop_up_into_the_page() {
	    boolean actual=respass.user_should_also_get_the_reset_password_successfully_pop_up();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	


		
	
	
	
	@Then("Verify that user is on the super_admin log in page after getting pop up into the page in super admin reset your password page")
	public void verify_that_user_is_on_the_super_admin_log_in_page_after_getting_pop_up_into_the_page() {
	    boolean actual = salogin.administrator_log_in_page_have_email_user_field_be_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that user should not able to log in with older password in super admin log in page")
	public void verify_that_user_should_not_able_to_log_in_with_older_password_in_super_admin_log_in_page() {
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("password"));
		salogin.administrator_sign_in_button_is_clicked();
		boolean actual = salogin.administrator_log_in_note_contaiing_invalid_credentials_is_displayed();
		Assert.assertEquals(actual, true);
		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that user should be able to log in with new updated password {string} for super admin log in page")
	public void verify_that_user_should_be_able_to_log_in_with_new_updated_password(String string) {
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("email"));
		salogin.administrator_log_enter_password_into_the_user_field(string);
		salogin.administrator_sign_in_button_is_clicked();
		boolean actual = respass.super_admin_pop_up_user_log_in_successfully_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
		
	
	
	@Then("Verify that user should be able to set the older password into the userfield for super admin log in page")
	public void verify_that_user_should_be_able_to_set_the_older_password_into_the_userfield() {
		respass.super_admin_pop_up_user_log_in_successfully_is_click();
		System.out.println("1");
		samain.super_admin_logger_other_time_profile_dropdown_button_is_clicked();
		System.out.println("2");
		samain.super_admin_logger_profile_dropdown_item_sign_out_is_clicked();
		System.out.println("3");
		salogin.administrator_log_in_page_forget_password_link_is_clicked();
		System.out.println("4");
		safp.user_forget_password_enter_email_into_user_field(AppHooks.prop.getProperty("super_admin_email"));
		System.out.println("5");
		safp.user_forget_password_request_reset_link_is_clicked();
		System.out.println("6");
		DriverFactory.getDriver().navigate().to(AppHooks.prop.getProperty("mailtrapURL"));
		System.out.println("7");
		mailtrap.mailtrap_user_click_on_log_in_button();
		System.out.println("8");
//		salogin.mailtrap_user_enter_email_into_the_user_field(AppHooks.prop.getProperty("mailtrapEmail"));
		System.out.println("9");
//		salogin.mailtrap_user_click_the_next_button();
		System.out.println("10");
//		salogin.mailtrap_user_enter_password_into_the_user_field(AppHooks.prop.getProperty("mailtrapPassword"));
		System.out.println("11");
//		salogin.mailtrap_user_click_on_log_in_button_before_scroll_down();
		System.out.println("12");
		mailtrap.mailtrap_user_email_testing_is_click();
		System.out.println("13");
		mailtrap.mailtrap_user_inbox_is_click();
		System.out.println("14");
		mailtrap.mailtrap_user_demo_inbox_is_click();
		System.out.println("15");
		mailtrap.mailtrap_get_the_mail_with_subject_title_clicked();
		System.out.println("16");
		mailtrap.mailtrap_mail_link_reset_old_password_click_and_get_title();
		System.out.println("17");
		respass.user_enters_the_new_password_into_the_new_password_user_field(AppHooks.prop.getProperty("super_admin_password"));
		System.out.println("18");
		respass.user_enters_the_comfirm_password_into_the_comfirm_password_user_field(AppHooks.prop.getProperty("super_admin_password"));
		System.out.println("19");
		respass.reset_your_password_submit_button_click();
		System.out.println("19");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		respass.reset_your_password_submit_button_click();
		System.out.println("19");
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		System.out.println("19");
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		System.out.println("20");
		salogin.administrator_sign_in_button_is_clicked();
		System.out.println("21");	
	}
	
	
}
