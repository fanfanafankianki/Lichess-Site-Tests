Feature: Feature to test login functionality

  Scenario: Check login is succesfull with valid credentials
    Given user is on login page
    When user enters valid <username> and <password>
    And click on login button
    Then user is navigated to the home page
    And user username is displayed in right corner

    Examples: 
    | username | password |
    | TestingAccount321 | Lichesstesting123 |