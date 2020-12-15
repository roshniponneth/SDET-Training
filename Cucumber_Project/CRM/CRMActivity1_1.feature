    @crmactivity1_1
Feature: Login Test

Scenario: Open the Leads page and add multiple lead accounts using values passed fromFeature file
    Given User Log into the page
		When User entrs "admin" and "pa$$w0rd"
    Then  Open the homepage and count the number of the dashlets on the page
    And Close Browser