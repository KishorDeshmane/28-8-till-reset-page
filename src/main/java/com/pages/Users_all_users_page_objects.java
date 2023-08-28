package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_all_users_page_objects {
private WebDriver driver;
	
	
	@FindBy(xpath = "(//*[text()='All Users'])[2]")
	private WebElement super_admin_user_all_users_headers_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement super_admin_user_all_users_breadcrum_list;

	@FindBy(xpath = "//*[@class='breadcrumb-item']/a")
	private WebElement super_admin_user_all_users_breadcrum_dashboard;

	@FindBy(xpath = "//*[@class='breadcrumb-item active']")
	private WebElement super_admin_user_all_users_breadcrum_users_text;

	@FindBy(xpath = "(//*[@type='button']/i)[2]")
	private WebElement super_admin_user_all_users_search_button;
	
	@FindBy(xpath = "//*[@placeholder='Search...']")
	private WebElement super_admin_user_all_users_search_userfield;

	@FindBy(xpath = "//*[text()='Create User']")
	private WebElement super_admin_user_all_users_create_user_button;

	@FindBy(xpath = "//table[@class='card-table table-striped table-vcenter text-nowrap mb-0 table']//th/span")
	private List<WebElement> super_admin_user_all_users_column_list;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[1]")
	private WebElement super_admin_user_all_users_column_list_name_up_down_arrow;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[2]")
	private WebElement super_admin_user_all_users_column_list_email_up_down_arrow;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[3]")
	private WebElement super_admin_user_all_users_column_list_mobile_number_up_down_arrow;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[4]")
	private WebElement super_admin_user_all_users_column_list_type_up_down_arrows;
	
	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[5]")
	private WebElement super_admin_user_all_users_column_list_status_up_down_arrow;

	@FindBy(xpath = "//*[text()='Actions']")
	private WebElement super_admin_user_all_users_column_list_action_text;
	
	@FindBy(xpath = "//*[text()='Name']")
	private WebElement super_admin_user_all_users_thread_column_name;

	@FindBy(xpath = "//*[text()='Email']")
	private WebElement super_admin_user_all_users_thread_column_email;

	@FindBy(xpath = "//*[text()='Mobile Number']")
	private WebElement super_admin_user_all_users_thread_column_mobile_number;

	@FindBy(xpath = "//*[text()='Type']")
	private WebElement super_admin_user_all_users_thread_column_type;
	
	@FindBy(xpath = "//*[text()='Status']")
	private WebElement super_admin_user_all_users_thread_column_status;

	/*
	 * Actions
	 */

	@FindBy(xpath = "//*[@class='dropdown']/a/i")
	private WebElement super_admin_users_all_users_actions_options_3_dots;

	@FindBy(xpath = "(//*[@class='dropdown-item']/a)[1]")
	private WebElement super_admin_users_all_users_actions_option_edit;

	@FindBy(xpath = "(//*[@class='dropdown-item']/a)[2]")
	private WebElement super_admin_users_all_users_actions_option_change_status;
	
	@FindBy(xpath = "//*[@class='text-center']/span[text()='Active']/span")
	private WebElement super_admin_user_all_users_thread_column_user_status_active;

	@FindBy(xpath = "//*[@class='text-center']/span[text()='Inactive']/span")
	private WebElement super_admin_user_all_users_thread_column_user_status_inactive;
	
	@FindBy(xpath = "(//*[@class='dropdown-item']/a)[3]")
	private WebElement super_admin_users_all_users_actions_option_delete;

	@FindBy(xpath = "(//*[@class='dropdown-item']/a)[4]")
	private WebElement super_admin_users_all_users_actions_option_resend_email_verification_link;

	@FindBy(xpath = "(//*[@class='dropdown-item']/a)[5]")
	private WebElement super_admin_users_all_users_actions_option_change_password;

	@FindBy(xpath = "//*[text()='Manage Roles and Permissions']")
	private WebElement super_admin_users_all_users_actions_manage_roles_and_permissions;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/span[text()])[1]")
	private WebElement super_admin_user_all_users_column_list_expected_user_name;

	@FindBy(xpath = "")
	private WebElement super_admin_users_all_users_search_not_found;
	
	@FindBy(xpath = "//*[@class='table-responsive']/table/tbody/tr/td[2]")
	private WebElement super_admin_users_all_users_search_button_is_display_the_name_of_user;
	
	@FindBy(xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/span[text()])[1]")
	private WebElement super_admin_users_all_users_search_button_is_display_the_email_of_user;
	
	@FindBy(xpath = "//*[@class='table-responsive']/table/tbody/tr/td[4]")
	private WebElement super_admin_users_all_users_search_button_is_display_the_number_of_user;
	
	@FindBy(xpath ="//*[text()='No records were found']")
	private WebElement search_button_is_display_the_text_of_the_no_records_were_found;
	
	@FindBy(xpath = "(//*[@class='page-item']/a/span[2])[1]")
	private WebElement super_admin_users_all_users_pagination_left_arrow;
	
	@FindBy(xpath = "(//*[@class='page-item']/a/span[2])[2]")
	private WebElement super_admin_users_all_users_pagination_right_arrow;
	
	@FindBy(xpath = "//tbody/tr/td[2]")
	private List<WebElement> super_admin_users_all_users_pagination_members_count;

	@FindBy(css=".page-item")
	private List<WebElement> super_admin_users_all_users_pagination_numbers;
	
	@FindBy(xpath="//span/span[@class='visually-hidden']")
	private WebElement super_admin_users_all_users_pagination_numbers_one;
	
	/* 
	 * 
	 * 
	 * 
	 * Constructor 
	 * 
	 * 
	 * */

	public Users_all_users_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 *  
	 *  Methods 
	 *  
	 *  
	 *  
	 *  */

	public boolean super_admin_user_all_users_headers_text_is_displayed() {
		return super_admin_user_all_users_headers_text.isDisplayed();
	}

	public boolean super_admin_user_all_users_breadcrum_is_displayed() {
		return super_admin_user_all_users_breadcrum_list.isDisplayed();
	}
	
	public void super_admin_user_all_users_breadcrum_is_click() {
		super_admin_user_all_users_breadcrum_list.click();
	}

	public boolean super_admin_user_all_users_breadcrum_dashboard_is_displayed() {
		return super_admin_user_all_users_breadcrum_dashboard.isDisplayed();
	}

	public boolean super_admin_user_all_users_breadcrum_dashboard_is_clickable() {
		return super_admin_user_all_users_breadcrum_dashboard.isEnabled();
	}
	
	public void super_admin_user_all_users_breadcrum_dashboard_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_user_all_users_breadcrum_dashboard);
		 super_admin_user_all_users_breadcrum_dashboard.click();
	}

	public boolean super_admin_user_all_users_breadcrum_users_text_is_displayed() {
		return super_admin_user_all_users_breadcrum_users_text.isDisplayed();
	}

	public boolean super_admin_user_all_users_search_button_is_displayed() {
		return super_admin_user_all_users_search_button.isDisplayed();
	}

	public boolean super_admin_user_all_users_search_button_is_clickable() {
		return super_admin_user_all_users_search_button.isEnabled();
	}
	
	public void super_admin_user_all_users_search_button_is_click() {
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_user_all_users_search_button);
		 super_admin_user_all_users_search_button.click();
	}
	
	public boolean super_admin_user_all_users_column_list_expected_user_name_is_displayed(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_user_all_users_column_list_expected_user_name);
		return super_admin_user_all_users_column_list_expected_user_name.isDisplayed();
	}
	
	public void super_admin_user_all_users_search_userfield_sendText(String string) {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_user_all_users_search_userfield);
		super_admin_user_all_users_search_userfield.sendKeys(string);
	}
	
	public boolean super_admin_user_all_users_search_button_should_be_able_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, super_admin_user_all_users_search_button);
		return true;
	}
	
	public boolean super_admin_user_all_users_search_userfield_is_clickable(){
		return super_admin_user_all_users_search_userfield.isEnabled();
	}
	
	public String super_admin_user_all_users_search_userfield_is_placeholder_value(){
		return  super_admin_user_all_users_search_userfield.getAttribute("placeholder");
	}
	
	public String super_admin_user_all_users_search_userfield_is_entered_value(){
		return  super_admin_user_all_users_search_userfield.getAttribute("value");
	}

	public boolean super_admin_user_all_users_create_user_button_is_displayed() {
		return super_admin_user_all_users_create_user_button.isDisplayed();
	}

	public boolean super_admin_user_all_users_create_user_button_is_clickable() {
		return super_admin_user_all_users_create_user_button.isEnabled();
	}
	
	public void super_admin_user_all_users_create_user_button_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_user_all_users_create_user_button);
		 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		 ElementUtil.eu.clickByJS(driver, super_admin_user_all_users_create_user_button);
	}

	public boolean super_admin_user_all_users_create_user_button_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, super_admin_user_all_users_create_user_button);
		return true;
	}

	public boolean super_admin_user_all_users_column_list_is_displayed() {
		for(WebElement elements : super_admin_user_all_users_column_list) {
		 elements.isDisplayed();
		 System.out.println(elements.getText());
		}
		return true;
	}
	
	public boolean super_admin_user_all_users_column_list_name_up_down_arrow_is_clickable(){
		return super_admin_user_all_users_column_list_name_up_down_arrow.isEnabled();
	}
	
	public boolean super_admin_user_all_users_column_list_email_up_down_arrow_is_clickable(){
		return super_admin_user_all_users_column_list_email_up_down_arrow.isEnabled();
	}
	
	public boolean super_admin_user_all_users_column_list_mobile_number_up_down_arrow_is_clickable(){
		return super_admin_user_all_users_column_list_mobile_number_up_down_arrow.isEnabled();
	}
	
	public boolean super_admin_user_all_users_column_list_type_up_down_arrows_is_clickable(){
		return super_admin_user_all_users_column_list_type_up_down_arrows.isEnabled();
	}
	
	public boolean super_admin_user_all_users_column_list_status_up_down_arrow_is_clickable(){
		return super_admin_user_all_users_column_list_status_up_down_arrow.isEnabled();
	}

	public boolean super_admin_user_all_users_column_list_name_up_down_arrow_is_displayed() {
		return super_admin_user_all_users_column_list_name_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_all_users_column_list_email_up_down_arrow_is_displayed() {
		return super_admin_user_all_users_column_list_email_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_all_users_column_list_mobile_number_up_down_arrow_is_displayed() {
		return super_admin_user_all_users_column_list_mobile_number_up_down_arrow.isDisplayed();
	}
	
	public boolean super_admin_user_all_users_column_list_type_up_down_arrows_is_displayed(){
		return super_admin_user_all_users_column_list_type_up_down_arrows.isDisplayed();
	}

	public boolean super_admin_user_all_users_column_list_action_text_is_displayed(){
		return super_admin_user_all_users_column_list_action_text.isDisplayed();	
	}
	
	public boolean super_admin_user_all_users_column_list_status_up_down_arrow_is_displayed() {
		return super_admin_user_all_users_column_list_status_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_all_users_thread_column_name_is_displayed() {
		return super_admin_user_all_users_thread_column_name.isDisplayed();
	}

	public boolean super_admin_user_all_users_thread_column_email_is_displayed() {
		return super_admin_user_all_users_thread_column_email.isDisplayed();
	}

	public boolean super_admin_user_all_users_thread_column_mobile_number_is_displayed() {
		return super_admin_user_all_users_thread_column_mobile_number.isDisplayed();
	}
	
	public boolean super_admin_user_all_users_thread_column_type_is_displayed(){
		return super_admin_user_all_users_thread_column_type.isDisplayed();
	}

	public boolean super_admin_user_all_users_thread_column_status_is_displayed() {
		return super_admin_user_all_users_thread_column_status.isDisplayed();
	}

	/*
	 * Actions
	 * 
	 */
	
	public boolean super_admin_users_all_users_actions_options_3_dots_is_clickable() {
		return super_admin_users_all_users_actions_options_3_dots.isEnabled();
	}

	public boolean super_admin_users_all_users_actions_options_3_dots_is_able_to_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, super_admin_users_all_users_actions_options_3_dots);
		return true;
	}
	
	public void super_admin_users_all_users_actions_options_3_dots_is_click() {
		ElementUtil.eu.clickByJS(driver, super_admin_users_all_users_actions_options_3_dots);
		//super_admin_users_all_users_actions_options_3_dots.click();
	}

	public boolean super_admin_users_all_users_actions_option_edit_is_clickable() {
		return super_admin_users_all_users_actions_option_edit.isEnabled();
	}
	
	public void super_admin_users_all_users_actions_option_edit_is_click() {
		 super_admin_users_all_users_actions_option_edit.click();
	}

	public boolean super_admin_users_all_users_actions_option_change_status_is_clickable() {
		return super_admin_users_all_users_actions_option_change_status.isEnabled();
	}

	public void super_admin_users_all_users_actions_option_change_status_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_users_all_users_actions_option_change_status);
		 super_admin_users_all_users_actions_option_change_status.click();
	}
	
	public boolean super_admin_users_all_users_actions_option_delete_is_clickable() {
		return super_admin_users_all_users_actions_option_delete.isEnabled();
	}
	
	public void super_admin_users_all_users_actions_option_delete_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_users_all_users_actions_option_delete);
		 super_admin_users_all_users_actions_option_delete.click();
	}
	
	public boolean super_admin_user_all_users_thread_column_user_status_active_is_displayed(){
		return super_admin_user_all_users_thread_column_user_status_active.isDisplayed();
	}
	
	public boolean super_admin_user_all_users_thread_column_user_status_inactive_is_displayed(){
		return super_admin_user_all_users_thread_column_user_status_inactive.isDisplayed();
	}

	public boolean super_admin_users_all_users_actions_option_resend_email_verification_link_is_clickable() {
		return super_admin_users_all_users_actions_option_resend_email_verification_link.isEnabled();
	}
	
	public void super_admin_users_all_users_actions_option_resend_email_verification_link_is_click() {
		 super_admin_users_all_users_actions_option_resend_email_verification_link.click();
	}

	public boolean super_admin_users_all_users_actions_option_change_password_is_clickable() {
		return super_admin_users_all_users_actions_option_change_password.isEnabled();
	}
	
	public void super_admin_users_all_users_actions_option_change_password_is_click() {
		 super_admin_users_all_users_actions_option_change_password.click();
	}

	public boolean super_admin_users_all_users_actions_manage_roles_and_permissions_is_clickable() {
		return super_admin_users_all_users_actions_manage_roles_and_permissions.isEnabled();
	}
	
	public boolean super_admin_users_all_users_pagination_left_arrow_is_displayed(){
		return super_admin_users_all_users_pagination_left_arrow.isDisplayed();
	}
	
	public boolean super_admin_users_all_users_pagination_left_arrow_is_clickable(){
		return super_admin_users_all_users_pagination_left_arrow.isEnabled();
	}
	
	public boolean super_admin_users_all_users_pagination_left_arrow_is_able_to_mouse_hover(){
		ElementUtil.eu.scroll_end_of_page_with_keyboard_click(5);
		ElementUtil.eu.mouseHover(driver, super_admin_users_all_users_pagination_left_arrow);
		return true;
	}
	
	public boolean super_admin_users_all_users_pagination_numbers_one_should_be_selected_by_default(){
		boolean ac=super_admin_users_all_users_pagination_numbers_one.getText().equals("(current)");
		return ac;
	}
	
	public boolean super_admin_users_all_users_pagination_numbers_should_be_displayed() {
		  for (WebElement element : super_admin_users_all_users_pagination_numbers) {
	            boolean isEnabled = element.isDisplayed();
	            System.out.println("Element: " + element.getText() + " - Displayed: " + isEnabled);
	        }
		  return true;
	}
	
	public boolean super_admin_users_all_users_pagination_numbers_should_be_clickable() {
		for (WebElement element : super_admin_users_all_users_pagination_numbers) {
            boolean isEnabled = element.isEnabled();
            System.out.println("Element: " + element.getText() + " - isEnabled: " + isEnabled);
        }
	  return true;
}
	
	public boolean super_admin_users_all_users_pagination_numbers_should_be_able_to_mouse_hover() {
		for (WebElement element : super_admin_users_all_users_pagination_numbers) {
            boolean isEnabled = element.isEnabled();
            ElementUtil.eu.mouseHover(driver, element);
            System.out.println("Element: " + element.getText() + " - mouse hover: " + isEnabled);
        }
	  return true;
}
	
	public boolean super_admin_users_all_users_pagination_right_arrow_is_displayed(){
		return super_admin_users_all_users_pagination_right_arrow.isDisplayed();
	}
	
	public boolean super_admin_users_all_users_pagination_right_arrow_is_clickable(){
		return super_admin_users_all_users_pagination_right_arrow.isEnabled();
	}
	
	public boolean super_admin_users_all_users_pagination_right_arrow_is_able_to_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, super_admin_users_all_users_pagination_right_arrow);
		return true;
	}
	
	public int super_admin_users_all_users_pagination_members_count_is(){
		return super_admin_users_all_users_pagination_members_count.size();
	}
	
	public void super_admin_users_all_users_actions_option_manage_roles_and_permissions_is_click() {
		 super_admin_users_all_users_actions_manage_roles_and_permissions.click();
	}

	public boolean super_admin_users_all_users_search_not_found_is_displayed(){
		return super_admin_users_all_users_search_not_found.isDisplayed();
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public String super_admin_users_all_users_search_button_is_display_the_name_of_the_user(){
		return super_admin_users_all_users_search_button_is_display_the_name_of_user.getText();
	}
	
	public String super_admin_users_all_users_search_button_is_display_the_email_of_the_user(){
		return super_admin_users_all_users_search_button_is_display_the_email_of_user.getText();
	}
	
	public String super_admin_users_all_users_search_button_is_display_the_number_of_the_user(){
		return super_admin_users_all_users_search_button_is_display_the_number_of_user.getText();
	}
	
	public String super_admin_users_all_users_search_button_is_display_the_text_of_the_no_records_were_found(){
		return search_button_is_display_the_text_of_the_no_records_were_found.getText();
	}
	
	
	
}
