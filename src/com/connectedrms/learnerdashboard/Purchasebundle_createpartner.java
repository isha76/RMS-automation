package com.connectedrms.learnerdashboard;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Purchasebundle_createpartner {

	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() throws InterruptedException {
		
		System.getProperty("webdriver.gecko.driver","//usr/bin//geckodriver");
	       WebDriver driver=new FirefoxDriver();
	
	       
	       //implicit wait
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	       //site open
	       driver.get("https://hiuprms.sandbox.connectedrms.com/purchase/bundle");
	  
	      
	       driver.manage().window().maximize();
	       
	      
	       //company name
	       driver.findElement(By.name("companyName")).sendKeys("Hiupaut Par1");
	       
	       //email
	       driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("hiupaut1@yopmail.com");
	       
	       //first name
	       driver.findElement(By.name("first_name")).sendKeys("Hiup");
	       
	       //last name
	       driver.findElement(By.name("last_name")).sendKeys("Aut1");
	       
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
	       
	       
	       
	       
	      
	
	}

	public static void main(String[] args) throws InterruptedException {
		Purchasebundle_createpartner myObj = new Purchasebundle_createpartner();
		myObj.invokeBrowser();

	}
}
