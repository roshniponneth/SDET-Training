@crmactivity1_3
Feature: Login Test

Scenario:  To schedule a meeting and include at least 3 invitees.
    Given The User Logged into page
		When User submit "admin" and "pa$$w0rd"
    Then  Navigate to Activities -> Meetings -> Schedule a Meeting
    And CloseOpened Browser