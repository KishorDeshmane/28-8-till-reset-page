package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_change_status_pop_up_objects {
	private WebDriver driver;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * change_status
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//*[@class='modal-content']")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up;

	@FindBy(xpath = "(//*[@class='modal-title h4'])[1]")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up_title_change_status_of_the_user;

	@FindBy(xpath = "//*[@aria-label='Close']")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button;

	@FindBy(xpath = "//*[@type='checkbox' and @id='active']")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button;

	@FindBy(xpath = "//*[@class='Users_statusField__FDFPd col']/span")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_side_text;

	@FindBy(xpath = "//*[@type='button' and text()='Submit']")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button;

	@FindBy(xpath = "//*[@type='button' and text()='Close']")
	private WebElement super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button;

	@FindBy(xpath = "(//table[tbody[tr/td[text()='Ashish']]]/tbody/tr/td/span[text()='Active'])[1]")
	private WebElement status_of_the_selected_first_user;
	
	@FindBy(xpath = "(//table[tbody[tr/td[text()='Ashish']]]/tbody/tr/td/span/span[@class='dot-label bg-success me-1- 300'])[1]")
	private WebElement super_admin_users_all_users_actions_user_status_active;
	
	@FindBy(xpath = "(//table[tbody[tr/td[text()='Ashish']]]/tbody/tr/td/span/span[@class='dot-label bg-danger me-1- 300'])[1]")
	private WebElement super_admin_users_all_users_actions_user_status_inactive;

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Users_change_status_pop_up_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * Change status
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_is_displayed(){
		return super_admin_logger_all_user_actions_options_change_status_button_pop_up.isDisplayed();
	}
	
	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_title_change_status_of_the_user_is_displayed() {
		return super_admin_logger_all_user_actions_options_change_status_button_pop_up_title_change_status_of_the_user.isDisplayed();
	}

	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button_is_clickable() {
		return super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button.isEnabled();
	}
	
	public void super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button_is_click() {
		 super_admin_logger_all_user_actions_options_change_status_button_pop_up_cross_button.click();
	}

	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_clickable() {
		return super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button.isEnabled();
	}

	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_side_text_is_displayed() {
		return super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_side_text.isDisplayed();
	}

	public void super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.clickByJS(driver, super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button);
		//super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button_is_click_two_times() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.doubleClick(driver, super_admin_logger_all_user_actions_options_change_status_button_pop_up_switch_button);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_is_click() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.clickByJS(driver, super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button_is_click() {
		super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button.click();	
	}

	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button_mouse_hover_is_possible() {
		ElementUtil.eu.mouseHover(driver, super_admin_logger_all_user_actions_options_change_status_button_pop_up_submit_button);
		return true;
	}
	
	public boolean super_admin_users_all_users_actions_user_status_is_changed(){
		System.out.println("status of the user is : "+status_of_the_selected_first_user.getText());
		if(super_admin_users_all_users_actions_user_status_active.isDisplayed()) {
			return super_admin_users_all_users_actions_user_status_active.isDisplayed();
		}
		else if (super_admin_users_all_users_actions_user_status_inactive.isDisplayed()) {
			return super_admin_users_all_users_actions_user_status_inactive.isDisplayed();
		}
		return true;
	}

	public boolean super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button_mouse_hover_is_possible() {
		ElementUtil.eu.mouseHover(driver, super_admin_logger_all_user_actions_options_change_status_button_pop_up_cancel_button);
		return true;
	}
	
}
