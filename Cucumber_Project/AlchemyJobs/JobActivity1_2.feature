@jobactivity1_2
Feature: Login Test

Scenario: Searching for jobs and applying to them using XPath
    Given u ser is on login page
    When User Enters  "root" and "pa$$w0rd"
    Then Find the Keywords search input field
    And Close theBrowse