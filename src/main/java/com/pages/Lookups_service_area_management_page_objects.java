package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_area_management_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement service_area_management_title_text;
	
	@FindBy(xpath="//*[text()='Create Service Area']")
	private WebElement create_service_area_button;
	
	@FindBy(xpath= "//*[@class='show dropdown']/a")
	private WebElement first_user_kebab_menu;
	
	@FindBy(xpath= "//*[@class='show dropdown']/ul/li[1]")
	private WebElement first_user_kebab_menu_edit_button;
	
	@FindBy(xpath= "//*[@class='show dropdown']/ul/li[2]")
	private WebElement first_user_kebab_menu_change_status_buttton;
	
	@FindBy(xpath= "//*[@class='show dropdown']/ul/li[3]")
	private WebElement first_user_kebab_menu_delete_button;
	

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_service_area_management_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean service_area_management_title_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, service_area_management_title_text);
		return service_area_management_title_text.isDisplayed();
	}

	public boolean create_service_category_button_should_be_clickable(){
		return create_service_area_button.isEnabled();
	}
	
	public void create_service_area_button_is_click(){
		create_service_area_button.click();
	}
	
	public void kebab_menu_is_clicked() {
		first_user_kebab_menu.click();
	}
	
	public void kebab_menu_edit_is_clicked() {
		first_user_kebab_menu_edit_button.click();
	}
	
	public void first_user_kebab_menu_change_status_buttton_is_clicked(){
		first_user_kebab_menu_change_status_buttton.click();
	}
	
	public void kebab_menu_delete_is_clicked() {
		first_user_kebab_menu_delete_button.click();
	}
	
}
