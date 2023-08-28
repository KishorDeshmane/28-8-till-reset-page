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
//
//public class C005_admin_profile_sign_out_function {
//
//	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
//	private C001_admin_log_in_page_objects adlogin = new C001_admin_log_in_page_objects(DriverFactory.getDriver());
//	private C002_admin_dashboard_main_page_objects admain = new C002_admin_dashboard_main_page_objects(DriverFactory.getDriver());
//	
//	Logger logger = LogManager.getLogger(C005_admin_profile_sign_out_function.class);
//	
//	
//    /*
//     * 
//     * 
//     * sign out
//     * 
//     * 
//     */
//
//    
//    @Given("Verify that user is on the admin dashboard my profile dropdown page as expected page title {string}")
//    public void verify_that_user_is_on_the_admin_dashboard_my_profile_dropdown_page_as_expected_page_title(String title) {
//    	DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
//		lp.user_log_in_to_admin_page();
//		adlogin.admin_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("admin_email"));
//		adlogin.admin_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("admin_password"));
//		adlogin.admin_sign_in_button_is_clicked();
//		admain.admin_logger_first_profile_dropdown_button_is_clicked();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
//		Assert.assertEquals(actual, title);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify than user is able to click on the sign out button from the admin profile dropdown page")
//    public void verify_than_user_is_able_to_click_on_the_sign_out_button_from_the_admin_profile_dropdown_page() {
//        boolean actual = admain.admin_logger_profile_dropdown_item_sign_out_is_clickable();
//    	admain.admin_logger_profile_dropdown_item_sign_out_is_clicked();
//    	Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    @Then("Verify that user is able to displayed the sign in button from the admin log in page")
//    public void verify_that_user_is_able_to_displayed_the_sign_in_button_from_the_admin_log_in_page() {
//        boolean actual =adlogin.admin_log_in_page_have_sign_in_button_is_clickable();
//        Assert.assertEquals(actual, true);
//		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
//		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
//	}
//    
//    
//    
//    
//    
////    @Then("Verify than user is able to sign out button from the admin profile dropdown page")
////    public void verify_than_user_is_able_to_sign_out_button_from_the_admin_profile_dropdown_page() {
////    	System.out.println("1");
////    	admain.admin_logger_first_profile_dropdown_button_with_changed_status_is_clicked();
////    	System.out.println("2");
////    	admain.admin_logger_profile_dropdown_item_sign_out_is_clicked();
////    	System.out.println("3");
////    	boolean actual =adlogin.admin_log_in_page_have_sign_in_button_is_clickable();
////    	System.out.println("4");
////        Assert.assertEquals(actual, true);
////		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
////		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
////	}
//    
//
//}
