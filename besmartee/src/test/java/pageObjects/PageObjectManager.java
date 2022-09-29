package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	public LenderLoginPage lenderLoginPage;
	public LOCommandCenterPage loCommandCenterPage;
	public PipelinePage pipelinePage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}


	public LenderLoginPage getLenderLoginPage() {
		lenderLoginPage = new LenderLoginPage(driver);
		return lenderLoginPage;
	}


	public LOCommandCenterPage getLoCommandCenterPage() {
		loCommandCenterPage = new LOCommandCenterPage(driver);
		return loCommandCenterPage;
	}


	public PipelinePage getPipelinePage() {
		pipelinePage = new PipelinePage(driver);
		return pipelinePage;
	}
	
	
	
	
	
}
