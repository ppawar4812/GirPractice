package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_4_AddressDetails {

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
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/dashboard/app-data-grid/ag-grid-angular/div/div[1]/div[2]/div[3]/div[3]/div/div/app-action-renderer/a/i")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/deductor-details/div[2]/basic-info/div[2]/div/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_BranchName_2']")).sendKeys("Demo 1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_FlatDoor_3']")).sendKeys("D 1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_BuildingName_4']")).sendKeys("Ashirwad");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_RoadStreet_5']")).sendKeys("sadashiv peth  pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_AreaLocality_6']")).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_City_7']")).sendKeys("Ahmednagar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='formly_54_input_PinCode_8']")).sendKeys("414401");
		
		Thread.sleep(2000);
		
		
		WebElement state =  driver.findElement(By.xpath("//*[@id='formly_54_select_StateId_9']"));
		
		Select dropdown = new Select(state);
		
		Thread.sleep(400);
		
		dropdown.selectByVisibleText(" MAHARASHTRA ");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/deductor-details/div[2]/address-login/div[2]/div/button[2]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/tds-layout/div[2]/div/div/div/div/div/div/div/deductor-details/div[1]/span/a[1]/h5")).click();
		
		
		
		
	
}
}