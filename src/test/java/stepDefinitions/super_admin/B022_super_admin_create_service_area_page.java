package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Lookups_create_service_area_page_objects;
import com.pages.Lookups_service_area_management_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B022_super_admin_create_service_area_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_service_area_management_page_objects sasamp = new Lookups_service_area_management_page_objects(DriverFactory.getDriver());
	private Lookups_create_service_area_page_objects sacsap = new Lookups_create_service_area_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(B016_super_admin_service_category_management_page.class);

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
	
	@Given("Verify that super admin user is on users create service area page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_users_create_service_area_page_as_expected_page_title_is(
			String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("super_admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("super_admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.super_admin_logger_mouser_hover_on_masters_button();
		samain.super_admin_logger_mouser_masters_service_areas_is_clicked();
		sasamp.create_service_area_button_is_click();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
	
	
	
	@Then("Verify that create service area title text of the page is displayed in super admin create service area page")
	public void verify_that_create_service_area_title_text_of_the_page_is_displayed_in_super_admin_create_service_area_page() {
		boolean actual= sacsap.create_service_area_title_text_of_the_page_is_displayed();
	    Assert.assertEquals(actual, true);
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
