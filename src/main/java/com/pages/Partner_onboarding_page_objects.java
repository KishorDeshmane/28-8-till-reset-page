package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Partner_onboarding_page_objects {
private WebDriver driver;
	
	
	
	@FindBy(xpath="(//*[text()='Partner Onboarding'])[1]")
	private WebElement partner_onboarding_header_text_above_breadcrumb;
	
	
	
	public Partner_onboarding_page_objects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean partner_onboarding_header_text_above_breadcrumb_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, partner_onboarding_header_text_above_breadcrumb);
		return partner_onboarding_header_text_above_breadcrumb.isDisplayed();
	}
	
	
	
	
}
