Feature: Testing JDBS Country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

    Scenario:
      Then Send The quary the database "select * from country order by id desc" and control match