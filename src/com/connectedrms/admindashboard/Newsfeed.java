package com.connectedrms.admindashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newsfeed {
	
	public void feed2(WebDriver driver,WebDriverWait wait,JavascriptExecutor jse) throws InterruptedException {
		
	       
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
	       Thread.sleep(3000);
	       
	       //upload image(for linux)
	       
	       //WebElement uploadElement = driver.findElement(By.name("image"));

	        // enter the file path onto the file-selection input field
	       // uploadElement.sendKeys("/home/isha/Pictures/book_images/coffee_cup.jpeg");
	       
	       
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
	       
	       //delete model popped up
	       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/div[6]/div/div/div[2]/div[2]/div/button[1]")));
	       element.click();
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector("button.close:nth-child(1) > span:nth-child(1)")).click();	       
	      
	       //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(5000);
	       
			}

	
}
