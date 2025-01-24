package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.ClientConfig;

public class Test_7_AddChallan {


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
		// TDS dashboard

		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/dashboard/app-data-grid/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")).click();
		
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.xpath("//div[@class='ag-center-cols-clipper']//div//div//div//div[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element1).click().perform();
		 
		 Thread.sleep(4200);
		
		 WebElement element2 = driver.findElement(By.xpath("//div[@class='py-2']//challan//div//button[3]"));
		 
		 action.moveToElement(element2).click().perform();
		
		Thread.sleep(2000);
		
//        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("12-09-2024");
//		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='formly_64_input_BSRCode_1']")).sendKeys("5555555");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_64_input_ChallanNo_2']")).sendKeys("44444");
		
		Thread.sleep(1000);
		
		WebElement A = driver.findElement(By.xpath("//input[@id='formly_64_input_TDSAmount_4']"));
		A.clear();
		Thread.sleep(500);
		A.sendKeys("50000");
		
		Thread.sleep(1000);
		
		WebElement B =driver.findElement(By.xpath("//input[@id='formly_64_input_EducationCess_5']"));
		B.clear();
		Thread.sleep(500);
		B.sendKeys("4500");
		
		Thread.sleep(1000);
		
		WebElement C = driver.findElement(By.xpath("//input[@id='formly_64_input_Surcharge_6']"));
		C.clear();
		Thread.sleep(500);
		C.sendKeys("1500");
		
		Thread.sleep(1000);
		
		WebElement D = driver.findElement(By.xpath("//input[@id='formly_64_input_InterestAmount_8']"));
		D.clear();
		Thread.sleep(500);
		D.sendKeys("1200");
		
		Thread.sleep(1000);
		
		WebElement E = driver.findElement(By.xpath("//input[@id='formly_64_input_OtherPenaltyAmount_9']"));
		E.clear();
		Thread.sleep(500);
		E.sendKeys("500");
		
		Thread.sleep(1000);
		
		WebElement F = driver.findElement(By.xpath("//input[@id='formly_64_input_FeeAmount_10']"));
		F.clear();
		Thread.sleep(500);
		F.sendKeys("150");
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/add-challan/div[2]/div/div[2]/button[1]")).click();
		
		
		


	}
}