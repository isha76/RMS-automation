package com.connectedrms.learnerdashboard;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Purchasebundle_createpartner {

	WebDriver driver;
	JavascriptExecutor jse;
	public static final String USERNAME = "qaengineer12";
	public static final String AUTOMATE_KEY = "sUVx3VyvKsqTPsNqzzgn";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "62.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1280x800");
	    caps.setCapability("build", "ConnectedRMS1");
	    caps.setCapability("project", "RMSpurchase");

	    driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	
	}
	
	@Test
	public void invokeBrowser() throws InterruptedException {
	       
	       //site open
	       driver.get("https://hiuprms.sandbox.connectedrms.com/purchase/bundle");
	  
	      
	       driver.manage().window().maximize();
	       
	      
	       //company name
	       driver.findElement(By.name("companyName")).sendKeys("Hiupaut Part01");
	       
	       //email
	       driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("hiupaut01@yopmail.com");
	       
	       //first name
	       driver.findElement(By.name("first_name")).sendKeys("Hiup");
	       
	       //last name
	       driver.findElement(By.name("last_name")).sendKeys("Aut01");
	       
	       //choose bundle
	       driver.findElement(By.name("bundle_id")).click();
	       
	       //choose currency
	       driver.findElement(By.name("currency")).click();
	       
	       //Number of license
	       driver.findElement(By.name("number_of_license")).clear();
	       driver.findElement(By.name("number_of_license")).sendKeys("2");
	       
	      
	       //cardnumber
	       driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4242424242424242");
	       
	       //month
	       driver.findElement(By.cssSelector("#payment-form > div:nth-child(11) > div:nth-child(2) > div > div:nth-child(1) > div > input")).sendKeys("12");
	       
	       //year
	       driver.findElement(By.cssSelector("#payment-form > div:nth-child(11) > div:nth-child(2) > div > div:nth-child(2) > div > input")).sendKeys("2021");
	       
	       //cardholder name
	       driver.findElement(By.cssSelector("#payment-form > div:nth-child(12) > div.col-sm-6.col-md-6 > div > input")).sendKeys("alex");
	       
	       
	       //cvc
	       driver.findElement(By.cssSelector("#payment-form > div:nth-child(12) > div:nth-child(2) > div > input")).sendKeys("1234");
	       
	       //purchase
	       driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[11]/input")).click();     
	       Thread.sleep(20000);
	}

	
	@AfterTest
	public void close() {
		
		driver.quit();
	}
}
