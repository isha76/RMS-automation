package com.connectedrms.admindashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reselling {
	
	public void resell(WebDriver driver,WebDriverWait wait,JavascriptExecutor jse) throws InterruptedException {
	       
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
	       
	       //close tab
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
	      
	       //pop up 
	       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.btn:nth-child(2)")));
	       element.click();
	       Thread.sleep(3000);
	       
	       //close tab
	       driver.findElement(By.cssSelector(".white-text")).click();
	       
	       //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(5000);
	       
	       
	}
	         
	
}
