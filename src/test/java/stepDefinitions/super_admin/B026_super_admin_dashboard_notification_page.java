package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Dashboard_notification_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B026_super_admin_dashboard_notification_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	 private Dashboard_notification_page_objects sasnp = new Dashboard_notification_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(B005_super_admin_dashboard_main_page.class);

	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Given("Verify that super admin user is on notification page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_notification_page_as_expected_page_title_is(String title) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_the_first_notification_dropdown_button_is_clicked();
		samain.super_admin_logger_view_all_notifications_link_top_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, title);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that notification list title text is displayed in the super admin notification list page")
	public void verify_that_notification_list_title_text_is_displayed_in_the_super_admin_notification_list_page() {
		boolean actual = sasnp.notification_list_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb should be displayed in the super admin notification list page")
	public void verify_that_breadcrumb_should_be_displayed_in_the_super_admin_notification_list_page() {
		boolean actual = sasnp.breadcrumb_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb pages button should be displayed in the super admin notification list page")
	public void verify_that_breadcrumb_pages_button_should_be_displayed_in_the_super_admin_notification_list_page() {
		boolean actual = sasnp.breadcrumb_pages_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb pages button should be clickable in the super admin notification list page")
	public void verify_that_breadcrumb_pages_button_should_be_clickable_in_the_super_admin_notification_list_page() {
		boolean actual = sasnp.breadcrumb_pages_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb notification list text should be displayed in the super admin notification list page")
	public void verify_that_breadcrumb_notification_list_text_should_be_displayed_in_the_super_admin_notification_list_page() {
		boolean actual = sasnp.breadcrumb_notification_list_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}


}
