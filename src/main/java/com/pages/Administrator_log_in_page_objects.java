package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Administrator_log_in_page_objects {
	private WebDriver driver;
	
	/*
	 * 
	 *  Pop up Elements
	 *  
	 */
	
	@FindBy(xpath= "//*[text()='User logged in successfully']")
	private WebElement note_containing_user_logged_in_successfully;
	
	@FindBy(xpath = "//*[text()='User not found']")
	private WebElement log_in_user_not_found_text;
	
	@FindBy(xpath = "//*[text()='Invalid credentials']")
	private WebElement note_contaning_invalid_credentials;
	
	@FindBy(xpath="//*[text()='You are not allowed to access admin area.']")
	private WebElement You_are_not_allowed_to_access_admin_area;
	
	/*
	 * 
	 * Page Elements
	 * 
	 */
	
	@FindBy(xpath = "(//*[text()='Sign-in to Your Account'])[2]")
	private WebElement title_text_signin_to_your_account_right_side;
	
	@FindBy(xpath = "(//*[text()='Sign-in to manage, your business'])[2]")
	private WebElement subtitle_signin_to_manage_your_bussiness_right_side;
	
	@FindBy(xpath = "//*[text()='Email']")
	private WebElement email_field_title_email;
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement email_user_field;
	
	@FindBy(xpath = "//*[@class='form-control  form-control is-valid' and @id='formEmail']")
	private WebElement green_tick_in_email_user_field;
	
	@FindBy(xpath = "//*[text()='Password']")
	private WebElement password_field_title;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password_user_field;
	
	@FindBy(xpath = "//*[@class='ti-eye']")
	private WebElement password_user_field_eye_button;
	
	@FindBy(xpath = "//*[@class='form-control  form-control is-valid' and @id='formpassword']")
	private WebElement green_tick_in_password_user_field;
	
	@FindBy(xpath = "//*[@class='form-control  form-control is-invalid' and @id='formpassword']")
	private WebElement red_tick_in_password_user_field;
	
	@FindBy(xpath = "//*[@class='form-control  form-control is-invalid' and @id='formEmail']")
	private WebElement red_tick_in_email_user_field;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement sign_in_button;
	
	@FindBy(xpath = "//*[text()='Forgot password?']")
	private WebElement forget_password_link;
	
	@FindBy(xpath = "//*[@alt='user']")
	private WebElement logo_of_shield_left_side;
	
	@FindBy (xpath = "(//*[text()='Sign-in to manage, your business'])[1]")
	private WebElement subtitle_signin_to_manage_your_bussiness_left_side;

	/*
	 * 
	 *  
	 *  
	 *  Constructor 
	 *  
	 *  
	 *  
	 *  
	 * */
	
	public Administrator_log_in_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 *  
	 *  Methods 
	 *  
	 *  
	 *  
	 *  
	 * */
	
	public void administrator_log_enter_email_into_the_user_field(String email){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field);
		email_user_field.sendKeys(email);
	}
	
	public String administrator_entered_email_text(){
		String value = email_user_field.getAttribute("value");
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field);
		return value;
	}
	
	public boolean administrator_log_in_green_tick_in_email_user_field_is_displayed(){
		return green_tick_in_email_user_field.isDisplayed(); 
	}
	
	public void administrator_log_enter_password_into_the_user_field(String password){
		password_user_field.sendKeys(password);
	}
	
	public boolean administrator_log_in_green_tick_in_password_user_field_is_displayed(){
		return green_tick_in_password_user_field.isDisplayed();
	}
	
	public boolean administrator_log_in_red_tick_in_password_user_field_is_displayed(){
		return red_tick_in_password_user_field.isDisplayed();
	}
	
	public String administrator_entered_password_text(){
		return password_user_field.getAttribute("value");
	}
	
	public boolean administrator_log_in_red_tick_in_email_user_field_is_displayed(){
		return red_tick_in_email_user_field.isDisplayed();
	}
	
	public boolean administrator_log_in_note_contaiing_invalid_credentials_is_displayed(){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, note_contaning_invalid_credentials);
		return note_contaning_invalid_credentials.isDisplayed();
	}
	
	public void administrator_sign_in_button_is_clicked() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sign_in_button.click();
	}
	
	public boolean administrator_log_in_note_in_top_corner_is_displayed(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, note_containing_user_logged_in_successfully);
		return note_containing_user_logged_in_successfully.isDisplayed();
	}
	
	public boolean administrator_log_in_page_have_title_text_signin_to_your_account_is_displayed(){
		return title_text_signin_to_your_account_right_side.isDisplayed();
	}
	
	public boolean administrator_log_in_page_have_subtitle_signin_to_manage_your_bussiness_is_displayed() {
		return subtitle_signin_to_manage_your_bussiness_right_side.isDisplayed();
	}
	
	public boolean administrator_log_in_page_have_email_field_title_email_is_displayed () {
		return email_field_title_email.isDisplayed();
	}
	
	public String administrator_log_in_page_have_email_place_holder_value() {
		String value=email_user_field.getAttribute("placeholder");
		return value;
	}
	
	public boolean administrator_user_email_userfield_is_cleared() {
		String value= email_user_field.getAttribute("value");
		return value.isEmpty();
	}
	
	public boolean administrator_user_password_userfield_is_cleared() {
		String value= password_user_field.getAttribute("value");
		return value.isEmpty();
	}
	
	public boolean administrator_log_in_page_have_email_user_field_be_is_clickable() {
		return email_user_field.isEnabled();
	}
	
	public boolean administrator_log_in_page_have_password_field_title_is_displayed () {
		return password_field_title.isDisplayed();
	}
	
	public String administrator_log_in_page_have_password_place_holder_value() {
		String value = password_user_field.getAttribute("placeholder");
		return value;
	}
	
	public boolean administrator_log_in_page_have_password_user_field_be_clickable(){
		return password_user_field.isEnabled();
	}
	
	public boolean administrator_log_in_page_have_sign_in_button_is_displayed () {
		return sign_in_button.isDisplayed();
	}
	
	public boolean administrator_log_in_page_have_sign_in_button_is_clickable () {
		return sign_in_button.isEnabled();
	}
	
	public boolean administrator_log_in_page_have_forget_password_link_is_displayed() {
		return forget_password_link.isDisplayed();
	}
	
	public boolean administrator_log_in_page_have_forget_password_link_is_clickable(){
		return forget_password_link.isEnabled();
	}
	
	public boolean administrator_log_in_page_have_logo_of_shield_is_displayed(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, logo_of_shield_left_side);
		return logo_of_shield_left_side.isDisplayed();
	}
	
	public boolean administrator_log_in_page_have_subtitle_is_displayed() {
		return subtitle_signin_to_manage_your_bussiness_left_side.isDisplayed();
	}
	
	public void administrator_log_in_page_forget_password_link_is_clicked(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, forget_password_link);
		forget_password_link.click();
	}
	
	public boolean administrator_log_in_user_not_found_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, log_in_user_not_found_text);
		return log_in_user_not_found_text.isDisplayed();
	}
	
	public boolean administrator_get_you_are_not_allowed_to_access_admin_area_is_displayed(){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, You_are_not_allowed_to_access_admin_area);
		return You_are_not_allowed_to_access_admin_area.isDisplayed();
	}
	
	public boolean administrator_password_user_field_eye_button(){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, password_user_field_eye_button);
		return password_user_field_eye_button.isDisplayed();
	}
	
}
