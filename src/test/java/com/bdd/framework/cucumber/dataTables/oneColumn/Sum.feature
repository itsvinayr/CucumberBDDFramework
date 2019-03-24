Feature: Cucumber can convert Gherkin data tables to a list of type you specify

  Scenario: The sum of list of numbers should be calculated
    Given a list of numbers
      |   17 |
      |   42 |
      | 4711 |
    When I summarize them
    Then I should get 4770
