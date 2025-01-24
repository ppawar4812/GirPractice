package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_8_AddEmolpyee {


	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://cloudstineuat.com/home");

		Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Loging
		
		driver.get("https://cloudstineuat.com/login");

//		driver.findElement(By.xpath("/html/body/app-root/nav-component/div/header/div/ul/li[2]/div/button")).click();

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

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text() = 'Employee(Annexure I)']")).click();
		
//		action.moveToElement(element2).click().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text() = ' Add Employee']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_224_input_EMPID_0']")).sendKeys("D001");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_224_input_Name_2']")).sendKeys("Jonyy Deep");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_224_input_PANNo_3']")).sendKeys("QQQPQ0026Q");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_224_input_DateOfPayment_5']")).sendKeys("09-09-2024");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_224_input_DateOfDeduction_6']")).sendKeys("16-09-2024");
		
		Thread.sleep(1000);
		
		WebElement A = driver.findElement(By.xpath("//input[@id='formly_224_input_AmountPaid_8']"));
		A.clear();
		Thread.sleep(200);
		A.sendKeys("70000");
		
		Thread.sleep(1000);
		
		WebElement B = driver.findElement(By.xpath("//input[@id='formly_224_input_TDSAmount_9']"));
		B.clear();
		Thread.sleep(200);
		B.sendKeys("7000");
		
		Thread.sleep(1000);
		
		WebElement C = driver.findElement(By.xpath("//input[@id='formly_224_input_EducationCess_13']"));
		C.clear();
		Thread.sleep(200);
		C.sendKeys("1000");
		
		Thread.sleep(1000);
		
		WebElement D = driver.findElement(By.xpath("//input[@id='formly_224_input_Surcharge_14']"));
		D.clear();
		Thread.sleep(200);
		D.sendKeys("500");
		
		
		Thread.sleep(1000);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='formly_224_custom-select_ReasonTypeId_15']"));
		
		Select dropdown = new Select(element2);
		
		dropdown.selectByVisibleText(" A ");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='formly_224_input_CertificateNo_16']")).sendKeys("241224112");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("id='formly_448_input_CertificateNo_16'")).sendKeys("7654321");
		
		Thread.sleep(1200);
		
		driver.findElement(By.xpath("//button[text() = 'Save & Add More']")).click();
		

	}
}
