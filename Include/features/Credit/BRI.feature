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
Feature: Credit BRI

  Scenario Outline: User pay credit bill
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay credit bill
    When I saw payment of credit bills history
    When I want to add recipient of credit bill
    When I try adding recipient of credit bill condition with <creditBank> and <creditNumber>
    When I inputting <totalInput> and <amount> for the credit amount
    When I confirm payment of credit bill with <detail>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | creditBank	| creditNumber 			| totalInput	| amount	| detail				|
      | bribri0001 | Jakarta123 | 123457 | BRI				| 4365020100000107	| Manual			| 10000		| kartu kredit	|
      | bribri0001 | Jakarta123 | 123457 | BRI				| 4365020100000107	| Penuh				| Null		| kartu kredit	|
      | bribri0001 | Jakarta123 | 123457 | BRI				| 4365020100000107	| Minimal			| Null		| kartu kredit	|