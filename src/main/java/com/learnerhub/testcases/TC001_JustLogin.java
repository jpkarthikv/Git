package com.learnerhub.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.learnerhub.pages.LoginPage;

public class TC001_JustLogin extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Login";
		testDescription ="Login to Learner Hub";
		authors="Babu";
		category ="Smoke";
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickLogout();

	}

}
