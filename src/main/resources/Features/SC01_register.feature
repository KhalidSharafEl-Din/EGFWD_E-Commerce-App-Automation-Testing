@smoke
Feature: User Registration

  Scenario: user could register with valid first name last name email password and confirm_password
    Given Go to Registration Page
      When Enter valid "automation" "tester" "Test1@example.com" "P@ssw0rd" and "P@ssw0rd"
    And User click on register button
    Then User Directed to profile page

  Scenario: user could register with valid necessary and optional data

    Given Go to Registration Page
    When user select female gender
    And Enter valid "automation" "tester" "Test2@example.com" "P@ssw0rd" and "P@ssw0rd"
    And Enter birth of day
    And Enter birth of Month
    And Enter birth of year
    And User click on register button
    Then User Directed to profile page