Feature: Register
  I as user, I need to register on the web page
  So I can Buy the products.

  Scenario: Successful register
    Given That the user enters to the web page
    When the user hover on the user icon
    And the user clicks on the registrate button
    And the user enters the credentials
    Then the user should enter to the successful register page
