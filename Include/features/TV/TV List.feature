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
Feature: TV

  @Valid
  Scenario Outline: User pay tv with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want pay tv with <condition> for <username>
    When I saw my tv payment history
    When I try pay tv from my list
    When I saw amount of tv payment and <decision> with <name> , then choose account <debit>
    When I confirm of tv payment
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 	| tvType			| tvNumber			| decision	| name				| debit	| condition	|
      #| bribri0001 | Jakarta123 | 123457 	| Transvision	| 127123415001	| Save			| Transvision	| RATRI	|	NULL			|
      | bribri0001 | Jakarta123 | 123457 	| MyRepublic	| 1089675				| Save			| MyRepublic	| RATRI	|	NULL			|
      #| bribri0001 | Jakarta123 | 123457 	| Indosat			| 181210033241	| Save			| Indosat			| RATRI	|	NULL			|