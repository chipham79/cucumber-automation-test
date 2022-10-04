package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LOCommandCenterPage;
import utils.TestContextSetup;

public class LOCommandCenterSteps 
{
    TestContextSetup testContextSetup;
    LOCommandCenterPage loCommandCenterPage;
    
    
    
    public LOCommandCenterSteps(TestContextSetup testContextSetup, LOCommandCenterPage loCommandCenterPage) {
        super();
        this.testContextSetup = testContextSetup;
        this.loCommandCenterPage = testContextSetup.pageObjectManager.getLoCommandCenterPage();
    }

    @When("^click on Message menu$")
    public void click_on_message_menu() throws Throwable {
        loCommandCenterPage.clickMessageMenu();
    }

    @Then("^I validate the outcomes$")
    public void i_validate_the_outcomes() throws Throwable {

    }

    @And("^Input the message \"([^\"]*)\"$")
    public void input_the_message_hello_tom(String message) throws Throwable {
        loCommandCenterPage.sendMessageToBorrower(message);
    }


}
