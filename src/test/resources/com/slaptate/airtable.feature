Feature: Airtable Form Submission

  Scenario: Submit valid data
    Given I open the Airtable form
    When I fill in the form with valid data
    Then I should see a success message