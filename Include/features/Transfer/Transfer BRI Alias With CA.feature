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
Feature: Transfer
	
	@Valid
  Scenario Outline: User transfer money to other people (BRI Alias) with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to transfer money with <condition> for <username>
    When I saw my money transfer history
    When I want to add recipient of money transfer
    When I try adding recipient of money transfer in condition with <destinationBank> and <destinationAccount>
    When I inputting <amount> for the transfer amount and <decision> with <name> , then choose account <debit>
    When I confirm transfer bill with <detail> and <destinationBank>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | destinationBank	| destinationAccount	| amount	| detail					| condition | decision	| name	| debit	|
      | bribri0001 | Jakarta123 | 123457 | BRI							| @inialiasbaru							| 10000		| transfer sesama	| NULL			| NULL			| NULL	| RATRI	|