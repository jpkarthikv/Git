package com.learnerhub.pages;

import com.framework.config.ConfigurationManager;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class LoginPage extends ProjectHooks{

	public LoginPage enterUsername(String username) {
		clearAndType(locateElement(Locators.ID, "userNameTxt"), username);
		reportStep("Username entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		clearAndType(locateElement(Locators.ID, "password"),  password);
		reportStep("Password entered successfully","pass");
		return this;
	}
	
	public LoginPage enterUsername() {
		return enterUsername(ConfigurationManager.configuration().appUserName());
	}
	
	public LoginPage enterPassword() {
		return enterPassword(ConfigurationManager.configuration().appPassword());
	}
	 
	public DashboardPage clickLogin() {
		click(locateElement(Locators.ID, "loginSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new DashboardPage();
	}

}
