Feature: Customers’ info on the Account page

  Background: User is already in the log in page
    Given the user is on the login page

@Aylin
  Scenario: US12AC1TC1 Verify user can see 8 filter items on the Accounts page
  Expected Filter names: ACCOUNT NAME, CONTACT NAME , CONTACT EMAIL, CONTACT PHONE, OWNER, BUSINESS UNIT, CREATED AT, UPDATED AT

  Given the user logged in as "sales manager"
    And the user Click the "Accounts" under the Customers
    And the user Click the Filters button
    Then the user should see following titles on the columns

      | Account Name: All |
      | Contact Name: All |
      | Contact Email: All|
      | Contact Phone: All|
      | Owner: All |
      | Business Unit: All|
      | Created At: All|
      | Updated At: All|



