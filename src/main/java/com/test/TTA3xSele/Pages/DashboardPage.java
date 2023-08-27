package com.test.TTA3xSele.Pages;

import org.openqa.selenium.By;

import com.test.TTA3xSele.base.BasePage;

public class DashboardPage extends BasePage{
	DashboardPage(){}
		By usernameDashboard=By.cssSelector("[data-qa=\"lufexuloga\"]");
		public String loggedInusername() {
			presenceOfElement(usernameDashboard);
			return getElement(usernameDashboard).getText();
		
	}
}
