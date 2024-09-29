Feature: Purchase products
  Scenario: Purchase products from the online store
    Given German is navigating on the online store
    When he selects and purchases a product
    Then he should complete the purchase successfully
