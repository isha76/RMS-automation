package com.connectedrms.admindashboard;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Courses {
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
	       
	       //feed course view
	       driver.findElement(By.cssSelector("div.licensed-block:nth-child(2) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //see more courses
	       driver.findElement(By.cssSelector("div.licensed-block-heading-last:nth-child(5) > a:nth-child(1)")).click();
	       
	       //view courses
	       driver.findElement(By.cssSelector("div.bundle_courses_block_heading:nth-child(1) > div:nth-child(3) > a:nth-child(1)")).click();
	       
	       //view course
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector("div.bundle_courses_block_heading:nth-child(2) > div:nth-child(3) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       jse.executeScript("scroll(0, 500);");
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       
	       //licensed courses
	       driver.findElement(By.cssSelector(".dropdown > a:nth-child(1)")).click();
	       driver.findElement(By.cssSelector(".dropdown > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //enrol button
	       driver.findElement(By.cssSelector("#licensed-block-list > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();  
	       
	       String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	       String subWindowHandler = null;
	       
	       Set<String> handles = driver.getWindowHandles(); // get all window handles
	       Iterator<String> iterator = handles.iterator();
	       while (iterator.hasNext()){
	           subWindowHandler = iterator.next();
	       }
	       driver.switchTo().window(subWindowHandler); // switch to popup window
	       
	       //select members
	       driver.findElement(By.cssSelector("div.enroll_team_member-block-heading:nth-child(2) > form:nth-child(1) > label:nth-child(1) > input:nth-child(1)")).click();
	       driver.findElement(By.cssSelector("div.enroll_team_member-block-heading:nth-child(3) > form:nth-child(1) > label:nth-child(1) > input:nth-child(1)")).click();
	       
	       //contiue button
	       driver.findElement(By.cssSelector("a.pull-right")).click();
	       Thread.sleep(3000);
	       //remove
	       driver.findElement(By.cssSelector("div.enroll_team_member-block-heading:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")).click();
	       Thread.sleep(2000);
	       
	       //enrol button
	       driver.findElement(By.cssSelector("a.pull-right:nth-child(3)")).click();
	       Thread.sleep(4000);
	     
	       driver.switchTo().window(parentWindowHandler);// switch back to parent window
	       //close box
	       driver.findElement(By.cssSelector(".white-text")).click();
	       
	       
	       //back to licensed courses
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector(".dropdown > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector(".dropdown > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //get licemses
	       driver.findElement(By.cssSelector("#licensed-block-list > div:nth-child(1) > div:nth-child(3) > a:nth-child(2)")).click();
	       driver.findElement(By.cssSelector(".white-text")).click();
	       Thread.sleep(3000);
	       //view course
	       driver.findElement(By.cssSelector("#licensed-block-list > div:nth-child(1) > div:nth-child(3) > a:nth-child(4)")).click();
	       Thread.sleep(3000);
	       jse.executeScript("scroll(0, 500);");
	       Thread.sleep(3000);
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       
	       //course menu to recommended courses
	       driver.findElement(By.cssSelector(".dropdown > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector(".dropdown > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       //view
	       driver.findElement(By.cssSelector("div.recomended_popular_courses_block_heading:nth-child(1) > div:nth-child(3) > a:nth-child(2)")).click();
	       
	      //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(3000); 
	       
	       //trending course
	       driver.findElement(By.cssSelector("div.popular-block:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)")).click();
	       Thread.sleep(3000);
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(3000); 
	       
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Courses myObj = new Courses();
   		myObj.invokeBrowser();
   		
       }
	
}

	       
	      
