package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.UiHelper;

public class PageObjectManager 
{
	public WebDriver driver;
	private LenderLoginPage lenderLoginPage;
	private LOCommandCenterPage loCommandCenterPage;
	private PipelinePage pipelinePage;
	UiHelper uiHepler;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}


	public LenderLoginPage getLenderLoginPage() {
		lenderLoginPage = new LenderLoginPage(driver, uiHepler);
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
