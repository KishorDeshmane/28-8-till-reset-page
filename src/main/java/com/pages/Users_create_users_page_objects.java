package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_create_users_page_objects {
private WebDriver driver;

	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement super_admin_logger_create_users_page_create_users_page_header_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement super_admin_logger_create_users_page_breadcrum;

	@FindBy(xpath = "//*[@id='back-to-top']/i")
	private WebElement back_to_top_arrow_button;

	@FindBy(xpath = "//*[@class='breadcrumb-item']/a")
	private WebElement super_admin_logger_create_users_page_breadcrum_all_users;

	@FindBy(xpath = "//*[@class='breadcrumb-item active']")
	private WebElement super_admin_logger_create_users_page_breadcrum_create_users_text;

	@FindBy(xpath = "//*[@class='card-body border']/div")
	private WebElement super_admin_logger_create_users_page_card_body_personnel_information_header;

	@FindBy(xpath = "//*[@for='first_name']")
	private WebElement super_admin_logger_create_users_page_first_name_text_above_users_field;

	@FindBy(xpath = "//*[@name='first_name']")
	private WebElement super_admin_logger_create_users_page_first_name_users_field;

	@FindBy(xpath="(//*[@class='Users_redAsterisk__yv8LK'])[1]")
	private WebElement super_admin_logger_create_users_page_first_name_asterrisk_symbol;
	
	@FindBy(xpath = "//*[@for='last_name']")
	private WebElement super_admin_logger_create_users_page_last_name_text_above_users_field;

	@FindBy(xpath = "//*[@name='last_name']")
	private WebElement super_admin_logger_create_users_page_last_name_users_field;

	@FindBy(xpath="(//*[@class='Users_redAsterisk__yv8LK'])[2]")
	private WebElement super_admin_logger_create_users_page_last_name_asterrisk_symbol;
	
	@FindBy(xpath = "//*[@for='formEmail']")
	private WebElement super_admin_logger_create_users_page_email_text_above_users_field;

	@FindBy(xpath="(//*[@class='Users_redAsterisk__yv8LK'])[3]")
	private WebElement super_admin_logger_create_users_page_email_asterrisk_symbol;
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement super_admin_logger_create_users_page_email_users_field;

	@FindBy(xpath = "//*[@class='form-label']//*[text()='Mobile Number']")
	private WebElement super_admin_logger_create_users_page_mobile_number_text_above_the_users_field;

	@FindBy(xpath = "(//*[@class='Users_redAsterisk__yv8LK'])[4]")
	private WebElement super_admin_logger_create_users_page_mobile_number_asterrisk_symbol;
	
	@FindBy(xpath = "//*[@name='country_code']/option")
	private WebElement super_admin_logger_create_users_page_mobile_number_country_code_dropdown;

	@FindBy(xpath = "//*[@name='country_code']/option[2]")
	private WebElement super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE;

	@FindBy(xpath = "//*[@name='mobile_number']")
	private WebElement super_admin_logger_create_users_page_mobile_number_users_field;

	@FindBy(xpath = "//*[text()='Date of Birth']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_title_text;
		
	@FindBy(xpath = "//*[@id='dobdatepicker']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_user_field;
	
	@FindBy(xpath = "//*[@aria-label='Previous Month']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_left_arrow;
	
	@FindBy(xpath = "//*[@aria-label='Next Month']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_right_arrow;
	
	@FindBy(xpath = "//*[@class='react-datepicker__month-select']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_month_down_arrow;
	
	@FindBy(xpath = "//*[@class='react-datepicker__month-select']/option")
	private List<WebElement> super_admin_logger_create_users_page_date_of_birth_months;
	
	@FindBy(xpath = "//*[@class='react-datepicker__year-select']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_year_first_down_arrow;
	
	@FindBy(xpath = "//*[@class='react-datepicker__year-select']/option")
	private List<WebElement> super_admin_logger_create_users_page_date_of_birth_years;
	
	@FindBy(xpath = "//*[text()='Credential Information']")
	private WebElement super_admin_logger_create_users_page_card_body_credential_information_header;

	@FindBy(xpath = "//*[@for='password']")
	private WebElement super_admin_logger_create_users_page_password_text_above_the_user_field;

	@FindBy(xpath = "(//*[@class='Users_redAsterisk__yv8LK'])[5]")
	private WebElement super_admin_logger_create_users_page_password_asterrisk_symbol;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement super_admin_logger_create_users_page_password_user_field;
	
	@FindBy(xpath = "(//*[@class='Users_redAsterisk__yv8LK'])[6]")
	private WebElement super_admin_logger_create_users_page_comfirm_password_asterrisk_symbol;

	@FindBy(xpath = "//*[@for='password_confirmation']")
	private WebElement super_admin_logger_create_users_page_comfirm_password_text_above_userfield;

	@FindBy(xpath = "//*[@name='password_confirmation']")
	private WebElement super_admin_logger_create_users_page_comfirm_password_userfield;

	@FindBy(xpath = "//*[text()='Role Information']")
	private WebElement super_admin_logger_create_users_page_card_body_role_information_header;

	@FindBy(xpath = "//*[@for='assigned_roles']")
	private WebElement super_admin_logger_create_users_page_assigned_roles_text_above_user_field;

	@FindBy(xpath = "//*[@name='assigned_roles']")
	private WebElement super_admin_logger_create_users_page_assigned_roles_user_field;
	
	@FindBy(xpath = "(//*[@class='Users_redAsterisk__yv8LK'])[7]")
	private WebElement super_admin_logger_create_users_page_assigned_roles_asterrisk_symbol;

	@FindBy(xpath = "//*[@name='assigned_roles']/option[2]")
	private WebElement super_admin_logger_create_users_page_assigned_roles_drop_down_admin;

	@FindBy(xpath = "//*[@name='assigned_roles']/option[3]")
	private WebElement super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin;

	/*
	 * 
	 * 
	 * 
	 * Invalid valid field
	 * 
	 * 
	 */
	
	@FindBy(xpath = "(//*[@name='first_name' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_create_user_first_name_userfield_below_note_valid;

	@FindBy(xpath= "(//*[@name='first_name' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_create_user_first_name_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@name='last_name' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_create_user_last_name_userfield_below_note_valid;

	@FindBy(xpath = "(//*[@name='last_name' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_create_user_last_name_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@name='email' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_create_user_email_userfield_below_note_valid;

	@FindBy(xpath = "(//*[@name='email' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_create_user_email_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@name='mobile_number' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_create_user_mobile_number_userfield_below_note_valid;

	@FindBy(xpath = "(//*[@name='mobile_number' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_create_user_mobile_number_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@name='password' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_create_user_password_userfield_below_note_valid;

	@FindBy(xpath = "(//*[@name='password' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_create_user_password_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@name='password_confirmation' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_create_user_comfirm_password_userfield_below_note_valid;

	@FindBy(xpath = "(//*[@name='password_confirmation' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_create_user_comfirm_password_userfield_below_note_invalid;

	/*
	 * 
	 * 
	 * radio gender
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//*[text()='Gender']")
	private WebElement super_admin_logger_create_users_page_gender_header_text_of_the_radio;

	@FindBy(xpath = "//*[text()='Male']")
	private WebElement super_admin_logger_create_users_page_gender_male_text;

	@FindBy(xpath = "//*[text()='Female']")
	private WebElement super_admin_logger_create_users_page_gender_female_text;

	@FindBy(xpath = "//*[text()='Others']")
	private WebElement super_admin_logger_create_users_page_gender_others_text;
	
	@FindBy(xpath = "(//*[@name='gender' and @type='radio'])[1]")
	private WebElement super_admin_logger_create_users_page_gender_male_button;

	@FindBy(xpath = "(//*[@name='gender' and @type='radio'])[2]")
	private WebElement super_admin_logger_create_users_page_gender_female_button;

	@FindBy(xpath = "(//*[@name='gender' and @type='radio'])[3]")
	private WebElement super_admin_logger_create_users_page_gender_others_button;
	
	@FindBy(xpath = "//*[@name='profile_pic']")
	private WebElement super_admin_logger_create_users_page_profile_image_userfield;
	
	@FindBy(xpath= "//*[text()='Profile Image']")
	private WebElement super_admin_logger_create_users_page_profile_image_title_text;
	
	@FindBy(xpath = "//*[@class='form-control  form-control is-valid' and @name='profile_pic']")
	private WebElement super_admin_logger_create_users_page_profile_image_userfield_is_valid;
	
	@FindBy(xpath= "//*[@class='form-control  form-control is-invalid' and @name='profile_pic']")
	private WebElement super_admin_logger_create_users_page_profile_image_userfield_is_invalid;
	
	@FindBy(xpath = "//*[@id='dobdatepicker']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_userfield;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement super_admin_logger_create_user_submit_button;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	private WebElement super_admin_logger_create_user_cancel_button;
	
	@FindBy(xpath = "//*[@class='react-datepicker__month-container']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_calender;
	
	@FindBy(xpath = "//*[@class='react-datepicker__day react-datepicker__day--015']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_calender_selectDate;
	
	@FindBy(xpath = "//*[@class='react-datepicker__year-option' and text()='2005']")
	private WebElement year_2005_Element_in_calender;
	
	@FindBy(xpath = "//*[text()='December']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_calender_select_month_dec;

	@FindBy(xpath = "//*[text()='December']")
	private WebElement super_admin_logger_create_users_page_date_of_birth_calender_select_month_december;

	@FindBy(xpath = "//*[text()='2005']")
	private WebElement year_2005_in_header_of_the_calender;
	
	/* 
	 * 
	 * 
	 * 
	 * Constructor 
	 * 
	 * 
	 * */

	public Users_create_users_page_objects(WebDriver driver) {
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

	public boolean super_admin_logger_create_users_page_create_users_page_header_text_is_displayed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return super_admin_logger_create_users_page_create_users_page_header_text.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_breadcrum_is_displayed(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_logger_create_users_page_breadcrum);
		return super_admin_logger_create_users_page_breadcrum.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_breadcrum_all_users_is_displayed() {
		return super_admin_logger_create_users_page_breadcrum_all_users.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_breadcrum_all_users_is_clickable() {
		return super_admin_logger_create_users_page_breadcrum_all_users.isEnabled();
	}
	
	public void super_admin_logger_create_users_page_breadcrum_all_users_is_click() {
		super_admin_logger_create_users_page_breadcrum_all_users.click();
	}

	public boolean super_admin_logger_create_users_page_breadcrum_create_users_text_is_displayed() {
		return super_admin_logger_create_users_page_breadcrum_create_users_text.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_card_body_personnel_information_header_is_displayed() {
		return super_admin_logger_create_users_page_card_body_personnel_information_header.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_first_name_text_above_users_field_is_displayed() {
		return super_admin_logger_create_users_page_first_name_text_above_users_field.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_first_name_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_first_name_asterrisk_symbol.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_first_name_users_field_is_clickable() {
		return super_admin_logger_create_users_page_first_name_users_field.isEnabled();
	}

	public String super_admin_logger_create_users_page_first_name_users_field_placeholder_value() {
		return super_admin_logger_create_users_page_first_name_users_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_create_users_page_last_name_text_above_users_field_is_displayed() {
		return super_admin_logger_create_users_page_last_name_text_above_users_field.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_last_name_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_last_name_asterrisk_symbol.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_last_name_users_field_is_clickable() {
		return super_admin_logger_create_users_page_last_name_users_field.isEnabled();
	}

	public String super_admin_logger_create_users_page_last_name_users_field_placeholder_value() {
		return super_admin_logger_create_users_page_last_name_users_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_create_users_page_email_text_above_users_field_is_displayed() {
		return super_admin_logger_create_users_page_email_text_above_users_field.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_email_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_email_asterrisk_symbol.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_email_users_field_is_clickable() {
		return super_admin_logger_create_users_page_email_users_field.isEnabled();
	}

	public String super_admin_logger_create_users_page_email_users_field_placeholder_value() {
		return super_admin_logger_create_users_page_email_users_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_create_users_page_mobile_number_text_above_the_users_field_is_displayed() {
		return super_admin_logger_create_users_page_mobile_number_text_above_the_users_field.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_mobile_number_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_mobile_number_asterrisk_symbol.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_displayed() {
		return super_admin_logger_create_users_page_mobile_number_country_code_dropdown.isDisplayed();
	}
	
	public void super_admin_logger_create_users_page_mobile_number_country_code_dropdown_is_click() {
		 super_admin_logger_create_users_page_mobile_number_country_code_dropdown.click();
	}

	public String super_admin_logger_create_users_page_mobile_number_country_code_dropdown_selected_value() {
		String value= super_admin_logger_create_users_page_mobile_number_country_code_dropdown.getText();
		System.out.println(value);
		return value;
	}
	
	public String super_admin_logger_create_users_page_mobile_number_drop_down_uae_option_is_selected(){
		String value=super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE.getText();
		System.out.println(value);
		return value;
	}
	
	public boolean super_admin_logger_create_users_page_mobile_number_country_code_dropdown_list_is_clickable() {
		return super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE.isEnabled();
	}

	public void super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE_is_click() {
		super_admin_logger_create_users_page_mobile_number_country_code_dropdown_UAE.click();
	}
	
	public boolean super_admin_logger_create_users_page_mobile_number_users_field_is_clickable() {
		return super_admin_logger_create_users_page_mobile_number_users_field.isEnabled();
	}

	public String super_admin_logger_create_users_page_mobile_number_users_field_place_holder_value() {
		return super_admin_logger_create_users_page_mobile_number_users_field.getAttribute("placeholder");
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_title_text_above_the_user_field_is_displayed(){
		return super_admin_logger_create_users_page_date_of_birth_title_text.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_user_field_is_displayed(){
		return super_admin_logger_create_users_page_date_of_birth_user_field.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_user_field_is_clickable(){
		return super_admin_logger_create_users_page_date_of_birth_user_field.isEnabled();
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_user_field_is_click(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, super_admin_logger_create_users_page_date_of_birth_user_field);
		super_admin_logger_create_users_page_date_of_birth_user_field.click();
	}
	
	public String super_admin_logger_create_users_page_date_of_birth_user_field_placeholder_value_is(){
		return super_admin_logger_create_users_page_date_of_birth_user_field.getAttribute("placeholder");
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_left_arrow_is_clickable(){
		return super_admin_logger_create_users_page_date_of_birth_left_arrow.isEnabled();
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_left_arrow_is_click(){
		super_admin_logger_create_users_page_date_of_birth_left_arrow.click();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_right_arrow_is_clickable(){
		return super_admin_logger_create_users_page_date_of_birth_right_arrow.isEnabled();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_month_down_arrow_is_clickable(){
		return super_admin_logger_create_users_page_date_of_birth_month_down_arrow.isEnabled();
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_month_down_arrow_is_click(){
		 super_admin_logger_create_users_page_date_of_birth_month_down_arrow.click();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_months_is_clickable(){
		System.out.println(super_admin_logger_create_users_page_date_of_birth_months.size());
		for (int i = 0; i < super_admin_logger_create_users_page_date_of_birth_months.size(); i++) {
			WebElement el=super_admin_logger_create_users_page_date_of_birth_months.get(i);
            		 System.out.println(el.getText());
            		 System.out.println(el.isEnabled());
            	}
		return true;
       }
	
	public void super_admin_logger_create_users_page_date_of_birth_year_first_down_arrow_is_click(){
		 super_admin_logger_create_users_page_date_of_birth_year_first_down_arrow.click();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_year_down_arrow_is_clickable(){
		return super_admin_logger_create_users_page_date_of_birth_year_first_down_arrow.isEnabled();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_years_is_clickable(){
		System.out.println(super_admin_logger_create_users_page_date_of_birth_years.size()+" List ");
		for (int i = 0; i < super_admin_logger_create_users_page_date_of_birth_years.size(); i++) {
		WebElement el=super_admin_logger_create_users_page_date_of_birth_years.get(i);
        		 System.out.println(el.getText());
        		 System.out.println(el.isEnabled());
        	}
		return true;
   }
	
	public boolean super_admin_logger_create_users_page_profile_image_title_text_should_be_displayed() {
		return super_admin_logger_create_users_page_profile_image_title_text.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_profile_image_user_field_should_be_displayed() {
		return super_admin_logger_create_users_page_profile_image_userfield.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_profile_image_user_field_should_be_clickable() {
		return super_admin_logger_create_users_page_profile_image_userfield.isEnabled();
	}
	
	public boolean super_admin_logger_create_users_page_gender_text_above_the_radio_button_should_be_displayed() {
		return super_admin_logger_create_users_page_gender_header_text_of_the_radio.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_male_radio_button_should_be_clickable() {
		return super_admin_logger_create_users_page_gender_male_button.isEnabled();
	}

	public boolean super_admin_logger_create_users_page_gender_male_radio_button_should_be_displayed() {
		return super_admin_logger_create_users_page_gender_male_button.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_male_text_should_be_displayed() {
		return super_admin_logger_create_users_page_gender_male_text.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_gender_female_radio_button_should_be_clickable() {
		return super_admin_logger_create_users_page_gender_female_button.isEnabled();
	}

	public boolean super_admin_logger_create_users_page_gender_female_radio_button_should_be_displayed() {
		return super_admin_logger_create_users_page_gender_female_button.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_gender_female_text_should_be_displayed(){
		return super_admin_logger_create_users_page_gender_female_text.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_others_radio_button_should_be_clickable() {
		return super_admin_logger_create_users_page_gender_others_button.isEnabled();
	}

	public boolean super_admin_logger_create_users_page_gender_others_radio_button_should_be_displayed() {
		return super_admin_logger_create_users_page_gender_others_button.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_others_text_should_be_displayed() {
		return super_admin_logger_create_users_page_gender_others_text.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_card_body_credential_information_header_is_displayed() {
		return super_admin_logger_create_users_page_card_body_credential_information_header.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_password_text_above_the_user_field_is_displayed() {
		return super_admin_logger_create_users_page_password_text_above_the_user_field.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_password_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_password_asterrisk_symbol.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_password_user_field_is_clickable() {
		return super_admin_logger_create_users_page_password_user_field.isEnabled();
	}

	public String super_admin_logger_create_users_page_password_userfield_placeholder_value() {
		return super_admin_logger_create_users_page_password_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_create_users_page_comfirm_password_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_comfirm_password_asterrisk_symbol.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_comfirm_password_text_above_userfield_is_displayed() {
		return super_admin_logger_create_users_page_comfirm_password_text_above_userfield.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_comfirm_password_userfield_is_clickable() {
		return super_admin_logger_create_users_page_comfirm_password_userfield.isEnabled();
	}

	public String super_admin_logger_create_users_page_comfirm_password_userfield_place_holder_value() {
		return super_admin_logger_create_users_page_comfirm_password_userfield.getAttribute("placeholder");
	}

	public boolean super_admin_logger_create_users_page_card_body_role_information_header_is_displayed() {
		return super_admin_logger_create_users_page_card_body_role_information_header.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_assigned_roles_text_above_user_field_is_displayed() {
		return super_admin_logger_create_users_page_assigned_roles_text_above_user_field.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_assigned_roles_asterrisk_symbol_is_displayed(){
		return super_admin_logger_create_users_page_assigned_roles_asterrisk_symbol.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_assigned_roles_user_field_is_clickable() {
		return super_admin_logger_create_users_page_assigned_roles_user_field.isEnabled();
	}

	public boolean super_admin_logger_create_users_page_assigned_roles_drop_down_is_clickable() {
		return super_admin_logger_create_users_page_assigned_roles_user_field.isEnabled();
	}
	
	public void super_admin_logger_create_users_page_assigned_roles_drop_down_is_clic() {
		ElementUtil.eu.clickByJS(driver, super_admin_logger_create_users_page_assigned_roles_user_field);
	}
	
	public String super_admin_logger_create_users_page_assigned_roles_dropdown_place_holder_value(){
		return super_admin_logger_create_users_page_assigned_roles_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_clickable() {
		return super_admin_logger_create_users_page_assigned_roles_drop_down_admin.isEnabled();
	}
	
	public String super_admin_logger_create_users_page_assigned_roles_drop_down_admin_is_selected() {
		super_admin_logger_create_users_page_assigned_roles_drop_down_admin.click();
		return super_admin_logger_create_users_page_assigned_roles_drop_down_admin.getText();
	}
	
	public boolean super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_clickable() {
		return super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin.isEnabled();
	}
	
	public String super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin_is_selected(){
		super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin.click();
		return super_admin_logger_create_users_page_assigned_roles_drop_down_super_admin.getText();
	}

	public boolean super_admin_logger_create_users_page_submit_button_is_displayed() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		return super_admin_logger_create_user_submit_button.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_submit_button_is_clickable() {
		return super_admin_logger_create_user_submit_button.isEnabled();
	}
	
	public boolean super_admin_logger_create_users_page_submit_button_is_able_to_mouser_hover(){
		ElementUtil.eu.mouseHover(driver, super_admin_logger_create_user_submit_button);
		return true;
	}
	
	public boolean super_admin_logger_create_users_page_cancel_button_is_displayed() {
		return super_admin_logger_create_user_cancel_button.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_cancel_button_is_clickable() {
		return super_admin_logger_create_user_cancel_button.isEnabled();
	}
	
	public boolean super_admin_logger_create_users_page_cancel_button_is_able_to_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, super_admin_logger_create_user_cancel_button);
		return true;
	}
	
	/*
	 * 
	 * first name
	 * 
	 */
	
	public void super_admin_logger_create_user_first_name_user_field_is_cleared(){
		ElementUtil.eu.clickByJS(driver, super_admin_logger_create_users_page_first_name_users_field);
		//super_admin_logger_create_users_page_first_name_users_field.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_create_users_page_first_name_users_field);
	}

	public void super_admin_logger_create_user_first_name_user_field_send_text(String string) {
		super_admin_logger_create_users_page_first_name_users_field.sendKeys(string);
	}

	public String super_admin_logger_create_user_entered_first_name_text() {
		return super_admin_logger_create_users_page_first_name_users_field.getAttribute("value");
	}

	/*
	 * 
	 * last name
	 * 
	 * 
	 */
	
	public void super_admin_logger_create_user_last_name_user_field_is_cleared(){
		super_admin_logger_create_users_page_last_name_users_field.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_create_users_page_last_name_users_field);
	}

	public void super_admin_logger_create_user_last_name_user_field_send_text(String string) {
		super_admin_logger_create_users_page_last_name_users_field.sendKeys(string);
	}

	public String super_admin_logger_create_user_entered_last_name_text() {
		return super_admin_logger_create_users_page_last_name_users_field.getAttribute("value");
	}

	/*
	 * 
	 * email
	 * 
	 */
	
	public void super_admin_logger_create_user_email_user_field_is_cleared(){
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_create_users_page_email_users_field);
		super_admin_logger_create_users_page_email_users_field.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_create_users_page_email_users_field);
	}
	
	public void super_admin_logger_create_user_email_user_field_send_text(String string) {
		super_admin_logger_create_users_page_email_users_field.sendKeys(string);
	}

	public String super_admin_logger_create_user_entered_email_text() {
		return super_admin_logger_create_users_page_email_users_field.getAttribute("value");
	}
	
	/*
	 * 
	 * Mobile number
	 * 
	 * 
	 */
	
	public void super_admin_logger_create_user_mobile_number_user_field_is_cleared(){
		ElementUtil.eu.scroll_till_lement(driver,super_admin_logger_create_users_page_mobile_number_users_field );
		//ElementUtil.eu.clickByJS(driver, super_admin_logger_create_users_page_mobile_number_users_field);
		super_admin_logger_create_users_page_mobile_number_users_field.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_create_users_page_mobile_number_users_field);
	}

	public void super_admin_logger_create_user_mobile_number_user_field_send_text(String string){
		super_admin_logger_create_users_page_mobile_number_users_field.sendKeys(string);
	}

	public String super_admin_logger_create_user_entered_mobile_number_text() {
		return super_admin_logger_create_users_page_mobile_number_users_field.getAttribute("value");
	}

	/*
	 * 
	 * password
	 * 
	 */
	
	public void super_admin_logger_create_user_password_user_field_send_text(String string) {
		super_admin_logger_create_users_page_password_user_field.sendKeys(string);
	}

	public String super_admin_logger_create_user_entered_password_text() {
		return super_admin_logger_create_users_page_password_user_field.getAttribute("value");
	}

	/*
	 * 
	 * 
	 * Comfirm password
	 * 
	 */
	
	public void super_admin_logger_create_user_comfirm_password_user_field_send_text(String string) {
		super_admin_logger_create_users_page_comfirm_password_userfield.sendKeys(string);
	}
	
	public String super_admin_logger_create_user_entered_comfirm_password_text() {
		return super_admin_logger_create_users_page_comfirm_password_userfield.getAttribute("value");
	}
	
	/*
	 * 
	 * 
	 * 
	 * Profile image
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean super_admin_logger_create_users_page_profile_image_is_uploaded(String location_jpg) {
		super_admin_logger_create_users_page_profile_image_userfield.sendKeys(ElementUtil.eu.project_path()+location_jpg);
		ElementUtil.eu.scroll_down_body_click(2, driver);
		super_admin_logger_create_user_submit_button.click();
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_logger_create_users_page_profile_image_userfield_is_valid);
		return super_admin_logger_create_users_page_profile_image_userfield_is_valid.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_profile_invalid_image_is_uploaded(String file){
		super_admin_logger_create_users_page_profile_image_userfield.sendKeys(ElementUtil.eu.project_path()+file);
		ElementUtil.eu.scroll_down_body_click(2, driver);
		super_admin_logger_create_user_submit_button.click();
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_logger_create_users_page_profile_image_userfield_is_invalid);
		return super_admin_logger_create_users_page_profile_image_userfield_is_invalid.isDisplayed();
	}
	
	/*
	 * 
	 * 
	 * 
	 * Gender radio
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean super_admin_logger_create_users_page_gender_header_text_of_the_radio_button_displayed() {
		return super_admin_logger_create_users_page_gender_header_text_of_the_radio.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_male_button_is_clickable() {
		return super_admin_logger_create_users_page_gender_male_button.isEnabled();
	}

	public boolean super_admin_logger_create_users_page_gender_female_button_is_clickable() {
		return super_admin_logger_create_users_page_gender_female_button.isEnabled();
	}

	public boolean super_admin_logger_create_users_page_gender_others_button_is_clickable() {
		return super_admin_logger_create_users_page_gender_others_button.isEnabled();
	}

	public void super_admin_logger_create_users_page_gender_male_button_is_click() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_create_users_page_gender_male_button);
		//super_admin_logger_create_users_page_gender_male_button.click();
		ElementUtil.eu.clickByJS(driver, super_admin_logger_create_users_page_gender_male_button);
	}

	public boolean super_admin_logger_create_users_page_gender_male_button_is_selected() {
		return super_admin_logger_create_users_page_gender_male_button.isSelected();
	}

	public void super_admin_logger_create_users_page_gender_female_button_is_click() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_create_users_page_gender_female_button);
		super_admin_logger_create_users_page_gender_female_button.click();
	}

	public boolean super_admin_logger_create_users_page_gender_female_button_is_selected() {
		return super_admin_logger_create_users_page_gender_female_button.isSelected();
	}

	public void super_admin_logger_create_users_page_gender_others_button_is_click() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_create_users_page_gender_others_button);
		super_admin_logger_create_users_page_gender_others_button.click();
	}

	public boolean super_admin_logger_create_users_page_gender_others_button_is_selected() {
		return super_admin_logger_create_users_page_gender_others_button.isSelected();
	}
	
	public boolean super_admin_logger_create_users_page_gender_male_text_is_displayed() {
		return super_admin_logger_create_users_page_gender_male_text.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_female_text_is_displayed() {
		return super_admin_logger_create_users_page_gender_female_text.isDisplayed();
	}

	public boolean super_admin_logger_create_users_page_gender_others_text_is_displayed() {
		return super_admin_logger_create_users_page_gender_others_text.isDisplayed();
	}

	/*
	 * 
	 * 
	 * date of birth
	 * 
	 * 
	 */
	
	public void super_admin_logger_create_users_page_date_of_birth_userfield_send_text(String string) {
		super_admin_logger_create_users_page_date_of_birth_userfield.sendKeys(string);
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_userfield_click() {
		ElementUtil.eu.scroll_till_lement(driver, super_admin_logger_create_users_page_date_of_birth_userfield);
		super_admin_logger_create_users_page_date_of_birth_userfield.click();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_year_2005_displayed(){
		year_2005_in_header_of_the_calender.click();
		return year_2005_in_header_of_the_calender.isDisplayed();
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_year_down_arrow_is_clicked() {
		super_admin_logger_create_users_page_date_of_birth_year_first_down_arrow.click();
	}

	public boolean super_admin_logger_create_users_page_date_of_birth_calender_is_displayed(){
		return super_admin_logger_create_users_page_date_of_birth_calender.isDisplayed();
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_calender_select_date_15(){
		super_admin_logger_create_users_page_date_of_birth_calender_selectDate.click();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_date_15_clickable(){
		return super_admin_logger_create_users_page_date_of_birth_calender_selectDate.isEnabled();
	}
	
	public void super_admin_logger_create_users_page_date_of_birth_calender_select_month_december(){
		super_admin_logger_create_users_page_date_of_birth_month_down_arrow.click();
		super_admin_logger_create_users_page_date_of_birth_calender_select_month_dec.click();
	}
	
	public boolean super_admin_logger_create_users_page_date_of_birth_calender_select_month_december_is_dispalyed(){
		return super_admin_logger_create_users_page_date_of_birth_calender_select_month_december.isDisplayed();
	}
	
	public String super_admin_logger_create_users_page_date_of_birth_userfield_text_value() {
		return super_admin_logger_create_users_page_date_of_birth_userfield.getAttribute("value");
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean super_admin_logger_create_users_page_back_to_top_arrow_button_is_displayed() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		return back_to_top_arrow_button.isDisplayed();
	}
	
	public boolean super_admin_logger_create_users_page_back_to_top_arrow_button_is_clickable() {
		return back_to_top_arrow_button.isEnabled();
	}

	public void super_admin_logger_create_users_page_submit_button_with_js_is_click() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		ElementUtil.eu.clickByJS(driver, super_admin_logger_create_user_submit_button);
	}
	
	public boolean super_admin_logger_create_user_first_name_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_first_name_userfield_below_note_valid.isDisplayed();
	}
	
	public boolean super_admin_logger_create_user_first_name_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_first_name_userfield_below_note_invalid.isDisplayed();
	}

	public boolean super_admin_logger_create_user_last_name_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_last_name_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_create_user_last_name_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_last_name_userfield_below_note_invalid.isDisplayed();
	}
	
	public boolean super_admin_logger_create_user_email_userfield_below_note_text_is_displayed() {
		return super_admin_logger_create_user_email_userfield_below_note_invalid.isDisplayed();
	}
	
	public boolean super_admin_logger_create_user_email_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_email_userfield_below_note_valid.isDisplayed();
	}
	public boolean super_admin_logger_create_user_mobile_number_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_mobile_number_userfield_below_note_valid.isDisplayed();
	}
	
	public boolean super_admin_logger_create_user_mobile_number_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_mobile_number_userfield_below_note_invalid.isDisplayed();
	}

	public boolean super_admin_logger_create_user_comfirm_password_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_comfirm_password_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_create_user_comfirm_password_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_comfirm_password_userfield_below_note_invalid.isDisplayed();
	}

	public boolean super_admin_logger_create_user_password_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_password_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_create_user_password_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_create_user_password_userfield_below_note_invalid.isDisplayed();
	}

}
