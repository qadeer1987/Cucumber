Feature: Login related scenarios
  Scenario: Valid admin login
    #don't add anything in the step after creating
    Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application

