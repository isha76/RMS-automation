package com.connectedrms.admindashboard;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Admindashboard {
	
     public void feed1(WebDriver driver,WebDriverWait wait) throws InterruptedException{  
	  
	       Thread.sleep(5000);

	       //edit post
	       driver.findElement(By.cssSelector("section.block:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1) > i:nth-child(1)")).click();
	       driver.findElement(By.cssSelector(".open > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
	       driver.findElement(By.cssSelector("#news_edit-8d4c0b8e-ae16-4284-8720-8b0ddd2ce50c > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > form:nth-child(2) > div:nth-child(6) > div:nth-child(2) > input:nth-child(1)")).click();
	       
	       //close tab
	       driver.findElement(By.cssSelector(".white-text")).click();
	       Thread.sleep(3000);
	       
	       //assign partner
	       driver.findElement(By.cssSelector("section.block:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1) > i:nth-child(1)")).click();
	       driver.findElement(By.cssSelector(".open > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
	       
	       //radio button
	       WebElement radio1 = driver.findElement(By.id("all_organisations_yes"));							
	       radio1.click();
	       
	       //checkbox
	       driver.findElement(By.name("visibleToAdminOnlyFlag")).click();
	       
	       //assign button
	       driver.findElement(By.cssSelector("#news_assign_to_partners-8d4c0b8e-ae16-4284-8720-8b0ddd2ce50c > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(1) > form:nth-child(2) > div:nth-child(5) > div:nth-child(1) > input:nth-child(1)")).click();
	     
	       //close tab
	       driver.findElement(By.cssSelector(".white-text")).click();
	       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	       //AHQ logo
	       Thread.sleep(3000);
	       driver.findElement(By.cssSelector(".sub-img")).click();
	       Thread.sleep(5000);
	       driver.switchTo().window(tabs.get(0));
	       Thread.sleep(2000);
	       
	       
	       //profile
	       
	       //click logo
	       driver.findElement(By.cssSelector(".login-tool > img:nth-child(1)")).click();
	       Thread.sleep(3000);
	       //learner dashboard
	       driver.findElement(By.cssSelector(".user-menu > li:nth-child(3) > a:nth-child(1)")).click();
	       //...... goes to learner dashboard
	       Thread.sleep(10000);
	       //click logo
	       driver.findElement(By.cssSelector(".login-tool > img:nth-child(1)")).click();
	       Thread.sleep(3000);
	       //admin dashboard
	       driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)")).click();
	       Thread.sleep(5000);
	       
	       //click logo
	       driver.findElement(By.cssSelector(".login-tool > img:nth-child(1)")).click();
	       Thread.sleep(3000);
	       //purchase
	       driver.findElement(By.cssSelector(".user-menu > li:nth-child(4) > a:nth-child(1)")).click();
	       Thread.sleep(3000);
	       
	       //click logo
	       driver.findElement(By.cssSelector(".login-tool > img:nth-child(1)")).click();
	       Thread.sleep(3000);
	       //partners
	       driver.findElement(By.cssSelector(".user-menu > li:nth-child(5) > a:nth-child(1)")).click();
	     
	       //REMOVE PARTNERS
	       driver.findElement(By.cssSelector("div.bundle_courses_block_heading:nth-child(1) > div:nth-child(3) > a:nth-child(2)")).click();
	       
	       //cancel
	       WebElement wait1;
	       wait1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[2]/div[2]/a")));
	       
	       //click button
	       wait1.click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.cssSelector(".navigation > li:nth-child(1) > a:nth-child(1)")).click();
	       Thread.sleep(5000);
	      	       
}
	
}
