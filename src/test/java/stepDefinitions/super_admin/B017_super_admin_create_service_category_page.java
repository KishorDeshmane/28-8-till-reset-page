package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Lookups_create_service_category_page_objects;
import com.pages.Lookups_service_category_management_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B017_super_admin_create_service_category_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_service_category_management_page_objects sascm = new Lookups_service_category_management_page_objects(DriverFactory.getDriver());
	private Lookups_create_service_category_page_objects sacsc = new Lookups_create_service_category_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(B017_super_admin_create_service_category_page.class);

	
	
	@Given("Verify that super admin user is on users create service category page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_users_create_service_category_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_masters_button();
		samain.super_admin_logger_mouser_masters_service_category_is_clicked();
		sascm.super_admin_logger_create_service_category_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that create service category tilte text of the page should displayed in the super admin create service category page")
	public void verify_that_create_service_category_tilte_text_of_the_page_should_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.create_service_category_tilte_text_of_the_page_should_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create service category breadcrumb is displayed in the super admin create service category page")
	public void verify_that_create_service_category_breadcrumb_is_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.create_service_category_breadcrumb_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create service category dashboard breadcrumb button is displayed in the super admin create service category page")
	public void verify_that_create_service_category_dashboard_breadcrumb_button_is_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.service_category_breadcrumb_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create service category create service category in breadcrumb is displayed in the super admin create service category page")
	public void verify_that_create_service_category_create_service_category_in_breadcrumb_is_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.create_service_category_create_service_category_in_breadcrumb_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name title text above the user field should be displayed in the super admin create service category page")
	public void verify_that_service_category_name_title_text_above_the_user_field_should_be_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.service_category_name_title_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name user field should be clickable in the super admin create service category page")
	public void verify_that_service_category_name_user_field_should_be_clickable_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.service_category_name_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name user field placeholder value should be {string} in the super admin create service category page")
	public void verify_that_service_category_name_user_field_placeholder_value_should_be_in_the_super_admin_create_service_category_page(String string) {
		String actual = sacsc.service_category_name_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category service icon title above user field is displayed in the super admin create service category page")
	public void verify_that_service_category_service_icon_title_above_user_field_is_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.service_category_service_icon_title_above_user_field_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category service icon text line should be displayed in the super admin create service category page")
	public void verify_that_service_category_service_icon_text_line_should_be_displayed_in_the_super_admin_create_service_category_page() {
		boolean actual = sacsc.service_category_service_icon_text_line_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category service icon user field placeholder should be {string} in super admin create service category page")
	public void verify_that_service_category_service_icon_user_field_placeholder_should_be_in_super_admin_create_service_category_page(String string) {
		String actual = sacsc.service_category_service_icon_user_field_placeholder();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category service icon user field should be clickable in super admin create service category page")
	public void verify_that_service_category_service_icon_user_field_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.service_category_service_icon_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verfy that parent category above the dropdown title text is displayed in super admin create service category page")
	public void verfy_that_parent_category_above_the_dropdown_title_text_is_displayed_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.parent_category_above_the_dropdown_title_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that parent category dropdown should be clickable in super admin create service category page")
	public void verify_that_parent_category_dropdown_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.parent_category_dropdown_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that parent category dropdown selected value should be {string} in super admin create service category page")
	public void verify_that_parent_category_dropdown_selected_value_should_be_select_in_super_admin_create_service_category_page(String string) {
		String actual = sacsc.parent_category_dropdown_selected_value_should_be_select();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that parent category dropdown list should be clickable in super admin create service category page")
	public void verify_that_parent_category_dropdown_list_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.parent_category_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status of the category title above dropdown should be displayed in super admin create service category page")
	public void verify_that_status_of_the_category_title_above_dropdown_should_be_displayed_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.status_of_the_category_title_above_dropdown_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status dropdown should be clickable in super admin create service category page")
	public void verify_that_status_dropdown_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.status_dropdown_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that status dropdown selected value should be {string} in super admin create service category page")
	public void verify_that_status_dropdown_selected_value_should_be_select_in_super_admin_create_service_category_page(String string) {
		String actual = sacsc.status_dropdown_selected_value_should_be_select();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that staus dropdown list should be clickable in super admin create service category page")
	public void verify_that_staus_dropdown_list_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.staus_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be displayed in super admin create service category page")
	public void verify_that_submit_button_should_be_displayed_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.submit_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be clickable in super admin create service category page")
	public void verify_that_submit_button_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.submit_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be able to mouse hover in super admin create service category page")
	public void verify_that_submit_button_should_be_able_to_mouse_hover_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.submit_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be displayed in super admin create service category page")
	public void verify_that_cancel_button_should_be_displayed_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.cancel_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be clickable in super admin create service category page")
	public void verify_that_cancel_button_should_be_clickable_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.cancel_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be able to mouse hover in super admin create service category page")
	public void verify_that_cancel_button_should_be_able_to_mouse_hover_in_super_admin_create_service_category_page() {
		boolean actual = sacsc.cancel_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
}
