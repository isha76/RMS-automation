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


public class Purchasebundle_alreadypartner {
	
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
	       
	       //signin button
	       driver.findElement(By.xpath("/html/body/section/div/div/div[3]/article/div/form/div[2]/div[2]/div/p/a")).click();
	       Thread.sleep(3000);
	       
	       //signin dialogue box
	       driver.findElement(By.name("email")).sendKeys("hiupp01@yopmail.com");
	       driver.findElement(By.name("password")).sendKeys("Hiup@123");
	       driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div/div[3]/div/input")).click();
	       Thread.sleep(6000);
	       
	       //purchase page opens
	       
	       
	       //select bundle 
	       driver.findElement(By.xpath("//*[@id=\"select_bundle\"]")).click();
	       
	       //select currency
	       driver.findElement(By.xpath("//*[@id=\"select_currency\"]")).click();
	       
	       //number of license
	       driver.findElement(By.name("number_of_license")).clear();
	       driver.findElement(By.name("number_of_license")).sendKeys("2");
	       
	       //enter cardnumber
	       driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4242424242424242");
	       
	       //enter month
	       driver.findElement(By.xpath("//*[@id=\"exampleInputText\"]")).sendKeys("12");
	       
	       //enter year
	       driver.findElement(By.cssSelector("div.col-xs-6:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("2021");
	       
	       //enter cardholder name
	       driver.findElement(By.cssSelector("div.row:nth-child(8) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).sendKeys("Alex");
	       
	       //enter cvc
	       driver.findElement(By.cssSelector("div.col-md-3:nth-child(2) > div:nth-child(1) > input:nth-child(2)")).sendKeys("1234");
	       
	       //purchase button
	       driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/div/form/div[8]/input")).click();
	       Thread.sleep(15000);
	       
	       //close tab
	       driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button/span")).click();
	       Thread.sleep(3000);
	       
	
	}
	

	@AfterTest
	public void close() {
		
		driver.quit();
	}

}
