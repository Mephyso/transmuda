Feature: Users learn how to use the pinbar

  Background: User is on the login page
    Given the user is on the login page

  Scenario Outline: US3AC1TC1 Verify user can see messages

    Then the user logged in as "<user>"
    And the user click on the Learn how to use this space message
    Then Verify user can see these messages "How To Use Pinbar" and "Use pin icon on the right top corner of page to create fast access link in the pinbar."

    Examples:
      | user          |
      | sales manager |
      | store manager |
      | driver        |


  Scenario Outline: US3AC2TC1 Verify users see an image (Automation testing - verify image source)

    Then the user logged in as "<user>"
    And the user click on the Learn how to use this space message
    Then the user should see an example image

    Examples:
      | user          |
      | sales manager |
      | store manager |
      | driver        |
