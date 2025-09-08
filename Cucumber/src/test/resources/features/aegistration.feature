Feature: User Registration
  Scenario: Register new user in ParaBank
    When user goes to the bank page
    Given user is on the registration page
    Then user fills the registration form with valid data
      | firstName | lastName | address         | city     | state | zip    | phone       | ssn       | username    | password     |
      | Johnn      | Doe      | 123 Elm Street  | New York | NY    | 10001  | 1234567890  | 111223333 | johndoe12 | password123  |
    And user clicks on register button
    Then user will see registration success message
    Then user creates a savings account

