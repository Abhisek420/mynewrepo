package com.test.TTA3xSele.base;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.TTA3xSele.drivers.DriverManagerTL;

public class BasePage {
protected BasePage() {}
//common methods like write,enter.click
protected void enter_Input(By by,String key) {
	DriverManagerTL.getDriver().findElement(by).sendKeys(key);
	}
protected void click_Element(By by) {
	DriverManagerTL.getDriver().findElement(by).click();
}
protected WebElement getElement(By by) {
	return DriverManagerTL.getDriver().findElement(by);
}
protected WebElement presenceOfElement(final By elementLocation) {
    return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
}

protected WebElement visibilityOfElementLocated(final By elementLocation) {
    return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
}

protected WebElement elementToBeClickable(final By elementIdentier) {
    WebElement element = new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(elementIdentier));
    return element;
}
}
