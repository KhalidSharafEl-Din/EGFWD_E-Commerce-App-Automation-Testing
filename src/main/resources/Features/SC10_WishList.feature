@smoke
Feature: SC10_WishList | logged user could add products to wishlist
  Background:
    # user Login
      Given user go to login page
      When user login with "valid" "Test1@example.com" and "P@ssw0rd"
      And user press on login button
      Then user login to the system successfully

  Scenario: products will added to wishlist when user click on add to wishlist from detailed page
     When user click on pc product
     And user clicks on add to wishlist button from detailed product page
     And  user go to wish list page
     Then pc product will added to wishlist