Feature: Login With Different  Scenarios
@Positive
  Scenario: Login with valid credentials
    Given the user is logged in "username" and "password"
    Then the user should see the the title "Zero - Account Summary"
@Negative
  Scenario Outline: Login with invalid credentials
    Given the user is logged in "<username>" and "<password>"
    Then the user should see the message "Login and/or password are wrong."
    And the user should see the the title "Zero - Log in"

  Examples:
    |username|password|
    |  1234  |password|
    |  1234  | 1234   |
    |username|1234    |
    |username|        |
    |        |password|
    |        |        |