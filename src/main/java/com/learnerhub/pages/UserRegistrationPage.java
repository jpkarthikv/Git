package com.learnerhub.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class UserRegistrationPage extends ProjectHooks{
	
	public UserRegistrationPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "userName"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public UserRegistrationPage selectRole() {
		selectDropDownUsingIndex(locateElement(Locators.ID, "roleDropdown"), 1);
		reportStep("Role is selected successfully","pass");
		return this;
	}
	
	
	public UserRegistrationPage enterName(String data) {
		clearAndType(locateElement(Locators.ID, "name"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	
	public UserRegistrationPage enterEmail(String data) {
		clearAndType(locateElement(Locators.ID, "email"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	
	public UserRegistrationPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	public UserRegistrationPage enterConfirmPassword(String data) {
		clearAndType(locateElement(Locators.ID, "cnfPassword"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	

	public UserRegistrationPage selectSecretQuestion() {
		selectDropDownUsingIndex(locateElement(Locators.ID, "secQuest"), 2);
		reportStep("Secret Question is selected successfully","pass");
		return this;
	}
	
	
	public UserRegistrationPage enterAnswer(String data) {
		clearAndType(locateElement(Locators.ID, "answer"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public DashboardPage clickRegister() {
		click(locateElement(Locators.XPATH, "//input[@type='submit']"));
		reportStep("Register button clicked successfully", "pass");
		return new DashboardPage();
	}
}
