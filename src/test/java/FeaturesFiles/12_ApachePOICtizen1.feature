Feature:ApachePOI Citizen Functiolalty

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page

    Scenario: Create and delete citizenship from Excel
      When User create ctizenship with ApachePOI
      Then Userdelete ctizenship with ApachiPOI