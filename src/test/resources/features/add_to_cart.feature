Feature: Add to cart
  I as user, I want to buy a product

  Scenario: Succesful add to cart
    Given That the user enters to the web page
    When the user clicks on the product category
    And the user select a product
    Then the user should see the add to cart confirmation