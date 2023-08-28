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
//import com.qa.factory.DriverFactory;
//import com.qa.utility.ElementUtil;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class C002_admin_dashboard_main_page {
//
//	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
//	private C001_admin_log_in_page_objects adlogin = new C001_admin_log_in_page_objects(DriverFactory.getDriver());
//	private C002_admin_dashboard_main_page_objects admain = new C002_admin_dashboard_main_page_objects(DriverFactory.getDriver());
//	Logger logger = LogManager.getLogger(C002_admin_dashboard_main_page.class);
//
//	/**
//	 * 
//	 * 
//	 * 
//	 * 
//	 * SCR 01
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	
//	@Given("Verify that user is on the admin dashboard page as expected page title {string}")
//	public void verify_that_user_is_on_the_admin_dashboard_page_as_expected_page_title(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the main logo in admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_main_logo_in_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_the_main_logo_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be clickable the main logo in admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_the_main_logo_in_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_the_main_logo_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the notification dropdown button in the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_notification_dropdown_button_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_the_notification_dropdown_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be clickable the notification dropdown button in the admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_the_notification_dropdown_button_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_the_notification_dropdown_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be display profile dropdown button in the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_profile_dropdown_button_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_profile_dropdown_button_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be clickable profile dropdown button in the admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_profile_dropdown_button_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_profile_dropdown_button_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display navigational tabs in the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_navigational_tabs_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_navigational_tabs_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be clickable navigational tabs in the admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_navigational_tabs_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_navigational_tabs_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be able to mouse hover in navigational tabs in the admin dashboard page")
//	public void verify_that_admin_user_should_be_able_to_mouse_hover_in_navigational_tabs_in_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_navigational_tabs_is_mouse_hover();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display card box below the naviagtional tabs in admin dashboard page")
//	public void verify_that_admin_user_should_be_display_card_box_below_the_naviagtional_tabs_in_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_card_box_below_the_naviagtional_tabs_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the name of user in the card box from admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_name_of_user_in_the_card_box_from_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_name_of_user_in_the_card_box_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the projects details in the card box from the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_projects_details_in_the_card_box_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_projects_details_in_the_card_box_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the projects percentages in the card box from the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_projects_percentages_in_the_card_box_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_projects_percentages_in_the_card_box_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the image in the card box from the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_image_in_the_card_box_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_image_in_the_card_box_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be display the back to top arrow from the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_back_to_top_arrow_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_back_to_top_arrow_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be clickable the back to top arrow from the admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_the_back_to_top_arrow_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_back_to_top_arrow_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be display the copyrights details from the admin dashboard page")
//	public void verify_that_admin_user_should_be_display_the_copyrights_details_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_copyrights_details_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that admin user should be clickable the copyrights details shield link from the admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_the_copyrights_details_shield_link_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_copyrights_details_shield_link_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin user should be clickable the copyrights details iffort link from the admin dashboard page")
//	public void verify_that_admin_user_should_be_clickable_the_copyrights_details_iffort_link_from_the_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_copyrights_details_iffort_link_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	/**
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * SCCR 02
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//	@When("user is on the my profile page from the admin dashboard page")
//	public void user_is_on_the_my_profile_page_from_the_admin_dashboard_page() {
//	    admain.admin_logger_first_profile_dropdown_button_is_clicked();
//	    admain.admin_logger_profile_dropdown_my_profile_is_clicked();
//	    boolean actual= admain.admin_logger_my_profile_title_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user click on the main logo that should be navigated to the admin dashboard page")
//	public void verify_that_user_click_on_the_main_logo_that_should_be_navigated_to_the_admin_dashboard_page() {
//	    admain.admin_logger_the_main_logo_is_clicked();
//	    boolean actual=admain.admin_logger_image_in_the_card_box_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("user is click on the notification dropdown from the admin dashboard page")
//	public void user_is_click_on_the_notification_dropdown_from_the_admin_dashboard_page() {
//	    admain.admin_logger_the_notification_dropdown_button_is_clicked();
//	    boolean actual=admain.admin_logger_view_all_notification_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user should get the list of the notifications from the admin dashboard page")
//	public void verify_that_user_should_get_the_list_of_the_notifications_from_the_admin_dashboard_page() {
//	    boolean actual =admain.admin_logger_notification_list_is_clickable();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user should get the text you have dot unread notifications from the admin dashboard page")
//	public void verify_that_user_should_get_the_text_you_have_dot_unread_notifications_from_the_admin_dashboard_page() {
//		 	boolean actual =admain.admin_logger_notification_text_you_have_dot_unread_notifications_is_displayed();
//		    Assert.assertEquals(actual, true);
//			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//			AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user should get the view all notifications link top from the admin dashboard page")
//	public void verify_that_user_should_get_the_view_all_notifications_link_top_from_the_admin_dashboard_page() {
//		boolean actual =admain.admin_logger_view_all_notifications_link_top_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//}
//	
//	@Then("Verify that user should get the view all notifications link is clickable from the admin dashboard page")
//	public void verify_that_user_should_get_the_view_all_notifications_link_is_clickable_from_the_admin_dashboard_page() {
//		boolean actual =admain.admin_logger_get_the_view_all_notifications_link_is_clickable();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//}
//
//	@When("user click on the main profile dropdown button from the admin dashboard page")
//	public void user_click_on_the_main_profile_dropdown_button_from_the_admin_dashboard_page() {
//		 admain.admin_logger_other_time_profile_dropdown_button_is_clicked();
//		 boolean actual=admain.admin_logger_profile_dropdown_is_displayed();
//		 Assert.assertEquals(actual, true);
//		 logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		 AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user name should be displayed in the profile dropdown from the admin page")
//	public void verify_that_user_name_should_be_displayed_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_user_name_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user role should be displayed in the profile dropdown from the admin page")
//	public void verify_that_user_role_should_be_displayed_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_user_role_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user last log in should be displayed in the profile dropdown from the admin page")
//	public void verify_that_user_last_log_in_should_be_displayed_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_user_last_log_in_time_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user my profile dropdown item should be displayed in the profile dropdown from the admin page")
//	public void verify_that_user_my_profile_dropdown_item_should_be_displayed_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_item_my_profile_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user my profile dropdown item should be clickable in the profile dropdown from the admin page")
//	public void verify_that_user_my_profile_dropdown_item_should_be_clickable_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_item_my_profile_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user change password dropdown item should be displayed in the profile dropdown from the admin page")
//	public void verify_that_user_change_password_dropdown_item_should_be_displayed_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_item_change_password_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user change password dropdown item should be clickable in the profile dropdown from the admin page")
//	public void verify_that_user_change_password_dropdown_item_should_be_clickable_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_item_change_password_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user sign out dropdown item should be displayed in the profile dropdown from the admin page")
//	public void verify_that_user_sign_out_dropdown_item_should_be_displayed_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_item_sign_out_is_displayed();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user sign out dropdown item should be clickable in the profile dropdown from the admin page")
//	public void verify_that_user_sign_out_dropdown_item_should_be_clickable_in_the_profile_dropdown_from_the_admin_page() {
//		boolean actual= admain.admin_logger_profile_dropdown_item_sign_out_is_clickable();
//		Assert.assertEquals(actual, true);
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
//	@When("Verify that user is mouse hover on the user then list of elements should be displayed from the admin home page")
//	public void verify_that_user_is_mouse_hover_on_the_user_then_list_of_elements_should_be_displayed_from_the_admin_home_page() {
//		boolean actual = admain.admin_logger_list_on_users_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user is mouse hover on the master category button from the admin home page")
//	public void verify_that_user_is_mouse_hover_on_the_master_category_button_from_the_admin_home_page() {
//		admain.admin_logger_mouser_hover_on_masters_button();
//		boolean actual = admain.admin_logger_mouse_hover_on_master_category_button();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	@Then("Verify that user is mouse hover on the master service areas button from the admin home page")
//	public void verify_that_user_is_mouse_hover_on_the_master_service_areas_button_from_the_admin_home_page() {
//		boolean actual = admain.super_admin_logger_mouse_hover_on_master_service_areas_button();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user is able to mouse hover on the user all user button from the admin home page")
//	public void verify_that_user_is_able_to_mouse_hover_on_the_user_all_user_button_from_the_admin_home_page() {
//		admain.admin_logger_mouser_hover_on_users_button();
//		boolean actual = admain.admin_logger_mouse_hover_on_users_all_users_button();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user is able to mouse hover on the user partners button from the admin home page")
//	public void verify_that_user_is_able_to_mouse_hover_on_the_user_partners_button_from_the_admin_home_page() {
//		boolean actual = admain.admin_logger_mouse_hover_on_users_partners_button();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user is able to mouse hover on the user costomers button from the admin home page")
//	public void verify_that_user_is_able_to_mouse_hover_on_the_user_costomers_button_from_the_admin_home_page() {
//		boolean actual = admain.admin_logger_mouse_hover_on_users_customers_button();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that dashboard button is clickable from the admin home page")
//	public void verify_that_dashboard_button_is_clickable_from_the_admin_home_page() {
//		boolean actual = admain.admin_logger_dashboard_button_is_clickable();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user button is clickable from the admin home page")
//	public void verify_that_user_button_is_clickable_from_the_admin_home_page() {
//		boolean actual = admain.admin_logger_users_is_clickable();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user dropdown list should be clickable from the admin home page")
//	public void verify_that_user_dropdown_list_should_be_clickable_from_the_admin_home_page() {
//		boolean actual = admain.admin_logger_users_dropdown_options_is_clickable();
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
//	
//	
//
//	@When("user is at the footer and click on the shield link from the admin dashboard page")
//	public void user_is_at_the_footer_and_click_on_the_shield_link_from_the_admin_dashboard_page() {
//	    ElementUtil.eu.scroll_end_of_page_with_keyboard_click(3);
//	    admain.admin_logger_copyrights_details_shield_link_is_click();
//	    boolean actual = admain.admin_logger_copyrights_details_shield_link_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user scroll top of the page then shield main logo should be click from admin dashboard page")
//	public void verify_that_user_scroll_top_of_the_page_then_shield_main_logo_should_be_click_from_admin_dashboard_page() {
//		boolean actual = admain.admin_logger_the_main_logo_is_clickable();
//		Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@When("user is at the footer and click on the iffort link from the admin dashboard page {string}")
//	public void user_is_at_the_footer_and_click_on_the_iffort_link_from_the_admin_dashboard_page(String iffurl) {
//		ElementUtil.eu.scroll_end_of_page_with_keyboard_click(3);
//		admain.admin_logger_copyrights_details_iffort_link_is_click();
//		String url=DriverFactory.getDriver().getCurrentUrl();
//		Assert.assertEquals(url, iffurl);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that user should navigate to the new tab as expected page title is {string} from admin dashboard page")
//	public void verify_that_user_should_navigate_to_the_new_tab_as_expected_page_title_is_from_admin_dashboard_page(String string) {
//	   ElementUtil.eu.get_window_handels_pages(DriverFactory.getDriver());
//		String title= ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//	   Assert.assertEquals(title, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//}
