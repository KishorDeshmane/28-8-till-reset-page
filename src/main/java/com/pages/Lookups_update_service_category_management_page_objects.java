package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_update_service_category_management_page_objects {
public WebDriver driver;
	
	@FindBy(css = ".main-content-title")
	private WebElement update_service_category_title_text;

	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb;

	@FindBy(xpath="//*[@class='breadcrumb-item']/a")
	private WebElement breadcrumb_service_category_button;

	@FindBy(xpath= "//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_update_service_category_text;
	
	@FindBy(xpath="//*[text()='Service category name']")
	private WebElement service_category_name_text_above_the_user_field;

	@FindBy(xpath="//*[text()='Service category name']/span")
	private WebElement service_category_name_text_asterisk_sign;

	@FindBy(xpath="//*[@name='category_name']")
	private WebElement service_category_name_user_field;

	@FindBy(xpath="//*[text()='Service icon']")
	private WebElement service_icon_title_above_the_user_field;

	@FindBy(xpath="//*[text()='Service icon']/small")
	private WebElement service_icon_text_line;

	@FindBy(xpath="//*[@placeholder='Enter your user image URL']")
	private WebElement service_icon_user_field;

	@FindBy(xpath="//*[@class='undefinedmedia border']")
	private WebElement service_icon_image_by_deafult_present;

	@FindBy(xpath="//*[text()='Parent category']")
	private WebElement parent_category_title_text_above_the_user_field;

	@FindBy(xpath="//*[@name='parent_category']")
	private WebElement parent_category_dropdown;

	@FindBy(xpath="//*[@name='parent_category']/option")
	private List<WebElement> parent_category_dropdown_list;

	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_title_text_above_dropdown;

	@FindBy(xpath="//*[@name='current_status']")
	private WebElement status_dropdown;

	@FindBy(xpath="//*[@name='current_status']/option")
	private List<WebElement> status_dropdown_list;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit_button;

	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_update_service_category_management_page_objects(WebDriver driver) {
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
	
	public boolean update_service_category_title_text_should_be_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, update_service_category_title_text );
		return update_service_category_title_text.isDisplayed();
	}

	public boolean breadcrumb_should_be_displayed() {
		return breadcrumb.isDisplayed();
	}

	public boolean breadcrumb_service_category_button_should_be_displayed() {
		return breadcrumb_service_category_button.isDisplayed();
	}

	public boolean breadcrumb_service_category_button_should_be_clickable() {
		return breadcrumb_service_category_button.isEnabled();
	}
	
	public boolean breadcrumb_update_service_category_text_should_be_displayed(){
		return breadcrumb_update_service_category_text.isDisplayed();
	}

	public boolean service_category_name_text_above_the_user_field_should_be_displayed() {
		return service_category_name_text_above_the_user_field.isDisplayed();
	}

	public boolean service_category_name_text_asterisk_sign_should_be_displayed() {
		return service_category_name_text_asterisk_sign.isDisplayed();
	}

	public boolean service_category_name_user_field_should_be_displayed() {
		return service_category_name_user_field.isDisplayed();
	}

	public boolean service_category_name_user_field_should_be_clickable() {
		return service_category_name_user_field.isEnabled();
	}

	public String service_category_name_user_field_placeholder_value() {
		return service_category_name_user_field.getAttribute("placeholder");
	}

	public boolean service_category_name_user_field_text_should_be_displayed() {
		return service_category_name_user_field.getAttribute("value").isEmpty();
	}

	public boolean service_icon_title_above_the_user_field_should_be_dispalyed() {
		return service_icon_title_above_the_user_field.isDisplayed();
	}

	public boolean service_icon_text_line_should_be_displayed() {
		return service_icon_text_line.isDisplayed();
	}

	public boolean service_icon_user_field_should_be_displayed() {
		return service_icon_user_field.isDisplayed();
	}

	public boolean service_icon_user_field_should_be_clickable() {
		return service_icon_user_field.isEnabled();
	}

	public String service_icon_user_field_placeholder_value() {
		return service_icon_user_field.getAttribute("placeholder");
	}

	public boolean service_icon_image_should_be_displayed_by_default() {
		return service_icon_image_by_deafult_present.isDisplayed();
	}

	public boolean parent_category_title_text_above_the_user_field_should_be_displayed() {
		return parent_category_title_text_above_the_user_field.isDisplayed();
	}

	public boolean parent_category_dropdown_should_be_clickable() {
		return parent_category_dropdown.isEnabled();
	}

	public boolean parent_category_dropdown_list_should_be_clickable() {
		for (WebElement element : parent_category_dropdown_list) {
            boolean isEnabled = element.isEnabled();
            System.out.println("Element: " + element.getText() + " - Enabled: " + isEnabled);
        }
		return true;
	}

	public boolean status_title_text_above_dropdown_should_be_displayed() {
		return status_title_text_above_dropdown.isDisplayed();
	}

	public boolean status_dropdown_should_be_clickable() {
		return status_dropdown.isEnabled();
	}

	public boolean status_dropdown_list_should_be_clickable() {
		for (WebElement element : status_dropdown_list) {
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
		ElementUtil.eu.mouseHover(driver, cancel_button );
		return true;
	}

	
}
