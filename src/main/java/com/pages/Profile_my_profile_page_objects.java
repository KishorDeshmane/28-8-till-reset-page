package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Profile_my_profile_page_objects {

	private WebDriver driver;
	
	/*
	 * 
	 * Page Objects
	 * 
	 */
	
	@FindBy(xpath = "(//*[text()='My Profile'])[1]")
	private WebElement header_my_profile_title_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement breadcrum_list;

	@FindBy(xpath = "//*[@class='breadcrumb']/li/a")
	private WebElement breadcrum_dashboard;

	@FindBy(xpath = "//*[@class='breadcrumb-item active']")
	private WebElement breadcrum_my_profile_text;

	@FindBy(xpath = "(//*[@class='small font-weight-bold'])[4]")
	private WebElement my_profile_page_last_log_in_date;

	@FindBy(xpath = "(//*[@class='small font-weight-bold'])[4]")
	private WebElement my_profile_page_last_log_in_time;
	
	@FindBy(xpath = "(//*[@class='small font-weight-bold'])[6]")
	private WebElement user_ip_address;

	@FindBy(xpath = "(//*[@class='small font-weight-bold'])[8]")
	private WebElement user_agent;

	@FindBy(xpath = "//*[@class='rounded-circle img-thumbnail']")
	private WebElement user_image_in_round_circle;
	
	@FindBy(xpath = "//*[@class='h3']")
	private WebElement user_name_below_image;
	
	@FindBy(xpath = "//*[@class='small text-dark']")
	private WebElement user_role_below_image;
	
	@FindBy(xpath = "//*[@class='Myprofile_profileBadge__4O_mD badge rounded-pill bg-success']")
	private WebElement tick_mark_below_image;
	
	@FindBy(xpath = "//*[text()='Personal Information']")
	private WebElement personal_information_header_text;
	
	@FindBy(xpath="")
	private WebElement change_password_button;
	
	@FindBy(xpath = "//*[text()='First Name']")
	private WebElement first_name_text_above_user_field;
	
	@FindBy(xpath = "")
	private WebElement first_name_text_above_asterisk_sign;
	
	@FindBy(xpath = "//*[@name='first_name']")
	private WebElement first_name_user_field;

	@FindBy(xpath = "//*[text()='Last Name']")
	private WebElement last_name_text_above_user_field;
	
	@FindBy(xpath = "")
	private WebElement last_name_asterisk_sign;
	
	@FindBy(xpath = "//*[@name='last_name']")
	private WebElement last_name_user_field;

	@FindBy(xpath = "//*[text()='Username']")
	private WebElement user_name_text_above_user_field;
	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement user_name_user_field;

	@FindBy(xpath = "//*[text()='Email']")
	private WebElement email_text_above_user_field;
	
	@FindBy(xpath="")
	private WebElement email_asterisk_sign;
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement email_user_field;

	@FindBy(xpath = "(//*[text()='Verify'])[1]")
	private WebElement email_user_field_verify_button;
	
	@FindBy(xpath = "//*[text()='Mobile Number']")
	private WebElement mobile_number_text_above_the_user_field;
	
	@FindBy(xpath="")
	private WebElement mobile_number_text_above_asterrisk_sign;
	
	@FindBy(xpath = "//*[@name='country_code']")
	private WebElement country_code_user_field;

	@FindBy(xpath = "//*[@name='mobile_number']")
	private WebElement mobile_number_user_field;

	@FindBy(xpath = "(//*[text()='Verify'])[2]")
	private WebElement mobile_number_user_field_verify_button;
	
	@FindBy(xpath = "//*[text()='Profile Image']")
	private WebElement profile_image_text_above_the_user_field;
	
	@FindBy(xpath = "//*[@placeholder='Enter your user image URL']")
	private WebElement profile_image_user_field;
	
	@FindBy(xpath = "(//*[@class='Myprofile_btn_group__JyB3V']/button)[1]")
	private WebElement save_button;
	
	@FindBy(xpath = "(//*[@class='Myprofile_btn_group__JyB3V']/button)[2]")
	private WebElement cancel_button;
	
	/*
	 * 
	 * Constructor
	 * 
	 */
	
	public Profile_my_profile_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * Methods
	 * 
	 * 
	 * 
	 */


	public boolean super_admin_logger_my_profile_page_header_my_profile_title_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, header_my_profile_title_text);
		return header_my_profile_title_text.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_breadcrum_list_is_displayed() {
		return breadcrum_list.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_breadcrum_dashboard_is_clickable() {
		return breadcrum_dashboard.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_breadcrum_my_profile_text_is_displayed() {
		return breadcrum_my_profile_text.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_last_log_in_date_is_displayed() {
		return my_profile_page_last_log_in_date.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_last_log_in_time_is_displayed() {
		return my_profile_page_last_log_in_date.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_user_ip_address_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, user_ip_address);
		return user_ip_address.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_user_agent_is_displayed() {
		return user_agent.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_user_image_in_round_circle_is_displayed() {
		return user_image_in_round_circle.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_user_name_below_image_is_displayed() {
		return user_name_below_image.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_user_role_below_image_should_be_displayed() {
		return user_role_below_image.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_tick_mark_below_image_is_displayed() {
		return tick_mark_below_image.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_personal_information_header_text_is_displayed() {
		return personal_information_header_text.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_first_name_text_above_user_field_is_displayed() {
		return first_name_text_above_user_field.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_first_name_user_field_is_clickable() {
		return first_name_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_first_name_user_field_place_holder_value_is_something() {
		return first_name_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_last_name_text_above_user_field_is_displayed() {
		return last_name_text_above_user_field.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_last_name_user_field_is_clickable() {
		return last_name_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_last_name_user_field_place_holder_value_is_something() {
		return last_name_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_user_name_text_above_user_field_is_displayed() {
		return user_name_text_above_user_field.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_user_name_user_field_is_clickable() {
		return user_name_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_user_name_user_field_place_holder_value_should_be_something() {
		return user_name_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_email_text_above_user_field_is_displayed() {
		return email_text_above_user_field.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_email_user_field_is_clickable() {
		return email_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_email_user_field_place_holder_value_is_something() {
		return email_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_email_user_field_verify_button_is_displayed() {
		return email_user_field_verify_button.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_email_user_field_verify_button_is_clickable() {
		return email_user_field_verify_button.isEnabled();
	}

	public boolean super_admin_logger_my_profile_page_mobile_number_text_above_the_user_field_is_displayed() {
		return mobile_number_text_above_the_user_field.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_mobile_number_country_code_user_field_is_clickable() {
		return country_code_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_mobile_number_country_code_user_field_place_holder_value_is_something() {
		return country_code_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_mobile_number_user_field_is_clickable() {
		return mobile_number_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_mobile_number_user_field_placeholder_value_is_something() {
		return mobile_number_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_mobile_number_verify_button_is_displayed() {
		return mobile_number_user_field_verify_button.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_mobile_number_verify_button_is_clickable() {
		return mobile_number_user_field_verify_button.isEnabled();
	}

	public boolean super_admin_logger_my_profile_page_profile_image_text_above_the_user_field_is_displayed() {
		return profile_image_text_above_the_user_field.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_profile_image_user_field_is_clickable() {
		return profile_image_user_field.isEnabled();
	}

	public String super_admin_logger_my_profile_page_profile_image_user_field_place_holder_value_is_something() {
		return profile_image_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_my_profile_page_save_button_is_clickable() {
		return save_button.isEnabled();
	}
	
	public boolean super_admin_logger_my_profile_page_save_button_is_displayed(){
		return save_button.isDisplayed();
	}

	public boolean super_admin_logger_my_profile_page_save_button_is_able_to_mouse_hover() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		ElementUtil.eu.mouseHover(driver, save_button);
		return true;
	}
	public boolean super_admin_logger_my_profile_page_cancel_button_should_be_displayed(){
		return cancel_button.isDisplayed();
	}
	
	public boolean super_admin_logger_my_profile_page_cancel_button_should_be_clickable() {
		return cancel_button.isEnabled();
	}

	public boolean super_admin_logger_my_profile_page_cancel_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, cancel_button);
		return true;
	}
	
	public void super_admin_logger_my_profile_page_cancel_button_is_clicked(){
		ElementUtil.eu.scroll_down_body_click(5, driver);
		cancel_button.click();
	}

	
	
}
