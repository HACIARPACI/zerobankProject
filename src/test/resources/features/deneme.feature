Feature: Login feature
  Background:   Given the user is on login page
  Scenario: Login with valid credentials

    When the user enters valid  username and password
    Then the user should see the title "welcome"

    Scenario Outline:

      When the user enters invalid "<username>" "<password>"
      Then  the user should see message"invalid message"
      And the user should see the title"login ttile"
      Examples:
        | username | password  |
        | 123123   | sdfsdfsd  |
        | 123123   | dasdasd   |
        | 12321312 | asdasdas  |
        | 12343223 | asdasda   |
        | 234234   | asdasdasd |


      Scenario: the user should see Account summary page options
      Given the user is on login page
        And the user enters valid username and password
        Then Account summary	page	should	have	to	following	account	types:
          |Cash Accounts       |
          |Investment Accounts |
          |Credit Accounts     |
          |Loan Accounts       |

        Scenario:Credit Account table
          Given Given the user is on login page
          Then Credit	Accounts table	must	have	columns
            | Account     |
            | Credit Card |
            | Balance     |

          Scenario: Account Activity page title