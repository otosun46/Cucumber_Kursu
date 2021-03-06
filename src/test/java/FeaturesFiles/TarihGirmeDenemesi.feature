Feature: DataTable Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @SmokeTest
  Scenario: Create a Exam

    When Click on the element in the left class
      | entranceExams |
      | setup2        |
      | entranceExam2 |

    Then Click on the element in the content class
      | addButton |
    When User sending the keys in the dialog content class
      | nameInput | Matematik10 |

    Then Click and Select options
      | academicPeriod |
      | 1              |
      | gradeLevel     |
      | 2              |
      | documentType   |
      | 2              |

    When Click "regStart" and "regStartInput1" and Send "11102021" Date options
    When Click "regEnd" and "regEndInput" and Send "11112022 " Date options

    Then Click on the element in the content class
      | documentAddButton |
      | saveButton        |

    Then Success message shuld be diplayed

#  Scenario: Delete
#    When Click on the element in the left class
#      | entranceExams |
#      | setup2        |
#      | entranceExam2 |
#    When User delete the Exam"Matematik7"
#    Then Success message shuld be diplayed
