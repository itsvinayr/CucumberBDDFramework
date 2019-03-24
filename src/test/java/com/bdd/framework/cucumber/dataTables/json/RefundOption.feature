Feature: Refund options combination

  Scenario Outline: Test for refund funding option credit card
    Given test url to navigate
    When end user logs with "<userdata>"
    Then check the refund option source
      | funding_source |
      | bank           |
      | CC             |
      | balance        |
    Then end user is eligible to do a "<valid>" transaction

    Examples: 
      | valid | userdata |
      | true  | vinay    |
      | false | anusha   |
