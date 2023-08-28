package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_customers_page_objects {
	private WebDriver driver;
	
	@FindBy(xpath="(//*[text()='Customers'])[2]")
	private WebElement customers_page_customers_header_text;

	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement customers_page_customers_breadcrumb;

	@FindBy(xpath="//*[@class='breadcrumb']/li[1]")
	private WebElement customers_page_customers_breadcrumb_dashboard_button;

	@FindBy(xpath="//*[@class='breadcrumb']/li[2]")
	private WebElement customers_page_customers_breadcrumb_customers_button;

	@FindBy(xpath="//*[@placeholder='Search...']")
	private WebElement customers_page_search_user_field;

	@FindBy(xpath="//*[@class='input-group']/button/i")
	private WebElement customers_page_search_button;

	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th/span")
	private List<WebElement> customers_page_thread_column_list;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/span)[2]")
	private WebElement customers_page_thread_column_name;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/span)[3]")
	private WebElement customers_page_thread_column_email;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/span)[4]")
	private WebElement customers_page_thread_column_mobile_number;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/span)[5]")
	private WebElement customers_page_thread_column_type;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/span)[6]")
	private WebElement customers_page_thread_column_status;

	@FindBy(xpath="//*[text()='Actions']")
	private WebElement customers_page_thread_column_actions;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/i)[1]")
	private WebElement customers_page_thread_column_name_up_down_arrow;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/i)[2]")
	private WebElement customers_page_thread_column_email_up_down_arrow;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/i)[3]")
	private WebElement customers_page_thread_column_mobile_number_up_down_arrow;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/i)[4]")
	private WebElement customers_page_thread_column_type_up_down_arrow;

	@FindBy(xpath="(//*[@class='table-responsive']/table/thead/tr/th/i)[5]")
	private WebElement customers_page_thread_column_status_up_down_arrow;

	@FindBy(xpath="//*[@class='dropdown']/a/i")
	private WebElement customers_page_thread_column_actions_options_3_dots;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[1]")
	private WebElement customers_page_thread_column_actions_options_3_dots_edit;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[2]")
	private WebElement customers_page_thread_column_actions_options_3_dots_change_status;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[3]")
	private WebElement customers_page_thread_column_actions_options_3_dots_delete;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[4]")
	private WebElement customers_page_thread_column_actions_options_3_dots_resend_email_verification_link;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[5]")
	private WebElement customers_page_thread_column_actions_options_3_dots_change_password;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[6]")
	private WebElement customers_page_thread_column_actions_options_3_dots_manage_roles_and_permissions;
	
	/* 
	 * 
	 * 
	 * 
	 * Constructor 
	 * 
	 * 
	 * */

	public Users_customers_page_objects(WebDriver driver) {
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


	public boolean super_admin_user_customers_page_customers_header_text_is_displayed() {
		return customers_page_customers_header_text.isDisplayed();
	}

	public boolean super_admin_user_customers_page_customers_breadcrumb_is_displayed() {
		return customers_page_customers_breadcrumb.isDisplayed();
	}

	public boolean super_admin_user_customers_page_customers_breadcrumb_dashboard_button_is_displayed() {
		return customers_page_customers_breadcrumb_dashboard_button.isDisplayed();
	}

	public boolean super_admin_user_customers_page_customers_breadcrumb_dashboard_button_is_clickable() {
		return customers_page_customers_breadcrumb_dashboard_button.isEnabled();
	}

	public boolean super_admin_user_customers_page_customers_breadcrumb_dashboard_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, customers_page_customers_breadcrumb_dashboard_button);
		return true;
	}

	public boolean super_admin_user_customers_page_customers_breadcrumb_customers_button_is_displayed() {
		return customers_page_customers_breadcrumb_customers_button.isDisplayed();
	}

	public boolean super_admin_user_customers_page_search_user_field_is_displayed() {
		return customers_page_search_user_field.isDisplayed();
	}

	public boolean super_admin_user_customers_page_search_user_field_is_clickable() {
		return customers_page_search_user_field.isEnabled();
	}

	public String super_admin_user_customers_page_search_user_field_place_holder_value() {
		return customers_page_search_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_user_customers_page_search_button_is_displayed() {
		return customers_page_search_button.isDisplayed();
	}

	public boolean super_admin_user_customers_page_search_button_is_clickable() {
		return customers_page_search_button.isEnabled();
	}

	public boolean super_admin_user_customers_page_thread_column_list_should_be_displayed() {
		for (WebElement element : customers_page_thread_column_list) {
            boolean isDisplayed = element.isEnabled();
            System.out.println("Element: " + element.getText() + " - Enabled: " + isDisplayed);
        }
		return true;
	}

	public boolean super_admin_user_customers_page_thread_column_name_should_be_displayed() {
		return customers_page_thread_column_name.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_email_should_be_displayed() {
		return customers_page_thread_column_email.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_mobile_number_should_be_displayed() {
		return customers_page_thread_column_mobile_number.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_type_should_be_displayed() {
		return customers_page_thread_column_type.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_status_should_be_displayed() {
		return customers_page_thread_column_status.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_should_be_displayed() {
		return customers_page_thread_column_actions.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_name_up_down_arrow_should_be_displayed() {
		return customers_page_thread_column_name_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_email_up_down_arrow_should_be_displayed() {
		return customers_page_thread_column_email_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_mobile_number_up_down_arrow_should_be_displayed() {
		return customers_page_thread_column_mobile_number_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_type_up_down_arrow_should_be_displayed() {
		return customers_page_thread_column_type_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_status_up_down_arrow_should_be_displayed() {
		return customers_page_thread_column_status_up_down_arrow.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_displayed() {
		return customers_page_thread_column_actions_options_3_dots.isDisplayed();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots.isEnabled();
	}

	public void super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_click() {
		customers_page_thread_column_actions_options_3_dots.click();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, customers_page_thread_column_actions_options_3_dots);
		return true;
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_edit_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots_edit.isEnabled();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_change_status_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots_change_status.isEnabled();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_delete_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots_delete.isEnabled();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_resend_email_verification_link_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots_resend_email_verification_link.isEnabled();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_change_password_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots_change_password.isEnabled();
	}

	public boolean super_admin_user_customers_page_thread_column_actions_options_3_dots_manage_roles_and_permissions_should_be_clickable() {
		return customers_page_thread_column_actions_options_3_dots_manage_roles_and_permissions.isEnabled();
	}

}
