#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Forgot Pin

  @Valid
  Scenario Outline: User forgot pin
  #	Given I start application for first time
    #When I already have an account
    Given I start application
    When I want login
    When I try login another device with existing account <username> and <password>
    And I want reset pin cause forgot current pin
    When I validate born date for reset pin
    Then I input otp for verification reset pin on <username>
    And I create pin with <pin>
    And I confirm pin with <pin>
    When I verification deep link from account <username>
    Then I successfully go to dashboard

    Examples: 
      | username   | password   | pin 	 |
      | bribri0001 | Jakarta123 | 123457 |