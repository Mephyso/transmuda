Feature: Manage filters on the Vehicle Costs page

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: US13AC1TC1 Verify user can access the Oroinc Doc Page
    Given the user logged in as "sales manager"
    And the user click on the question icon
    Then the user should see "Welcome to Oro Documentation"