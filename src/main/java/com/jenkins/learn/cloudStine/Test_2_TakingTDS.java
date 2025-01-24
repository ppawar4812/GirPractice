package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2_TakingTDS {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cloudstineuat.com/home");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/nav-component/div/header/div/ul/li[2]/div/button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/login/div[1]/div/div[2]/div/div[4]/form/div/div[1]/div/input")).sendKeys("joy021@yopmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/login/div[1]/div/div[2]/div/div[4]/form/div/div[2]/div/div/input")).sendKeys("12345678");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/login/div[1]/div/div[2]/div/div[4]/form/div/div[4]/div/button")).click();
		
		Thread.sleep(2000);
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0 , 500)");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-product-dashboard/div[5]/div/div[3]/div/div[1]/ul/li[2]/div/div[1]/div/h5")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-product-dashboard/div[5]/div/div[3]/div/div[2]/div/div[1]/div[3]/div/button")).click();
		
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(500 , 0)");
		
		
		
	}
}

// every time add new ID
