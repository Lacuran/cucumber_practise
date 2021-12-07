Feature: Login feature

  Scenario: User Login Scenario
    Given User is on Application Home Page
    When Application Page Title is The Internet
    Then User clicks on Form Authentication
    Then User enters username and password
    And User clicks on Login Button
    When Application Alert is present
    Then User clicks Logout button
    And Application Logout Alert is present