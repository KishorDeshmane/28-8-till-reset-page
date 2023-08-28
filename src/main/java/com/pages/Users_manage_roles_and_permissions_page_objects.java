package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

public class Users_manage_roles_and_permissions_page_objects {

private WebDriver driver;
	
/*
 * 
 * 
 * manage roles and permissions front breadcrum
 * 
 * 
 */

@FindBy(xpath = "//*[@class='page-header']/div/h2")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header;

@FindBy(xpath = "//*[@class='breadcrumb']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum;

@FindBy(xpath = "")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button;

@FindBy(xpath = "//*[@class='breadcrumb']/li/a")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button;

@FindBy(xpath = "//*[@class='breadcrumb-item active']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_roles_and_permissions_text;

@FindBy(xpath = "//*[@for='assigned_roles']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_text_above_the_userfield;

@FindBy(xpath = "//*[@id='assigned_roles']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_list;

@FindBy(xpath = "//*[@id='assigned_roles']/option[2]")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin;

@FindBy(xpath = "//*[@id='assigned_roles']/option[3]")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_super_admin;

@FindBy(xpath = "//*[@class='Roles_disabledText___UrWW']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_permission_of_super_admin_can_not_be_modifieded;

/*
 * 
 * role management 
 *
 * 
 */

@FindBy(xpath = "//legend[text()='Role Management']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_title_text;

@FindBy(xpath = "//*[text()='Create Role']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Create Role']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_text;

@FindBy(xpath = "//*[text()='Read Role']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Read Role']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_text;

@FindBy(xpath = "//*[text()='Update Role']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Update Role']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_text;

@FindBy(xpath = "//*[text()='Delete Role']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Delete Role']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_text;

@FindBy(xpath = "//*[text()='Change Role Status']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Change Role Status']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_text;

@FindBy(xpath = "//*[text()='Search Role']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Search Role']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_text;

@FindBy(xpath = "//*[text()='Manage Role Permissions']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Manage Role Permissions']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_text;

/*
 * 
 * 
 * user_management
 * 
 *
 */

@FindBy(xpath = "//legend[text()='User Management']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_title_text;

@FindBy(xpath = "//*[text()='Create User']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Create User']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_text;

@FindBy(xpath = "//*[text()='Read User']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Read User']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_text;

@FindBy(xpath = "//*[text()='Update User']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Update User']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_text;

@FindBy(xpath = "//*[text()='Delete User']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Delete User']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_text;

@FindBy(xpath = "//*[text()='Change User Status']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Change User Status']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_text;

@FindBy(xpath = "//*[text()='Search User']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Search User']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_text;

@FindBy(xpath = "//*[text()='Change User Password']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Change User Password']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_text;

@FindBy(xpath = "//*[text()='Resend Password Verification Link']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Resend Password Verification Link']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_text;

@FindBy(xpath = "//*[text()='Forgot User Password']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Forgot User Password']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_text;

@FindBy(xpath = "//*[text()='Resend Email Verification Link']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Resend Email Verification Link']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_text;

/*
 * 
 * 
 * Service category manangement
 * 
 * 
 */

@FindBy(xpath = "//legend[text()='Service Category Management']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_title_text;

@FindBy(xpath = "//*[text()='Create Service Category']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Create Service Category']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_text;

@FindBy(xpath = "//*[text()='Read Service Category']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Read Service Category']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_text;

@FindBy(xpath = "//*[text()='Update Service Category']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Update Service Category']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_text;

@FindBy(xpath = "//*[text()='Delete Service Category']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Delete Service Category']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_text;

@FindBy(xpath = "//*[text()='Change Service Category Status']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Change Service Category Status']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_text;

@FindBy(xpath = "//*[text()='Search Service Category']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Search Service Category']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_text;

/*
 * 
 * 
 * Service management
 * 
 * 
 */

@FindBy(xpath = "//legend[text()='Service Management']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_title_text;

@FindBy(xpath = "//*[text()='Create Service']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Create Service']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_text;

@FindBy(xpath = "//*[text()='Read Service']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Read Service']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_text;

@FindBy(xpath = "//*[text()='Update Service']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Update Service']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_text;

@FindBy(xpath = "//*[text()='Delete Service']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Delete Service']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_text;

@FindBy(xpath = "//*[text()='Change Service Status']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Change Service Status']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_text;

@FindBy(xpath = "//*[text()='Search Service']/preceding-sibling::input")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box;

@FindBy(xpath = "//*[@type='checkbox']/following-sibling::label[text()='Search Service']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_text;

/*
 * 
 * buttons
 * 
 * 
 * 
 */

@FindBy(xpath = "//*[@type='submit']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button;

@FindBy(xpath = "//*[text()='Cancel']")
private WebElement super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	public Users_manage_roles_and_permissions_page_objects (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Manage roles and permission
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header_is_displayed() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_page_header.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_dashboard_button.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button.isEnabled();
	}
	
	public void super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button);
		 super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_all_users_button.click();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_roles_and_permissions_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_breadcrum_roles_and_permissions_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_text_above_the_userfield_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_text_above_the_userfield.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_list_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_list.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin.isEnabled();
	}
	
	public void super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin_is_click() {
		super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_admin.click();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_super_admin_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_super_admin.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_permission_of_super_admin_can_not_be_modified(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_list);
		ElementUtil.eu.scroll_up_body_click(5, DriverFactory.getDriver());
		super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_list.click();
		super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_dropdown_super_admin.click();
		boolean res= super_admin_logger_all_users_actions_option_manage_roles_and_permissions_assigned_role_permission_of_super_admin_can_not_be_modifieded.isDisplayed();
		return res;
	}
	
	/**
	 * 
	 * role management 
	 * 
	 * */

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_title_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_title_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box_is_not_selected() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box_is_selected() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_create_role_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box_is_not_selected(){
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box_is_selected(){
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_read_role_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_update_role_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_delete_role_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_change_role_status_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_click_box.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_search_role_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_role_management_container_manage_role_permission_text.isDisplayed();
	}

	/*
	 * 
	 * 
	 * user_management
	 * 
	 */
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_title_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_title_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box_is_clickable() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box_is_selected() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_create_user_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_read_user_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_update_user_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_delete_user_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_status_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_search_user_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_change_user_password_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_password_verification_link_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_forgot_user_password_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_user_management_container_resend_email_verification_link_text.isDisplayed();
	}
	
	/*
	 * 
	 * 
	 * Service category manangement
	 * 
	 * 
	 */

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_title_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_title_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box_is_clickable() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_create_service_category_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_read_service_category_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_update_service_category_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_delete_service_category_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_change_service_category_status_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_category_management_container_search_service_category_text.isDisplayed();
	}
	
	/*
	 * 
	 * 
	 * Service management
	 * 
	 * 
	 */

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_title_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_title_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_click_box_is_clickable() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_create_service_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_create_service_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_read_service_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_update_service_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_delete_service_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_change_service_status_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box.isEnabled();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box_is_selected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box.isSelected();
	}
	
	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box_is_not_selected() {
		ElementUtil.eu.wait_for_element_to_be_not_selected(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_click_box.isSelected();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_service_management_container_search_service_text.isDisplayed();
	}
	
	/*
	 * 
	 * buttons
	 * 
	 * 
	 * 
	 */

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button_is_displayed() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button);
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button);
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_submit_button.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button_is_displayed() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button.isEnabled();
	}

	public void super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button_is_click() {
		 super_admin_logger_all_users_actions_option_manage_roles_and_permissions_cancel_button.click();
	}
	
	
}
