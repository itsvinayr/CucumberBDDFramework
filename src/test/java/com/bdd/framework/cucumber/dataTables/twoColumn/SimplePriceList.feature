Feature: Cucumber can convert Gherkin table to a map
  This is an example of a map

  Scenario: A price list can be represented as price per item
    Given the price list for a coffee shop
      | coffee | 1 |
      | donut  | 2 |
    When I order 1 coffee and 1 donut
    Then should I pay 3
