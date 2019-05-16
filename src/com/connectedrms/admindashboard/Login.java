package com.connectedrms.admindashboard;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login {
	
	WebDriver driver;
	JavascriptExecutor jse;
	public static final String USERNAME = "qaengineer12";
	public static final String AUTOMATE_KEY = "sUVx3VyvKsqTPsNqzzgn";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	Admindashboard admin_dash1 = new Admindashboard();
	Newsfeed admin_dash2 = new Newsfeed();
	Bsa admin_dash3 = new Bsa();
	Courses admin_dash4 = new Courses();
	Member admin_dash5 = new Member();
	Reselling admin_dash6 = new Reselling();
	Addmember admin_dash7 = new Addmember();
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "62.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1280x800");

	    driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	
	}
	
	@Test
	public void login() throws InterruptedException {
		
		   WebDriverWait wait=new WebDriverWait(driver, 20);
		
		   //site open
	       driver.get("https://www.sandbox.connectedrms.com/login");
	       
	       //login
	       driver.findElement(By.id("email")).sendKeys("ishakhanal@hiupapp.com");
	       driver.findElement(By.id("password")).sendKeys("secret");
	       
	       //scroll down
	       jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	       driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input")).click();
	       Thread.sleep(5000);

	       admin_dash1.feed1(driver,wait);
	       admin_dash2.feed2(driver,wait,jse);
	       admin_dash3.browsebsa(driver, wait);
	       admin_dash4.browsecourse(driver, wait, jse);
	       admin_dash5.browsemember(driver, wait, jse);
	       //admin_dash7.memberadd(driver, jse);
	       //admin_dash6.resell(driver, wait, jse);
	}
	
	@AfterTest
	public void close() {
		
		driver.quit();
	}

}
