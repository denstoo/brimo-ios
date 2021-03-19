
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
Feature: Listrik

  @Valid
  Scenario Outline: User pay electricity bill with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want pay electricity with <condition> for <username>
    When I saw my payment of electricity history
    When I want to add payment bill of electricity
    When I write payment bill of electricity in condition with <listrikType> and <listrikNumber>
    When I inputting <amountListrik> for bill of electricity and <decision> with <name> , then choose account <debit>
    When I confirm electricity transaction with <listrikType>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | listrikType	| listrikNumber		| amountListrik	| detail			| decision	| name			| debit					| condition	|
      | bribri0001 | Jakarta123 | 123457 | Token				| 11000000037			| 20000					| listrik			| NULL			| NULL			| Rihana Elaela	|	NEW				|