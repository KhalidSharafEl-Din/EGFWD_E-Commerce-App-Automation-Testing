@smoke
Feature: SC08_SelectTags | Logged user could select different tags
  Background:
    # user Login
    Given user go to login page
    When user login with "valid" "Test1@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: Logged user could filter the content with different tags

    Given user clicks on search field
    And user search with name of product
    When user click on "awesome" Tag
    Then user redirected to correct page