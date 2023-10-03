# Created by Ekrem Mese at 10/2/2023
Feature: Apply jobs
  As a user I want to apply IT Positions on Knauf web page

  @wip
  Scenario: Searching IT jobs by location
    Given user is on Knauf English page
    When user hover overs career tab
    And user clicks Find current job openings button
    And user switches to careers page
    And user clicks on Click here to explore our open job positions opportunities button
    And user selects IT as a department
    And user clicks one of the job openings on the list
    Then user should be able to apply the job

    # Enter steps here