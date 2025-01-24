package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncomTax {
	
	public static void main(String[] args) throws Exception{
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(500);

	driver.get("https://www.incometax.gov.in/iec/foportal/");
	
	Thread.sleep(500);
	
	driver.manage().window().maximize();

	Thread.sleep(1200);
	
	driver.findElement(By.id("login")).click();
	
	driver.findElement(By.id("panAdhaarUserId")).sendKeys("CSWPP7025G");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text() = ' Continue ']")).click();
	
//	Thread.sleep(1000);
	

}
}
