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
Feature: Telkom

	@Invalid
	Scenario Outline: User pay telkom bill - Abnormal
    Given I start application
    When I want login
    When Abnormal Saldo - I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay telkom bill with <condition> for <username>
    When I saw payment of telkom bills history
    When I want to add recipient of telkom bill
    When I try adding recipient of telkom bill condition with <telkomNumber>
    Then Abnormal Saldo - I saw telkom amount with <username>

    Examples: 
      | username   | password   | pin 	 | telkomNumber		| condition	|
      | bribri0001 | Jakarta123 | 123457 | 0021888815001	| NEW				|	

	@Valid
  Scenario Outline: User pay telkom bill CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay telkom bill with <condition> for <username>
    When I saw payment of telkom bills history
    When I want to add recipient of telkom bill
    When I try adding recipient of telkom bill condition with <telkomNumber>
    When I saw telkom amount and <decision> with <name> , then choose account <debit>
    When I confirm payment of telkom bill
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | telkomNumber		| condition	| decision	| name	| debit	|
      | bribri0001 | Jakarta123 | 123457 | 0021888815001	| NEW				| Save			| Test	| RATRI	|
   
  @Valid    
  Scenario Outline: User pay telkom bill from list SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay telkom bill with <condition> for <username>
    When I saw payment of telkom bills history
    When I try pay telkom bill from my list
    When I saw telkom amount and <decision> with <name> , then choose account <debit>
    When I confirm payment of telkom bill
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | telkomNumber		| condition	| decision	| name	| debit					|
      | bribri0001 | Jakarta123 | 123457 | 0021888815001	| NULL			| NULL			| NULL	| Rihana Elaela	|
      
   @valid   
   Scenario Outline: User pay pasbayar bill from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay telkom bill with <condition> for <username>
    When I saw payment of telkom bills history
    When I try pay telkom bill from my history
    When I saw telkom amount and <decision> with <name> , then choose account <debit>
    When I confirm payment of telkom bill
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | telkomNumber		| condition	| decision	| name	| debit	|
      | bribri0001 | Jakarta123 | 123457 | 0021888815001	| NULL			| NULL			| NULL	| RATRI	|
