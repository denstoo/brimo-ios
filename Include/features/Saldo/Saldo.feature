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
Feature: Saldo

	Scenario Outline: User check their balance
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to check my total balance
    Then I saw my total balance with check valas <checkValas> and type <valas>

    Examples: 
      | username   | password   | pin 	 | checkValas	| valas	|
      | bribri0001 | Jakarta123 | 123457 | Yes				| JPY		|