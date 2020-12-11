@hrmactivity1_2
Feature: Login Test

Scenario: Add information about a candidate for recruitment
    Given User Login to the page 
    When User enter the username and password
    Then Click on the Add button to add candidateinformation
    And Close the Opened Browser