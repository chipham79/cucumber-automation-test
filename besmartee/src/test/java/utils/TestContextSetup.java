package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup 
{
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public WebDriverManage webDriverManage;
	
	public TestContextSetup() throws IOException 
	{
		webDriverManage = new WebDriverManage();
		pageObjectManager = new PageObjectManager(webDriverManage.createDriver());	
	}
}
