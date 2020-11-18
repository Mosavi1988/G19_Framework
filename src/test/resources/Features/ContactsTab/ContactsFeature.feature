Feature: As a User I should be able to create a contact

  Scenario: As a user I should be able to create a contact
    Given I am in the contact function page
    And I click on the create button
    And the user provides the required information
      |name        |Elvis Gravel  |
      |Street      |12135         |
      |City        |Annandale     |
      |State       |Virginia      |
      |Zip         |22405         |
      |Country     |Afghanistan   |
      |TIN         |5657          |
      |Tags        |Retailer      |
      |Job Position|Sales Director|
      |Phone       |5764345677    |
    Then I should be able to add new contact

