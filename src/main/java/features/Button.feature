Feature: Add and Remove button feature

  Scenario: User can add button
    Given User is on Application Web Page
    When App Page Title is The Internet
    Then User clicks on Add or Remove Elements on HomePage
    Then User clicks on Add element
    And Delete button is present

  Scenario: User can remove button
    Given User is on App Home Page
    When Web Page Title is The Internet
    Then User clicks on Add or Remove Elements on HomePage
    Then User clicks on Add element
    Then User clicks on delete button
    And Delete button is absent
