@smoke
Feature: Switch Currency | user could switch between the available currencies
  Background:
    # user Login
    Given user go to login page
    When user login with "valid" "Test1@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

Scenario: user make sure about the default currency
  Given  user will make sure that default currency is US_dollar

Scenario: user could select any option from currency dropdown
  Given user go to dropdown currency
  When  user select any option from dropdown
  Then  user will see option sign in all products and it is switched successfully