package com.connectedrms.learnerdashboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Purchasecourse_alreadypartner {
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() throws InterruptedException {
		
		System.getProperty("webdriver.gecko.driver","//usr/bin//geckodriver");
	       WebDriver driver=new FirefoxDriver();
	
	       
	       //implicit wait
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	       //site open
	       driver.get("https://hiuprms.sandbox.connectedrms.com/purchase/course");
	  
	      
	       driver.manage().window().maximize();
	       
	      
	       
	       //scroll down
	       jse = (JavascriptExecutor)driver;
	       //jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	       //signin button
	       driver.findElement(By.xpath("/html/body/section/div/div/div[3]/article/div/form/div[2]/div[2]/div/p/a")).click();
	       Thread.sleep(3000);
	       
	       //signin dialogue box
	       driver.findElement(By.name("email")).sendKeys("hiupp01@yopmail.com");
	       driver.findElement(By.name("password")).sendKeys("Hiup@123");
	       driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/form/div/div[3]/div/input")).click();
	       Thread.sleep(3000);
	       
	       //purchase page opens
	       
	       
	       //select course 
	       driver.findElement(By.xpath("//*[@id=\"select_course\"]")).click();
	       
	       //select currency
	       driver.findElement(By.xpath("//*[@id=\"select_currency\"]")).click();
	       
	       //number of license
	       driver.findElement(By.name("number_of_license")).clear();
	       driver.findElement(By.name("number_of_license")).sendKeys("2");
	      
	       //checkbox
	       driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/div/form/div[5]/div[1]/div/div/div/label")).click();
	       
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
	   
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Purchasecourse_alreadypartner myObj = new Purchasecourse_alreadypartner();
		myObj.invokeBrowser();

	}

}
