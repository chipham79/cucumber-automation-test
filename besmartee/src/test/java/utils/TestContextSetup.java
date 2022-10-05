package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup 
{
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public WebDriverManager webDriverManage;
	
	
	public String message;
	
	
	public TestContextSetup() throws IOException 
	{
		webDriverManage = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManage.createDriver());	
	}
}
