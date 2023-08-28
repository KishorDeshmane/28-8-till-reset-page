package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Reset_password_page_objects {
private WebDriver driver;
	
	/*
	 * 
	 * reset  password
	 * 
	 */
	
	@FindBy(xpath = "(//*[text()='Reset Your Password'])[2]")
	private WebElement mail_link_reset_password_click_title_text_of_the_page_reset_you_password;

	@FindBy(xpath = "(//*[text()='Signin to manage, your bussiness'])[2]")
	private WebElement mail_link_reset_password_click_header_sign_in_to_manage_text;

	@FindBy(xpath = "//*[text()='New Password']")
	private WebElement mail_link_reset_password_click_new_password_title_text_above_user_field;

	@FindBy(xpath = "//*[@id='new_password']")
	private WebElement mail_link_reset_password_click_new_password_user_field;

	@FindBy(xpath = "//*[text()='Confirm Password']")
	private WebElement mail_link_reset_password_click_confirm_password_title_text_above_user_field;

	@FindBy(xpath = "//*[@id='new_password_confirmation']")
	private WebElement mail_link_reset_password_click_comfirm_password_user_field;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement mail_link_reset_password_click_submit_button;

	@FindBy(xpath = "//*[text()='Already have an account?']")
	private WebElement mail_link_reset_password_click_already_have_an_account_text;

	@FindBy(xpath = "//*[text()='Sign In']")
	private WebElement mail_link_reset_password_click_sign_in_link;

	@FindBy(xpath = "//img[@alt='user']")
	private WebElement mail_link_reset_password_click_logo_of_shield;

	@FindBy(xpath = "(//*[text()='Reset Your Password'])[1]")
	private WebElement mail_link_reset_password_click_logo_header_subtitle;

	@FindBy(xpath = "(//*[text()='Signin to manage, your bussiness'])[1]")
	private WebElement mail_link_reset_password_click_logo_header_subtitle_second_line_text;

	@FindBy(xpath="//*[@id='new_password' and @class='form-control  form-control is-invalid']")
	private WebElement user_should_get_the_red_tick_on_the_new_password_user_field;

	@FindBy(xpath="//*[@id='new_password' and @class='form-control  form-control is-valid']")
	private WebElement user_should_get_the_green_tick_on_the_new_password_user_field;

	@FindBy(xpath = "//*[@id='new_password_confirmation' and @class='form-control  form-control is-invalid']")
	private WebElement user_get_the_red_tick_into_comfirm_password_user_field;

	@FindBy(xpath = "//*[@id='new_password_confirmation' and @class='form-control  form-control is-valid']")
	private WebElement user_get_the_green_tick_into_comfirm_password_user_field;
	
	@FindBy(xpath = "//*[text()='Password reset successfully']")
	private WebElement user_get_the_pop_up_password_reset_successfully_text;

	@FindBy(xpath = "//*[text()='User logged in successfully']")
	private WebElement super_admin_pop_up_user_log_in_successfully;

	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Reset_password_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * 
	 * Reset ur password page
	 * 
	 */
	
	public boolean mail_link_reset_password_click_title_text_of_the_page_reset_you_password_is_displayed() {
		return mail_link_reset_password_click_title_text_of_the_page_reset_you_password.isDisplayed();
	}

	public boolean mail_link_reset_password_click_header_sign_in_to_manage_text_is_displayed() {
		return mail_link_reset_password_click_header_sign_in_to_manage_text.isDisplayed();
	}

	public boolean mail_link_reset_password_click_new_password_title_text_above_user_field_is_displayed() {
		return mail_link_reset_password_click_new_password_title_text_above_user_field.isDisplayed();
	}

	public boolean mail_link_reset_password_click_new_password_user_field_is_clickable() {
		return mail_link_reset_password_click_new_password_user_field.isEnabled();
	}

	public String mail_link_reset_password_click_new_password_user_field_placeholder_value() {
		return mail_link_reset_password_click_new_password_user_field.getAttribute("placeholder");
	}

	public boolean mail_link_reset_password_click_confirm_password_title_text_above_user_field_is_displayed() {
		return mail_link_reset_password_click_confirm_password_title_text_above_user_field.isDisplayed();
	}

	public boolean mail_link_reset_password_click_comfirm_password_user_field_is_clickable() {
		return mail_link_reset_password_click_comfirm_password_user_field.isEnabled();
	}

	public String mail_link_reset_password_click_comfirm_password_user_field_placeholder_value() {
		return mail_link_reset_password_click_comfirm_password_user_field.getAttribute("placeholder");
	}

	public boolean mail_link_reset_password_click_submit_button_is_displayed() {
		return mail_link_reset_password_click_submit_button.isDisplayed();
	}

	public boolean mail_link_reset_password_click_submit_button_is_clickable() {
		return mail_link_reset_password_click_submit_button.isEnabled();
	}

	public boolean mail_link_reset_password_click_submit_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, mail_link_reset_password_click_submit_button);
		return true;
	}

	public boolean mail_link_reset_password_click_already_have_an_account_text_is_displayed() {
		return mail_link_reset_password_click_already_have_an_account_text.isDisplayed();
	}

	public boolean mail_link_reset_password_click_sign_in_link_is_clickable() {
		return mail_link_reset_password_click_sign_in_link.isEnabled();
	}

	public boolean mail_link_reset_password_click_logo_of_shield_is_displayed() {
		return mail_link_reset_password_click_logo_of_shield.isDisplayed();
	}

	public boolean mail_link_reset_password_click_logo_header_subtitle_is_displayed() {
		return mail_link_reset_password_click_logo_header_subtitle.isDisplayed();
	}

	public boolean mail_link_reset_password_click_logo_header_subtitle_second_line_text_is_displayed() {
		return mail_link_reset_password_click_logo_header_subtitle_second_line_text.isDisplayed();
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void user_enters_the_new_password_into_the_new_password_user_field(String string) {
		mail_link_reset_password_click_new_password_user_field.sendKeys(string);
	}

	public String user_entered_the_new_password_into_user_field() {
		return mail_link_reset_password_click_new_password_user_field.getAttribute("value");
	}

	public void reset_your_password_submit_button_click() {
		mail_link_reset_password_click_submit_button.click();
	}

	public boolean user_should_get_the_red_tick_on_the_new_password_user_fields() {
		return user_should_get_the_red_tick_on_the_new_password_user_field.isDisplayed();
	}
	
	public boolean user_should_get_the_green_tick_on_the_new_password_user_fields() {
		return user_should_get_the_green_tick_on_the_new_password_user_field.isDisplayed();
	}
	
	public void mail_reset_password_page_user_click_on_sign_in_link_is_click(){
		mail_link_reset_password_click_sign_in_link.click();
	}
	
	/*
	 * Confirm pass
	 * 
	 */

	public void user_enters_the_comfirm_password_into_the_comfirm_password_user_field(String string) {
		mail_link_reset_password_click_comfirm_password_user_field.sendKeys(string);
	}

	public String user_entered_the_comfirm_password_into_user_field() {
		return mail_link_reset_password_click_comfirm_password_user_field.getAttribute("value");
	}

	public boolean user_get_the_red_tick_into_the_comfirm_password_user_field() {
		return user_get_the_red_tick_into_comfirm_password_user_field.isDisplayed();
	}

	public boolean user_get_the_green_tick_into_the_comfirm_password_user_field() {
		return user_get_the_green_tick_into_comfirm_password_user_field.isDisplayed();
	}

	public boolean user_should_also_get_the_reset_password_successfully_pop_up() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, user_get_the_pop_up_password_reset_successfully_text);
		return user_get_the_pop_up_password_reset_successfully_text.isDisplayed();
	}

	public boolean super_admin_pop_up_user_log_in_successfully_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_pop_up_user_log_in_successfully);
		return super_admin_pop_up_user_log_in_successfully.isDisplayed();
	}
	
	public void super_admin_pop_up_user_log_in_successfully_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_pop_up_user_log_in_successfully);
		super_admin_pop_up_user_log_in_successfully.click();
	}


	
}
