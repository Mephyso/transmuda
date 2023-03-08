Feature: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

Background: User is already in the log in page
Given the user logged in with username as "User1" and password as "UserUser123"

  @CreateEvent
  Scenario:  US9AC1TC1 users see the default repeat day as 1
    Given    User are on the homepage
    When     Click the “Calendar Events” under the Activities
    And      Click the “Create Calendar Event” button
    And      See error messages for entering invalid integers
    Then     Verify the app displays "The value have not to be less than 1"


  @CreateEvent
  Scenario:  US9AC2TC1 users clear the repeat day and see an error message
    Given    User are on the homepage
    When     Click the “Calendar Events” under the Activities
    And      Click the “Create Calendar Event” button
    And      Check the Repeat checkbox
    And      see error messages for entering invalid integers
    Then     Verify the app displays "The value have not to be more than 99"