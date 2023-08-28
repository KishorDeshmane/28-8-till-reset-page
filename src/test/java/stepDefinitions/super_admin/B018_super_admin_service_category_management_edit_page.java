package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Lookups_service_category_management_page_objects;
import com.pages.Lookups_update_service_category_management_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B018_super_admin_service_category_management_edit_page {

	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_service_category_management_page_objects sascm = new Lookups_service_category_management_page_objects(DriverFactory.getDriver());
	private Lookups_update_service_category_management_page_objects sascme = new Lookups_update_service_category_management_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(B018_super_admin_service_category_management_edit_page.class);

	
	
	
	
	@Given("Verify that super admin user is on users service category management edit page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_users_service_category_management_edit_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_masters_button();
		samain.super_admin_logger_mouser_masters_service_category_is_clicked();
		sascm.super_admin_user_column_kebab_menu_is_clicked();
		sascm.super_admin_user_column_kebab_menu_edit_button_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that update service category title text should be displayed in super admin service category management edit page")
	public void verify_that_update_service_category_title_text_should_be_displayed_in_super_admin_service_category_management_edit_page() {
	    boolean actual = sascme.update_service_category_title_text_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb should be displayed in super admin service category management edit page")
	public void verify_that_breadcrumb_should_be_displayed_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.breadcrumb_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrumb service category button should be displayed in super admin service categorry management edit page")
	public void verify_that_breadcrumb_service_category_button_should_be_displayed_in_super_admin_service_categorry_management_edit_page() {
		boolean actual = sascme.breadcrumb_service_category_button_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb service category button should be clickable in super admin service category management edit page")
	public void verify_that_breadcrumb_service_category_button_should_be_clickable_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.breadcrumb_service_category_button_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb update service category text should be displayed in super admin service category management edit page")
	public void verify_that_breadcrumb_update_service_category_text_should_be_displayed_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.breadcrumb_update_service_category_text_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name text above the user field should be displayed in super admin service category management edit page")
	public void verify_that_service_category_name_text_above_the_user_field_should_be_displayed_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_category_name_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name text asterisk sign should be displayed in super admin service category management edit page")
	public void verify_that_service_category_name_text_asterisk_sign_should_be_displayed_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_category_name_text_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name user field should be displayed in super admin service category management edit page")
	public void verify_that_service_category_name_user_field_should_be_displayed_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_category_name_user_field_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name user field should be clickable in the super admin service category management edit page")
	public void verify_that_service_category_name_user_field_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_category_name_user_field_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name user field placeholder value should be {string} in super admin service category management edit page")
	public void verify_that_service_category_name_user_field_placeholder_value_should_be_in_super_admin_service_category_management_edit_page(String string) {
		String actual = sascme.service_category_name_user_field_placeholder_value();
	    Assert.assertEquals(actual , string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category name user field text should be displayed by default in the super admin service category management edit page")
	public void verify_that_service_category_name_user_field_text_should_be_displayed_by_default_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_category_name_user_field_text_should_be_displayed();
	    Assert.assertEquals(actual , false);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service icon title above the user field should be dispalyed in the super admin service category management edit page")
	public void verify_that_service_icon_title_above_the_user_field_should_be_dispalyed_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_icon_title_above_the_user_field_should_be_dispalyed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service icon text line should be displayed in the super admin category management edit page")
	public void verify_that_service_icon_text_line_should_be_displayed_in_the_super_admin_category_management_edit_page() {
		boolean actual = sascme.service_icon_text_line_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service icon user field should be displayed in the super admin service category management edit page")
	public void verify_that_service_icon_user_field_should_be_displayed_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_icon_user_field_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service icon user field should be clickable in the super admin service category management edit page")
	public void verify_that_service_icon_user_field_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_icon_user_field_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service icon user field placeholder value should be {string} in super admin service category management edit page")
	public void verify_that_service_icon_user_field_placeholder_value_should_be_in_super_admin_service_category_management_edit_page(String string) {
		String actual = sascme.service_icon_user_field_placeholder_value();
	    Assert.assertEquals(actual , string);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service icon image should be displayed by default in super admin service category management edit page")
	public void verify_that_service_icon_image_should_be_displayed_by_default_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.service_icon_image_should_be_displayed_by_default();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that parent category title text above the user field should be displayed in super admin service category management edit page")
	public void verify_that_parent_category_title_text_above_the_user_field_should_be_displayed_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.parent_category_title_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that parent category dropdown should be clickable in the super admin service category management edit page")
	public void verify_that_parent_category_dropdown_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.parent_category_dropdown_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that parent category dropdown list should be clickable in the super admin service category management edit page")
	public void verify_that_parent_category_dropdown_list_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.parent_category_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status title text above dropdown should be displayed in the super admin service category management edit page")
	public void verify_that_status_title_text_above_dropdown_should_be_displayed_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.status_title_text_above_dropdown_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status dropdown should be clickable in the super admin service category manangement edit page")
	public void verify_that_status_dropdown_should_be_clickable_in_the_super_admin_service_category_manangement_edit_page() {
		boolean actual = sascme.status_dropdown_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status dropdown list should be clickable in the super admin service category management edit page")
	public void verify_that_status_dropdown_list_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.status_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be displayed in the super admin service category management edit page")
	public void verify_that_submit_button_should_be_displayed_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.submit_button_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be clickable in the super admin service category management edit page")
	public void verify_that_submit_button_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.submit_button_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be able to mouse hover in super admin service category management edit page")
	public void verify_that_submit_button_should_be_able_to_mouse_hover_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.submit_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be displayed in the super admin service category management edit page")
	public void verify_that_cancel_button_should_be_displayed_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.cancel_button_should_be_displayed();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be clickable in the super admin service category management edit page")
	public void verify_that_cancel_button_should_be_clickable_in_the_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.cancel_button_should_be_clickable();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be able to mouse hover in super admin service category management edit page")
	public void verify_that_cancel_button_should_be_able_to_mouse_hover_in_super_admin_service_category_management_edit_page() {
		boolean actual = sascme.cancel_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual , true);
	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
}
