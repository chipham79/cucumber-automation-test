package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.PipelinePage;
import utils.TestContextSetup;

public class PipelineSteps 
{
    
    PipelinePage pipelinePage;
    TestContextSetup testContextSetup;
    
    private String loanPublicID = "9MES3ZGQ";
    
    public PipelineSteps(TestContextSetup testContextSetup) 
    {
        super();
        this.testContextSetup = testContextSetup;
        this.pipelinePage = testContextSetup.pageObjectManager.getPipelinePage();
    }

    @When("^search the loan by 'loan public id'$")
    public void search_the_loan_by_loan_public_id() throws Throwable 
    {
        pipelinePage.findLoanByPublicID(loanPublicID);
        pipelinePage.openApplicationByPublicID(loanPublicID);
        Thread.sleep(5000);
    }

}
