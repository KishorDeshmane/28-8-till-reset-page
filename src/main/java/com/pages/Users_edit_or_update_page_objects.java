package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_edit_or_update_page_objects {
	private WebDriver driver;
	
	/*
	 * 
	 * 
	 * Edit 
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement super_admin_logger_update_users_page_breadcrum;
	
	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement super_admin_logger_update_users_page_header;

	@FindBy(xpath = "//*[@class='page-header']/div/ol/li[1]")
	private WebElement super_admin_logger_update_users_page_breadcrum_all_user;

	@FindBy(xpath = "//*[@class='page-header']/div/ol/li[2]")
	private WebElement super_admin_logger_update_users_page_breadcrum_update_user_text;
	
	@FindBy(xpath = "//*[@class='card-body border']/div")
	private WebElement super_admin_logger_update_users_page_card_body_personnel_information_header;

	@FindBy(xpath = "//*[@for='first_name']")
	private WebElement super_admin_logger_update_users_page_first_name_text_above_users_field;

	@FindBy(xpath = "//*[@name='first_name']")
	private WebElement super_admin_logger_update_users_page_first_name_users_field;

	@FindBy(xpath = "//*[@for='last_name']")
	private WebElement super_admin_logger_update_users_page_last_name_text_above_users_field;

	@FindBy(xpath = "//*[@name='last_name']")
	private WebElement super_admin_logger_update_users_page_last_name_users_field;

	@FindBy(xpath = "//*[@for='formEmail']")
	private WebElement super_admin_logger_update_users_page_email_text_above_users_field;

	@FindBy(xpath = "//*[@name='email']")
	private WebElement super_admin_logger_update_users_page_email_users_field;

	@FindBy(xpath = "//*[text()='Mobile Number']")
	private WebElement super_admin_logger_update_users_page_mobile_number_text_above_the_users_field;

	@FindBy(xpath = "//*[@name='country_code']/option")
	private WebElement super_admin_logger_update_users_page_mobile_number_country_code_dropdown;

	@FindBy(xpath = "//*[@name='country_code']/option[2]")
	private WebElement super_admin_logger_update_users_page_mobile_number_country_code_dropdown_list;

	@FindBy(xpath = "//*[@name='mobile_number']")
	private WebElement super_admin_logger_update_users_page_mobile_number_users_field;
	
	@FindBy(xpath = "//*[text()='Date of Birth']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_date_of_birth_text_above_the_user_field;

	@FindBy(xpath = "//*[@type='button' and @class='btn btn-light']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_date_of_birth_button;

	@FindBy(xpath = "//*[@placeholder='Enter your date of birth']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_date_of_birth_userfield;

	@FindBy(xpath = "//*[text()='Profile Image']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_profile_image_title_text_above_the_userfield;

	@FindBy(xpath = "//*[@id='profile_pic']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_profile_image_userfield_button;

	@FindBy(xpath = "//*[text()='Gender']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_radio_button_title_text;

	@FindBy(xpath = "//*[@id='inline-radio-Male-1']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_radio_male_button;

	@FindBy(xpath = "//*[text()='Male']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_male_side_text;

	@FindBy(xpath = "//*[@id='inline-radio-Female-1']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_radio_female_button;

	@FindBy(xpath = "//*[text()='Female']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_female_side_text;

	@FindBy(xpath = "//*[@id='inline-radio-Others-1']")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_radio_others_button;

	@FindBy(xpath = "(//*[text()='Others'])[1]")
	private WebElement super_admin_logger_all_users_actions_option_update_user_gender_others_side_text;

	@FindBy(xpath = "//*[text()='Role Information']")
	private WebElement super_admin_logger_update_users_page_card_body_role_information_header;

	@FindBy(xpath = "//*[@for='assigned_roles']")
	private WebElement super_admin_logger_update_users_page_assigned_roles_text_above_user_field;

	@FindBy(xpath = "//*[@name='assigned_roles']")
	private WebElement super_admin_logger_update_users_page_assigned_roles_user_field;
	
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement super_admin_logger_update_users_page_assigned_roles_drop_down_admin;

	@FindBy(xpath = "//*[text()='Super Admin']")
	private WebElement super_admin_logger_update_users_page_assigned_roles_drop_down_super_admin;

	@FindBy(xpath = "//*[text()='Address Information']")
	private WebElement super_admin_logger_update_users_page_card_body_address_information_header;
	
	@FindBy(xpath = "//*[text()='Add New']")
	private WebElement super_admin_logger_update_users_page_card_body_add_new_button;

	@FindBy(xpath = "(//*[text()='Remove'])[1]")
	private WebElement super_admin_logger_update_users_page_card_body_remove_button;

	@FindBy(xpath = "//*[text()='Address Line 1']")
	private WebElement super_admin_logger_update_users_page_address_line_1_text_above_the_userfield;

	@FindBy(xpath = "//*[@placeholder='Enter address line 1']")
	private WebElement super_admin_logger_update_users_page_address_line_1_userfield;

	@FindBy(xpath = "//*[text()='Address Line 2']")
	private WebElement super_admin_logger_update_users_page_address_line_2_text_above_the_user_field;

	@FindBy(xpath = "//*[@placeholder='Enter address line 2']")
	private WebElement super_admin_logger_update_users_page_address_line_2_user_field;

	@FindBy(xpath =  "//*[text()='Country']")
	private WebElement super_admin_logger_update_users_page_country_text_above_the_user_field;

	@FindBy(xpath = "//*[@placeholder='Select your country']")
	private WebElement super_admin_logger_update_users_page_country_userfield;

	@FindBy(xpath = "//*[@placeholder='Select your country']/option[2]")
	private WebElement super_admin_logger_update_users_page_country_dropdown_uae;

	@FindBy(xpath = "//*[text()='State']")
	private WebElement super_admin_logger_update_users_page_state_text_above_the_userfield;

	@FindBy(xpath = "//*[@placeholder='Select your state']")
	private WebElement super_admin_logger_update_users_page_state_userfield;

	@FindBy(xpath = "//*[text()='City']")
	private WebElement super_admin_logger_update_users_page_city_text_above_the_userfield;

	@FindBy(xpath = "//*[@placeholder='Enter your city']")
	private WebElement super_admin_logger_update_users_page_city_user_field;

	@FindBy(xpath = "//*[text()='ZIP Code']")
	private WebElement super_admin_logger_update_users_page_zip_code_text_above_userfield;

	@FindBy(xpath = "//*[@placeholder='Enter your ZIP code']")
	private WebElement super_admin_logger_update_users_page_zip_code_userfield;

	@FindBy(xpath = "//*[text()='Address Type']")
	private WebElement super_admin_logger_update_users_page_address_type_text_above_radio_button;

	@FindBy(xpath = "//*[@id='inline-radio-Home-1']")
	private WebElement super_admin_logger_update_users_page_address_type_home_radio_button;

	@FindBy(xpath = "//*[@for='inline-radio-Home-1']")
	private WebElement super_admin_logger_update_users_page_address_type_home_radio_button_text;
	
	@FindBy(xpath = "//*[@id='inline-radio-Work-1']")
	private WebElement super_admin_logger_update_users_page_address_type_office_radio_button;

	@FindBy(xpath = "//*[@for='inline-radio-Work-1']")
	private WebElement super_admin_logger_update_users_page_address_type_office_radio_button_text;
	
	@FindBy(xpath = "(//*[@class='form-check form-check-inline'])[6]/input")
	private WebElement super_admin_logger_update_users_page_address_type_others_radio_button;

	@FindBy(xpath = "//*[@for='inline-radio-Others-1']")
	private WebElement super_admin_logger_update_users_page_address_type_others_radio_button_text;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement super_admin_logger_update_users_page_submit_button;

	@FindBy(xpath = "//*[text()='Cancel']")
	private WebElement super_admin_logger_update_users_page_cancel_button;

	/*
	 * 
	 * 
	 * Valid or invalid
	 * 
	 * 
	 */

	@FindBy(xpath = "(//*[@placeholder='Enter address line 1' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_update_user_address_line_one_userfield_below_note_valid;

	@FindBy(xpath = "")
	private WebElement super_admin_logger_update_user_address_line_one_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@placeholder='Enter address line 2' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_update_user_address_line_two_userfield_below_note_valid;

	@FindBy(xpath = "")
	private WebElement super_admin_logger_update_user_address_line_two_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@placeholder='Select your state' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_update_user_state_userfield_below_note_valid;

	@FindBy(xpath = "")
	private WebElement super_admin_logger_update_user_state_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@placeholder='Enter your city' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_update_user_city_userfield_below_note_valid;

	@FindBy(xpath = "")
	private WebElement super_admin_logger_update_user_city_userfield_below_note_invalid;

	@FindBy(xpath = "(//*[@placeholder='Enter your ZIP code' and @class='form-control  form-control is-valid'])[1]")
	private WebElement super_admin_logger_update_user_zip_code_userfield_below_note_valid;

	@FindBy(xpath = "(//*[@placeholder='Enter your ZIP code' and @class='form-control  form-control is-invalid'])[1]")
	private WebElement super_admin_logger_update_user_zip_code_userfield_below_note_invalid;

	@FindBy(xpath = "//*[@id='back-to-top']/i")
	private WebElement back_to_top_arrow_button;
	
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
	 * Constructor
	 * 
	 * 
	 */
	
	public Users_edit_or_update_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 *Update/Edit page 
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean administraor_logger_all_users_actions_option_update_user_page_header_is_displayed() {
		return super_admin_logger_update_users_page_header.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_breadcrum_is_displayed() {
		return super_admin_logger_update_users_page_breadcrum.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_breadcrum_all_user_is_displayed() {
		return super_admin_logger_update_users_page_breadcrum_all_user.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_breadcrum_all_user_is_clickable() {
		return super_admin_logger_update_users_page_breadcrum_all_user.isEnabled();
	}
	
	public void administraor_logger_all_users_actions_option_update_user_breadcrum_all_user_is_click() {
		 super_admin_logger_update_users_page_breadcrum_all_user.click();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_breadcrum_update_user_text_is_displayed() {
		return super_admin_logger_update_users_page_breadcrum_update_user_text.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_card_body_personnel_information_header_is_displayed() {
		return super_admin_logger_update_users_page_card_body_personnel_information_header.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_first_name_text_above_users_field_is_displayed() {
		return super_admin_logger_update_users_page_first_name_text_above_users_field.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_first_name_users_field_is_clickable() {
		return super_admin_logger_update_users_page_first_name_users_field.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_first_name_users_field_placeholder_value() {
		return super_admin_logger_update_users_page_first_name_users_field.getAttribute("placeholder");
	}

	public boolean administraor_logger_all_users_actions_option_update_user_last_name_text_above_users_field_is_displayed() {
		return super_admin_logger_update_users_page_last_name_text_above_users_field.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_last_name_users_field_is_clickable() {
		return super_admin_logger_update_users_page_last_name_users_field.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_last_name_users_field_placeholder_value() {
		return super_admin_logger_update_users_page_last_name_users_field.getAttribute("placeholder");
	}

	public boolean administraor_logger_all_users_actions_option_update_user_email_text_above_users_field_is_displayed() {
		return super_admin_logger_update_users_page_email_text_above_users_field.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_email_users_field_is_clickable() {
		return super_admin_logger_update_users_page_email_users_field.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_email_users_field_placeholder_value() {
		return super_admin_logger_update_users_page_email_users_field.getAttribute("placeholder");
	}

	public boolean administraor_logger_all_users_actions_option_update_user_mobile_number_text_above_users_field_is_displayed() {
		return super_admin_logger_update_users_page_mobile_number_text_above_the_users_field.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_mobile_number_country_code_dropdown_is_displayed() {
		return super_admin_logger_update_users_page_mobile_number_country_code_dropdown.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_mobile_number_country_code_dropdown_list_is_clickable() {
		return super_admin_logger_update_users_page_mobile_number_country_code_dropdown_list.isEnabled();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_mobile_number_users_field_is_clickable() {
		return super_admin_logger_update_users_page_mobile_number_users_field.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_mobile_number_users_field_placeholder_value() {
		return super_admin_logger_update_users_page_mobile_number_users_field.getAttribute("placeholder");
	}
	
	public boolean super_admin_logger_all_users_actions_option_update_user_date_of_birth_text_above_the_user_field_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_date_of_birth_text_above_the_user_field.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_date_of_birth_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_update_user_date_of_birth_button.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_date_of_birth_userfield_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_date_of_birth_userfield.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_date_of_birth_userfield_is_clickable() {
		return super_admin_logger_all_users_actions_option_update_user_date_of_birth_userfield.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_date_of_birth_userfeld_placeholder_value() {
		return super_admin_logger_all_users_actions_option_update_user_date_of_birth_userfield.getAttribute("placeholder");
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_profile_image_title_text_above_the_userfield_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_profile_image_title_text_above_the_userfield.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_profile_image_userfield_button_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_profile_image_userfield_button.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_profile_image_userfield_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_update_user_profile_image_userfield_button.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_profile_image_userfield_button_placeholder_value() {
		return super_admin_logger_all_users_actions_option_update_user_profile_image_userfield_button.getAttribute("placeholder");
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_radio_button_title_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_gender_radio_button_title_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_radio_male_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_update_user_gender_radio_male_button.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_male_side_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_gender_male_side_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_radio_female_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_update_user_gender_radio_female_button.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_female_side_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_gender_female_side_text.isDisplayed();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_radio_others_button_is_clickable() {
		return super_admin_logger_all_users_actions_option_update_user_gender_radio_others_button.isEnabled();
	}

	public boolean super_admin_logger_all_users_actions_option_update_user_gender_others_side_text_is_displayed() {
		return super_admin_logger_all_users_actions_option_update_user_gender_others_side_text.isDisplayed();
	}
	
	public boolean administraor_logger_all_users_actions_option_update_user_card_body_role_information_header_is_displayed() {
		return super_admin_logger_update_users_page_card_body_role_information_header.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_assigned_roles_text_above_user_field_is_displayed() {
		return super_admin_logger_update_users_page_assigned_roles_text_above_user_field.isDisplayed();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_assigned_roles_user_field_is_clickable() {
		return super_admin_logger_update_users_page_assigned_roles_user_field.isEnabled();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_assigned_roles_drop_down_is_clickable() {
		return super_admin_logger_update_users_page_assigned_roles_user_field.isEnabled();
	}

	public String administraor_logger_all_users_actions_option_update_user_assigned_roles_dropdown_place_holder_value() {
		return super_admin_logger_update_users_page_assigned_roles_user_field.getAttribute("placeholder");
	}

	public boolean administraor_logger_all_users_actions_option_update_user_assigned_roles_drop_down_admin_is_clickable() {
		return super_admin_logger_update_users_page_assigned_roles_drop_down_admin.isEnabled();
	}

	public boolean administraor_logger_all_users_actions_option_update_user_assigned_roles_drop_down_super_admin_is_clickable() {
		return super_admin_logger_update_users_page_assigned_roles_drop_down_super_admin.isEnabled();
	}

	public boolean super_admin_logger_update_users_page_card_body_address_information_header_is_displayed() {
		return super_admin_logger_update_users_page_card_body_address_information_header.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_card_body_add_new_button_is_displayed() {
		return super_admin_logger_update_users_page_card_body_add_new_button.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_card_body_add_new_button_is_clickable() {
		return super_admin_logger_update_users_page_card_body_add_new_button.isEnabled();
	}

	public void super_admin_logger_update_users_page_card_body_add_new_button_is_click() {
		ElementUtil.eu.scroll_down_body_click(3, driver);
		super_admin_logger_update_users_page_card_body_add_new_button.click();
	}

	public boolean super_admin_logger_update_users_page_card_body_remove_button_is_displayed() {
		return super_admin_logger_update_users_page_card_body_remove_button.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_card_body_remove_button_is_clickable() {
		return super_admin_logger_update_users_page_card_body_remove_button.isEnabled();
	}
	
	public boolean super_admin_logger_update_users_page_address_line_1_text_above_the_userfield_is_displayed() {
		return super_admin_logger_update_users_page_address_line_1_text_above_the_userfield.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_address_line_1_userfield_is_clickable() {
		return super_admin_logger_update_users_page_address_line_1_userfield.isEnabled();
	}

	public String super_admin_logger_update_users_page_address_line_1_userfield_place_holder_value() {
		return super_admin_logger_update_users_page_address_line_1_userfield.getAttribute("placeholder");
	}

	public boolean super_admin_logger_update_users_page_address_line_2_text_above_the_user_field_is_displayed() {
		return super_admin_logger_update_users_page_address_line_2_text_above_the_user_field.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_address_line_2_user_field_is_clickable() {
		return super_admin_logger_update_users_page_address_line_2_user_field.isEnabled();
	}

	public String super_admin_logger_update_users_page_address_line_2_user_field_place_holder_value() {
		return super_admin_logger_update_users_page_address_line_2_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_update_users_page_country_text_above_the_user_field_is_displayed() {
		return super_admin_logger_update_users_page_country_text_above_the_user_field.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_country_userfield_is_clickable() {
		return super_admin_logger_update_users_page_country_userfield.isEnabled();
	}
	
	public void super_admin_logger_update_users_page_country_userfield_dropdown_is_click() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_country_userfield.click();
	}

	public boolean super_admin_logger_update_users_page_country_dropdown_uae_is_clickable() {
		return super_admin_logger_update_users_page_country_dropdown_uae.isEnabled();
	}
	
	public String super_admin_logger_update_users_page_country_dropdown_uae_is_selected() {
		super_admin_logger_update_users_page_country_userfield.click();
		super_admin_logger_update_users_page_country_dropdown_uae.click();
		return super_admin_logger_update_users_page_country_dropdown_uae.getText();
	}

	public boolean super_admin_logger_update_users_page_state_text_above_the_userfield_is_displayed() {
		return super_admin_logger_update_users_page_state_text_above_the_userfield.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_state_userfield_is_clickable() {
		return super_admin_logger_update_users_page_state_userfield.isEnabled();
	}

	public String super_admin_logger_update_users_page_state_userfield_place_holder_value() {
		return super_admin_logger_update_users_page_state_userfield.getAttribute("placeholder");
	}

	public boolean super_admin_logger_update_users_page_city_text_above_the_userfield_is_displayed() {
		return super_admin_logger_update_users_page_city_text_above_the_userfield.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_city_user_field_is_clickable() {
		return super_admin_logger_update_users_page_city_user_field.isEnabled();
	}

	public String super_admin_logger_update_users_page_city_user_field_place_holder_value() {
		return super_admin_logger_update_users_page_city_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_logger_update_users_page_zip_code_text_above_userfield_is_displayed() {
		return super_admin_logger_update_users_page_zip_code_text_above_userfield.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_zip_code_userfield_is_clickable() {
		return super_admin_logger_update_users_page_zip_code_userfield.isEnabled();
	}

	public String super_admin_logger_update_users_page_zip_code_place_holder_value() {
		return super_admin_logger_update_users_page_zip_code_userfield.getAttribute("placeholder");
	}

	public boolean super_admin_logger_update_users_page_address_type_text_above_radio_button_is_displayed() {
		return super_admin_logger_update_users_page_address_type_text_above_radio_button.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_address_type_home_radio_button_is_preSelected() {
		ElementUtil.eu.wait_for_element_to_be_selected(driver, 10, super_admin_logger_update_users_page_address_type_home_radio_button);
		return super_admin_logger_update_users_page_address_type_home_radio_button.isSelected();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_home_radio_button_is_clickable() {
		return super_admin_logger_update_users_page_address_type_home_radio_button.isEnabled();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_home_radio_button_text_is_displayed(){
		return super_admin_logger_update_users_page_address_type_home_radio_button_text.isDisplayed();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_home_radio_button_is_selected() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_type_home_radio_button.click();
		return super_admin_logger_update_users_page_address_type_home_radio_button.isSelected();
	}

	public boolean super_admin_logger_update_users_page_address_type_office_radio_button_is_clickable() {
		return super_admin_logger_update_users_page_address_type_office_radio_button.isEnabled();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_office_radio_button_text_is_displayed(){
		return super_admin_logger_update_users_page_address_type_office_radio_button_text.isDisplayed();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_office_radio_button_is_selected() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_type_office_radio_button.click();
		return super_admin_logger_update_users_page_address_type_office_radio_button.isSelected();
	}

	public boolean super_admin_logger_update_users_page_address_type_others_radio_button_is_clickable() {
		return super_admin_logger_update_users_page_address_type_others_radio_button.isEnabled();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_others_radio_button_text_is_displayed(){
		return super_admin_logger_update_users_page_address_type_others_radio_button_text.isDisplayed();
	}
	
	public boolean super_admin_logger_update_users_page_address_type_others_radio_button_is_selected() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_type_others_radio_button.click();
		return super_admin_logger_update_users_page_address_type_others_radio_button.isSelected();
	}
	
	public boolean super_admin_logger_update_users_office_radio_button_is_selected() {
		return super_admin_logger_update_users_page_address_type_office_radio_button.isSelected();
	}

	public boolean super_admin_logger_update_users_others_radio_button_is_selected() {
		return super_admin_logger_update_users_page_address_type_others_radio_button.isSelected();
	}

	public boolean super_admin_logger_update_users_home_radio_button_is_selected() {
		return super_admin_logger_update_users_page_address_type_home_radio_button.isSelected();
	}

	public boolean super_admin_logger_update_users_page_submit_button_is_displayed(){
		return super_admin_logger_update_users_page_submit_button.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_submit_button_is_clickable() {
		return super_admin_logger_update_users_page_submit_button.isEnabled();
	}
	
	public void super_admin_logger_update_users_page_submit_button_is_click() {
		 super_admin_logger_update_users_page_submit_button.click();
	}
	
	public boolean super_admin_logger_update_users_page_cancel_button_is_displayed() {
		return super_admin_logger_update_users_page_cancel_button.isDisplayed();
	}

	public boolean super_admin_logger_update_users_page_cancel_button_is_clickable() {
		return super_admin_logger_update_users_page_cancel_button.isEnabled();
	}
	
	/*
	 * 
	 * address line 1
	 * 
	 * 
	 */
	
	public void super_admin_logger_create_user_address_line_one_user_field_is_cleared(){
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_line_1_userfield.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_update_users_page_address_line_1_userfield);
	}
	
	public void super_admin_logger_update_user_address_line_one_user_field_send_text(String string) {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_line_1_userfield.click();
		super_admin_logger_update_users_page_address_line_1_userfield.sendKeys(string);
	}

	public String super_admin_logger_update_user_entered_address_line_one_text() {
		return super_admin_logger_update_users_page_address_line_1_userfield.getAttribute("value");
	}

	public boolean super_admin_logger_update_user_address_line_one_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_address_line_one_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_update_user_address_line_one_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_address_line_one_userfield_below_note_invalid.isDisplayed();
	}

	/*
	 * 
	 * address line 2
	 * 
	 * 
	 */
	
	public void super_admin_logger_create_user_address_line_two_user_field_is_cleared(){
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_line_2_user_field.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_update_users_page_address_line_2_user_field);
	}
	
	public void super_admin_logger_update_user_address_line_two_user_field_send_text(String string) {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_address_line_2_user_field.click();
		super_admin_logger_update_users_page_address_line_2_user_field.sendKeys(string);
	}

	public String super_admin_logger_update_user_entered_address_line_two_text() {
		return super_admin_logger_update_users_page_address_line_2_user_field.getAttribute("value");
	}

	public boolean super_admin_logger_update_user_address_line_two_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_address_line_two_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_update_user_address_line_two_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_address_line_two_userfield_below_note_invalid.isDisplayed();
	}
	
	/*
	 * 
	 * State
	 * 
	 */
	
	public void super_admin_logger_create_user_state_user_field_is_cleared(){
		ElementUtil.eu.scroll_down_body_click(5, driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super_admin_logger_update_users_page_state_userfield.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_update_users_page_state_userfield);
	}

	public void super_admin_logger_update_user_state_user_field_send_text(String string) {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_state_userfield.click();
		super_admin_logger_update_users_page_state_userfield.sendKeys(string);
	}

	public String super_admin_logger_update_user_entered_state_text() {
		return super_admin_logger_update_users_page_state_userfield.getAttribute("value");
	}

	public boolean super_admin_logger_update_user_state_userfield_below_note_text_is_not_displayed() {
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_state_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_update_user_state_userfield_below_note_text_is_displayed() {
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_state_userfield_below_note_invalid.isDisplayed();
	}
	
	/*
	 * City
	 * 
	 */
	
	public void super_admin_logger_create_user_city_user_field_is_cleared(){
		ElementUtil.eu.scroll_down_body_click(5, driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super_admin_logger_update_users_page_city_user_field.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_update_users_page_city_user_field);
	}
	
	public void super_admin_logger_update_user_city_user_field_send_text(String string) {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_city_user_field.click();
		super_admin_logger_update_users_page_city_user_field.sendKeys(string);
	}
	
	public String super_admin_logger_update_user_entered_city_text() {
		return super_admin_logger_update_users_page_city_user_field.getAttribute("value");
	}

	public boolean super_admin_logger_update_user_city_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_city_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_update_user_city_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_city_userfield_below_note_invalid.isDisplayed();
	}
	
	/*
	 * 
	 * Zip code
	 * 
	 * 
	 */

	public void super_admin_logger_create_user_zip_code_user_field_is_cleared(){
		ElementUtil.eu.scroll_down_body_click(5, driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super_admin_logger_update_users_page_zip_code_userfield.click();
		ElementUtil.eu.wait_for_element_text_be_cleared(driver, 3,  super_admin_logger_update_users_page_zip_code_userfield);
	}
	
	public void super_admin_logger_update_user_zip_code_user_field_send_text(String string) {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		super_admin_logger_update_users_page_zip_code_userfield.click();
		super_admin_logger_update_users_page_zip_code_userfield.sendKeys(string);
	}

	public String super_admin_logger_update_user_entered_zip_code_text() {
		return super_admin_logger_update_users_page_zip_code_userfield.getAttribute("value");
	}

	public boolean super_admin_logger_update_user_zip_code_userfield_below_note_text_is_not_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_zip_code_userfield_below_note_valid.isDisplayed();
	}

	public boolean super_admin_logger_update_user_zip_code_userfield_below_note_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow_button);
		back_to_top_arrow_button.click();
		return super_admin_logger_update_user_zip_code_userfield_below_note_invalid.isDisplayed();
	}
	
	public boolean super_admin_logger_update_users_page_back_to_top_arrow_button_is_displayed() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		return back_to_top_arrow_button.isDisplayed();
	}
	
	public boolean super_admin_logger_update_users_page_back_to_top_arrow_button_is_clickable() {
		return back_to_top_arrow_button.isEnabled();
	}

	public void super_admin_logger_update_users_page_submit_button_with_js_is_click() {
		ElementUtil.eu.scroll_down_body_click(1, driver);
		ElementUtil.eu.clickByJS(driver, super_admin_logger_update_users_page_submit_button);
	}
	
	public void administraor_logger_all_users_actions_option_update_user_cancel_button_is_click() {
		ElementUtil.eu.scroll_end_of_page_with_keyboard_click(5);
		super_admin_logger_update_users_page_cancel_button.click();
	}

}
