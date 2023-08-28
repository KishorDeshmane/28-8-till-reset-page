package com.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Partner_log_in_page_objects {
	private WebDriver driver;
	
	/*
	 * 
	 * Page Objects
	 * 
	 */
	
	@FindBy(xpath = "(//*[text()='Get OTP'])[1]")
	private WebElement partner_log_page_get_otp_button;

	@FindBy(xpath="(//*[text()='Sign-in to Your Account'])[2]")
	private WebElement partner_log_in_page_sign_in_to_your_account_title_text;

	@FindBy(xpath="//*[text()='Sign-in to manage, your business']")
	private WebElement partner_log_in_page_sign_in_to_manage_your_business_text;

	@FindBy(xpath="(//*[text()='Shield'])[2]")
	private WebElement partner_log_in_page_left_side_shield_title_text;

	@FindBy(xpath="//*[@alt='user']")
	private WebElement partner_log_in_page_left_side_shield_logo;

	@FindBy(xpath="(//*[text()='Sign-in to Your Account'])[1]")
	private WebElement partner_log_in_page_left_side_sign_in_to_your_account_text;

	@FindBy(xpath="//*[text()='Sign-in to manage your business']")
	private WebElement partner_log_in_page_left_side_sign_in_to_manage_your_business_text;

	@FindBy(xpath="//*[text()='Sign-in using Email']")
	private WebElement partner_log_in_page_sign_in_using_email_button;

	@FindBy(xpath="//*[text()='Email']")
	private WebElement partner_log_in_page_sign_in_using_email_selected_having_email_title_text;

	@FindBy(xpath="//*[text()='Email']/span")
	private WebElement partner_log_in_page_sign_in_using_email_selected_having_email_asterisk;

	@FindBy(xpath="//*[@id='formEmail']")
	private WebElement partner_log_in_page_sign_in_using_email_selected_having_email_userfield;

	@FindBy(xpath="(//*[@type='submit'])[1]")
	private WebElement partner_log_in_page_sign_in_using_email_selected_having_get_otp_button;

	@FindBy(xpath="//*[text()='Sign-in using Mobile']")
	private WebElement partner_log_in_page_sign_in_using_mobile_button;

	@FindBy(xpath="//*[text()='Mobile Number']")
	private WebElement partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_title_text;

	@FindBy(xpath="//*[text()='Mobile Number']/span")
	private WebElement partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_asterisk;

	@FindBy(xpath= "//*[@name='country_code']")
	private WebElement partner_log_in_page_sign_in_using_mobile_dropdown;
	
	@FindBy(xpath="//*[@name='country_code']/option")
	private List<WebElement> partner_log_in_page_sign_in_using_mobile_dropdown_list;
	
	@FindBy(xpath="//*[@name='mobile_number']")
	private WebElement partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield;

	@FindBy(xpath="(//*[@type='submit'])[2]")
	private WebElement partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button;

	@FindBy(xpath= "//*[@class='form-control  form-control is-valid' and @name='email']")
	private WebElement partner_log_in_should_get_the_green_tick_in_the_email_user_field;

	@FindBy(xpath= "//*[@class='form-control  form-control is-invalid' and @name='email']")
	private WebElement partner_log_in_should_get_the_red_tick_in_the_email_user_field;

	@FindBy(xpath= "//*[@class='form-control mb-3 form-control is-valid' and @name='mobile_number']")
	private WebElement partner_log_in_should_get_the_green_tick_in_the_mobile_number_user_field;

	@FindBy(xpath= "//*[@class='form-control mb-3 form-control is-invalid' and @name='mobile_number']")
	private WebElement partner_log_in_should_get_the_red_tick_in_the_mobile_number_user_field;
	
	@FindBy(xpath="//*[text()='User is not active']")
	private WebElement partner_log_in_get_otp_page_pop_up_user_is_not_active;
	
	@FindBy(xpath= "//*[text()='Partner created successfully and a verification mail has been sent to you']")
	private WebElement partner_log_in_get_otp_page_pop_up_partner_created_successfully_and_a_verification_mail_has_been_sent_to_you;
	
	@FindBy(xpath="//*[text()='Email verified successfully']")
	private WebElement partner_log_in_page_email_verified_successfully_pop_up;

/*
 * 
 * otp page	
 */
	
	@FindBy(xpath= "(//*[text()='Sign-in to Your Account'])[2]")
	private WebElement partner_log_in_otp_page_sign_in_into_your_account_title_text;
	
	@FindBy(xpath= "//*[text()='Sign-in to manage, your business']")
	private WebElement partner_log_in_otp_page_sign_in_into_manage_your_business_text;
	
	@FindBy(xpath= "//*[text()='Please Enter six digit OTP sent to your Email / Mobile']")
	private WebElement partner_log_in_otp_page_please_enter_six_digit_otp_sent_to_your_text;
	
	@FindBy(xpath= "(//*[text()='Shield'])[2]")
	private WebElement partner_log_in_otp_page_left_side_shield_title_text;
	
	@FindBy(xpath= "//*[@alt='user']")
	private WebElement partner_log_in_otp_page_left_side_shield_logo;
	
	@FindBy(xpath= "(//*[text()='Sign-in to Your Account'])[1]")
	private WebElement partner_log_in_otp_page_left_side_sign_in_into_your_account_text;
	
	@FindBy(xpath= "//*[text()='Sign-in to manage your business']")
	private WebElement partner_log_in_otp_page_left_side_sign_in_into_manage_your_business_text;
	
	@FindBy(xpath= "//*[@class='Login_otpBoxes__P2D4O']/div/div")
	private List<WebElement> partner_log_in_otp_page_otp_user_fields;
	
	@FindBy(xpath= "//*[@class='Login_otpBoxes__P2D4O']/div/div")
	private List<WebElement> partner_log_in_otp_page_otp_user_field_placeholder_value;
	
	@FindBy(xpath= "//*[text()='Verify OTP']")
	private WebElement partner_log_in_otp_page_verify_otp_button;
	
	
	
	
	@FindBy(xpath="(//*[@type='text'])[1]")
	private WebElement partner_log_in_get_otp_user_field_first_number;

	@FindBy(xpath="(//*[@class='Login_otpBoxes__P2D4O']/div/input)[2]")
	private WebElement partner_log_in_get_otp_user_field_second_number;

	@FindBy(xpath="(//*[@class='Login_otpBoxes__P2D4O']/div/input)[3]")
	private WebElement partner_log_in_get_otp_user_field_third_number;

	@FindBy(xpath="(//*[@class='Login_otpBoxes__P2D4O']/div/input)[4]")
	private WebElement partner_log_in_get_otp_user_field_fourth_number;
	
	@FindBy(xpath="(//*[@class='Login_otpBoxes__P2D4O']/div/input)[5]")
	private WebElement partner_log_in_get_otp_user_field_fifth_number;

	@FindBy(xpath="(//*[@class='Login_otpBoxes__P2D4O']/div/input)[6]")
	private WebElement partner_log_in_get_otp_user_field_sixth_number;

	@FindBy(xpath="//*[@class='Toastify__toast-body']")
	private WebElement partner_log_in_otp_page_wrong_password_pop_up;
	
	/**
	 * 
	 *  
	 *  
	 *  Constructor 
	 *  
	 *  
	 *  
	 *  */
	
	public Partner_log_in_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 *  
	 *  Methods 
	 *  
	 *  
	 *  
	 *  
	 *  */

	
	
	public boolean partner_log_page_get_otp_button_is_clickable(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, partner_log_page_get_otp_button);
		return partner_log_page_get_otp_button.isEnabled();
	}

	public boolean partner_log_in_page_sign_in_to_your_account_title_text_is_displayed() {
		return partner_log_in_page_sign_in_to_your_account_title_text.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_to_manage_your_business_text_is_displayed() {
		return partner_log_in_page_sign_in_to_manage_your_business_text.isDisplayed();
	}

	public boolean partner_log_in_page_left_side_shield_title_text_is_displayed() {
		return partner_log_in_page_left_side_shield_title_text.isDisplayed();
	}

	public boolean partner_log_in_page_left_side_shield_logo_is_displayed() {
		return partner_log_in_page_left_side_shield_logo.isDisplayed();
	}

	public boolean partner_log_in_page_left_side_sign_in_to_your_account_text_is_displayed() {
		return partner_log_in_page_left_side_sign_in_to_your_account_text.isDisplayed();
	}

	public boolean partner_log_in_page_left_side_sign_in_to_manage_your_business_text_displayed() {
		return partner_log_in_page_left_side_sign_in_to_manage_your_business_text.isDisplayed();
	}

	
	
	
	public boolean partner_log_in_page_sign_in_using_email_button_should_be_displayed() {
		return partner_log_in_page_sign_in_using_email_button.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_email_button_should_be_clickable() {
		return partner_log_in_page_sign_in_using_email_button.isEnabled();
	}

	public boolean partner_log_in_page_sign_in_using_email_button_should_be_able_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_log_in_page_sign_in_using_email_button);
		return true;
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_email_title_text_should_be_displayed() {
		return partner_log_in_page_sign_in_using_email_selected_having_email_title_text.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_email_asterisk_should_be_displayed() {
		return partner_log_in_page_sign_in_using_email_selected_having_email_asterisk.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_email_userfield_should_be_displayed() {
		return partner_log_in_page_sign_in_using_email_selected_having_email_userfield.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_email_userfield_should_be_clickable() {
		return partner_log_in_page_sign_in_using_email_selected_having_email_userfield.isEnabled();
	}
	
	public void partner_log_in_page_sign_in_using_email_selected_having_email_userfield_send_text(String str) {
		partner_log_in_page_sign_in_using_email_selected_having_email_userfield.sendKeys(str);
	}
	
	public String partner_log_in_page_sign_in_using_email_selected_having_email_userfield_entered_text(){
		return partner_log_in_page_sign_in_using_email_selected_having_email_userfield.getAttribute("value");
	}

	public String partner_log_in_page_sign_in_using_email_selected_having_email_userfield_placeholder_value() {
		return partner_log_in_page_sign_in_using_email_selected_having_email_userfield.getAttribute("placeholder");
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_displayed() {
		return partner_log_in_page_sign_in_using_email_selected_having_get_otp_button.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_clickable() {
		return partner_log_in_page_sign_in_using_email_selected_having_get_otp_button.isEnabled();
	}
	
	public void partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_clicked() {
		partner_log_in_page_sign_in_using_email_selected_having_get_otp_button.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean partner_log_in_page_sign_in_using_email_selected_having_get_otp_button_should_be_able_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_log_in_page_sign_in_using_email_selected_having_get_otp_button);
		return true;
	}
	
	
	
	
	
	public void partner_log_in_page_sign_in_using_mobile_button_clicked() {
		 partner_log_in_page_sign_in_using_mobile_button.click();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_button_should_be_displayed() {
		return partner_log_in_page_sign_in_using_mobile_button.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_button_should_be_clickable() {
		return partner_log_in_page_sign_in_using_mobile_button.isEnabled();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_button_should_be_able_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_log_in_page_sign_in_using_mobile_button);
		return true;
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_title_text_should_be_displayed() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_title_text.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_asterisk_should_be_displayed() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_asterisk.isDisplayed();
	}
	
	public boolean partner_log_in_page_sign_in_using_mobile_dropdown_should_be_displayed(){
		return partner_log_in_page_sign_in_using_mobile_dropdown.isDisplayed();	
	}
	
	public boolean partner_log_in_page_sign_in_using_mobile_dropdown_should_be_clickable(){
		return partner_log_in_page_sign_in_using_mobile_dropdown.isEnabled();
	}
	
	public void partner_log_in_page_sign_in_using_mobile_dropdown_should_be_click(){
		 partner_log_in_page_sign_in_using_mobile_dropdown.click();
	}
	
	public boolean partner_log_in_page_sign_in_using_mobile_dropdown_list_should_be_clickable(){
		for (WebElement el : partner_log_in_page_sign_in_using_mobile_dropdown_list) {
			System.out.println(el.isEnabled());
			System.out.println(el.isDisplayed());
            }
		return true;
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_should_be_displayed() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_should_be_clickable() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield.isEnabled();
	}

	public String partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_placeholder_value() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield.getAttribute("placeholder");
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_should_be_displayed() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button.isDisplayed();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_should_be_clickable() {
		return partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button.isEnabled();
	}

	public boolean partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_should_be_able_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button);
		return true;
	}

	public boolean partner_log_in_should_get_the_green_tick_in_the_email_user_field_is_displayed() {
		return partner_log_in_should_get_the_green_tick_in_the_email_user_field.isDisplayed();
	}

	public boolean partner_log_in_should_get_the_red_tick_in_the_email_user_field_is_displayed() {
		return partner_log_in_should_get_the_red_tick_in_the_email_user_field.isDisplayed();
	}

	
	public void partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield_send_text(String string) {
		partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield.sendKeys(string);
	}
	
	public String partner_log_in_page_sign_in_using_email_selected_having_mobile_number_userfield_entered_text(){
		return partner_log_in_page_sign_in_using_mobile_selected_having_mobile_number_userfield.getAttribute("value");
	}

	public void partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button_clicked() {
		partner_log_in_page_sign_in_using_mobile_selected_having_get_otp_button.click();
	}
	
	public boolean partner_log_in_should_get_the_green_tick_in_the_mobile_number_user_field_is_displayed(){
		return partner_log_in_should_get_the_green_tick_in_the_mobile_number_user_field.isDisplayed();
	}
	
	public boolean partner_log_in_should_get_the_red_tick_in_the_mobile_number_user_field_is_displayed(){
		return partner_log_in_should_get_the_red_tick_in_the_mobile_number_user_field.isDisplayed();
	}
	
	
	public boolean partner_log_in_get_otp_page_pop_up_user_is_not_active_should_be_displayed(){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, partner_log_in_get_otp_page_pop_up_user_is_not_active);
		return partner_log_in_get_otp_page_pop_up_user_is_not_active.isDisplayed();
	}

	public boolean partner_log_in_pop_up_partner_created_successfully_and_a_verification_mail_has_been_sent_to_you_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, partner_log_in_get_otp_page_pop_up_partner_created_successfully_and_a_verification_mail_has_been_sent_to_you);
		return partner_log_in_get_otp_page_pop_up_partner_created_successfully_and_a_verification_mail_has_been_sent_to_you.isDisplayed();
	}

	public boolean partner_log_in_page_email_verified_successfully_pop_up_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, partner_log_in_page_email_verified_successfully_pop_up);
		return partner_log_in_page_email_verified_successfully_pop_up.isDisplayed();
	}
	
	/*
	 * 
	 * OTP page
	 * 
	 */

	public boolean partner_log_in_otp_page_sign_in_into_your_account_title_text_is_displayed() {
		return partner_log_in_otp_page_sign_in_into_your_account_title_text.isDisplayed();
	}

	public boolean partner_log_in_otp_page_sign_in_into_manage_your_business_text_is_displayed() {
		return partner_log_in_otp_page_sign_in_into_manage_your_business_text.isDisplayed();
	}

	public boolean partner_log_in_otp_page_please_enter_six_digit_otp_sent_to_your_text_is_displayed() {
		return partner_log_in_otp_page_please_enter_six_digit_otp_sent_to_your_text.isDisplayed();
	}

	public boolean partner_log_in_otp_page_left_side_shield_title_text_is_displayed() {
		return partner_log_in_otp_page_left_side_shield_title_text.isDisplayed();
	}

	public boolean partner_log_in_otp_page_left_side_shield_logo_is_displayed() {
		return partner_log_in_otp_page_left_side_shield_logo.isDisplayed();
	}

	public boolean partner_log_in_otp_page_left_side_sign_in_into_your_account_text_is_displayed() {
		return partner_log_in_otp_page_left_side_sign_in_into_your_account_text.isDisplayed();
	}

	public boolean partner_log_in_otp_page_left_side_sign_in_into_manage_your_business_text_is_displayed() {
		return partner_log_in_otp_page_left_side_sign_in_into_manage_your_business_text.isDisplayed();
	}

	public int partner_log_in_otp_page_otp_user_fields_counts_is() {
		int i=partner_log_in_otp_page_otp_user_fields.size();
		return i;
	}

	public String partner_log_in_otp_page_otp_user_field_placeholder_value() {
		//return partner_log_in_otp_page_otp_user_field_placeholder_value.getText();
		for (WebElement els : partner_log_in_otp_page_otp_user_field_placeholder_value) {
            String tr=els.getText();
            if (tr.contains("●")) {
                System.out.println("6 times");
                return tr;
            }
        }
		return null;
}

	public boolean partner_log_in_otp_page_otp_user_fields_is_clickable() {
		 for (WebElement els : partner_log_in_otp_page_otp_user_fields) {
	            boolean text = els.isEnabled();
	            if (text) {
	                System.out.println("True");
	            }
	            else {
	            	System.out.println("False");
	            }
	        }
		return true;
	}

	public boolean partner_log_in_otp_page_verify_otp_button_is_displayed() {
		return partner_log_in_otp_page_verify_otp_button.isDisplayed();
	}

	public boolean partner_log_in_otp_page_verify_otp_button_is_clickable() {
		return partner_log_in_otp_page_verify_otp_button.isEnabled();
	}

	public boolean partner_log_in_otp_page_verify_otp_button_is_able_to_mouse() {
		ElementUtil.eu.mouseHover(driver, partner_log_in_otp_page_verify_otp_button);
		return true;
	}

	
	
	
	public void switch_to_parent_window() {
	    String parentWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String windowHandle : windowHandles) {
	        if (!windowHandle.equals(parentWindowHandle)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	}
	
	
	
	
	public void partner_log_in_otp_page_otp_user_fields_pasted_otp_into_user_fields(String actual) {
	
	    char first_number=actual.charAt(0);
	    System.out.println(first_number);
	    char second_number=actual.charAt(1);
	    System.out.println(second_number);
	    char third_number=actual.charAt(2);
	    System.out.println(third_number);
	    char fourth_number=actual.charAt(3);
	    System.out.println(fourth_number);
	    char fifth_number=actual.charAt(4);
	    System.out.println(fifth_number);
	    char sixth_number=actual.charAt(5);
	    System.out.println(sixth_number);
		
  	    
	    Actions a=new Actions(driver);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  
	    a.doubleClick(partner_log_in_get_otp_user_field_first_number);
	  
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    partner_log_in_get_otp_user_field_first_number.sendKeys(String.valueOf(first_number));
	    partner_log_in_get_otp_user_field_second_number.sendKeys(String.valueOf(second_number));
	    partner_log_in_get_otp_user_field_third_number.sendKeys(String.valueOf(third_number));
	    partner_log_in_get_otp_user_field_fourth_number.sendKeys(String.valueOf(fourth_number));
	    partner_log_in_get_otp_user_field_fifth_number.sendKeys(String.valueOf(fifth_number));
	    partner_log_in_get_otp_user_field_sixth_number.sendKeys(String.valueOf(sixth_number));
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	    

	    

	}

	public void partner_log_in_otp_page_verify_otp_is_clicked() {
	    partner_log_in_otp_page_verify_otp_button.click();
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean partner_log_in_otp_page_wrong_password_pop_up_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, partner_log_in_otp_page_wrong_password_pop_up);
		return partner_log_in_otp_page_wrong_password_pop_up.isDisplayed();
	}
	
	
	
	
	
	
}
