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
    When Abnormal Saldo - I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want pay tv with <condition> for <username>
    When I saw my tv payment history
    When I want to add payment of tv
    When I write tv code in condition with <tvType> and <tvNumber>
    Then Abnormal Saldo - I saw amount of tv payment with <username>
    
    Examples: 
      | username   | password   | pin 	 	| tvType			| tvNumber			| decision	| name				| debit	| condition	|
      #| bribri0001 | Jakarta123 | 123457 	| Transvision	| 127123415001	| Save			| Transvision	| RATRI	|	NEW				|
      | bribri0001 | Jakarta123 | 123457 	| MyRepublic	| 1089675				| Save			| MyRepublic	| RATRI	|	NEW				|
      #| bribri0001 | Jakarta123 | 123457 	| Indosat			| 181210033241	| Save			| Indosat			| RATRI	|	NEW				|