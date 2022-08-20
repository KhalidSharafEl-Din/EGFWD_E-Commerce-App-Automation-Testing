@smoke
Feature: SC04_Search | users will be able to search for products
  Background:
    # user Login
    Given user go to login page
    When user login with "valid" "Test1@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could search for product using fullname
    When user clicks on search field
    And user search with name of product
    Then user could find relative results

  Scenario: user could search for product using SKU
    When user clicks on search field
    And user search with sku of product
    Then user could find the desired product