Feature: Main modules verification

  Background: User is already in the log in page
    Given the user is on the login page

  @B28G51-196 @mnr
  Scenario Outline: US1AC1TC1 Verify Store and sales managers should view 8 module names
    Given the user logged in as "<user>"
    Then the user should see main module names as listed
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | user          |
      | sales manager |
      | store manager |


    @B28G51-197 @mnr
  Scenario: US1AC2TC1 Verify Store and sales managers should view 8 module names
    Given the user logged in as "driver"
    Then the user should see main module names as listed
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |