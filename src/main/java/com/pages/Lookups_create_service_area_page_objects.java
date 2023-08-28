package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_create_service_area_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement create_service_area_title_text_of_the_page;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_create_service_area_page_objects(WebDriver driver) {
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


	public boolean create_service_area_title_text_of_the_page_is_displayed() {
		return create_service_area_title_text_of_the_page.isDisplayed();
	}

}
