Feature: To verify user registration functionality
  Scenario: Verify user registration functionality by filling out registration form, click register to create account
    Given Open Browser
    And Enter url
    When Click register
    And Fill out Registration Form
    And Click register button
    Then Validate registration successful
    And Close Browser

