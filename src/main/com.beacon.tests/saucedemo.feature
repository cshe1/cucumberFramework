@sauce
Feature: SauceDemo

  Scenario: Logging in to SauceDemo with a valid user
    Given I am on the SauceDemo page
    And I see the login screen
    Then I login as standard-user
    And I verify that I am logged in

  Scenario: Logging in to SauceDemo with an invalid user
    Given I am on the SauceDemo page
    And I see the login screen
    Then I login as invalid user
    And I verify the invalid user error
    Then the driver should close