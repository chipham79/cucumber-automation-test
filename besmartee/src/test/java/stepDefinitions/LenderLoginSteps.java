package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.LenderLoginPage;
import utils.TestContextSetup;

public class LenderLoginSteps 
{
	TestContextSetup testContextSetup;
	public LenderLoginPage lenderLoginPage;
	private String email = "chi.pham@besmartee.com";
	private String password = "P@ssword1";
	
	public LenderLoginSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.lenderLoginPage = testContextSetup.pageObjectManager.getLenderLoginPage();
    }



    @Given("^loan officer go to 'lender login page'$")
    public void loan_officer_go_to_login_lender_page() throws Throwable {
		lenderLoginPage.openLenderPage("https://staging.besmartee.com/lender/login/QQBNWFLI");		
    }
    
    @And("^input valid 'credentials'$")
    public void input_valid_credentials() throws Throwable {
        lenderLoginPage.enterCredentialLoanOfficer(email, password);
    }

}
