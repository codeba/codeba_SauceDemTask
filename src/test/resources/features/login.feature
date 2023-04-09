Feature: login feature

  Scenario: success login
    Given The user is on the login page
  When The user enter valid credentials:"standard_user" and "secret_sauce"
  Then The user should be able to see page title : "Products"
