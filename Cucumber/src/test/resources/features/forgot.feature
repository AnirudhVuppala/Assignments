Feature: Implementing all recovery mechanisms
  Scenario: Implementing actions when user forgets user credentials
    Given the user is in login credentials recovery page
    When user enters all the fields require to validate the account
      | firstName       | Johnn     |
      | lastName        | Doe      |
      | street          | 123 Elm Street        |
      | city            | New York          |
      | state           | NY         |
      | zipCode         | 10001       |
      | ssn             | 111223333           |
    And click on find my login info button
    Then display the user credentials