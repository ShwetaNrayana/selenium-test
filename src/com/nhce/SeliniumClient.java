package com.nhce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeliniumClient 
{
public static void main(String[] args) throws InterruptedException
 {
System.setProperty("webdriver.chrome.driver","D://APPLICATION//chromedriver_win32//chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 Thread.sleep(10000);
 driver.close();
 }
}