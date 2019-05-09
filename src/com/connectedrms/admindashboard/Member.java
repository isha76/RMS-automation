package com.connectedrms.admindashboard;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Member {

	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() throws InterruptedException {
		
		System.getProperty("webdriver.gecko.driver","//usr/bin//geckodriver");
	       WebDriver driver=new FirefoxDriver();
	       WebDriverWait wait=new WebDriverWait(driver, 20);
	     
	       
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
	      
	       
	       //see more members
	       driver.findElement(By.cssSelector("div.licensed-block-heading-last:nth-child(7)")).click();
	       
	       //scroll down
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       
	       //scroll up
	       jse.executeScript("scroll(0, -1000);");
	       Thread.sleep(3000);
	       
	       //select member
	       driver.findElement(By.cssSelector("#member-block-list > a:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).click();
	       
	       //enroll button
	       driver.findElement(By.cssSelector("#btn-more")).click();
	       
	       WebElement enrolwait3;
	       enrolwait3= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.course-enroll-block-heading:nth-child(1) > div:nth-child(3) > a:nth-child(2)")));
	       
	       //click button
	       enrolwait3.click();
	       Thread.sleep(3000);
	       
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	       //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       
	       
	       //view feed member
	       driver.findElement(By.cssSelector("div.sidebar-block-left:nth-child(2) > a:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
	       
	       //enroll button
	       driver.findElement(By.cssSelector("#btn-more")).click();
	       
	       WebElement enrolwait1;
	       enrolwait1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[3]/div/div/div[2]/div[2]/div[1]/div[3]/button")));
	       
	       //click button
	       enrolwait1.click();
	       Thread.sleep(3000);
	       
	       WebElement enrolwait2;
	       enrolwait2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[4]/div/div/div/div[2]/button[2]")));
	       
	       //click button
	       enrolwait2.click();
	       Thread.sleep(3000);
	       
	       //close tab
	       driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button/span")).click();
	       Thread.sleep(3000);
	       
	       //close another tab
	       
	       Actions actions = new Actions(driver);
	       actions.moveToElement(driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div[1]/button"))).click().pause(3000).click().build().perform();
	      
	       //back to feed
	       Thread.sleep(4000);
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	      
	       
	
	}
	       
	       public static void main(String[] args) throws InterruptedException {
	   		Member myObj = new Member();
	   		myObj.invokeBrowser();
	   		
	       }
	   		

	   	
	       
	       
	       
	}
	

