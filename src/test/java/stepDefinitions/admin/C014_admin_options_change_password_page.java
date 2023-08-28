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
//import com.pages.admin.C004_admin_profile_change_password_page_objects;
//import com.pages.admin.C006_admin_all_users_page_objects;
//import com.pages.admin.C014_admin_options_change_password_page_objects;
//import com.qa.factory.DriverFactory;
//import com.qa.utility.ElementUtil;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class C014_admin_options_change_password_page {
//
//	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
//	private C001_admin_log_in_page_objects adlogin = new C001_admin_log_in_page_objects(DriverFactory.getDriver());
//	private C002_admin_dashboard_main_page_objects admain = new C002_admin_dashboard_main_page_objects(DriverFactory.getDriver());
//	private C004_admin_profile_change_password_page_objects adcp = new C004_admin_profile_change_password_page_objects(DriverFactory.getDriver());
//	private C006_admin_all_users_page_objects adalluser = new C006_admin_all_users_page_objects(DriverFactory.getDriver());
//	private C014_admin_options_change_password_page_objects adchangepass = new C014_admin_options_change_password_page_objects(DriverFactory.getDriver());
//	
//	Logger logger = LogManager.getLogger(C014_admin_options_change_password_page.class);
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * SCR
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//	
//
//    @Then("Verify that page header change password title text is displayed from admin dashboard options change password page")
//    public void verify_that_page_header_change_password_title_text_is_displayed_from_admin_dashboard_options_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_header_change_password_title_text_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    
//    @Then("Verify that page breadcrum list should be displayed from the admin dashboard options change password page")
//    public void verify_that_page_breadcrum_list_should_be_displayed_from_the_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_breadcrum_list_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page breadcrum dashborad button should be clickable from the admin dashboard options change password page")
//    public void verify_that_page_breadcrum_dashborad_button_should_be_clickable_from_the_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_breadcrum_dashborad_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page breadcrum change password text is displayed from the admin dashboard options change password page")
//    public void verify_that_page_breadcrum_change_password_text_is_displayed_from_the_admin_dashboard_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_breadcrum_change_password_text_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page current password title text above userfield should be displayed from the admin options change password page")
//    public void verify_that_page_current_password_title_text_above_userfield_should_be_displayed_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_current_password_title_text_above_userfield_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page current password user field should be clickable from the admin options change password page")
//    public void verify_that_page_current_password_user_field_should_be_clickable_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_current_password_user_field_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page current password user field placeholder value should be {string} from the admin options change password page")
//    public void verify_that_page_current_password_user_field_placeholder_value_should_be_from_the_admin_change_password_page(String string) {
//    	String actual=adcp.admin_logger_change_password_page_current_password_user_field_placeholder_value();
//        Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page submit button should be displayed from the admin options change password page")
//    public void verify_that_page_submit_button_should_be_displayed_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page submit button should be clickable from the admin options change password page")
//    public void verify_that_page_submit_button_should_be_clickable_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be displayed from the admin options change password page")
//    public void verify_that_page_cancel_button_should_be_displayed_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be clickable from the admin options change password page")
//    public void verify_that_page_cancel_button_should_be_clickable_from_the_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page submit button should be able to mouse hover from admin options change password page")
//    public void verify_that_page_submit_button_should_be_able_to_mouse_hover_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be able to mouse hover from admin options change password page")
//    public void verify_that_page_cancel_button_should_be_able_to_mouse_hover_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page new password title text is displayed in the change password second page from admin options change password page")
//    public void verify_that_page_new_password_title_text_is_displayed_in_the_change_password_second_page_from_admin_change_password_page() {
//    	adcp.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
//    	adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        boolean actual=adcp.admin_logger_change_password_page_new_password_title_text_is_displayed();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page new password userfield should be clickable in the change password second page from admin options change password page")
//    public void verify_that_page_new_password_userfield_should_be_clickable_in_the_change_password_second_page_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_new_password_userfield_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page comfirm password title text is displayed in the change password second page from admin options change password page")
//    public void verify_that_page_comfirm_password_title_text_is_displayed_in_the_change_password_second_page_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_comfirm_password_title_text_is_displayed();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page new password userfield placeholder value should be {string} in the change password second page from admin options change password page")
//    public void verify_that_page_new_password_userfield_placeholder_value_should_be_in_the_change_password_second_page_from_admin_change_password_page(String string) {
//        String value = adcp.admin_logger_change_password_page_new_password_userfield_is_placeholder();
//        Assert.assertEquals(value, string);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page comfirm password userfield placeholder value should be {string} in the change password second page from admin options change password page")
//    public void verify_that_page_comfirm_password_userfield_placeholder_value_should_be_in_the_change_password_second_page_from_admin_change_password_page(String string) {
//        String value = adcp.admin_logger_change_password_page_comfirm_password_userfield_is_placeholder();
//        Assert.assertEquals(value, string);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page comfirm password userfield should be clickable in the change password second page from admin options change password page")
//    public void verify_that_page_comfirm_password_userfield_should_be_clickable_in_the_change_password_second_page_from_admin_change_password_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_comfirm_password_userfield_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page submit button should be displayed from the admin options change password second page")
//    public void verify_that_page_submit_button_should_be_displayed_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_displayed();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page submit button should be clickable from the admin options change password second page")
//    public void verify_that_page_submit_button_should_be_clickable_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page cancel button should be displayed from the admin options change password second page")
//    public void verify_that_page_cancel_button_should_be_displayed_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_displayed();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page cancel button should be clickable from the admin options change password second page")
//    public void verify_that_page_cancel_button_should_be_clickable_from_the_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_is_clickable();
//        Assert.assertEquals(actual, true);
// 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
// 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
// 	}
//    
//    @Then("Verify that page submit button should be able to mouse hover from admin options change password secon page")
//    public void verify_that_page_submit_button_should_be_able_to_mouse_hover_from_admin_change_password_secon_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_submit_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that page cancel button should be able to mouse hover from admin options change password second page")
//    public void verify_that_page_cancel_button_should_be_able_to_mouse_hover_from_admin_change_password_second_page() {
//    	boolean actual=adcp.admin_logger_change_password_page_cancel_button_should_be_able_to_mouse_hover();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * SCR 
//	 * 
//	 * 
//	 * 
//	 */
//
//	@Given("Verify that admin user is on the users all users actions options change password page as expected page title {string}")
//	public void verify_that_admin_user_is_on_the_users_all_users_actions_options_change_password_page_as_expected_page_title(String title) {
//		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		admain.admin_logger_mouser_hover_on_users_button();
//		admain.admin_logger_mouser_users_all_users_is_clicked();
//		adalluser.admin_user_all_users_search_userfield_sendText(AppHooks.prop.getProperty("admin_email"));
//	    adalluser.admin_user_all_users_search_button_is_click();
//	    adalluser.admin_users_all_users_actions_options_3_dots_is_click();
//		adalluser.admin_users_all_users_actions_option_change_password_is_click();
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//
//	
//	@When("admin enter the invalid password into the cureent password from all users actions options change password page")
//	public void admin_enter_the_invalid_password_into_the_cureent_password_from_all_users_actions_options_change_password_page() {
//		adcp.admin_logger_change_password_page_current_password_user_field_send_text("   ");
//		adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin should not be able to displayed the new password user field from all users actions options change password page")
//	public void verify_that_admin_should_not_be_able_to_displayed_the_new_password_user_field_from_all_users_actions_options_change_password_page() {
//	    boolean actual = adchangepass.admin_dashboard_all_users_actions_options_change_password_invalid_text_below_password_userfield();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//
//	
//	@Then("Verify that admin breadcrum dashboard button should navigated to the dashboard page from the users options change password page")
//	public void verify_that_the_breadcrum_dashboard_button_should_navigated_to_the_dashboard_page_from_the_users_options_change_password_page() {
//		adcp.admin_logger_change_password_page_breadcrum_dashborad_button_is_click();
//	    boolean  actual = admain.admin_logger_projects_percentages_in_the_card_box_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin second page breadcrum dashboard button should navigated to the dashboard page from the users options change password page")
//	public void verify_that_the_second_page_breadcrum_dashboard_button_should_navigated_to_the_dashboard_page_from_the_users_options_change_password_page() {
//		adcp.admin_logger_change_password_page_breadcrum_dashborad_button_is_click();
//	    boolean  actual = admain.admin_logger_projects_percentages_in_the_card_box_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin cancel button should navigated to the dashboard page from the users options change password page")
//	public void verify_that_the_cancel_button_should_navigated_to_the_dashboard_page_from_the_users_options_change_password_page() {
//		adcp.admin_logger_change_password_page_cancel_button_is_click();
//	    boolean  actual = admain.admin_logger_projects_percentages_in_the_card_box_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	@Then("Verify that admin second page cancel button should navigated to the dashboard page from the users options change password page")
//	public void verify_that_the_second_page_cancel_button_should_navigated_to_the_dashboard_page_from_the_users_options_change_password_page() {
//		adcp.admin_logger_change_password_page_cancel_button_is_click();
//	    boolean  actual = admain.admin_logger_projects_percentages_in_the_card_box_is_displayed();
//	    Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	/*
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 */
//
//
//
//	 
//    @When("admin enter valid password into the userfield and click on submit button from options change password page")
//    public void admin_enter_valid_password_into_the_userfield_and_clcik_on_submit_button_from_options_change_password_page() {
//    	adcp.admin_logger_change_password_page_current_password_user_field_send_text(AppHooks.prop.getProperty("admin_password"));
//    	adcp.admin_logger_change_password_page_submit_button_is_clicked();
//        logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @When("admin current enter new password {string} and click on submit button from options change password page")
//    public void admin_current_enter_new_password_and_click_on_submit_button_from_options_change_password_page(String string) {
//    	adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//        String actual = adcp.admin_logger_change_password_page_new_password_userfield_is_value();
//        adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @When("admin current enter password {string} and click on submit button from options change password page")
//    public void admin_current_enter_password_and_click_on_submit_button_from_options_change_password_page(String string) {
//    	adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//    	 String actual = adcp.admin_logger_change_password_page_new_password_userfield_is_value();
//    	 adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	    Assert.assertEquals(actual, string);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//	@Then("Verify that admin should get the red tick with note below the password user field from options change password page")
//	public void verify_that_admin_should_get_the_red_tick_with_note_below_the_password_user_field_from_options_change_password_page() {
//		boolean actual=adcp.admin_logger_new_password_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//	
//	@Then("Verify that admin should not get any red tick with note below the password user field from options change password page")
//	public void verify_that_admin_should_not_get_any_red_tick_with_note_below_the_password_user_field_from_options_change_password_page() {
//		boolean actual=adcp.admin_logger_new_password_userfield_below_note_text_is_not_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//	@When("admin is enter the password as {string} in change password from options change password page")
//	public void admin_is_enter_the_password_as_in_change_password(String string) {
//		adcp.admin_logger_change_password_page_new_password_userfield_is_sendText(string);
//	    String actual = adcp.admin_logger_change_password_page_new_password_user_field_value();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//	
//	
//	@When("admin is enter the comfirm password as {string} and click on submit button in options change password page")
//	public void admin_is_enter_the_comfirm_password_as_and_click_on_submit_button_in_change_password(String string) {
//		adcp.admin_logger_change_password_page_comfirm_password_userfield_is_sendText(string);
//	    String actual = adcp.admin_logger_change_password_page_comfirm_password_user_field_value();
//	    Assert.assertEquals(actual, string);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		adcp.admin_logger_change_password_page_submit_button_is_clicked();
//	}
//	
//	@Then("Verify that admin should get any red tick and note below the comfirm password user field in options change password page")
//	public void verify_that_admin_should_get_any_red_tick_and_note_below_the_comfirm_password_user_field_in_options_change_password() {
//		boolean actual=adcp.admin_logger_change_pass_comfirm_password_userfield_below_note_text_is_displayed();
//	    Assert.assertEquals(actual, true);
//	    logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//		ElementUtil.eu.refresh_your_page(DriverFactory.getDriver());
//	}
//
//
//}
