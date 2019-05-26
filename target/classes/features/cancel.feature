Feature: Buy products
    As a customer
    I want to cancel product(s) that is ordered

Background:
    Given an order number 1 with 1 quantity exists

Scenario: Cancel one order
    When I cancel order 1
    Then total orders should be 0

Scenario: Cancel all order
    When I cancel all orders
    Then total orders should be 0
