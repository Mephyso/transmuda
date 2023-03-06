Feature: Edit car info icons from the Vehicle page.

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario: US2AC1TC1 Verify users see the car edited options on the Vehicle page
    Given the user logged in as "sales manager"
    And   Click the Vehicles under the Fleet
    Then user should see any car info has 3 dots “...”, and there are “view, edit, delete” icons.

