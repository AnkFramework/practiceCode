package com.dookTravels.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ankit\\Desktop\\selenium\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Ankit");
		
		driver.findElement(By.name("lastname")).sendKeys("Srivastava");
		
		driver.findElement(By.cssSelector("#submit")).click();
		
		Thread.sleep(15);
		
		driver.quit();
	

	}

}
