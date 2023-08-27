package com.test.TTA3xSele.Web.tests;


import org.testng.annotations.Test;
import org.assertj.core.api.Assertions;
import com.test.TTA3xSele.Pages.DashboardPage;
import com.test.TTA3xSele.Pages.LoginPage;
import com.test.TTA3xSele.drivers.DriverManagerTL;
import com.test.TTA3xSele.utils.PropertyReader;

public class LoginTest {
@Test
private void testVWOloginPositive() throws Exception {
	// TODO Auto-generated method stub
DriverManagerTL.getDriver().get(PropertyReader.readKey("url"));
DashboardPage dashpage=new LoginPage().loginToVwo().afterLogin();
String expResult=dashpage.loggedInusername();
Assertions.assertThat(expResult).isNotEmpty().isNotBlank().isNotNull().contains(PropertyReader.readKey("expected_username"));

 
}

}
