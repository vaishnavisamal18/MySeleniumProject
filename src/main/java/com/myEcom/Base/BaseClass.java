package com.myEcom.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String projectPath = System.getProperty("user.dir");
	
	//(browser.equalsIgnoreCase("firefox"))
	
	public void loadAppication() 
	{
		
		
		String browser = (String) prop.get("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"//Driver//geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(options);
		}
		else
		{
			System.out.println("browser not connecting");
		}
		driver.get(prop.getProperty("baseurl"));
	}
	@BeforeTest
	public void readProp() throws IOException {
		
		FileInputStream fis = new FileInputStream(projectPath+"//Config/config.properties");
		prop = new Properties();
		prop.load(fis);	
	}

}
