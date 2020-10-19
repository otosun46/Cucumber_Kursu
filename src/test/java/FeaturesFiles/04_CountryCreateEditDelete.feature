Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page
  @Regression
  Scenario: Create a country
    When Create a country name as "KarlarUlkesi" and code as "KU"
    Then Success message shuld be diplayed
  @Regression
  Scenario: Edit a country
    When User edit the "KarlarUlkesi" to "KarliUlke"
    Then Success message shuld be diplayed
  @Regression
  Scenario: Delete a country
    When User delete the "KarliUlke"
    Then Success message shuld be diplayed
