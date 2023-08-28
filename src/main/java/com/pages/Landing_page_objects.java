package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Landing_page_objects {
	private WebDriver driver;

	/* 
	 * 
	 * Log in button
	 * 
	 */
	
	@FindBy(xpath = "//*[@id='dropdown-variants-info-one']")
	private WebElement log_in_button;
	
	@FindBy(xpath = "(//*[text()='Login as Administrator'])[2]")
	private WebElement log_in_button_log_in_as_administrator;

	@FindBy(xpath = "//*[text()='Login as Partner']")
	private WebElement log_in_button_log_in_as_partner;
	
	/*
	 * 
	 * Register page
	 * 
	 */
	
	@FindBy(xpath = "(//*[text()='Register as Partner'])[2]")
	private WebElement register_as_partner_button;
	
	@FindBy(xpath = "//*[text()='Home']")
	private WebElement home_button;
	
	/* 
	 * 
	 * Constructor 
	 * 
	 */

	public Landing_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 *  Methods 
	 *  
	 */

	public boolean landing_page_log_in_button_is_displayed() {
		return log_in_button.isDisplayed();
	}

	public boolean landing_page_log_in_button_clickable() {
		return log_in_button.isEnabled();
	}
	
	public boolean landing_page_log_in_button_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, log_in_button);
		return true;
	}
	
	public void landing_page_log_in_button_is_clicked() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, log_in_button);
		log_in_button.click();
	}
	
	public boolean landing_page_log_in_as_administator_button_is_clickable() {
		return log_in_button_log_in_as_administrator.isEnabled();
	}
	
	public boolean landing_page_log_in_as_partner_button_is_clickable() {
		return log_in_button_log_in_as_partner.isEnabled();
	}
	
	public void landing_page_home_button_is_clicked() {
		home_button.click();
	}
	
	public void landing_page_log_in_as_administrator_is_clicked() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, log_in_button_log_in_as_administrator);
		log_in_button_log_in_as_administrator.click();
	}
	
	public void landing_page_log_in_as_partner_button_is_clicked() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, log_in_button_log_in_as_partner);
		log_in_button_log_in_as_partner.click();
	}
	
	public void user_log_in_to_super_admin_page () {
		landing_page_log_in_button_mouse_hover();
		landing_page_log_in_button_is_clicked();
		landing_page_log_in_as_administrator_is_clicked();
	}
	
	public void user_log_in_to_admin_page () {
		landing_page_log_in_button_mouse_hover();
		landing_page_log_in_button_is_clicked();
		landing_page_log_in_as_administrator_is_clicked();
	}
	
	public void user_log_in_to_partner_page (){
		landing_page_log_in_button_mouse_hover();
		landing_page_log_in_button_is_clicked();
		landing_page_log_in_as_partner_button_is_clicked();
	}
	
	public void landing_page_register_as_partner_button_is_click() {
		register_as_partner_button.click();
	}
	
	public boolean landing_page_register_as_partner_button_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, register_as_partner_button);
		return true;
	}
	
	public boolean landing_page_register_as_partner_button_is_clickable(){
		return register_as_partner_button.isEnabled();
	}

	public boolean landing_page_register_as_partner_button_is_displayed() {
		return register_as_partner_button.isDisplayed();
	}
	
}
