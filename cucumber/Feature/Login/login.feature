
Feature: Login

  Scenario: Invalid password
    Given The user opens login screen
    When The user enters "username"
    And The user enters incorrect "incorrectpass"
    And clicks on Login button
    Then The expected validation message "Invalid credentials! Please try again." shows

