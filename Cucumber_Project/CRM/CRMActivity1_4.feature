@crmactivity1_4
Feature: Login Test

Scenario:  To use an Examples table to add products
    Given The User Logged into the page
		When User submit username "admin" and "pa$$w0rd"
    Then  Navigate to All -> Products-> Create Product
    And Close Browsers