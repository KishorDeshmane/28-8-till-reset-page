package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_category_management_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[text()='Create Service Category']")
	private WebElement super_admin_logger_masters_create_service_category;

	@FindBy(xpath = "//*[text()='Service Category Management']")
	private WebElement super_admin_logger_service_category_management_title_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement super_admin_logger_service_category_management_breadcrumb;

	@FindBy(xpath = "//*[@class='breadcrumb']/li[1]")
	private WebElement super_admin_user_dashboard_button_in_breadcrumb;

	@FindBy(xpath = "//*[@class='breadcrumb']/li[2]")
	private WebElement super_admin_user_service_category_text_in_breadcrumb;

	@FindBy(xpath = "//*[@placeholder='Search by name...']")
	private WebElement super_admin_logger_masters_search_user_field;

	@FindBy(xpath = "//*[@class='input-group']/button/i")
	private WebElement super_admin_logger_masters_search_search_icon;

	@FindBy(xpath = "//*[text()='Name']")
	private WebElement super_admin_user_column_name_name_text;

	@FindBy(xpath = "//*[text()='Name']/following-sibling::i")
	private WebElement super_admin_user_column_name_name_asc_desc_button;

	@FindBy(xpath="//*[text()='Parent category']")
	private WebElement super_admin_user_column_name_parent_category_text;
	
	@FindBy(xpath = "//*[text()='Status']")
	private WebElement super_admin_user_column_name_status_text;

	@FindBy(xpath = "//*[text()='Status']/following-sibling::i")
	private WebElement super_admin_user_column_name_status_asc_desc_button;

	@FindBy(xpath = "//*[text()='Actions']")
	private WebElement super_admin_user_column_name_action_text;

	@FindBy(xpath = "//*[@alt='avatar']")
	private WebElement super_admin_user_column_name_list_having_the_default_image;

	@FindBy(xpath = "//tbody/tr/td[2]")
	private WebElement super_admin_user_column_name_of_the_first_service_category_name;

	@FindBy(xpath = "//tbody/tr/td[3]/span")
	private WebElement super_admin_user_column_parent_category_text_of_the_first_category;

	@FindBy(xpath = "//tbody/tr/td[4]/span")
	private WebElement super_admin_user_column_status_of_the_first_category;

	@FindBy(xpath = "//tbody/tr/td[5]/div/a/i")
	private WebElement super_admin_user_column_kebab_menu_of_the_first_category;

	@FindBy(xpath = "//tbody/tr/td[5]/div/ul/li[1]")
	private WebElement super_admin_user_column_kebab_menu_of_the_first_category_edit_button;

	@FindBy(xpath = "//tbody/tr/td[5]/div/ul/li[2]")
	private WebElement super_admin_user_column_kebab_menu_of_the_first_category_change_status;

	@FindBy(xpath = "//tbody/tr/td[5]/div/ul/li[3]")
	private WebElement super_admin_user_column_kebab_menu_of_the_first_category_delete_button;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_service_category_management_page_objects(WebDriver driver) {
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
	
	public void super_admin_logger_create_service_category_is_clicked() {
		super_admin_logger_masters_create_service_category.click();
	}

	public boolean super_admin_user_should_be_displayed_service_category_management_title_text() {
		return super_admin_logger_service_category_management_title_text.isDisplayed();
	}

	public boolean super_admin_user_should_be_displayed_the_breadcrumb() {
		return super_admin_logger_service_category_management_breadcrumb.isDisplayed();
	}

	public boolean super_admin_user_should_be_displayed_the_dashboard_button_in_breadcrumb() {
		return super_admin_user_dashboard_button_in_breadcrumb.isDisplayed();
	}

	public boolean super_admin_user_should_be_clickable_the_dashboard_button_in_breadcrumb() {
		return super_admin_user_dashboard_button_in_breadcrumb.isEnabled();
	}

	public boolean super_admin_user_should_be_displayed_the_service_category_text_from_breadcrumb() {
		return super_admin_user_service_category_text_in_breadcrumb.isDisplayed();
	}

	public boolean super_admin_user_should_be_displayed_the_button_create_service_category() {
		return super_admin_logger_masters_create_service_category.isDisplayed();
	}

	public boolean super_admin_user_should_be_clickable_the_button_create_service_category() {
		return super_admin_logger_masters_create_service_category.isEnabled();
	}

	public boolean super_admin_user_should_be_mouse_hover_the_button_create_service_category() {
		ElementUtil.eu.mouseHover(driver, super_admin_logger_masters_create_service_category);
		return true;
	}

	public boolean super_admin_user_should_be_displayed_in_the_search_user_field() {
		return super_admin_logger_masters_search_user_field.isDisplayed();
	}

	public boolean super_admin_user_should_be_clickable_in_the_user_field() {
		return super_admin_logger_masters_search_user_field.isEnabled();
	}

	public String super_admin_user_should_serach_userfield_placeholder_value() {
		return super_admin_logger_masters_search_user_field.getAttribute("placeholder");
	}

	public boolean super_admin_user_should_be_displayed_the_search_icon() {
		return super_admin_logger_masters_search_search_icon.isDisplayed();
	}

	public boolean super_admin_user_should_be_clickable_the_serach_icon() {
		return super_admin_logger_masters_search_search_icon.isEnabled();
	}

	public boolean super_admin_user_column_name_name_text_should_be_displayed() {
		return super_admin_user_column_name_name_text.isDisplayed();
	}

	public boolean super_admin_user_column_name_name_asc_desc_button_should_be_clickable() {
		return super_admin_user_column_name_name_asc_desc_button.isEnabled();
	}

	public boolean super_admin_user_column_name_name_asc_desc_button_should_be_displayed() {
		return super_admin_user_column_name_name_asc_desc_button.isDisplayed();
	}
	public boolean super_admin_user_column_name_parent_category_text_is_displayed(){
		return super_admin_user_column_name_parent_category_text.isDisplayed();
	}

	public boolean super_admin_user_column_name_status_text_should_be_displayed() {
		return super_admin_user_column_name_status_text.isDisplayed();
	}

	public boolean super_admin_user_column_name_status_asc_desc_button_is_displayed() {
		return super_admin_user_column_name_status_asc_desc_button.isDisplayed();
	}

	public boolean super_admin_user_column_name_status_asc_desc_button_is_clickable() {
		return super_admin_user_column_name_status_asc_desc_button.isEnabled();
	}

	public boolean super_admin_user_column_name_action_text_is_displayed() {
		return super_admin_user_column_name_action_text.isDisplayed();
	}

	public boolean super_admin_user_column_name_list_having_the_default_image_is_displayed() {
		return super_admin_user_column_name_list_having_the_default_image.isDisplayed();
	}

	public boolean super_admin_user_column_name_of_the_first_service_category_name_is_displayed() {
		return super_admin_user_column_name_of_the_first_service_category_name.isDisplayed();
	}

	public boolean super_admin_user_column_parent_category_text_of_the_first_category_should_be_displayed() {
		return super_admin_user_column_parent_category_text_of_the_first_category.isDisplayed();
	}

	public boolean super_admin_user_column_status_of_the_first_category_should_be_displayed() {
		return super_admin_user_column_status_of_the_first_category.isDisplayed();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_be_displayed() {
		return super_admin_user_column_kebab_menu_of_the_first_category.isDisplayed();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_be_clickable() {
		return super_admin_user_column_kebab_menu_of_the_first_category.isEnabled();
	}
	
	public void super_admin_user_column_kebab_menu_is_clicked(){
		super_admin_user_column_kebab_menu_of_the_first_category.click();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_displayed_the_edit_button() {
		return super_admin_user_column_kebab_menu_of_the_first_category_edit_button.isDisplayed();
	}
	
	public void super_admin_user_column_kebab_menu_edit_button_is_clicked(){
		super_admin_user_column_kebab_menu_of_the_first_category_edit_button.click();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_clickbale_the_edit_button() {
		return super_admin_user_column_kebab_menu_of_the_first_category_edit_button.isEnabled();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, super_admin_user_column_kebab_menu_of_the_first_category_edit_button);
		return true;
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_displayed_the_change_status_button() {
		return super_admin_user_column_kebab_menu_of_the_first_category_change_status.isDisplayed();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_clickable_the_change_status_button() {
		return super_admin_user_column_kebab_menu_of_the_first_category_change_status.isEnabled();
	}

	public void super_admin_user_column_kebab_menu_change_status_button_is_clicked() {
		super_admin_user_column_kebab_menu_of_the_first_category_change_status.click();
	}
	
	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_be_able_to_mouse_hover_on_change_status() {
		ElementUtil.eu.mouseHover(driver, super_admin_user_column_kebab_menu_of_the_first_category_change_status );
		return true;
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_be_displayed_the_delete_button() {
		return super_admin_user_column_kebab_menu_of_the_first_category_delete_button.isDisplayed();
	}

	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_be_clickable_the_delete_button() {
		return super_admin_user_column_kebab_menu_of_the_first_category_delete_button.isEnabled();
	}

	public void super_admin_user_column_kebab_menu_delete_button_is_clicked(){
		super_admin_user_column_kebab_menu_of_the_first_category_delete_button.click();
	}
	
	public boolean super_admin_user_column_kebab_menu_of_the_first_category_should_be_able_to_mouse_hover_on_delete_button() {
		ElementUtil.eu.mouseHover(driver, super_admin_user_column_kebab_menu_of_the_first_category_delete_button);
		return true;
	}

}
