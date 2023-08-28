package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Partner_dashboard_page_objects {
private WebDriver driver;


	@FindBy(xpath = "//*[@class='main-logo']/span")
	private WebElement partner_dashboard_header_shield_main_logo;

	@FindBy(xpath = "//*[@class=' main-header-notification dropdown']/a/i")
	private WebElement partner_dashboard_header_notification_bell_icon;

	@FindBy(xpath = "//*[@class=' main-header-notification dropdown']/a/span")
	private WebElement partner_dashboard_header_notification_bell_icon_should_have_count;

	@FindBy(xpath = "(//p[@class='main-notification-text'])[1]")
	private WebElement partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text;

	@FindBy(xpath = "(//p[@class='main-notification-text'])/a")
	private WebElement partner_dashboard_header_notification_bell_icon_having_view_all_button;

	@FindBy(xpath = "//*[@class='dropdown-footer']/a")
	private WebElement partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button;

	@FindBy(xpath = "//*[@class='main-img-user']/img")
	private WebElement partner_dashboard_header_profile_dropdown;

	@FindBy(xpath = "//*[@class='main-notification-title']")
	private WebElement partner_dashboard_header_profile_dropdown_icon_having_text_of_the_user;

	@FindBy(xpath = "(//p[@class='main-notification-text'])[2]")
	private WebElement partner_dashboard_header_profile_dropdown_is_have_role;

	@FindBy(xpath = "//p[@class='main-notification-text small']")
	private WebElement partner_dashboard_header_profile_dropdown_is_have_last_log_in_date_and_time;

	@FindBy(xpath = "//*[@class='border-top dropdown-item']/a")
	private WebElement partner_dashboard_header_profile_dropdown_have_my_profile_button;

	@FindBy(xpath="(//*[@class='dropdown-item']/a)[1]")
	private WebElement partner_dashboard_header_profile_dropdown_have_change_password_button;
	
	@FindBy(xpath = "(//*[@class='dropdown-item']/a)[2]")
	private WebElement partner_dashboard_header_profile_dropdown_have_sign_out_button;

	@FindBy(xpath="//*[text()='Dashboard']")
	private WebElement partner_dashboard_dashboard_button;
	
	@FindBy(xpath="//*[text()='My Applications']")
	private WebElement partner_dashboard_my_applications_button;
	
	@FindBy(xpath = "//*[text()='Welcome To Dashboard']")
	private WebElement partner_dashboard_mid_welcome_to_dashboard_text;

	@FindBy(xpath = "//*[text()='Track your application']")
	private WebElement partner_dashboard_mid_track_your_application;

	@FindBy(xpath = "//*[text()='Fill out the application and submit the documents for verification']")
	private WebElement partner_dashboard_mid_fill_out_the_application_and_submit_the_documents_for_verification_text;

	@FindBy(xpath = "//*[text()='Get Started']")
	private WebElement partner_dashboard_mid_get_started_button;

	@FindBy(xpath = "//*[@alt='user-img']")
	private WebElement partner_dashboard_mid_card_body_image;

	@FindBy(xpath = "//*[@class='font-weight-bold text-white ']")
	private WebElement partner_dashboard_mid_card_body_user_name;

	@FindBy(xpath = "//*[@class='tx-white-7 mb-1']")
	private WebElement partner_dashboard_mid_card_body_subtitle_line;

	@FindBy(xpath = "//*[@class='tx-white-7 mb-1']/b")
	private WebElement partner_dashboard_mid_card_body_subtitle_line_percentage;

	@FindBy(xpath = "//*[@id='back-to-top']")
	private WebElement partner_dashboard_mid_back_to_top_arrow;

	@FindBy(xpath = "//*[@class='col-md-12']/span")
	private WebElement partner_dashboard_footer_line_text;

	@FindBy(xpath = "(//*[@class='col-md-12']/span/a)[1]")
	private WebElement partner_dashboard_footer_shield_link;

	@FindBy(xpath = "(//*[@class='col-md-12']/span/a)[2]")
	private WebElement partner_dashboard_footer_iffort_link;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Partner_dashboard_page_objects(WebDriver driver) {
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
	 * 
	 * 
	 */


	public boolean partner_dashboard_header_shield_main_logo_is_displayed() {
		return partner_dashboard_header_shield_main_logo.isDisplayed();
	}

	public boolean partner_dashboard_header_shield_main_logo_is_clickable() {
		return partner_dashboard_header_shield_main_logo.isEnabled();
	}
	
	public void partner_dashboard_header_shield_main_logo_is_click() {
		partner_dashboard_header_shield_main_logo.click();
	}
	
	public boolean partner_dashboard_header_notification_bell_icon_is_displayed() {
		return partner_dashboard_header_notification_bell_icon.isDisplayed();
	}

	public boolean partner_dashboard_header_notification_bell_icon_is_clickable() {
		return partner_dashboard_header_notification_bell_icon.isEnabled();
	}

	public boolean partner_dashboard_header_notification_bell_icon_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_header_notification_bell_icon);
		return true;
	}

	public boolean partner_dashboard_header_notification_bell_icon_should_have_count_displayed_over_bell() {
		return partner_dashboard_header_notification_bell_icon_should_have_count.isDisplayed();
	}

	public void partner_dashboard_header_notification_bell_icon_is_click() {
		partner_dashboard_header_notification_bell_icon.click();
	}

	public boolean partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text_is_displayed() {
		return partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text.isDisplayed();
	}

	public boolean partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text_is_clickable() {
		return partner_dashboard_header_notification_bell_icon_having_you_have_dot_notifications_text.isEnabled();
	}

	public boolean partner_dashboard_header_notification_bell_icon_having_view_all_button_is_displayed() {
		return partner_dashboard_header_notification_bell_icon_having_view_all_button.isDisplayed();
	}

	public boolean partner_dashboard_header_notification_bell_icon_having_view_all_button_is_clickable() {
		return partner_dashboard_header_notification_bell_icon_having_view_all_button.isEnabled();
	}

	public void partner_dashboard_header_notification_bell_icon_having_view_all_button_is_click() {
		 partner_dashboard_header_notification_bell_icon_having_view_all_button.click();
	}
	
	public boolean partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_displayed() {
		return partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button.isDisplayed();
	}

	public boolean partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_clickable() {
		return partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button.isEnabled();
	}
	
	public void partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button_is_click() {
		partner_dashboard_header_notification_bell_icon_having_view_all_notifications_button.click();
	}

	public boolean partner_dashboard_header_profile_dropdown_is_displayed() {
		return partner_dashboard_header_profile_dropdown.isDisplayed();
	}

	public void partner_dashboard_header_profile_dropdown_is_click() {
		partner_dashboard_header_profile_dropdown.click();
	}

	public boolean partner_dashboard_header_profile_dropdown_is_clickable() {
		return partner_dashboard_header_profile_dropdown.isEnabled();
	}

	public boolean partner_dashboard_header_profile_dropdown_icon_having_text_of_the_user_is_displayed() {
		return partner_dashboard_header_profile_dropdown_icon_having_text_of_the_user.isDisplayed();
	}

	public boolean partner_dashboard_header_profile_dropdown_is_have_role_is_displayed() {
		return partner_dashboard_header_profile_dropdown_is_have_role.isDisplayed();
	}

	public boolean partner_dashboard_header_profile_dropdown_is_have_last_log_in_date_and_time_is_displayed() {
		return partner_dashboard_header_profile_dropdown_is_have_last_log_in_date_and_time.isDisplayed();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_my_profile_button_is_displayed() {
		return partner_dashboard_header_profile_dropdown_have_my_profile_button.isDisplayed();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_my_profile_button_is_clickable() {
		return partner_dashboard_header_profile_dropdown_have_my_profile_button.isEnabled();
	}
	
	public void partner_dashboard_header_profile_dropdown_have_my_profile_button_is_click() {
		partner_dashboard_header_profile_dropdown_have_my_profile_button.click();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_my_profile_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_header_profile_dropdown_have_my_profile_button);
		return true;
	}

	public boolean partner_dashboard_header_profile_dropdown_have_change_password_button_is_displayed() {
		return partner_dashboard_header_profile_dropdown_have_change_password_button.isDisplayed();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_change_password_button_is_clickable() {
		return partner_dashboard_header_profile_dropdown_have_change_password_button.isEnabled();
	}
	
	public void partner_dashboard_header_profile_dropdown_have_change_password_button_is_click() {
		partner_dashboard_header_profile_dropdown_have_change_password_button.click();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_change_password_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_header_profile_dropdown_have_change_password_button);
		return true;
	}

	public boolean partner_dashboard_header_profile_dropdown_have_sign_out_button_is_displayed() {
		return partner_dashboard_header_profile_dropdown_have_sign_out_button.isDisplayed();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_sign_out_button_is_clickable() {
		return partner_dashboard_header_profile_dropdown_have_sign_out_button.isEnabled();
	}
	
	public void partner_dashboard_header_profile_dropdown_have_sign_out_button_is_click() {
		partner_dashboard_header_profile_dropdown_have_sign_out_button.click();
	}

	public boolean partner_dashboard_header_profile_dropdown_have_sign_out_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_header_profile_dropdown_have_sign_out_button);
		return true;
	}
	
	public boolean partner_dashboard_dashboard_button_is_displayed() {
		return partner_dashboard_dashboard_button.isDisplayed();
	}

	public boolean partner_dashboard_dashboard_button_is_clickable() {
		return partner_dashboard_dashboard_button.isEnabled();
	}
	
	public boolean partner_dashboard_dashboard_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_dashboard_button);
		return true;
	}
	
	public boolean partner_dashboard_my_application_button_is_displayed() {
		return partner_dashboard_my_applications_button.isDisplayed();
	}

	public boolean partner_dashboard_my_applications_button_is_clickable() {
		return partner_dashboard_my_applications_button.isEnabled();
	}
	
	public void partner_dashboard_my_applications_button_is_click() {
		partner_dashboard_my_applications_button.click();
	}
	
	public boolean partner_dashboard_my_applications_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_my_applications_button);
		return true;
	}

	public boolean partner_dashboard_mid_welcome_to_dashboard_text_is_displayed() {
		return partner_dashboard_mid_welcome_to_dashboard_text.isDisplayed();
	}

	public boolean partner_dashboard_mid_track_your_application_is_displayed() {
		return partner_dashboard_mid_track_your_application.isDisplayed();
	}

	public boolean partner_dashboard_mid_track_your_application_is_clickable() {
		return partner_dashboard_mid_track_your_application.isEnabled();
	}

	public boolean partner_dashboard_mid_track_your_application_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_mid_track_your_application);
		return true;
	}

	public boolean partner_dashboard_mid_fill_out_the_application_and_submit_the_documents_for_verification_text_is_displayed() {
		return partner_dashboard_mid_fill_out_the_application_and_submit_the_documents_for_verification_text.isDisplayed();
	}

	public boolean partner_dashboard_mid_get_started_button_is_displayed() {
		return partner_dashboard_mid_get_started_button.isDisplayed();
	}

	public boolean partner_dashboard_mid_get_started_button_is_clickable() {
		return partner_dashboard_mid_get_started_button.isEnabled();
	}
	
	public void partner_dashboard_mid_get_started_button_is_click() {
		 partner_dashboard_mid_get_started_button.click();
	}

	public boolean partner_dashboard_mid_get_started_button_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_mid_get_started_button);
		return true;
	}

	public boolean partner_dashboard_mid_card_body_image_is_displayed() {
		return partner_dashboard_mid_card_body_image.isDisplayed();
	}

	public boolean partner_dashboard_mid_card_body_user_name_is_displayed() {
		return partner_dashboard_mid_card_body_user_name.isDisplayed();
	}

	public boolean partner_dashboard_mid_card_body_subtitle_line_is_displayed() {
		return partner_dashboard_mid_card_body_subtitle_line.isDisplayed();
	}

	public boolean partner_dashboard_mid_card_body_subtitle_line_percentage_is_displayed() {
		return partner_dashboard_mid_card_body_subtitle_line_percentage.isDisplayed();
	}

	public boolean partner_dashboard_mid_back_to_top_arrow_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, partner_dashboard_mid_back_to_top_arrow);
		return partner_dashboard_mid_back_to_top_arrow.isDisplayed();
	}

	public boolean partner_dashboard_mid_back_to_top_arrow_is_clickable() {
		return partner_dashboard_mid_back_to_top_arrow.isEnabled();
	}

	public boolean partner_dashboard_mid_back_to_top_arrow_is_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, partner_dashboard_mid_back_to_top_arrow);
		return true;
	}

	public boolean partner_dashboard_footer_line_text_is_displayed() {
		return partner_dashboard_footer_line_text.isDisplayed();
	}

	public boolean partner_dashboard_footer_shield_link_is_displayed() {
		return partner_dashboard_footer_shield_link.isDisplayed();
	}

	public boolean partner_dashboard_footer_shield_link_is_clickable() {
		return partner_dashboard_footer_shield_link.isEnabled();
	}

	public boolean partner_dashboard_footer_iffort_link_is_displayed() {
		return partner_dashboard_footer_iffort_link.isDisplayed();
	}

	public boolean partner_dashboard_footer_iffort_link_is_clickable() {
		return partner_dashboard_footer_iffort_link.isEnabled();
	}


}
