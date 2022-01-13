package com.nhce;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","D:\\APPLICATION\\geckodriver-v0.30.0-win64//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(5000);
	driver.get("http://demo.guru99.com/test/newtours//");
	Thread.sleep(5000);
	List<WebElement>e = driver.findElements(By.tagName("a"));
	System.out.println(e.size());
	for(int i=0; i<e.size(); i=i+1)
	{
	System.out.println(e.get(i).getText());
	}
	driver.close();
	}
	}



