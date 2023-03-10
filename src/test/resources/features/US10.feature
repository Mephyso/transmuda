Feature: Calender Events Page- Create a comment on the calendar

  Scenario:US10AC1 verify note writing can be create under the calendar
    Given the user logged in as "salesmanager"
    When     Click the "Calendar Events" under the "Activities"
    And      Click the “Create Calendar Event” button
    And   writes a note to the description
    Then  User saves the typed note with Save and Close
