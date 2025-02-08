package com.learnerhub.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.framework.utils.FakerDataFactory;
import com.learnerhub.pages.LoginPage;

public class TC002_Register extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Register";
		testDescription ="Register a new user";
		authors="Babu";
		category ="Smoke";
	}
	
	@Test
	public void runRegister() {
		
		String username = FakerDataFactory.getFirstName();
		String password = "testleaf";
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickRegister()
		.enterUsername(username)
		.selectRole()
		.enterName(username)
		.enterEmail(FakerDataFactory.getEmailAddress())
		.enterPassword(password)
		.enterConfirmPassword(password)
		.selectSecretQuestion()
		.enterAnswer(password)
		.clickRegister()
		.clickLogout();
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
	}

}
