Feature: Calisma icin girilen kayitlari siler

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

#    Scenario: Delete all Exam
#      When Click on the element in the left class
#        | entranceExams |
#        | setup2        |
#        | entranceExam2 |
#      When Delete all items of the list
      Scenario: Delete all Item
      When Click on the element in the left class
        | inventory |
        | setupButtonUnderInventory        |
        | ItemCategory |
      When Delete all items of the list

  Scenario Outline: Delete all option
    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | <Sections> |

    When Delete all items of the list

    Examples:
      | Sections     |
      | citizenships |
      | nationality  |
      | country      |
