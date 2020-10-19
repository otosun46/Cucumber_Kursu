Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create a Country
    When Create a country
    Then Success message shuld be diplayed


  Scenario: Create a Country parameter data
    When Create a country name as "Sweden_1" and code as "code1"
    Then Success message shuld be diplayed