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
    Then I already see my DPLK account

    Examples: 
      | username   | password   | pin 	 | dplkNumber	| amountDPLK	| decision	| name		| debit	| condition	|
      | bribri0001 | Jakarta123 | 123457 | 1040058		| 10000				| NULL			| NULL		| RATRI	|	NULL			|