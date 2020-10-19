Feature: Citizenship with senaryooutline

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create and delete with senaryo outline

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Success message shuld be diplayed

#    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
#    Then Error message shuld be diplayed
#    And Click on close button


#    When User delete the "<CitizenshipName>"
#    Then Success message shuld be diplayed


    Examples:
      | CitizenshipName | CitizenshipShortName |
      | Sverige_        | SE                   |
      | Norge_          | NO                   |
      | Danmark_        | DK                   |
      | Finland_        | FI                   |
