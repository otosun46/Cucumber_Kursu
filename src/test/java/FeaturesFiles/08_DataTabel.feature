Feature: DataTable Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
  @Regression
  Scenario: Create Country
    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | country    |
    Then Click on the element in the content class
      | addButton |
    When User sending the keys in the dialog content class
      | nameInput | KarlarUlkesi |
      | codeInput | SE           |
    And Click on the element in the content class
      | saveButton |
    Then Success message shuld be diplayed
  @Regression
  Scenario: Create a Nationalties
    And Click on the element in the left class
      | setupOne    |
      | parameters  |
      | nationality |
    Then Click on the element in the content class
      | addButton |
    When User sending the keys in the dialog content class
      | nameInput | caysh1 |

    And Click on the element in the content class
      | saveButton |
    Then Success message shuld be diplayed
  @Regression
  Scenario: Create a Fee
    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | fees       |
    Then Click on the element in the content class
      | addButton |
    When User sending the keys in the dialog content class
      | nameInput            | Benim |
      | codeInput            | Bn  |
      | integrationCodeInput | TE |
      | priorityInput        | 12500|

    And Click on the element in the content class
      | saveButton |
    Then Success message shuld be diplayed