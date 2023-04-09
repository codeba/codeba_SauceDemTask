Feature: success shopping test

  Background:
    Given The user is on the login page
    When The user enter valid credentials:"standard_user" and "secret_sauce"
    Then The user should be able to see page title : "Products"

  @wip
  Scenario: positive success shopping test
    When The user should be able to sort items by order type:"Price (low to high)"
    And The user should be able to add items with item name:"Sauce Labs Backpack"
    And The user should be able to add items with item name:"Sauce Labs Bike Light"
    And The user should be able to add items with item name:"Sauce Labs Onesie"
    And The user should be able to add items with item name:"Test.allTheThings() T-Shirt (Red)"
    Then The user soud be able to verify added item quantitiy
    When The user navigate to your cart page
    Then The user should be able to see page title : "Your Cart"
    And The user should see the added items on cart page
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    When The user navigate to page related button:"checkout"
    Then The user should be able to see page title : "Checkout: Your Information"