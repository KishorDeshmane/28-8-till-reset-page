package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Dashboard_notification_page_objects {
	private WebDriver driver;

	/*
	 * 
	 * Page Objects
	 * 
	 */

	@FindBy(xpath = "//h2[text()='Notification List']")
	private WebElement notification_list_title_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement breadcrumb;

	@FindBy(xpath = "//*[@class='breadcrumb']/li[1]")
	private WebElement breadcrumb_dashboard_button;

	@FindBy(xpath = "//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_notification_list_text;

	/*
	 * 
	 * 
	 * 
	 * 
	 * Constructor
	 * 
	 * 
	 * 
	 */

	public Dashboard_notification_page_objects(WebDriver driver) {
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
	 */

	public boolean notification_list_title_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, notification_list_title_text);
		return notification_list_title_text.isDisplayed();
	}

	public boolean breadcrumb_should_be_displayed() {
		return breadcrumb.isDisplayed();
	}

	public boolean breadcrumb_pages_button_should_be_displayed() {
		return breadcrumb_dashboard_button.isDisplayed();
	}

	public boolean breadcrumb_pages_button_should_be_clickable() {
		return breadcrumb_dashboard_button.isEnabled();
	}

	public boolean breadcrumb_notification_list_text_should_be_displayed() {
		return breadcrumb_notification_list_text.isDisplayed();
	}

}
