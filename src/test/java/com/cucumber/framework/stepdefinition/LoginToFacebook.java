package com.cucumber.framework.stepdefinition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.framework.helper.TestBase.TestBase;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToFacebook {
	
	@Given("^User navigated to FACEBOOK\\.COM$")
	public void user_navigated_to_FACEBOOK_COM() throws Throwable {
		TestBase.driver.get("https://www.facebook.com/");
	}

	@When("^user enter Username as \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enter_Username_as_and_Password(String arg1, String arg2) throws Throwable {
		TestBase.driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(arg1);
		TestBase.driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(arg2);
		
		
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		TestBase.driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		TestBase.driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
