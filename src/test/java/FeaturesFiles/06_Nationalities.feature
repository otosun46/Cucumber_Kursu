Feature: Nationalities functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Nationalities page

  Scenario: Create Nationalities
    Then Create a Nationalities "cayish1"
    Then Success message shuld be diplayed

  Scenario: Edit Nationalities
    When User edit the "cayish1" to "cafeish1"
    Then Success message shuld be diplayed

  Scenario: Delete Nationalities
    When User delete the "cafeish1"
    Then Success message shuld be diplayed

  @Regression
    Scenario: Nationalities All functionality

      Then Create a Nationalities "cayish"
      Then Success message shuld be diplayed
      When User edit the "cayish" to "cafeish"
      Then Success message shuld be diplayed
      When User delete the "cafeish"
      Then Success message shuld be diplayed