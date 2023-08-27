package com.test.TTA3xSele.Web.Testbase;

import java.io.ByteArrayInputStream;
import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.test.TTA3xSele.drivers.DriverManagerTL;

import io.qameta.allure.Allure;

public class TestBase {
@BeforeMethod
protected void setup() {
	DriverManagerTL.init();
}

@AfterMethod
protected void teardown() {
	DriverManagerTL.down();
}
protected void takesScreenshot(String name) {
	Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)DriverManagerTL.getDriver()).getScreenshotAs(OutputType.BYTES)));
	
}
}
