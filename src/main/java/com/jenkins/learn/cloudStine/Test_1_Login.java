package com.jenkins.learn.cloudStine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_1_Login {
	
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://cloudstineuat.com/home");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/sign-up/div[1]/div/div[2]/div/div[4]/form/div/div[1]/div/input")).sendKeys("Joy");
//		
//		Thread.sleep(700);
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/sign-up/div[1]/div/div[2]/div/div[4]/form/div/div[2]/div/input")).sendKeys("joy021@yopmail.com");
//		
//		Thread.sleep(700);
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/sign-up/div[1]/div/div[2]/div/div[4]/form/div/div[3]/div/input")).sendKeys("6666666666");
//		
//		Thread.sleep(700);
//		
//		driver.findElement(By.xpath("/html/body/app-root/div/sign-up/div[1]/div/div[2]/div/div[4]/form/div/div[4]/div/button")).click();
//		
//		Thread.sleep(700);
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		Thread.sleep(2000);

		driver.get("https://yopmail.com/en/");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("joy021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='md']")).click();

		Thread.sleep(1500);

		driver.switchTo().frame(2);

		Thread.sleep(1500);
		
//		driver.findElement(By.xpath("//*[@id=\"refresh\"]")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id='mail']/div"));
		Thread.sleep(1500);

		Actions actions = new Actions(driver);
		actions.doubleClick(element1).perform();

		Thread.sleep(1000);
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(1500);

		driver.close();
//		Thread.sleep(1500);
//		
//		WebElement element2 = driver.findElement(By.xpath("/html/body/app-root/div/sign-up/div[1]/div/div[2]/div/div[4]/div/div[1]/input"));
//		Thread.sleep(1500);
//		element2.click();
//		Thread.sleep(1000);
//		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		
	}
}
