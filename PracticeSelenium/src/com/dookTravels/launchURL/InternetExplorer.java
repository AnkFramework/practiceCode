package com.dookTravels.launchURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.", "C:\\Users\\Ankit\\Desktop\\selenium\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		
		
		
		
	}

}
