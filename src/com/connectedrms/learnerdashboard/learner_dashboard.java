package com.connectedrms.learnerdashboard;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class learner_dashboard {
	
	
	public void invokeBrowser(WebDriver driver,WebDriverWait wait,JavascriptExecutor jse) throws InterruptedException {
		

	       //stores url
	       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	       
	       
	       // browse course
	       driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[2]/a")).click();
	       
	       //wait
	       WebElement coursewait1;
	       coursewait1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/a")));
	       
	       //click button
	       coursewait1.click();
	       Thread.sleep(3000);
	       
	       
	       //viewcoursedetails
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(5000);
	       
		   jse.executeScript("scroll(0, -250);");
		   Thread.sleep(3000);
		   
		   //feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
	       
	       //certificate
	       driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[3]/a")).click();
	       Thread.sleep(3000);
	       
	       //View certificate
	       driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/a[1]")).click();
	       Thread.sleep(3000);
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       
	       //download certificate
	       driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/div[3]/a")).click();
	       Thread.sleep(5000);
	       
	       //previous tab
	       driver.switchTo().window(tabs.get(0));
	       
	       //scrollup
	       jse.executeScript("scroll(0, -500);");
	       Thread.sleep(3000);
	       
	       //export
	       driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[3]/a")).click();//certificate page
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"btn-enrol2\"]")).click();
	       Thread.sleep(5000);
	       driver.switchTo().window(tabs.get(0));
	       Thread.sleep(1000);
	       
	       //review
	       driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/a[3]")).click();
	       Thread.sleep(5000);
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       jse.executeScript("scroll(0, -500);");
	       Thread.sleep(3000);
	       
	      
	       //video
	       driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[4]/a")).click();
	       Thread.sleep(3000);
		
	       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	       Thread.sleep(3000);
	       jse.executeScript("scroll(0, -500);");
	       Thread.sleep(3000);
	       
	       //readmore
	       WebElement input= driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/a"));
	       input.sendKeys(Keys.ENTER);		
	       //input.click();
	       Thread.sleep(3000);
	       
	       //model pop up
	       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[2]/div/div[5]/div/div/div[2]/button")));
	       element.click();
	      
	       //driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div/div/div[2]/div/div[5]/div/div/div[2]/button")).click();
		   Thread.sleep(3000);
		   
		   //playvideo
		   //Actions act = Actions(driver);
		   //act.moveToElement("div.inner_block:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > img:nth-child(1)").click().build().perform();


		   //WebElement input2= driver.findElement(By.cssSelector("div.inner_block:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > img:nth-child(1)"));
		   //input2.sendKeys(Keys.ENTER);
	       //input2.click();
	       //Thread.sleep(3000);
		   
	       
	       
	       //feed
	       driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
	       Thread.sleep(3000);
	       
	       //feed course
		   driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/button")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/div/div/div/div[1]/div[2]/div[2]/a")).click();
		   Thread.sleep(6000);
		   jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		   Thread.sleep(3000);
		   jse.executeScript("scroll(0, -250);");
		   Thread.sleep(3000);
		       
		       
		   //goesback to feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
		       
		   //view feed certificate
		   driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/button")).click();
		   Thread.sleep(3000);
		       
		   //goesback to feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
		       
		   //bsa feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[3]/div[1]/div[2]/div[1]/div/a/div")).click();
		   Thread.sleep(5000);
		       
		   //previous tab
		   driver.switchTo().window(tabs.get(0));
		   Thread.sleep(3000);
		   
		   
		   
		   //course feed expand
		   driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[1]/div[2]/div/div[2]/a")).click();
		   Thread.sleep(3000);
		   
		   //goesback to feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
		   
		   //certificate expand
		   driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div[2]/div[2]/a")).click();
		   Thread.sleep(3000);
		   
		   //goesback to feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
		   
		   //bsa expand
		   driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[3]/div[1]/div[2]/div[2]/a")).click();
		   Thread.sleep(3000);
		   
		   //goesback to feed
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
		   
	       //logout
		   driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[3]/ul/li/a/img")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector(".btn")).click();
		   Thread.sleep(3000);
		   
		   
	}

}
