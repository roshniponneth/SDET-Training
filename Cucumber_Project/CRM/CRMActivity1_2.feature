@crmactivity1_2
Feature: Login Test

Scenario: Open the Leads page and add multiple lead accounts using values passed fromFeature file
    Given User Logged into page
		When User enters "admin" and "pa$$w0rd"
    Then  Navigate to Sales Leads Create Lead
    And Close  Opened Browser