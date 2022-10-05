package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LOCommandCenterPage;
import utils.TestContextSetup;

public class LOCommandCenterSteps 
{
    TestContextSetup testContextSetup;
    LOCommandCenterPage loCommandCenterPage;
    public String _message;
        
    public LOCommandCenterSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.loCommandCenterPage = testContextSetup.pageObjectManager.getLoCommandCenterPage();
    }

    @When("^click on Message menu$")
    public void click_on_message_menu() throws Throwable {
        loCommandCenterPage.clickMessageMenu();
    }

    @Then("^I validate the outcomes message display$")
    public void i_validate_the_outcomes() throws Throwable {        
        boolean result = loCommandCenterPage.checkMessageDisplay(_message);
        System.out.println(result);
        Assert.assertTrue(result);
        
    }

    @And("^Input the message \"([^\"]*)\"$")
    public void input_the_message_hello_tom(String message) throws Throwable {
        this._message = message;
        loCommandCenterPage.sendMessageToBorrower(message);
    }


}
