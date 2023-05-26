Feature: To validate search function for hotel booking

  Scenario: To validate search options 	
    Given user launch adactin hotel application
    And user enter username and password
    And user click login button
    When user select location
    And user select hotels
    And user select room type
    And user select number of rooms
    And user enter check in date 
    And user enter check out date 
    And user select adults per room
    And user select child per room
    And user click search button
    Then user sees the title select hotel in the next page
 