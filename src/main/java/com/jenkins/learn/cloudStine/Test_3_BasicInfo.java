package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_3_BasicInfo {

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
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-product-dashboard/div[2]/div[5]/div/div[3]/div/button")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/dashboard/div/div/div[3]/button")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_65_input_DeductorName_2']")).sendKeys("Joy Industry");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_65_input_PAN_3']")).sendKeys("QQQPQ0030Q");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_65_input_TAN_4']")).sendKeys("QQQQ00030Q");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_65_input_GSTN_5']")).sendKeys("27QQQPQ0030Q1Z5");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_65_input_MobileNo_6']")).sendKeys("6666666666");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_65_input_EMailId_7']")).sendKeys("joy022@yopmail.com");
		
		Thread.sleep(2000);
		
		WebElement TypeOfDeductor = driver.findElement(By.xpath("//*[@id='formly_65_select_DeductorTypeId_8']"));
		
		Select dropdown = new Select(TypeOfDeductor);
		
		Thread.sleep(400);
		
		dropdown.selectByVisibleText(" Company ");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/deductor-details/div[2]/basic-info/div[2]/div/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/deductor-details/div[1]/span/a[1]/h5")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}