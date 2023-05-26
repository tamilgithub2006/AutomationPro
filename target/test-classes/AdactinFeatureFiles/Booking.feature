Feature: To validate booking function for hotel booking

  Scenario: To validate booking option 	
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
    And user choose hotel
    And user click continue button
    When user enter first name
    And user enter last name
    And user enter billing address
    And user enter credit card number
    And user select credit card type
    And user select expiry date
    And user enter CVV number
    And user click book now button
    Then user sees the order number generated
 