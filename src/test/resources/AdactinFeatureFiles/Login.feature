Feature: To validate the login functionality

  Scenario: To validate login using valid username and valid password
    Given user launch adactin hotel application
    When user enter username and password
    And user click login button
    Then user see the homepage for valid password
    