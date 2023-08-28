package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Z999_mailtrap_objects {
	private WebDriver driver;
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * MAILTRAP
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath= "//*[@class='d-flex js-user-anonymous']/a[1]")
	private WebElement mailtrap_user_first_log_in;

	@FindBy(xpath= "//*[@id='user_email']")
	private WebElement mailtrap_user_enter_email_into_user_field;

	@FindBy(xpath= "//*[text()='Next']")
	private WebElement mailtrap_user_next_button;

	@FindBy(xpath= "//*[@id='user_password']")
	private WebElement mailtrap_user_enter_password_into_user_field;

	@FindBy(xpath= "//*[@type='submit']")
	private WebElement mailtrap_user_click_last_log_in_button;

	@FindBy(xpath = "(//*[text()='Email Testing'])[1]")
	private WebElement mailtrap_user_email_testing;
	
	@FindBy(xpath = "(//*[text()='Inboxes'])[1]")
	private WebElement mailtrap_user_inbox;
	
	@FindBy(xpath = "//*[@class='inboxes_list']/div/div/span/a/span")
	private WebElement mailtrap_user_demo_inbox;
	
	@FindBy(xpath="(//span[text()='Reset your password - [Shield]'])[1]")
	private WebElement mailtrap_get_latest_unread_mail_subject_title;
	
	@FindBy(xpath = "//*[@class='button button-success']")
	private WebElement mailtrap_mail_link_reset_password_link;

	@FindBy(xpath= "//p/strong")
	private WebElement email_otp;


	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public Z999_mailtrap_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * MAIL TRAP METHODS
	 * 
	 * 
	 * 
	 */
	
	public void mailtrap_user_click_on_log_in_button() {
		mailtrap_user_first_log_in.click();
	}

	public void mailtrap_user_enter_email_into_the_user_field(String property) {
		mailtrap_user_enter_email_into_user_field.sendKeys(property);
	}

	public void mailtrap_user_click_the_next_button() {
		mailtrap_user_next_button.click();
	}

	public void mailtrap_user_enter_password_into_the_user_field(String property) {
		mailtrap_user_enter_password_into_user_field.sendKeys(property);
	}

	public void mailtrap_user_click_on_log_in_button_before_scroll_down() {
		ElementUtil.eu.scroll_down_body_click(1, driver);
		ElementUtil.eu.clickByJS(driver, mailtrap_user_click_last_log_in_button);
		//mailtrap_user_click_last_log_in_button.click();
	}

	public void mailtrap_user_email_testing_is_click() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mailtrap_user_email_testing);
		mailtrap_user_email_testing.click();
	}

	public void mailtrap_user_inbox_is_click() {
		mailtrap_user_inbox.click();
	}
	
	public void mailtrap_user_demo_inbox_is_click(){
		mailtrap_user_demo_inbox.click();
	}

	public String mailtrap_get_the_mail_with_subject_title() {
		return mailtrap_get_latest_unread_mail_subject_title.getText();
	}
	
	public void mailtrap_get_the_mail_with_subject_title_click() {
//		 mailtrap_get_latest_unread_mail_subject_title.click();
		driver.findElement(By.xpath("//*[text()='a few seconds ago']")).click();
	}
	
	public void mailtrap_get_the_mail_with_subject_title_clicked() {
		 mailtrap_get_latest_unread_mail_subject_title.click();
//		driver.findElement(By.xpath("//*[text()='a few seconds ago']")).click();
	}

	public String mailtrap_mail_link_reset_password(){
		System.out.println("start");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@data-test-id='message_view_iframe']")));
		System.out.println("switched");
		ElementUtil.eu.scroll_down_body_click(2, driver);
		System.out.println("scrolled");
		String sre=mailtrap_mail_link_reset_password_link.getText();
		System.out.println(sre);
		driver.switchTo().defaultContent();
		return sre;
	}
	
	public String mailtrap_mail_link_reset_password_click_and_get_title(){
		System.out.println("start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Message view' and @data-test-id='message_view_iframe']")));
		System.out.println("switched");
		ElementUtil.eu.scroll_down_body_click(2, driver);
		System.out.println("scrolled");
		//mailtrap_mail_link_reset_password_link.click();
		ElementUtil.eu.clickByJS(driver, mailtrap_mail_link_reset_password_link);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		  String currentTab = driver.getWindowHandle();
	        for (String tab : driver.getWindowHandles()) {
	            if (!tab.equals(currentTab)) {
	            	
	            	//String parentWindows =
	            			driver.getWindowHandle();
	            	driver.close();
	            	//driver.switchTo().window(parentWindows);
	                
	            	
	            	driver.switchTo().window(tab);
	                break;
	            }
	        }
	        String newTabUrl = driver.getCurrentUrl();
	        System.out.println("URL of the new tab: " + newTabUrl);
		
		
		System.out.println("clicked link");
		String url=driver.getCurrentUrl();
		String corrected_url = url.replaceAll("shieldapi", "shield");
		System.out.println("Corrected url "+corrected_url);
		driver.navigate().to(corrected_url);
		
		ElementUtil.eu.wait_for_to_be_title_is_displayed(driver , 10 , "Shield");
		
		String title = ElementUtil.eu.current_page_title(driver);
		System.out.println("Title change pass "+title);
		return title;
	}
	
	
	
	

	public String mailtrap_mail_link_reset_old_password_click_and_get_title(){
		System.out.println("start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Message view' and @data-test-id='message_view_iframe']")));
		System.out.println("switched");
		ElementUtil.eu.scroll_down_body_click(2, driver);
		System.out.println("scrolled");
		//mailtrap_mail_link_reset_password_link.click();
		ElementUtil.eu.clickByJS(driver, mailtrap_mail_link_reset_password_link);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		  String currentTab = driver.getWindowHandle();
	        for (String tab : driver.getWindowHandles()) {
	            if (!tab.equals(currentTab)) {
	            	
	            	//String parentWindows =
	            			driver.getWindowHandle();
	            	driver.close();
	            	//driver.switchTo().window(parentWindows);
	            	
	                driver.switchTo().window(tab);
	                break;
	            }
	        }
	        String newTabUrl = driver.getCurrentUrl();
	        System.out.println("URL of the new tab: " + newTabUrl);
		
		
		System.out.println("clicked link");
		String url=driver.getCurrentUrl();
		String corrected_url = url.replaceAll("shieldapi", "shield");
		System.out.println("Corrected url "+corrected_url);
		driver.navigate().to(corrected_url);
		
		ElementUtil.eu.wait_for_to_be_title_is_displayed(driver , 10 , "Shield");
		
		String title = ElementUtil.eu.current_page_title(driver);
		System.out.println("Title change pass "+title);
		return title;
	}
	
	
	public void mailtrap_verify_email_address_link_is_clicked() {
		driver.findElement(By.xpath("//*[text()='Verify Email Address']")).click();
		
		  String currentTab = driver.getWindowHandle();
	        for (String tab : driver.getWindowHandles()) {
	            if (!tab.equals(currentTab)) {
	            	driver.getWindowHandle();
	            	driver.close();
	                driver.switchTo().window(tab);
	                break;
	            }
	        }
	}
	
	public boolean mailtrap_verify_email_address_link_is_clickable(){
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Message view' and @data-test-id='message_view_iframe']")));
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, driver.findElement(By.xpath("//*[text()='Verify Email Address']")));
		return driver.findElement(By.xpath("//*[text()='Verify Email Address']")).isDisplayed();
	}


	public String mailtrap_send_mail_otp_is_copied() {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Message view' and @data-test-id='message_view_iframe']")));
		String otp=email_otp.getText();
		System.out.println(otp);
		
		
//	    char first_number=otp.charAt(0);
//	    System.out.println(first_number);
//	    char second_number=otp.charAt(1);
//	    System.out.println(second_number);
//	    char third_number=otp.charAt(2);
//	    System.out.println(third_number);
//	    char fourth_number=otp.charAt(3);
//	    System.out.println(fourth_number);
//	    char fifth_number=otp.charAt(4);
//	    System.out.println(fifth_number);
//	    char sixth_number=otp.charAt(5);
//	    System.out.println(sixth_number);
	    
//	    /*
//	     * 
//	     * 
//	     * Parent windows
//	     * 
//	     * 
//	     */
//	    
//	    String parentWindowHandle = driver.getWindowHandle();
//	    Set<String> windowHandles = driver.getWindowHandles();
//	    for (String windowHandle : windowHandles) {
//	        if (!windowHandle.equals(parentWindowHandle)) {
//	            driver.switchTo().window(windowHandle);
//	            break;
//	        }
//	    }
	    
	    
	    /*
	     * 
	     * Send OTP to user fields
	     * 
	     */

//	  	    
//	    Actions a=new Actions(DriverFactory.getDriver());
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	  
//	    a.doubleClick(partner_log_in_get_otp_user_field_first_number);
//	  
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	    
//	    partner_log_in_get_otp_user_field_first_number.sendKeys(String.valueOf(first_number));
//	    partner_log_in_get_otp_user_field_second_number.sendKeys(String.valueOf(second_number));
//	    partner_log_in_get_otp_user_field_third_number.sendKeys(String.valueOf(third_number));
//	    partner_log_in_get_otp_user_field_fourth_number.sendKeys(String.valueOf(fourth_number));
//	    partner_log_in_get_otp_user_field_fifth_number.sendKeys(String.valueOf(fifth_number));
//	    partner_log_in_get_otp_user_field_sixth_number.sendKeys(String.valueOf(sixth_number));
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
//	    
//	    verify_otp.click();
//	    
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	    
		return otp;
	}

	
	
}
