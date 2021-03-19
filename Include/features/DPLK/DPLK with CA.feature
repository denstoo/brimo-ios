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
Feature: DPLK

@Valid    
  Scenario Outline: User top up DPLK with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to see my DPLK account
    And I want to top up my DPLK account with <condition> for <username>
    When I saw my top up DPLK history
    When I want to add recipient of DPLK
    When I try adding recipient of DPLK account condition with <dplkNumber>
    When I inputting <amountDPLK> for the DPLK amount and <decision> with <name> , then choose account <debit>
    When I confirm top up DPLK account
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | dplkNumber	| amountDPLK	| decision	| name		| debit	| condition	|
      | bribri0001 | Jakarta123 | 123457 | 1040058		| 10000				| Save			| DPLK		| RATRI	|	NULL			|