@smoke
Feature: SC06_ChangeCategories| user could hover on any option and select different categories
  Background:
    # user Login
    Given user go to login page
    When user login with "valid" "Test1@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: logged user could hover on Apparel option and select clothes category

    # Hovering
    When user hover on Apparel option and select clothes category
    Then user move successfully to the clothes page