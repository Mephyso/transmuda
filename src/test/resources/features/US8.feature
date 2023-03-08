
Feature:  Verify user to create a recurring(repetitive) calendar event.
  Background: User is already in the log in page
Feature:  Verify user to create a recurring(repetitive) calendar event.

  Background: User is already in the log in page
    Given the user logged in with username as "User1" and password as "UserUser123"

  @CreateEvent
  Scenario:  US8AC1TC1 users see the default repeat day as 1
    Given    User are on the homepage
    When     Click the “Calendar Events” under the Activities
    And      Click the “Create Calendar Event” button
    And      Check the Repeat checkbox
    Then     Verify the repeat number is 1

  @CreateEvent
  Scenario:  US8AC2TC1 users clear the repeat day and see an error message
    Given    User are on the homepage
    When     Click the “Calendar Events” under the Activities
    And      Click the “Create Calendar Event” button
    And      Check the Repeat checkbox
    And      Clear(delete) the number 1
    Then     Verify the app displays “This value should not be blank