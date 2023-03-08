Feature: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

Background: User is already in the log in page
Given the user logged in with username as "User1" and password as "UserUser123"


  Scenario:  US9AC1TC1 users should see the error message when the entered number less than 1
    Given    User are on the homepage
    When     Click the "Calendar Events" under the "Activities"
    And      Click the “Create Calendar Event” button
    And      Click the Repeat checkbox
    Then     See error messages when entering -2 verify the app displays "The value have not to be less than 1."



  Scenario:  US9AC1TC2 users should see the error message when the entered number more than 99
    Given    User are on the homepage
    When     Click the "Calendar Events" under the "Activities"
    And      Click the “Create Calendar Event” button
    And      Click the Repeat checkbox
    Then      See error messages when entering 123 verify the app displays "The value have not to be more than 99."
