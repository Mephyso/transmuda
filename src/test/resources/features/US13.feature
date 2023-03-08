Feature: Manage filters on the Vehicle Costs page

  Background: User is on the login page
    Given the user is on the login page

  Scenario Outline: US13AC1TC1 Verify user can see 3 columns on the Vehicle Model page as "sales manager"
  Expected Column names: TYPE, TOTAL PRICE, DATE

    Given the user logged in as "<user>"
    And the user click on the Vehicle Costs under the Fleet
    Then the user should see following titles in the table
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | user          |
      | sales manager |
      | store manager |


  Scenario Outline: US13AC2TC1 Verify user can check the first checkbox to check all the Vehicle Costs as "sales manager"

    Given the user logged in as "<user>"
    And the user click on the Vehicle Costs under the Fleet
    And the user click the first checkbox
    Then the user should see all the vehicle costs are checked

    Examples:
      | user          |
      | sales manager |
      | store manager |


