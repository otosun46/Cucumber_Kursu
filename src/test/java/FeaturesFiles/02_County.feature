Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page
    When Create a country
    Then Success message shuld be diplayed
