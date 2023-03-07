
Feature:  Verify user to create a recurring(repetitive) calendar event.
  Background: User is already in the log in page
    Given the user is on the login page
  @login
  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    @calender

  Scenario: users see the default repeat day as 1
    Given	Users are on the homepage
     When   Click the “Calendar Events” under the Activities
      And 	Click the “Create Calendar Event” button
      And	Check the Repeat checkbox
      Then	Verify the repeat number is 1

  Scenario: users clear the repeat day and see an error message
    Given	Users are on the homepage
      When	Click the “Calendar Events” under the Activities
      And	Click the “Create Calendar Event” button
      And	Check the Repeat checkbox
      And	Clear(delete) the number 1
    Then    Verify the app displays “This value should not be blank

