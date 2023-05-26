Feature: To validate select function for hotel booking

  Scenario: To validate select option 	
    Given user launch adactin hotel application
    And user enter username and password
    And user click login button
    And user select location
    And user select hotels
    And user select room type
    And user select number of rooms
    And user enter check in date 
    And user enter check out date 
    And user select adults per room
    And user select child per room
    And user click search button
    When user choose hotel
    And user click continue button
    Then user sees the title book a hotel in the next page
 