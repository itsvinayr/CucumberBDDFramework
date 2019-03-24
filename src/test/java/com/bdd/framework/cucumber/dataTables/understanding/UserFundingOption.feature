Feature: User funding options combination

  Scenario Outline: Test for funding option bank
    Given url to navigate
    When user logs in with "<username>" and "<password">
    Then check the funding_source
      | funding_source |
      | bank           |
      | CC             |
      | balance        |
    Then user is eligible to do a "<valid>" transaction

    Examples: 
      | username | password | valid |
      | vijay    | antony   | true  |
      | kamal    | 420ste   | false |
