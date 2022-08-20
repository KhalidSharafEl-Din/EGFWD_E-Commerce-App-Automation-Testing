@smoke
Feature: CheckOut | Create successful Order
  Background:
    # user Login
    Given user go to login page
    When user login with "valid" "Test1@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could checkout his order when he fill all required data

    When logged user press on jewelry category
    And  press add to cart to flower bracelet
    And  Go to shopping cart page
    And  Press on services terms and checkout button
    And  user fill the data of billing address press on continue button
    And  user select Ground of shipping method and press continue
    And  user select Check_money for payment method and press continue
    And  user press continue for payment information
    And  user press confirm for confirm order
    Then  order has been successfully processed