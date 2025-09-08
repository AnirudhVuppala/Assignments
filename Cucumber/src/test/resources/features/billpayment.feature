Feature: Bill payment
  Background:
    Given user is logged in with valid data
    |uname|pass|
    |johndoe12|password123|
  Scenario: Make a bill payment
    When user fills the bill payment details
#    Then user will see payment success message
