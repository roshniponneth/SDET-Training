@hrmactivity1_1
Feature: Login Test

Scenario: To create a job vacancy for DevOps Engineer
    Given User is on Login page
    When User enters username and password
    Then Navigate to the vacancies page and add Vacancies
    And Close the Browser