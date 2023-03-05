Feature: Manage filters on the Vehicle Costs page

  Background: User is already logged as "sales manager"
    Given the user is on the login page
    And the user logged in as "sales manager"
    And the user click on the Vehicle Costs under the Fleet

  Scenario: US13AC1TC1 Verify user can see 3 columns on the Vehicle Model page
  Expected Column names: TYPE, TOTAL PRICE, DATE
    Then the user should see following titles in the table
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

  Scenario: US13AC2TC1 Verify user can check the first checkbox to check all the Vehicle Costs

    And the user click the first checkbox
    Then the user should see all the vehicle costs are checked