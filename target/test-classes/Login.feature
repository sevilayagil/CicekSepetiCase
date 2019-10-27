Feature: User login to system successfully

  Background:
    Given user is at landing page for the login process
  Scenario: The user enters home page and fills correct user information after login to system
    When user clicks sign button and after clicks sign item
    And user fills user email and password
    Then user clicks sign in button and it display close icon