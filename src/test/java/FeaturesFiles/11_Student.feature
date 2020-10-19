#Student-1 ogrencı ekle
#-ad soyad gender ıd
#-grandlevel
#-school deparment
#-mobılphone
#-emaıl
#-natıonal
#-prıvate school
#-Representatıve(bolum sec)
#-ve formu doldurduktan sonra kayıt yap
Feature: Student add functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Add students
    When Click on the element in the left class
      | student  |
      | students |
    Then Click on the element in the form class
      | addButton |

    When User sending the keys in the form class
      | firstName          | Hasan                 |
      | lastName           | Sahan                 |
      | studentId          | 2020115               |
      | mobilePhone        | +46765432446          |
      | email              | sahan.hasan@gmail.com |
      | previousSchoolName | First School          |

    When Click and Select options form class
      | gender      | male      |
      | gradeLevel  | 1st grade |
      | department  | 1         |
      | section     | 1         |
      | citizenship | Sverige   |
      | nationality | Turkish   |

#    Scenario: Document info
    When Click to "documentInfoTab" form class
    And Click and Select options form class
      | documentType | Personal |
    When User sending the keys in the form class
      | documentNumber | 5687 |

#  Scenario: Representatives adding
    Then Click on the element in the form class
      | representativeTab       |
      | addButtonRepresentative |

    When User sending the keys in the form class
      | representativeFirstName  | Mehmet       |
      | representativeLastName   | Sahan        |
      | representativeMiddleName | Ali          |
      | representativePhone      | +46765432447 |

    When Click and Select options form class
      | representativeType    | Father |
      | representativeCountry | Turkey |
      | representativeCity    | Ankara |
    Then Click on the element in the form class
      | representativeAddButton |
      | saveButton              |
    Then Success message shuld be diplayed


