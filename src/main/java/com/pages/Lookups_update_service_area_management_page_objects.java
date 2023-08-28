package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_update_service_area_management_page_objects {

	public WebDriver driver;

	@FindBy(xpath = "")
	private WebElement el;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_update_service_area_management_page_objects(WebDriver driver) {
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

	public void els() {
		el.clear();
	}

}
