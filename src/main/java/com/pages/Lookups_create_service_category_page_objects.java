package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_create_service_category_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[@class='main-content-title tx-24 mg-b-5']")
	private WebElement create_service_category_tilte_text_of_the_page;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement create_service_category_breadcrumb;

	@FindBy(xpath = "//ol/li/a[text()='Service Category']")
	private WebElement service_category_breadcrumb_button;

	@FindBy(xpath = "//*[@class='breadcrumb-item active']")
	private WebElement create_service_category_in_breadcrumb;

	@FindBy(xpath = "//*[text()='Service category name']")
	private WebElement service_category_name_title_text_above_the_user_field;

	@FindBy(xpath = "//*[@name='category_name']")
	private WebElement service_category_name_user_field;

	@FindBy(xpath = "//*[text()='Service icon']")
	private WebElement service_category_service_icon_title_above_user_field;

	@FindBy(xpath = "//*[text()='Service icon']/small")
	private WebElement service_category_service_icon_text_line;

	@FindBy(xpath = "//*[@placeholder='Enter your user image URL']")
	private WebElement service_category_service_icon_user_field_placeholder;

	@FindBy(xpath = "//*[text()='Parent category']")
	private WebElement parent_category_above_the_dropdown_title_text;

	@FindBy(xpath = "//*[@name='parent_category']")
	private WebElement parent_category_dropdown;

	@FindBy(xpath = "//*[@name='parent_category']/option[1]")
	private WebElement parent_category_dropdown_selected_value;

	@FindBy(xpath = "//*[@name='parent_category']/option")
	private List<WebElement> parent_category_dropdown_list;

	@FindBy(xpath = "//*[text()='Status']")
	private WebElement status_of_the_category_title_above_dropdown;

	@FindBy(xpath = "//*[@name='current_status']")
	private WebElement status_dropdown;

	@FindBy(xpath = "//*[@name='current_status']/option[1]")
	private WebElement status_dropdown_selected_value;

	@FindBy(xpath = "//*[@name='current_status']/option")
	private List<WebElement> staus_dropdown_list;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submit_button;

	@FindBy(xpath = "//*[text()='Cancel']")
	private WebElement cancel_button;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_create_service_category_page_objects(WebDriver driver) {
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

	public boolean create_service_category_tilte_text_of_the_page_should_displayed() {
		return create_service_category_tilte_text_of_the_page.isDisplayed();
	}

	public boolean create_service_category_breadcrumb_is_displayed() {
		return create_service_category_breadcrumb.isDisplayed();
	}

	public boolean service_category_breadcrumb_button_is_displayed() {
		return service_category_breadcrumb_button.isDisplayed();
	}

	public boolean create_service_category_create_service_category_in_breadcrumb_is_displayed() {
		return create_service_category_in_breadcrumb.isDisplayed();
	}

	public boolean service_category_name_title_text_above_the_user_field_should_be_displayed() {
		return service_category_name_title_text_above_the_user_field.isDisplayed();
	}

	public boolean service_category_name_user_field_should_be_clickable() {
		return service_category_name_user_field.isEnabled();
	}

	public String service_category_name_user_field_placeholder_value() {
		return service_category_name_user_field.getAttribute("placeholder");
	}

	public boolean service_category_service_icon_title_above_user_field_is_displayed() {
		return service_category_service_icon_title_above_user_field.isDisplayed();
	}

	public boolean service_category_service_icon_text_line_should_be_displayed() {
		return service_category_service_icon_text_line.isDisplayed();
	}

	public String service_category_service_icon_user_field_placeholder() {
		return service_category_service_icon_user_field_placeholder.getAttribute("placeholder");
	}

	public boolean service_category_service_icon_user_field_should_be_clickable() {
		return service_category_service_icon_user_field_placeholder.isEnabled();
	}

	public boolean parent_category_above_the_dropdown_title_text_is_displayed() {
		return parent_category_above_the_dropdown_title_text.isDisplayed();
	}

	public boolean parent_category_dropdown_should_be_clickable() {
		return parent_category_dropdown.isEnabled();
	}

	public String parent_category_dropdown_selected_value_should_be_select() {
		return parent_category_dropdown_selected_value.getText();
	}

	public boolean parent_category_dropdown_list_should_be_clickable() {
		for (WebElement element : parent_category_dropdown_list) {
			boolean isEnabled = element.isEnabled();
			System.out.println("Element: " + element.getText() + " - Enabled: " + isEnabled);
		}
		return true;
	}

	public boolean status_of_the_category_title_above_dropdown_should_be_displayed() {
		return status_of_the_category_title_above_dropdown.isDisplayed();
	}

	public boolean status_dropdown_should_be_clickable() {
		return status_dropdown.isEnabled();
	}

	public String status_dropdown_selected_value_should_be_select() {
		return status_dropdown_selected_value.getText();
	}

	public boolean staus_dropdown_list_should_be_clickable() {
		for (WebElement element : staus_dropdown_list) {
			boolean isEnabled = element.isEnabled();
			System.out.println("Element: " + element.getText() + " - Enabled: " + isEnabled);
		}
		return true;
	}

	public boolean submit_button_should_be_displayed() {
		return submit_button.isDisplayed();
	}

	public boolean submit_button_should_be_clickable() {
		return submit_button.isEnabled();
	}

	public boolean submit_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, submit_button);
		return true;
	}

	public boolean cancel_button_should_be_displayed() {
		return cancel_button.isDisplayed();
	}

	public boolean cancel_button_should_be_clickable() {
		return cancel_button.isEnabled();
	}

	public boolean cancel_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, cancel_button);
		return true;
	}

}
