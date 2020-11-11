Feature: Item Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Categories page
  @Regression
  Scenario Outline:
    When User Create item Categories name as "<InventoryItemName>"user type as "<UserTypeOption>"
    Then Success message shuld be diplayed
    When User delete the "<InventoryItemName>"
    And Success message shuld be diplayed




    Examples:
      | InventoryItemName | UserTypeOption |
      | Abc               | 0              |
      | Def               | User           |
      | Ghi               | 3              |
      | Jik               | Manager        |
      | Lmn               | Student        |