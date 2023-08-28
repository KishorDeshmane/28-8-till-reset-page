package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class A001_landing_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(A001_landing_page.class);

	/**
	 * 
	 * 
	 * SCR 01
	 * Validate log in button functionality from the landing page
	 * 
	 * 
	 * 
	 */
	

	@Given("User is on the landing page as expected page title {string}")
	public void user_is_on_the_landing_page_as_expected_page_title(String expected) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, expected);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that the log in button should be clickable from the landing page")
	public void verify_that_the_log_in_button_should_be_clickable_from_the_landing_page() {
		boolean actual = lp.landing_page_log_in_button_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("^Verify that the user is able to mouse hover on the log in button from the landing page$")
    public void verify_that_the_user_is_able_to_mouse_hover_on_the_log_in_button_from_the_landing_page() {
        boolean actual = lp.landing_page_log_in_button_mouse_hover();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
    @Then("^Verify that after mouse hover on log in button from the landing page pop up should be displayed$")
    public void verify_that_after_mouse_hover_on_log_in_button_from_the_landing_page_pop_up_should_be_displayed() {
        boolean actual = lp.landing_page_log_in_as_partner_button_is_clickable();
        Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

    @Then("Verify that after mouse hover on log in button log in as administrator option should be clickable")
    public void verify_that_after_mouse_hover_on_log_in_button_log_in_as_administrator_option_should_be_clickable() {
        boolean actual = lp.landing_page_log_in_as_administator_button_is_clickable();
    	Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
    
    @Then("Verify that after mouse hover on log in button log in as partner option should be clickable")
    public void verify_that_after_mouse_hover_on_log_in_button_log_in_as_partner_option_should_be_clickable() {
    	boolean actual = lp.landing_page_log_in_as_partner_button_is_clickable();
    	Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
    
    @Then("Verify that after click on th log in button user should get the pop up as expected")
    public void verify_that_after_click_on_th_log_in_button_user_should_get_the_pop_up_as_expected() {
        lp.landing_page_home_button_is_clicked();
    	lp.landing_page_log_in_button_is_clicked();
        boolean actual1 = lp.landing_page_log_in_as_administator_button_is_clickable();
        boolean actual2 =lp.landing_page_log_in_as_partner_button_is_clickable();
    	Assert.assertSame(actual1, actual2);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
    
    @Then("Verify that after click on the log in button user should be able to click on the log in as administrator button")
    public void verify_that_after_click_on_the_log_in_button_user_should_be_able_to_click_on_the_log_in_as_administrator_button() {
        boolean actual = lp.landing_page_log_in_as_administator_button_is_clickable();
    	Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
    
    @Then("Verify that after click on the log in button user should be able to click on the log as partner button")
    public void verify_that_after_click_on_the_log_in_button_user_should_be_able_to_click_on_the_log_as_partner_button() {
       boolean actual = lp.landing_page_log_in_as_partner_button_is_clickable();
    	Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
    
	/**
	 * 
	 * 
	 * 
	 * SCR 02
	 * Validate register as partner button functionality from the landing page
	 * 
	 * 
	 * 
	 */
	
	@Then("Verify that register as partner button should be displayed in landing page")
	public void verify_that_register_as_partner_button_should_be_displayed_in_landing_page() {
	    boolean actual = lp.landing_page_register_as_partner_button_is_displayed();
	    Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
	
	@Then("Verify that register as partner button should be clickable in the landing page")
	public void verify_that_register_as_partner_button_should_be_clickable_in_the_landing_page() {
		boolean actual = lp.landing_page_register_as_partner_button_is_clickable();
	    Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
	
	@Then("Verify that register as partner button should be able to mouse hover in landing page")
	public void verify_that_register_as_partner_button_should_be_able_to_mouse_hover_in_landing_page() {
		boolean actual = lp.landing_page_register_as_partner_button_mouse_hover();
	    Assert.assertEquals(actual, true);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
	
	@Then("Verify that register as partner page should navigate to the registration page as expected page title {string}")
	public void verify_that_register_as_partner_page_should_navigate_to_the_registration_page_as_expected_page_title(String string) {
		lp.landing_page_register_as_partner_button_is_click();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
	    Assert.assertEquals(actual, string);
 		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
 		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
 	}
    
}
