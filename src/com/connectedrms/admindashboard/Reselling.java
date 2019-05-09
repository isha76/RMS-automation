package com.connectedrms.admindashboard;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reselling {

	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() throws InterruptedException {
		
		System.getProperty("webdriver.gecko.driver","//usr/bin//geckodriver");
	       WebDriver driver=new FirefoxDriver();
	     
	       
	       //implicit wait
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	       
	       //site open
	       driver.get("https://www.sandbox.connectedrms.com/login");
	          
	       driver.manage().window().maximize();
	       
	       //login
	       driver.findElement(By.id("email")).sendKeys("ishakhanal@hiupapp.com");
	       driver.findElement(By.id("password")).sendKeys("secret");
	       
	       //scroll down
	       jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	       driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/input")).click();
	       Thread.sleep(5000);
	       
	       //course menu to reselling course
	       driver.findElement(By.cssSelector(".dropdown > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector(".dropdown > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //course set to reselling
	       driver.findElement(By.cssSelector("#licensed-block-list > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
	       //switchToNewWindow(1);
	       
	      


	       driver.findElement(By.id("EUR")).click();
	       driver.findElement(By.id("EUR-price")).clear();
	       driver.findElement(By.id("EUR-price")).sendKeys("100");
	       driver.findElement(By.id("EUR-vat")).clear();
	       driver.findElement(By.id("EUR-vat")).sendKeys("10");
	       driver.findElement(By.cssSelector(".btn-primary")).click();
	       
	       
	       
	     
	       driver.findElement(By.cssSelector(".white-text")).click();
	       
	     
	       /*
	      
	       //edit pricing
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/div/div[3]/div[1]/div[3]/button")).click();
	      
	       
	       
	       driver.findElement(By.id("EUR")).click();
	       driver.findElement(By.id("EUR")).click();
	       driver.findElement(By.id("GBP")).click();
	       //driver.findElement(By.id("EUR-price")).clear();
	       driver.findElement(By.id("GBP-price")).sendKeys("200");
	       //driver.findElement(By.id("EUR-vat")).clear();
	       driver.findElement(By.id("GBP-vat")).sendKeys("20");
	       driver.findElement(By.cssSelector(".btn-primary")).click();
	       
	       
	       driver.findElement(By.cssSelector(".white-text")).click();
	       
	       //edit price2
	       
	       //edit pricing
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/div/div[3]/div[1]/div[3]/button")).click();
	      
	       
	       
	       driver.findElement(By.id("GBP")).click();
	       driver.findElement(By.id("GBP")).click();
	       driver.findElement(By.id("AUD")).click();
	       //driver.findElement(By.id("EUR-price")).clear();
	       driver.findElement(By.id("AUD-price")).sendKeys("10");
	       //driver.findElement(By.id("EUR-vat")).clear();
	       driver.findElement(By.id("AUD-vat")).sendKeys("1");
	       driver.findElement(By.cssSelector(".btn-primary")).click();
	       
	       
	       driver.findElement(By.cssSelector(".white-text")).click();
	       */
	       
	       //reselling bundle
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(3) > a:nth-child(1)")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector(".open > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //set to reselling bundle
	       driver.findElement(By.cssSelector("#licensed-block-list > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
	       String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	       String subWindowHandler = null;
	       
	       Set<String> handles = driver.getWindowHandles(); // get all window handles
	       Iterator<String> iterator = handles.iterator();
	       while (iterator.hasNext()){
	           subWindowHandler = iterator.next();
	       }
	       driver.switchTo().window(subWindowHandler); // switch to popup window
	       driver.findElement(By.cssSelector("a.btn:nth-child(2)")).click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.cssSelector(".white-text")).click();
	       
	       driver.switchTo().window(parentWindowHandler);
	       
	       
	}
	         

	public static void main(String[] args) throws InterruptedException {
		Reselling myObj = new Reselling();
		myObj.invokeBrowser();
		
   }
	
}
