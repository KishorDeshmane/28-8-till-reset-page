package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Users_all_users_page_objects;
import com.pages.Users_change_status_pop_up_objects;
import com.pages.Users_manage_roles_and_permissions_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B015_super_admin_options_manage_roles_and_permissions_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Users_all_users_page_objects saalluser = new Users_all_users_page_objects(DriverFactory.getDriver());
	private Users_change_status_pop_up_objects sastatus= new  Users_change_status_pop_up_objects(DriverFactory.getDriver());
	private Users_manage_roles_and_permissions_page_objects samangroleper= new Users_manage_roles_and_permissions_page_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B015_super_admin_options_manage_roles_and_permissions_page.class);

	
	
	/*
	 * 
	 * 
	 * SCR
	 * 
	 * 
	 * 
	 */

	@Given("Verify that super_admin user is on the users all users actions options manage roles and permission page")
	public void verify_that_super_admin_user_is_on_the_users_all_users_actions_options_manage_roles_and_permission_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_users_button();
		samain.super_admin_logger_mouser_users_all_users_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, actual);
		saalluser.super_admin_user_all_users_create_user_button_is_click();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
/*
 * 
 * 
 * 
 */
	@Given("Verify that super_admin user is on users all users actions options manage roles and permission page")
	public void verify_that_super_admin_user_is_on_users_all_users_actions_options_manage_roles_and_permission_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_users_button();
		samain.super_admin_logger_mouser_users_all_users_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, actual);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin breadcrum all users button should be navigated to the all users page from the manage roles and permission page")
	public void verify_that_super_admin_breadcrum_all_users_button_should_be_navigated_to_the_all_users_page_from_the_manage_roles_and_permission_page() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_manage_roles_and_permissions_is_click();
	    samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_click();
	    boolean actual= saalluser.super_admin_user_all_users_search_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that super_admin cancel button should be navigated to the all users page from the manage roles and permission page")
	public void verify_that_super_admin_cancel_button_should_be_navigated_to_the_all_users_page_from_the_manage_roles_and_permission_page() {
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
	    saalluser.super_admin_users_all_users_actions_option_manage_roles_and_permissions_is_click();
	    ElementUtil.eu.scroll_end_of_page_with_keyboard_click(3);
	    samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button_is_click();
	    boolean actual= saalluser.super_admin_user_all_users_search_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/*
	 * 
	 * Super admin need to create here
	 * 
	 */
	
	
	@When("super_admin search the using mail {string} and click on the manage roles and permission page as expected page title {string}")
     public void super_admin_search_the_using_mail_and_click_on_the_manage_roles_and_permission_page_as_expected_page_title(String email, String string) {
	    saalluser.super_admin_user_all_users_search_userfield_sendText(email);
	    saalluser.super_admin_user_all_users_search_button_is_click();
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
		
	    //Change status here
	    saalluser.super_admin_users_all_users_actions_option_change_status_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click();
	    sastatus.super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_is_click();
		
	    saalluser.super_admin_users_all_users_actions_options_3_dots_is_click();
		saalluser.super_admin_users_all_users_actions_option_manage_roles_and_permissions_is_click();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	@When("user click on the manage roles and permission button from the super_admin dashboard all users actions options button")
	public void user_click_on_the_manage_roles_and_permission_button_from_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the user is on the manage roles and permission page in super_admin dashbaord all users actions options button")
	public void verify_that_the_user_is_on_the_manage_roles_and_permission_page_in_super_admin_dashbaord_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user page header manage roles and permission is displayed in super_admin dashboard all users actions options button")
	public void verify_that_user_page_header_manage_roles_and_permission_is_displayed_in_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum should be displayed in the super_admin dashboard all usres actions options button")
	public void verify_that_breadcrum_should_be_displayed_in_the_super_admin_dashboard_all_usres_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum dashboard button should be displayed in the super_admin dashboard all users actions options button")
	public void verify_that_breadcrum_dashboard_button_should_be_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum dashboard button should be clickable in the super_admin dashboard all users actions options button")
	public void verify_that_breadcrum_dashboard_button_should_be_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum all users button should be displayed in the super_admin dashboard all users actions options button")
	public void verify_that_breadcrum_all_users_button_should_be_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum all users button should be clickable in the super_admin dashboard all users actions options button")
	public void verify_that_breadcrum_all_users_button_should_be_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrum roles and permissions text should be displayed in the super_admin dashboard all users actions options button")
	public void verify_that_breadcrum_roles_and_permissions_text_should_be_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_roles_and_permissions_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that assigned role text above the userfield should be displayed in the super_admin dashboard all users actions options button")
	public void verify_that_assigned_role_text_above_the_userfield_should_be_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_text_above_the_userfield_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that assigned role dropdown list should be displayed in the super_admin dashbaord all users actions options button")
	public void verify_that_assigned_role_dropdown_list_should_be_displayed_in_the_super_admin_dashbaord_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_list_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that assigned role dropdown admin should be clickable in the super_admin dashboard all users actions options button")
	public void verify_that_assigned_role_dropdown_admin_should_be_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that assigned role dropdown select the super admin then permission of super admin can not be modified should be displayed in actions options buttons")
	public void verify_that_assigned_role_dropdown_select_the_super_admin_then_permission_of_super_admin_can_not_be_modified_should_be_displayed_in_actions_options_buttons() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_permission_of_super_admin_can_not_be_modified();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	

	@Then("Verify that assigned role dropdown super admin should be clickable in the super_admin dashboard all users actions options button")
	public void verify_that_assigned_role_dropdown_super_admin_should_be_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_super_admin_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@And("admin is selected for super admin user test cases")
	public void admin_is_selected() {
		samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin_is_click();
	}

	/*
	 * 
	 * 
	 * role management
	 * 
	 * 
	 */

	@Then("Verify that role management container title text should displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_title_text_should_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container create role click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_create_role_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container create role click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_create_role_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container create role click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_create_role_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role managemenr container create role text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_managemenr_container_create_role_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container read role click box in clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_read_role_click_box_in_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container read role click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_read_role_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container read role click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_read_role_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container read role text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_read_role_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container update role click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_update_role_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container update role click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_update_role_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container update role click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_update_role_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container update role text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_update_role_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container delete role click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_delete_role_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container delete role click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_delete_role_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container delete role click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_delete_role_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container delete role text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_delete_role_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container change role status click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_change_role_status_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container change role status click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_change_role_status_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container change role status click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_change_role_status_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container change role status text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_change_role_status_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container search role click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_search_role_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container search role click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_search_role_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container search role click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_search_role_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container search role text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_search_role_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container manage role permission click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_manage_role_permission_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container manage role permission click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_manage_role_permission_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that role management container manage role permission click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_manage_role_permission_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that role management container manage role permission text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_role_management_container_manage_role_permission_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	/*
	 * 
	 * 
	 * user management
	 * 
	 * 
	 */

	@Then("Verify that user management container title text should displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_title_text_should_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container create user click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_create_user_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container create user click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_create_user_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container create user click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_create_user_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container create user text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_create_user_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container read user click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_read_user_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container read user click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_read_user_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container read user click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_read_user_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container read user text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_read_user_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container update user click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_update_user_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container update user click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_update_user_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container update user click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_update_user_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container update user text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_update_user_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container delete user click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_delete_user_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container delete user click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_delete_user_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container delete user click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_delete_user_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container delete user text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_delete_user_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container change user status user click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_status_user_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container change user status user click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_status_user_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container change user status user click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_status_user_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container change user status text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_status_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container search user click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_search_user_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container search user click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_search_user_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container search user click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_search_user_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container search user text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_search_user_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container change user password click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_password_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container change user password click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_password_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container change user password click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_password_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container change user password text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_change_user_password_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container resend password verification link click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_password_verification_link_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container resend password verification link click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_password_verification_link_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container resend password verification link click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_password_verification_link_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container resend password verification link text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_password_verification_link_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container forgot user password click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_forgot_user_password_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container forgot user password click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_forgot_user_password_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container forgot user password click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_forgot_user_password_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container forgot user password text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_forgot_user_password_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container resend email verification link click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_email_verification_link_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container resend email verification link click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_email_verification_link_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user management container resend email verification link click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_email_verification_link_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user management container resend email verification link text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_user_management_container_resend_email_verification_link_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/*
	 * 
	 * 
	 * Service category manangement
	 * 
	 * 
	 */

	@Then("Verify that service category management container title text should displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_title_text_should_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container create service category click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_create_service_category_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container create service category click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_create_service_category_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container create service category click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_create_service_category_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container create service category text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_create_service_category_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container read service category click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_read_service_category_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container read service category click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_read_service_category_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container read service category click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_read_service_category_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container read service category text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_read_service_category_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container update service category click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_update_service_category_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container update service category click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_update_service_category_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container update service category click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_update_service_category_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container update service category text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_update_service_category_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container delete service category click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_delete_service_category_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container delete service category click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_delete_service_category_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container delete service category click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_delete_service_category_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container delete service category text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_delete_service_category_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container change service category status click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_change_service_category_status_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container change service category status click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_change_service_category_status_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container change service category status click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_change_service_category_status_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container change service category status text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_change_service_category_status_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container search service category click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_search_service_category_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container search service category click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_search_service_category_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service category management container search service category click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_search_service_category_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category management container search service category text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_category_management_container_search_service_category_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/*
	 * 
	 * 
	 * Service management
	 * 
	 * 
	 */

	@Then("Verify that service management container title text should displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_title_text_should_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container create service click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_create_service_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container create service click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_create_service_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container create service click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_create_service_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container create service text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_create_service_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container read service click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_read_service_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container read service click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_read_service_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container read service click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_read_service_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container read service text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_read_service_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container update service click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_update_service_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container update service click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_update_service_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container update service click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_update_service_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container update service text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_update_service_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container delete service click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_delete_service_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container delete service click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_delete_service_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container delete service click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_delete_service_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container delete service text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_delete_service_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container change service status click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_change_service_status_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container change service status click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_change_service_status_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container change service status click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_change_service_status_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container change service status text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_change_service_status_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that service management container search service click box is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_search_service_click_box_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container search service click box is selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_search_service_click_box_is_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box_is_selected();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that service management container search service click box is not selected in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_search_service_click_box_is_not_selected_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box_is_not_selected();
		Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service management container search service text is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_service_management_container_search_service_text_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/*
	 * 
	 *
	 * Buttons 
	 * 
	 * 
	 */

	@Then("Verify that manage roles and management submit button is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_manage_roles_and_management_submit_button_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that manage roles and management submit button is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_manage_roles_and_management_submit_button_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that manage roles and management cancel button is displayed in the super_admin dashboard all users actions options button")
	public void verify_that_manage_roles_and_management_cancel_button_is_displayed_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that manage roles and management cancel button is clickable in the super_admin dashboard all users actions options button")
	public void verify_that_manage_roles_and_management_cancel_button_is_clickable_in_the_super_admin_dashboard_all_users_actions_options_button() {
		boolean actual = samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/*
	 * Delete user super admin
	 * 
	 */

	@Then("super_admin navigate back to the all user page from the manage roles and management page")
	public void super_admin_navigate_back_to_the_all_user_page_from_the_manage_roles_and_management_page() {
	    //ElementUtil.eu.navigate_back(DriverFactory.getDriver());
		
		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
	    samangroleper.super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_click();
	}

	
	
}
