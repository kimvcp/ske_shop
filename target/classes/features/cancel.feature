Feature: Buy products
    As a customer
    I want to cancel product(s)

Background:
    Given a order Bread with quantity 1 exists
    And a order Jam with quantity 1 exists

Scenario: Cancel one order
    When I cancel Bread
    Then total order should be 1

Scenario: Cancel multiple orders
    When I cancel Bread
    And I cancel Jam
    Then total order should be 0