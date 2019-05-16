package com.connectedrms.learnerdashboard;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_learner {
	
	WebDriver driver;
	JavascriptExecutor jse;
	public static final String USERNAME = "qaengineer12";
	public static final String AUTOMATE_KEY = "sUVx3VyvKsqTPsNqzzgn";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	learner_dashboard learner_dash1 = new learner_dashboard();
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "62.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1280x800");
	    caps.setCapability("build", "ConnectedRMS1");
	    caps.setCapability("project", "RMSlearner");

	    driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
	   
	}
	
	@Test
	public void login() throws InterruptedException {
		
		   WebDriverWait wait=new WebDriverWait(driver, 20);
		
		   //site open
	       driver.get("https://www.sandbox.connectedrms.com/login");
	       
	       //login
	       driver.findElement(By.id("email")).sendKeys("hiuprmslearner1@yopmail.com");
	       driver.findElement(By.id("password")).sendKeys("Hiup@123");
	       
	       //scroll down
	       jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	       driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input")).click();
	       Thread.sleep(5000);
	       
	      learner_dash1.invokeBrowser(driver, wait, jse);
	       
	}
	
	@AfterTest
	public void close() {
		
		driver.quit();
	}
	
	
}
