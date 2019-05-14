package com.connectedrms.admindashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Addmember {
	
	public void memberadd(WebDriver driver,JavascriptExecutor jse) throws InterruptedException {
	      
	       //add member
	       driver.findElement(By.cssSelector(".fa-plus")).click();
	       
	       //member form
	       //negative testing1
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/form/div[9]/div[2]/div/input")).click();
	       Thread.sleep(3000);
	       
	       //negativetesting2
	       driver.findElement(By.id("first_name")).sendKeys("New member1");
	      
	       driver.findElement(By.id("last_name")).sendKeys("Learner");
	       
	       driver.findElement(By.id("user_name")).sendKeys("hiuprmsnewlearner1");
	       driver.findElement(By.id("password")).sendKeys("Hiup@123");
	       driver.findElement(By.id("confirm_password")).sendKeys("Hiup@1234");
	       Thread.sleep(3000);
	       driver.findElement(By.id("password")).clear();
	       driver.findElement(By.id("confirm_password")).clear();
	       Thread.sleep(3000);
	       driver.findElement(By.id("password")).sendKeys("Hiup@123");
	       driver.findElement(By.id("confirm_password")).sendKeys("Hiup@123");
	       driver.findElement(By.id("confirm_email")).sendKeys("hiuprmsnewlearner1@yopmail.com");
	  
	       driver.findElement(By.cssSelector("input.btn")).click();
	       driver.findElement(By.cssSelector("#message_alert > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       
	       //positive testing
	       driver.findElement(By.id("first_name")).clear();
	       driver.findElement(By.id("first_name")).sendKeys("Sanam");
	       
	       driver.findElement(By.id("last_name")).clear();
	       driver.findElement(By.id("last_name")).sendKeys("Jha");
	       
	       driver.findElement(By.id("user_name")).clear();
	       driver.findElement(By.id("user_name")).sendKeys("SanamJha");
	       
	       driver.findElement(By.id("password")).sendKeys("Hiup@123");
	       driver.findElement(By.id("confirm_password")).sendKeys("Hiup@123");
	       
	       driver.findElement(By.id("confirm_email")).clear();
	       driver.findElement(By.id("confirm_email")).sendKeys("sanamjha2@yopmail.com");
			
	       Select drprole = new Select(driver.findElement(By.id("role")));
	       drprole.selectByVisibleText("Learner");
	       
	       driver.findElement(By.cssSelector("input.btn")).click();
	       Thread.sleep(5000);
	       
	       //close tab
	       driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button/span")).click();
	       driver.quit();
	}
	       

}
