@hrmactivity1_3
Feature: Login Test

Scenario: Add multiple employees using an the Examples table
    Given User Login to page 
    When User enter username and password
    Then Click the Add button to add a new Employee
    And Close opened Browser