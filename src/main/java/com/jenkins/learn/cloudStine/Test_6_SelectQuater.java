package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test_6_SelectQuater {
	
	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();

		driver.get("https://cloudstineuat.com/home");

		Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		// Loging

		driver.findElement(By.xpath("/html/body/app-root/nav-component/div/header/div/ul/li[2]/div/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/app-root/div/login/div[1]/div/div[2]/div/div[4]/form/div/div[1]/div/input")).sendKeys("joy021@yopmail.com");

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/app-root/div/login/div[1]/div/div[2]/div/div[4]/form/div/div[2]/div/div/input")).sendKeys("12345678");

		Thread.sleep(1000);
		
		// CLick Next Button

		driver.findElement(By.xpath("/html/body/app-root/div/login/div[1]/div/div[2]/div/div[4]/form/div/div[4]/div/button")).click();

		Thread.sleep(2000);
		
		// CLick for goes to TDS Dashboard
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-product-dashboard/div[2]/div[5]/div/div[3]/div/button")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/dashboard/app-data-grid/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")).click();
		
//		WebElement element1 = 
//		Actions click = new Actions(driver);
//		click.doubleClick(element1);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/tds-return/div[1]/div/div/div[2]/button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/tds-return/div[3]/div/div/div[2]/form/div/div[3]/button")).click();
		
		
}
}