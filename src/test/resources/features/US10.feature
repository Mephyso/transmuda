Feature: Calender Events Page- Create a comment on the calendar

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario:US10AC1 verify note writing can be create under the calendar
    Given the user logged in as "sales manager"
    When     Click the "Calendar Events" under the "Activities"
    And      Click the “Create Calendar Event” button
    Then   writes "This is an example text for our test case." to the description box
