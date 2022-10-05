package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.*;
import utils.UiHelper.UiLocator;

public class LenderLoginPage 
{
	public WebDriver driver;
	UiHelper uiHelper;
	
	public LenderLoginPage(WebDriver driver, UiHelper uiHepler) {
        super();
        this.driver = driver;
        
    }

	
	private WebElement txtEmail = uiHelper.tryGetElement(UiLocator.Css, "#email");
	private WebElement txtPassword = uiHelper.tryGetElement(UiLocator.Css, "#password");
	private WebElement btnLogin = uiHelper.tryGetElement(UiLocator.Css, "button[type='submit']");   
	
	public void openLenderPage(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(3000);
	}
	
	public void enterCredentialLoanOfficer(String email, String password) throws InterruptedException 
	{   
	    txtEmail.sendKeys(email);
	    txtPassword.sendKeys(password);
	    btnLogin.click();
	    
	    Thread.sleep(5000);
	}
}
