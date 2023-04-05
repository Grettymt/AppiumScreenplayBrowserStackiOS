  Feature: Login saucelabs app
    I AS user
    WANT TO buy products
    SO THAT I can enjoy them

    Scenario: Login with valid credentials
      Given  user wants to buy some clothes
      When  introduce the valid credentials bob@example.com 10203040
      Then  should see the Products list