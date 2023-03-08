Feature:Vehicle contracts page

  Background: User is already in the log in page
    Given the user is on the login page

@yasemin
  Scenario Outline:US4AC1TC1 Sales Manager access the Vehicle contracts page
    Given the user logged in as "<user>"
    Then the user click the Vehicle Contracts under the Fleet
    And verify managers can access the Vehicle contracts page
    Examples:
      | user          |
      | sales manager |
      | store manager |


  Scenario:US4AC1TC2 Drivers can NOT access the Vehicle contracts page
    Given the user logged in as "driver"
    Then the user clicks the Vehicle Contracts under the Fleet
    Then the user verify that the drivers see the error message "You do not have permission to perform this action."

