package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PipelinePage 
{
	public WebDriver driver;
	
	public PipelinePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By txtSearch = By.cssSelector("#searchValue");
	private By iconSearch = By.cssSelector("#pipelineSearchButton span");
	
	
	public void findLoanByPublicID(String loanPublicID) throws InterruptedException
	{
	    driver.findElement(txtSearch).sendKeys(loanPublicID);
	    Thread.sleep(2000);
	    driver.findElement(iconSearch).click();
	}
	
	public void openApplicationByPublicID(String loanPublicID) throws InterruptedException
	{  
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a[href='/lender/loan/"+loanPublicID+"/application']")).click();
	}
}
