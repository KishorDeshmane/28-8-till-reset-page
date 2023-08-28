package com.qa.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser
	 * @param browser
	 * @return this will return tldriver.
	 */
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is: " + browser);
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: " + projectPath);
		
		
		if (browser.equals("chrome")) {
			
//			 ChromeOptions options = new ChromeOptions();
//			 options.setBrowserVersion("116");
			 
//			 options.addArguments("--remote-allow-origin=*");
//			 options.addArguments("--disable notifications");
//			 DesiredCapabilities cp= new DesiredCapabilities();
//			 cp.setCapability(ChromeOptions.CAPABILITY, options);
//			 options.merge(cp);
//			 options.addArguments("--headless");
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kishor\\Downloads\\chromedriver-win64\\chromedriver.exe");
//			 ChromeOptions options = new ChromeOptions();
//			 options.setBinary("C:\\Users\\Kishor\\Downloads\\chrome-win64\\chrome.exe");
			WebDriverManager.chromedriver().setup(); 
			tlDriver.set(new ChromeDriver());
	
		} else if (browser.equals("edge")) {
			 EdgeOptions options = new EdgeOptions();
			 options.setBrowserVersion("117");
			 
			//WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver",  projectPath+"\\drivers\\msedgedriver.exe");
			tlDriver.set(new EdgeDriver(options));
			
		} else if (browser.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.firefox.driver", projectPath + "\\drivers\\geckodriver.exe");
			tlDriver.set(new FirefoxDriver());
			
		} else if (browser.equals("safari")) {
			//WebDriverManager.safaridriver().setup();
			//System.setProperty("webdriver.firefox.driver", projectPath + "\\drivers\\geckodriver.exe");
			tlDriver.set(new SafariDriver());
			
			/** Out Dated*/
		//} else if (browser.equals("ie")) {
			//WebDriverManager.iedriver().setup();
			//System.setProperty("webdriver.firefox.driver", projectPath + "\\drivers\\geckodriver.exe");
			//tlDriver.set(new InternetExplorerDriver());

		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

//		getDriver().manage().deleteAllCookies();
//		driver.manage().addCookie(cookie);
		getDriver().manage().window().maximize();
		
		
//		try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
//		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		return getDriver();
	}

	public synchronized static WebDriver getDriver() {
		return tlDriver.get();
	}
}