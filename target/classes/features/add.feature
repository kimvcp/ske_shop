Feature: Add products
    As a shop owner
    I want to add product(s) to catalog

Background:
    Given a catalog with 10 size exists

Scenario: Add one product
    When I add Bread with size 2
    Then total catalog size should be 12

Scenario: Add multiple products
    When I add Bread with size 2
    And I add Jam with size 1
    Then total catalog size should be 13
