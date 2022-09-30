package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.LenderLoginPage;
import utils.TestContextSetup;

public class LenderLoginSteps 
{
	TestContextSetup testContextSetup;
	public LenderLoginPage lenderLoginPage;
	
	public LenderLoginSteps(TestContextSetup testContextSetup) {
        super();
        this.testContextSetup = testContextSetup;
        this.lenderLoginPage = testContextSetup.pageObjectManager.getLenderLoginPage();
    }



    @Given("^loan officer go to 'lender login page'$")
    public void loan_officer_go_to_login_lender_page() throws Throwable {
		System.out.println("Go to lender login page");
		lenderLoginPage.openLenderPage("https://staging.besmartee.com/lender/login/QQBNWFLI");		
		
    }

}
