package com.connectedrms.admindashboard;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Bsa {
	
	
	public void browsebsa(WebDriver driver,WebDriverWait wait) throws InterruptedException {
	       
	       driver.findElement(By.cssSelector("div.sidebar-block-left:nth-child(1) > a:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1)")).click();
	       Thread.sleep(5000);
	       
	       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	       
	       //switch back to previous tab
	       driver.switchTo().window(tabs.get(0));
	       Thread.sleep(2000);
	       
	       //bsa browse
	       driver.findElement(By.cssSelector("div.sidebar-block-left:nth-child(1) > div:nth-child(1) > a:nth-child(2) > i:nth-child(1)")).click();
	       Thread.sleep(3000);
	       //more
	       driver.findElement(By.cssSelector("button.btn:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       WebElement morewait1;
	       morewait1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div[2]/div/div/div[3]/div/div/div[1]/button")));
	       
	       //click button
	       morewait1.click();
	       Thread.sleep(3000);
	       
	       //explore
	       driver.findElement(By.cssSelector("a.btn:nth-child(2)")).click();
	       Thread.sleep(3000);
	       
	       //switch back to previous tab
	       driver.switchTo().window(tabs.get(0));
	       Thread.sleep(2000);  
	       
	       driver.findElement(By.cssSelector(".fa-ellipsis-v")).click();
	       Thread.sleep(2000);
	       //assign partner
	       driver.findElement(By.cssSelector(".editpost-dropdown > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       WebElement morewait2;
	       morewait2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div[2]/div/div/div[2]/div/div/div[1]/button")));
	       
	       //click button
	       morewait2.click();
	       Thread.sleep(3000);
	       
	       //back to feed
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(6000);
	       
	       
	}
	
	
}
