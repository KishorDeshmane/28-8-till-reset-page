package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Partner_registration_page_objects {
	private WebDriver driver;
	
	/*
	 * 
	 * 
	 * 
	 * Elements
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//*[text()='Register as a Partner']")
	private WebElement register_as_partner_page_title_text;

	@FindBy(xpath = "(//*[text()='Register to manage, your business'])[2]")
	private WebElement register_as_partner_register_to_manage_your_business_subtitle_text;

	@FindBy(xpath = "//*[text()='First Name']")
	private WebElement register_as_partner_first_name_above_the_user_field_text;

	@FindBy(xpath = "//*[text()='First Name']/span")
	private WebElement register_as_partner_first_name_asterisk;

	@FindBy(xpath = "//*[@name='first_name']")
	private WebElement register_as_partner_first_name_user_field;

	@FindBy(xpath = "//*[text()='Last Name']")
	private WebElement register_as_partner_last_name_above_the_user_field_text;

	@FindBy(xpath = "//*[text()='Last Name']/span")
	private WebElement register_as_partner_last_name_asterisk;

	@FindBy(xpath = "//*[@name='last_name']")
	private WebElement register_as_partner_last_name_user_field;

	@FindBy(xpath = "//*[text()='Email']")
	private WebElement register_as_partner_email_above_the_user_field_text;

	@FindBy(xpath = "//*[text()='Email']/span")
	private WebElement register_as_partner_email_asterisk;

	@FindBy(xpath = "//*[@name='email']")
	private WebElement register_as_partner_email_user_field;

	@FindBy(xpath = "//*[text()='Mobile Number']")
	private WebElement register_as_partner_mobile_number_above_the_user_field_text;

	@FindBy(xpath = "//*[text()='Mobile Number']/span")
	private WebElement register_as_partner_mobile_number_asterisk;

	@FindBy(xpath = "//*[@name='country_code']")
	private WebElement register_as_partner_mobile_number_dropdown;
	
	@FindBy(xpath = "//*[@name='country_code']/option")
	private List<WebElement> register_as_partner_mobile_number_dropdown_list;

	@FindBy(xpath = "//*[@name='mobile_number']")
	private WebElement register_as_partner_mobile_number_user_field;

	@FindBy(xpath = "//*[text()='Password']")
	private WebElement register_as_partner_password_above_the_user_field_text;

	@FindBy(xpath = "//*[text()='Password']/span")
	private WebElement register_as_partner_password_asterisk;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement register_as_partner_password_user_field;

	@FindBy(xpath = "//*[text()='Confirm Password']")
	private WebElement register_as_partner_comfirm_password_above_the_user_field_text;

	@FindBy(xpath = "//*[text()='Confirm Password']/span")
	private WebElement register_as_partner_comfirm_password_asterisk;

	@FindBy(xpath = "//*[@name='password_confirmation']")
	private WebElement register_as_partner_comfirm_password_user_field;

	@FindBy(xpath= "//*[@type='submit']")
	private WebElement register_as_partner_register_button;

	@FindBy(xpath= "(//*[text()='Shield'])[2]")
	private WebElement register_as_partner_left_side_shield_text;

	@FindBy(xpath= "//*[@alt='user']")
	private WebElement register_as_partner_left_side_shield_logo;

	@FindBy(xpath= "(//*[text()='Register as a Partner'])[1]")
	private WebElement register_as_partner_left_side_register_as_partner_text;

	@FindBy(xpath= "(//*[text()='Register to manage, your business'])[1]")
	private WebElement register_as_partner_left_side_register_to_manage_text;

	@FindBy(xpath= "//*[@class='form-control  form-control is-valid' and @name='first_name']")
	private WebElement register_as_partner_first_name_get_green_tick_in_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-invalid' and @name='first_name']")
	private WebElement register_as_partner_first_name_get_red_tick_in_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-valid' and @name='last_name']")
	private WebElement register_as_partner_last_name_get_green_tick_in_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-invalid' and @name='last_name']")
	private WebElement register_as_partner_last_name_get_red_tick_in_user_field;

	@FindBy(xpath = "//*[@class='form-control  form-control is-valid' and @name='email']")
	private WebElement register_as_partner_email_get_green_tick_in_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-invalid' and @name='email']")
	private WebElement register_as_partner_email_get_red_tick_in_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-valid' and @name='mobile_number']")
	private WebElement register_as_partner_mobile_number_get_green_tick_in_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-invalid' and @name='mobile_number']")
	private WebElement register_as_partner_mobile_number_get_red_tick_in_user_field;

	@FindBy(xpath="//*[@class='form-control  form-control is-valid' and @name='password']")
	private WebElement register_as_partner_password_get_green_tick_in_user_field;

	@FindBy(xpath="//*[@class='form-control  form-control is-invalid' and @name='password']")
	private WebElement register_as_partner_password_get_red_tick_in_user_field;

	@FindBy(xpath="//*[@class='form-control  form-control is-valid' and @name='password_confirmation']")
	private WebElement register_as_partner_confirm_password_get_green_tick_in_user_field;

	@FindBy(xpath="//*[@class='form-control  form-control is-invalid' and @name='password_confirmation']")
	private WebElement register_as_partner_confirm_password_get_red_tick_in_user_field;


	/* 
	 * 
	 * 
	 * 
	 * Constructor 
	 * 
	 * 
	 * */

	public Partner_registration_page_objects(WebDriver driver) {
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

	public boolean register_as_partner_page_title_text_is_displayed() {
		return register_as_partner_page_title_text.isDisplayed();
	}

	public boolean register_as_partner_register_to_manage_your_business_subtitle_text_is_displayed() {
		return register_as_partner_register_to_manage_your_business_subtitle_text.isDisplayed();
	}

	public boolean register_as_partner_first_name_above_the_user_field_text_is_displayed() {
		return register_as_partner_first_name_above_the_user_field_text.isDisplayed();
	}

	public boolean register_as_partner_first_name_asterisk_is_displayed() {
		return register_as_partner_first_name_asterisk.isDisplayed();
	}

	public boolean register_as_partner_first_name_user_field_is_displayed() {
		return register_as_partner_first_name_user_field.isDisplayed();
	}

	public boolean register_as_partner_first_name_user_field_is_clickable() {
		return register_as_partner_first_name_user_field.isEnabled();
	}

	public String register_as_partner_first_name_user_field_placeholder_value() {
		return register_as_partner_first_name_user_field.getAttribute("placeholder");
	}

	public boolean register_as_partner_last_name_above_the_user_field_text_is_displayed() {
		return register_as_partner_last_name_above_the_user_field_text.isDisplayed();
	}

	public boolean register_as_partner_last_name_asterisk_is_displayed() {
		return register_as_partner_last_name_asterisk.isDisplayed();
	}

	public boolean register_as_partner_last_name_user_field_is_displayed() {
		return register_as_partner_last_name_user_field.isDisplayed();
	}

	public boolean register_as_partner_last_name_user_field_is_clickable() {
		return register_as_partner_last_name_user_field.isEnabled();
	}

	public String register_as_partner_last_name_user_field_placeholder_value() {
		return register_as_partner_last_name_user_field.getAttribute("placeholder");
	}

	public boolean register_as_partner_email_above_the_user_field_text_is_displayed() {
		return register_as_partner_email_above_the_user_field_text.isDisplayed();
	}

	public boolean register_as_partner_email_asterisk_is_displayed() {
		return register_as_partner_email_asterisk.isDisplayed();
	}

	public boolean register_as_partner_email_user_field_is_displayed() {
		return register_as_partner_email_user_field.isDisplayed();
	}

	public boolean register_as_partner_email_user_field_is_clickable() {
		return register_as_partner_email_user_field.isEnabled();
	}

	public String register_as_partner_email_user_field_placeholder_value() {
		return register_as_partner_email_user_field.getAttribute("placeholder");
	}

	public boolean register_as_partner_mobile_number_above_the_user_field_text_is_displayed() {
		return register_as_partner_mobile_number_above_the_user_field_text.isDisplayed();
	}

	public boolean register_as_partner_mobile_number_asterisk_is_displayed() {
		return register_as_partner_mobile_number_asterisk.isDisplayed();
	}

	public boolean register_as_partner_mobile_number_dropdown_is_clickable() {
		return register_as_partner_mobile_number_dropdown.isEnabled();
	}

	public boolean register_as_partner_mobile_number_dropdown_list_is_clickable() {
		for (int i = 0; i < register_as_partner_mobile_number_dropdown_list.size(); i++) {
			WebElement country_two = register_as_partner_mobile_number_dropdown_list.get(i);
			if(country_two.isDisplayed()) {
				System.out.println(country_two.isDisplayed());
				System.out.println(country_two.isEnabled());
				System.out.println(country_two.getText());
			}
		}
		return true;
	}
	

	public boolean register_as_partner_mobile_number_user_field_is_displayed() {
		return register_as_partner_mobile_number_user_field.isDisplayed();
	}

	public boolean register_as_partner_mobile_number_user_field_is_clickable() {
		return register_as_partner_mobile_number_user_field.isEnabled();
	}

	public String register_as_partner_mobile_number_user_field_placeholder_value() {
		return register_as_partner_mobile_number_user_field.getAttribute("placeholder");
	}

	public boolean register_as_partner_password_above_the_user_field_text_is_displayed() {
		return register_as_partner_password_above_the_user_field_text.isDisplayed();
	}

	public boolean register_as_partner_password_asterisk_is_displayed() {
		return register_as_partner_password_asterisk.isDisplayed();
	}

	public boolean register_as_partner_password_user_field_is_displayed() {
		return register_as_partner_password_user_field.isDisplayed();
	}

	public boolean register_as_partner_password_user_field_is_clickable() {
		return register_as_partner_password_user_field.isEnabled();
	}

	public String register_as_partner_password_user_field_placeholder_value() {
		return register_as_partner_password_user_field.getAttribute("placeholder");
	}

	public boolean register_as_partner_comfirm_password_above_the_user_field_text_is_displayed() {
		return register_as_partner_comfirm_password_above_the_user_field_text.isDisplayed();
	}

	public boolean register_as_partner_comfirm_password_asterisk_is_displayed() {
		return register_as_partner_comfirm_password_asterisk.isDisplayed();
	}

	public boolean register_as_partner_comfirm_password_user_field_is_displayed() {
		return register_as_partner_comfirm_password_user_field.isDisplayed();
	}
	
	public boolean register_as_partner_comfirm_password_user_field_is_clickable(){
		return register_as_partner_comfirm_password_user_field.isEnabled();
	}

	public String register_as_partner_comfirm_password_user_field_placeholder_value() {
		return register_as_partner_comfirm_password_user_field.getAttribute("placeholder");
	}

	public boolean register_as_partner_register_button_is_displayed() {
		return register_as_partner_register_button.isDisplayed();
	}

	public boolean register_as_partner_register_button_is_clickable() {
		return register_as_partner_register_button.isEnabled();
	}
	
	public void register_as_partner_register_button_is_click() {
		register_as_partner_register_button.click();
	}

	public boolean register_as_partner_register_button_is_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, register_as_partner_register_button);
		return true;
	}

	public boolean register_as_partner_left_side_shield_text_is_displayed() {
		return register_as_partner_left_side_shield_text.isDisplayed();
	}

	public boolean register_as_partner_left_side_shield_logo_is_displayed() {
		return register_as_partner_left_side_shield_logo.isDisplayed();
	}

	public boolean register_as_partner_left_side_register_as_partner_text_is_displayed() {
		return register_as_partner_left_side_register_as_partner_text.isDisplayed();
	}

	public boolean register_as_partner_left_side_register_to_manage_text_is_displayed() {
		return register_as_partner_left_side_register_to_manage_text.isDisplayed();
	}

	public void register_as_partner_first_name_user_field_send_text(String string) {
		register_as_partner_first_name_user_field.sendKeys(string);
	}

	public String register_as_partner_first_name_entered_text() {
		return register_as_partner_first_name_user_field.getAttribute("value");
	}

	public boolean register_as_partner_first_name_get_green_tick_in_user_field() {
		return register_as_partner_first_name_get_green_tick_in_user_field.isDisplayed();
	}

	public boolean register_as_partner_first_name_get_red_tick_in_user_field() {
		return register_as_partner_first_name_get_red_tick_in_user_field.isDisplayed();
	}

	public void register_as_partner_last_name_user_field_send_text(String string) {
		register_as_partner_last_name_user_field.sendKeys(string);
	}

	public String register_as_partner_last_name_entered_text() {
		return register_as_partner_last_name_user_field.getAttribute("value");
	}

	public boolean register_as_partner_last_name_get_green_tick_in_user_field() {
		return register_as_partner_last_name_get_green_tick_in_user_field.isDisplayed();
	}

	public boolean register_as_partner_last_name_get_red_tick_in_user_field() {
		return register_as_partner_last_name_get_red_tick_in_user_field.isDisplayed();
	}

	public void register_as_partner_email_user_field_send_text(String string) {
		register_as_partner_email_user_field.sendKeys(string);
	}
	
	public String register_as_partner_email_entered_text() {
		return register_as_partner_email_user_field.getAttribute("value");
	}

	public boolean register_as_partner_email_get_green_tick_in_user_field() {
		return register_as_partner_email_get_green_tick_in_user_field.isDisplayed();
	}

	public boolean register_as_partner_email_get_red_tick_in_user_field() {
		return register_as_partner_email_get_red_tick_in_user_field.isDisplayed();
	}

	public void register_as_partner_mobile_number_user_field_send_text(String string) {
		register_as_partner_mobile_number_user_field.sendKeys(string);
	}

	public String register_as_partner_mobile_number_entered_text() {
		return register_as_partner_mobile_number_user_field.getAttribute("value");
	}

	public boolean register_as_partner_mobile_number_get_green_tick_in_user_field() {
		return register_as_partner_mobile_number_get_green_tick_in_user_field.isDisplayed();
	}

	public boolean register_as_partner_mobile_number_get_red_tick_in_user_field() {
		return register_as_partner_mobile_number_get_red_tick_in_user_field.isDisplayed();
	}

	public void register_as_partner_password_user_field_send_text(String string) {
		register_as_partner_password_user_field.sendKeys(string);
	}

	public String register_as_partner_password_entered_text() {
		return register_as_partner_password_user_field.getAttribute("value");
	}

	public boolean register_as_partner_password_get_green_tick_in_user_field() {
		return register_as_partner_password_get_green_tick_in_user_field.isDisplayed();
	}

	public boolean register_as_partner_password_get_red_tick_in_user_field() {
		return register_as_partner_password_get_red_tick_in_user_field.isDisplayed();
	}

	public void register_as_partner_confirm_password_user_field_send_text(String string) {
		register_as_partner_comfirm_password_user_field.sendKeys(string);
	}

	public String register_as_confirm_partner_password_entered_text() {
		return register_as_partner_comfirm_password_user_field.getAttribute("value");
	}

	public boolean register_as_partner_confirm_password_get_green_tick_in_user_field() {
		return register_as_partner_confirm_password_get_green_tick_in_user_field.isDisplayed();
	}

	public boolean register_as_partner_confirm_password_get_red_tick_in_user_field() {
		return register_as_partner_confirm_password_get_red_tick_in_user_field.isDisplayed();
	}




}
