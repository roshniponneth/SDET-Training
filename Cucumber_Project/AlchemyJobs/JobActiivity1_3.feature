@jobactivity1_3

Feature: Post a job using details passed from the Feature file
  Scenario Outline: Post a job using details passed from the Example file
    Given User is on PostaJob page using table
    When User Enters "root" and "pa$$w0rd"
    Then Go to Post a Job page
    And Close the jobs  browser
   