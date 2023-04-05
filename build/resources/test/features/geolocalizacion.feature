#Language: en
Feature: : View geolocation in the app Saucelab
Scenario: view geolocation correctly
  Given that the user has access to the APP
  When the user logs with credentials and navigates to the Geolocation option
  Then the user should see his geolocation data correctly