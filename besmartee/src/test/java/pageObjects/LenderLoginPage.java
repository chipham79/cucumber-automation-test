package pageObjects;

import org.openqa.selenium.WebDriver;

public class LenderLoginPage 
{
	public WebDriver driver;
	
	public LenderLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openLenderPage(String url) {
	    driver.get(url);
	}
}
