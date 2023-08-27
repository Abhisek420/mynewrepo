package com.test.TTA3xSele.drivers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManagerTL {
//ThreadLocal
	static WebDriver driver;
	public static final ThreadLocal<WebDriver> dr=new ThreadLocal<>();
	
	public static void setDriver(WebDriver driverRef) {
		dr.set(driverRef);
	}
	public static WebDriver getDriver() {
		return dr.get();
	}
	public static void unload() {
		dr.remove();
	}
	@BeforeMethod
	public static void init() {
		if(getDriver()==null)
		{
			ChromeOptions co=new ChromeOptions();
			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			setDriver(new ChromeDriver(co));
		}
	}
	
	
	@AfterMethod
	public static void down() {
		if(getDriver()!=null) {
			getDriver().quit();
		}
	}
}
