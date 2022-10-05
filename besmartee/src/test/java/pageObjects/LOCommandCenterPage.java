package pageObjects;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOCommandCenterPage 
{
	public WebDriver driver;
	
	public LOCommandCenterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By menuMessages = By.cssSelector("#loanMessageLink");
	private By txtMessage = By.cssSelector("#messageBorrower");
	private By btnSend = By.cssSelector("#buttonSendBorrower");
	private By msgMessage = By.cssSelector("div.message-content");
	
	public void clickMessageMenu() throws InterruptedException {
	    Thread.sleep(5000);
	    driver.findElement(menuMessages).click();
	}
	
	public void sendMessageToBorrower(String message)
	{
	    driver.findElement(txtMessage).sendKeys(message);
	    driver.findElement(btnSend).click();
	}
	
	public boolean checkMessageDisplay(String message)
	{
	    List<WebElement> objects = driver.findElements(msgMessage);
	    for( WebElement msg : objects) 
	    {
	        String _message = msg.getText().trim();
	        if ( StringUtils.equals(_message, message)  ) {
	            return true;
	        }
	    }	    
	    return false;	    
	}
}
