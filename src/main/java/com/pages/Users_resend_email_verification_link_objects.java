package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_resend_email_verification_link_objects {

private WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Email verification link sent successfully']")
	private WebElement super_admin_dashboard_all_users_actions_options_resend_email_verification_link_pop_up_success;

	@FindBy(xpath="//div[text()='User not found by given id']")
	private WebElement super_admin_dashboard_all_users_actions_options_resend_email_verification_link_pop_up_unsuccessfull;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Users_resend_email_verification_link_objects (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean super_admin_dashboard_all_users_actions_options_resend_email_verification_link_successfully_sent_pop_up_is_displayed(){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_dashboard_all_users_actions_options_resend_email_verification_link_pop_up_success);
		return super_admin_dashboard_all_users_actions_options_resend_email_verification_link_pop_up_success.isDisplayed();
	}
	
	public boolean super_admin_dashboard_all_users_actions_options_resend_email_verification_link_successfully_sent_pop_up_is_not_displayed(){
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, super_admin_dashboard_all_users_actions_options_resend_email_verification_link_pop_up_unsuccessfull);
		return super_admin_dashboard_all_users_actions_options_resend_email_verification_link_pop_up_unsuccessfull.isDisplayed();
	}
	
	
}
