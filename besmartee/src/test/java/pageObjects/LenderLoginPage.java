package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LenderLoginPage 
{
	public WebDriver driver;
	
	public LenderLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By txtEmail = By.cssSelector("#email");
	private By txtPassword = By.cssSelector("#password");
	private By btnLogin = By.cssSelector("button[type='submit']");      
	
	public void openLenderPage(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(3000);
	}
	
	public void enterCredentialLoanOfficer(String email, String password) throws InterruptedException 
	{
	    driver.findElement(txtEmail).sendKeys(email);
	    driver.findElement(txtPassword).sendKeys(password);
	    driver.findElement(btnLogin).click();
	    Thread.sleep(5000);
	}
}
