@smoke
Feature: F03_PasswordRest | user is able to rest his account password

  Scenario: user is able to rest his account password
    Given user go to login page
    And user click on Forgot password?
    When user enter his email "Test1@example.com"
    And clicks on Recover button
    Then System confirms email have been sent