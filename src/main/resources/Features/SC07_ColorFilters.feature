@smoke
Feature: SC07_ColorFilters | Logged user could filter with color
  Background:
    # user Login
    Given user go to login page
    When user login with "valid" "Test1@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: logged user could hover on Apparel option and select clothes category

    Given user hover on Apparel option and select shoes category
    And user move successfully to the shoes page
    When Selecting "red" color option
    Then Filter is applied