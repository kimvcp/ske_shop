Feature: Buy products
    As a shop owner
    I want to add products to catalog

Background:
    Given a catalog with 10 size exists

Scenario: Add one product
    When I add product with quantity 2
    Then total size should be 12
