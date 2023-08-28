package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Change_password_page_objects {
	private WebDriver driver;

	/*
	 * 
	 * first page
	 * 
	 */

	@FindBy(xpath = "(//*[text()='Change Password'])[1]")
	private WebElement header_change_password_title_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement breadcrum_list;

	@FindBy(xpath = "//*[@class='breadcrumb']/li/a")
	private WebElement breadcrum_dashborad_button;

	@FindBy(xpath = "//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrum_change_password_text;

	@FindBy(xpath = "//*[text()='Current Password']")
	private WebElement current_password_title_text_above_userfield;

	@FindBy(xpath = "//*[@name='current_password']")
	private WebElement current_password_user_field;

	@FindBy(xpath = "//*[@id= 'current_password' and @class= 'form-control  form-control is-invalid']")
	private WebElement current_password_user_field_invalid_entered_values;


	@FindBy(xpath = "//*[@type='submit']")
	private WebElement super_admin_logger_change_password_page_submit_button;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	private WebElement cancel_button;
	
	/*
	 * 
	 * Second page/ Confirm password page
	 * 
	 */
	

	@FindBy(xpath = "//*[text()='New Password']")
	private WebElement new_password_title_text;

	@FindBy(xpath = "//*[@placeholder ='Enter your new password']")
	private WebElement new_password_userfield;

	@FindBy(xpath = "//*[text()='Confirm Password']")
	private WebElement comfirm_password_title_text;

	@FindBy(xpath = "//*[@placeholder='Confirm your password']")
	private WebElement comfirm_password_userfield;

	@FindBy(xpath = "//*[@id='new_password' and @class='form-control  form-control is-invalid']")
	private WebElement new_password_userfield_below_note_text_invalid;

	@FindBy(xpath = "//*[@id='new_password' and @class='form-control  form-control is-valid']")
	private WebElement new_password_userfield_below_note_text_valid;

	@FindBy(xpath = "")
	private WebElement comfirm_password_userfield_below_note_text_valid;

	@FindBy(xpath = "//*[@id='confirm_password' and @class='form-control  form-control is-invalid']")
	private WebElement comfirm_password_userfield_below_note_text_invalid;
	
	/*
	 * 
	 * 
	 * 
	 * Constructor
	 * 
	 * 
	 * 
	 */
	
	public Change_password_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * 
	 * Methods
	 * 
	 * 
	 */
	
	
	public boolean super_admin_logger_change_password_page_header_change_password_title_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, header_change_password_title_text);
		return header_change_password_title_text.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_breadcrum_list_is_displayed() {
		return breadcrum_list.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_breadcrum_dashborad_button_is_clickable() {
		return breadcrum_dashborad_button.isEnabled();
	}
	
	public void super_admin_logger_change_password_page_breadcrum_dashborad_button_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, breadcrum_dashborad_button);
		breadcrum_dashborad_button.click();
	}

	public boolean super_admin_logger_change_password_page_breadcrum_change_password_text_is_displayed() {
		return breadcrum_change_password_text.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_current_password_title_text_above_userfield_is_displayed() {
		return current_password_title_text_above_userfield.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_current_password_user_field_is_clickable() {
		return current_password_user_field.isEnabled();
	}
	
	public void super_admin_logger_change_password_page_current_password_user_field_send_text(String string) {
		current_password_user_field.sendKeys(string);
	}
	
	public String super_admin_logger_change_password_page_current_password_user_field_value() {
		return current_password_user_field.getAttribute("value");
	}
	
	public boolean super_admin_logger_change_password_page_current_password_user_field_invalid_entered_value(){
		return current_password_user_field_invalid_entered_values.isDisplayed();
	}

	public String super_admin_logger_change_password_page_current_password_user_field_placeholder_value() {
		return current_password_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_change_password_page_submit_button_is_displayed() {
		return super_admin_logger_change_password_page_submit_button.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_submit_button_is_clickable() {
		return super_admin_logger_change_password_page_submit_button.isEnabled();
	}
	
	public void super_admin_logger_change_password_page_submit_button_is_clicked() {
		ElementUtil.eu.scroll_down_body_click(3, driver);
		 super_admin_logger_change_password_page_submit_button.click();
	}

	public boolean super_admin_logger_change_password_page_cancel_button_is_displayed() {
		return cancel_button.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_cancel_button_is_clickable() {
		return cancel_button.isEnabled();
	}
	
	public void super_admin_logger_change_password_page_cancel_button_is_click() {
		cancel_button.click();
	}

	public boolean super_admin_logger_change_password_page_submit_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, super_admin_logger_change_password_page_submit_button);
		return true;
	}

	public boolean super_admin_logger_change_password_page_cancel_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, cancel_button);
		return true;
	}


	public boolean super_admin_logger_change_password_page_new_password_title_text_is_displayed() {
		return new_password_title_text.isDisplayed();
	}
	
	public boolean super_admin_logger_change_password_dont_match_password_is_displayed(){
		return comfirm_password_userfield_below_note_text_invalid.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_new_password_userfield_is_clickable() {
		return new_password_userfield.isEnabled();
	}
	
	public String super_admin_logger_change_password_page_new_password_userfield_is_placeholder() {
		return new_password_userfield.getAttribute("placeholder");
	}
	
	public String super_admin_logger_change_password_page_new_password_userfield_is_value() {
		return new_password_userfield.getAttribute("value");
	}
	
	
	public void super_admin_logger_change_password_page_new_password_userfield_is_sendText(String string) {
		new_password_userfield.sendKeys(string);
	}
	
	public void super_admin_logger_change_password_page_comfirm_password_userfield_is_sendText(String string) {
		comfirm_password_userfield.sendKeys(string);
	}
	
	public void super_admin_logger_change_password_page_new_password_userfield_is_sendText_is_cleared(){
		new_password_userfield.clear();
	}
	
	public void super_admin_logger_change_password_page_comfirm_password_userfield_is_sendText_is_cleared() {
		comfirm_password_userfield.clear();
	}
	
	public String super_admin_logger_change_password_page_new_password_user_field_value(){
		return new_password_userfield.getAttribute("value");
	}
	
	public String super_admin_logger_change_password_page_comfirm_password_user_field_value(){
		return comfirm_password_userfield.getAttribute("value");
	}

	public boolean super_admin_logger_change_password_page_comfirm_password_title_text_is_displayed() {
		return comfirm_password_title_text.isDisplayed();
	}

	public boolean super_admin_logger_change_password_page_comfirm_password_userfield_is_clickable() {
		return comfirm_password_userfield.isEnabled();
	}

	public String super_admin_logger_change_password_page_comfirm_password_userfield_is_placeholder() {
		return comfirm_password_userfield.getAttribute("placeholder");
	}
	
	public boolean super_admin_logger_new_password_userfield_below_note_text_is_displayed() {
		return new_password_userfield_below_note_text_invalid.isDisplayed();
	}

	public boolean super_admin_logger_new_password_userfield_below_note_text_is_not_displayed() {
		return new_password_userfield_below_note_text_valid.isDisplayed();
	}

	public boolean super_admin_logger_change_pass_comfirm_password_userfield_below_note_text_is_not_displayed() {
		return comfirm_password_userfield_below_note_text_valid.isDisplayed();
	}

	public boolean super_admin_logger_change_pass_comfirm_password_userfield_below_note_text_is_displayed() {
		return comfirm_password_userfield_below_note_text_invalid.isDisplayed();
	}

	
	
}
