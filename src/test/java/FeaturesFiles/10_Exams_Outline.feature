Feature: DataTable Functionalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression
  Scenario Outline: Create a Exam

    When Click on the element in the left class
      | entranceExams |
      | setup2        |
      | entranceExam2 |

    Then Click on the element in the content class
      | addButton |
    When User sending the keys in the dialog content class
      | nameInput | <ExamName> |

    Then Click and Select options
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |
      | documentType           |
      | <documentTypeOption>   |

    When Click and Select Date options
      | regStart | 10 |
      | regEnd   | 15 |

    Then Click on the element in the content class
      | documentAddButton |
      | saveButton        |

    Then Success message shuld be diplayed

    When Click on the element in the left class
      | entranceExams |
      | setup2        |
      | entranceExam2 |
    When User delete the Exam"<ExamName>"
    Then Success message shuld be diplayed

    Examples:
      | ExamName    | AcademicPeriodOption | GradeLevelOption | documentTypeOption |
      | Math exam   | 0                    | whiteN           | 1                  |
      | IT exam     | 2018-2019            | 3                | 2                  |
      | Oracle exam | 0                    | 2                | 3                  |
      | Math exam   | 1                    | 4                | 3                  |








