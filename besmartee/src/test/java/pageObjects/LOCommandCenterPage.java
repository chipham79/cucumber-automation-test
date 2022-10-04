package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOCommandCenterPage 
{
	public WebDriver driver;
	
	public LOCommandCenterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By menuMessages = By.cssSelector("#loanMessageLink");
	private By txtMessage = By.cssSelector("#messageBorrower");
	private By btnSend = By.cssSelector("#buttonSendBorrower");
	
	public void clickMessageMenu() throws InterruptedException {
	    Thread.sleep(5000);
	    driver.findElement(menuMessages).click();
	}
	
	public void sendMessageToBorrower(String message)
	{
	    driver.findElement(txtMessage).sendKeys(message);
	    driver.findElement(btnSend).click();
	}
	
}
