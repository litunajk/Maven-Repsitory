package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemMaven {

	
	@Test
	public void method()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\My Project1\\MavenProject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	}
}
