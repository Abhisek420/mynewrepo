package com.test.TTA3xSele.Pages;


import org.openqa.selenium.By;

import com.test.TTA3xSele.base.BasePage;
import com.test.TTA3xSele.utils.PropertyReader;


public class LoginPage extends BasePage {
	public LoginPage() {
        super();
    }

    // Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");

    By error_message = By.id("js-notification-box-msg");
public LoginPage loginToVwo() throws Exception {
	enter_Input(username, PropertyReader.readKey("username"));
	enter_Input(password, PropertyReader.readKey("password"));
	click_Element(signButton);
	return this;
}
public DashboardPage afterLogin() {
	return new DashboardPage();
}



}