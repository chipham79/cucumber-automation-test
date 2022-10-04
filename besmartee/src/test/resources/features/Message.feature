Feature: Message Function
  I want to go to loan application, and send a message to borrower on LO command center

  @msg
  Scenario: Verify that Loan officer send a message to borrower successfully
    Given loan officer go to 'lender login page'
    And input valid 'credentials'
    When search the loan by 'loan public id'
    When click on Message menu
    And Input the message "Hello, Tom"
    Then I validate the outcomes
