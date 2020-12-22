Feature: Testing JDBS Country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to cities page

    Scenario:

      Then Send The quary the database "select * from city order by id desc" and control match.