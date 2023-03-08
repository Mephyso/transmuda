
@Nihal
Feature: Vehicles Odometers Page Verification

  Background: User is already in the log in page
    Given the user is on the login page



 Scenario Outline: US11-AC1-TC1  Verify the managers see the error message

    Given the user logged in as <userType>
    And the user navigates to <tab> - <module>
    Then the user should see error message "You do not have permission to perform this action."

    Examples:
    | userType        | tab     | module             |
    | "sales manager" | "Fleet" | "Vehicle Odometer" |
    | "store manager" | "Fleet" | "Vehicle Odometer" |



    Scenario: US11-AC2-TC1 Verify user can see the default page as 1
    Given the user logged in as "driver"
    And the user navigates to "Fleet" - "Vehicle Odometer"
    Then verify the default page as 1




   Scenario: US11-AC3-TC1 Verify user can see View Per Page is 25
    Given the user logged in as "driver"
    And the user navigates to "Fleet" - "Vehicle Odometer"
    Then verify the View Per Page is 25