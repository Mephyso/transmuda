Feature: Calender Events Page- Create a comment on the calendar

  Background: User is already in the log in page
    Given the user is on the login page


  @wip_10
  Scenario:US10AC1 verify note writing can be create under the calendar

    When  the user navigates to "Activities" , "Calendar Events"
    And   the user click on Create Calendar Event button
    And   writes a note to the description
    Then  User saves the typed note with Save and Close
