package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookups_area_delete_pop_up_objects {
	public WebDriver driver;

	@FindBy(xpath = "")
	private WebElement els;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_area_delete_pop_up_objects(WebDriver driver) {
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
	
	public void elss() {
		els.click();
	}

}
