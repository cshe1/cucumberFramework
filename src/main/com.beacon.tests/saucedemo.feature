@sauce
Feature: SauceDemo

  Scenario: Logging in to SauceDemo
    Given I am on the SauceDemo page
    And I see the login screen
    Then I login as standard-user
    And I verify that I am logged in
    Then the driver should close
