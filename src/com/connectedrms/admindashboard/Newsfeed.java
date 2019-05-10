package com.connectedrms.admindashboard;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newsfeed {
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
	       
	      
	       
	       //write post
	       driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/section[1]/div[2]/a[1]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/section[1]/div[1]/div/div/div/form/input[4]")).sendKeys("News Title");
	       Thread.sleep(3000);
	       
	       WebElement editorFrame = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/section[1]/div[1]/div/div/div/form/div[1]/div[1]/div/div/iframe"));

	       driver.switchTo().frame(editorFrame);

	       WebElement body = driver.findElement(By.tagName("body"));

	       body.clear(); 
	       body.sendKeys("some text");
	       
	       driver.switchTo().defaultContent();
	       
	       //upload image
	       WebElement uploadElement = driver.findElement(By.name("image"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("/home/isha/Pictures/book_images/coffee_cup.jpeg");
	       
	       //publish
	       driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/section[1]/div[1]/div/div/div/form/div[2]/div[2]/input")).click();
	       //close 
	       driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button/span")).click();
	       Thread.sleep(3000);
	       
	       //SCROLL DOWN
	       jse.executeScript("scroll(0, 700);");
	       Thread.sleep(3000);
	       
	       //delete
	       driver.findElement(By.cssSelector("section.block:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1) > i:nth-child(1)")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[3]/div/div[1]/div[3]/ul/li[4]/a")).click();
	       Thread.sleep(3000);
	       //model popped up
	       String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	       String subWindowHandler = null;

	       Set<String> handles = driver.getWindowHandles(); // get all window handles
	       Iterator<String> iterator = handles.iterator();
	       while (iterator.hasNext()){
	           subWindowHandler = iterator.next();
	       }
	       driver.switchTo().window(subWindowHandler); // switch to popup window

	       driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/div[6]/div/div/div[2]/div[2]/div/button[1]")).click();

	       driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	       driver.findElement(By.cssSelector("button.close:nth-child(1) > span:nth-child(1)")).click();
	      
	       
	      
}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Newsfeed myObj = new Newsfeed();
		myObj.invokeBrowser();
		

	}
}
