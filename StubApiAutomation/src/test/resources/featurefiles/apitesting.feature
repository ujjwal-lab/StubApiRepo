#Author: ujjwal
@testsuite
Feature: This feature is to test the stub api response

  @getcustomer
  Scenario Outline: To verify list of all customer returned by get api
    Given User has the all customer endpoint Uri
    When User hit the get all customer endpoint "<endpoint>"
    Then Verify the <status> code for get all customer endpoint
    And check the <count> of records in response

    Examples: 
      | endpoint       | status | count |
      | getAllCustomer |    404 |     6 |

  @getspecificcust
  Scenario Outline: To verify specific response of each customer
    Given User has the specific customer endpoint Uri
    When User hit the get specific customer endpoint "<endpoint>"
    Then Verify success <status> code
    And verify "<email>" "<firstname>" "<lastname>"

    Examples: 
      | endpoint          | status | email           | firstname    | lastname    |
      | getCustomerFound1 |    200 | testerA@abc.com | testerBFirst | testerBLast |
      | getCustomerFound2 |    200 | testerB@abc.com | testerBFirst | testerBLast |
      | getCustomerFound3 |    200 | testerC@abc.com | testerCFirst | testerCLast |
      | getCustomerFound4 |    200 | testerD@abc.com | testerDFirst | testerDLast |
      | getCustomerFound5 |    200 | testerE@abc.com | testerEFirst | testerELast |
      | getCustomerFound6 |    200 | testerF@abc.com | testerFFirst | testerFLast |

  @negative
  Scenario Outline: To verify response when invalid customer Id is passed
    Given User has the endpoint Uri
    When User hit the endpoint "<endpoint>"
    Then Verify failure <status> code
    And Verify "<error_msg>" and "<statusmsg>" "<code>"in response

    Examples: 
      | endpoint           | status | error_msg | statusmsg                   | code |
      | getInvalidCustomer |    404 | fail      | Customer details not found. |    1 |
