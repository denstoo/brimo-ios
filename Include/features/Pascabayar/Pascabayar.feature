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
Feature: Pascabayar

#	@Invalid
#	Scenario Outline: User pay pascabayar bill - Abnormal
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay pascabayar bill with <condition> for <username>
    #When I saw payment of pascabayar bills history
    #When I want to add recipient of pascabayar bill
    #When I try adding recipient of pascabayar bill condition with <pascaNumber>
    #Then Abnormal Saldo - I saw pascabayar amount with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | pascaNumber	| pulsa		| condition	|
      #| bribri0001 | Jakarta123 | 123457 | 0818900432	| XL	| NEW				|	
      #| bribri0001 | Jakarta123 | 123457 | 0813123456004	| Halo	| NEW				|	
#
	@Valid
  Scenario Outline: User pay pascabayar bill
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay pascabayar bill with <condition> for <username>
    When I saw payment of pascabayar bills history
    When I want to add recipient of pascabayar bill
    When I try adding recipient of pascabayar bill condition with <pascaNumber>
    When I saw pascabayar amount and <decision> with <name> , then choose account <debit>
    When I confirm payment of pascabayar bill with <pulsa>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | pascaNumber		| pulsa		| condition	| decision	| name	| debit	|
      #| bribri0001 | Jakarta123 | 123457 | 0818900432			| XL			| NEW				| Save			| Test	| RATRI	|
      #| bribri0001 | Jakarta123 | 123457 | 0813123456004	| Halo		| NEW				| Save			| Test	| RATRI	|
      | bribri0001 | Jakarta123 | 123457 | 08141234567		| Matrix	| NEW				| NULL			| NULL	| RATRI	|
      
   #
  #@Valid    
  #Scenario Outline: User pay pascabayar bill from list
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay pascabayar bill with <condition> for <username>
    #When I saw payment of pascabayar bills history
    #When I try pay pascabayar bill from my list
    #When I saw pascabayar amount and <decision> with <name> , then choose account <debit>
    #When I confirm payment of pascabayar bill with <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | pascaNumber	| pulsa		| condition	| decision	| name	| debit					|
      #| bribri0001 | Jakarta123 | 123457 | 0818900432	| XL	| NULL			| NULL			| NULL	| Rihana Elaela	|
      #| bribri0001 | Jakarta123 | 123457 | 0813123456004	| Halo	| NULL			| NULL			| NULL	| Rihana Elaela	|
      #| bribri0001 | Jakarta123 | 123457 | 08141234567	| Matrix	| NULL			| NULL			| NULL	| Rihana Elaela	|
      #
   #@valid   
   #Scenario Outline: User pay pasbayar bill from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay pascabayar bill with <condition> for <username>
    #When I saw payment of pascabayar bills history
    #When I try pay pascabayar bill from my history
    #When I saw pascabayar amount and <decision> with <name> , then choose account <debit>
    #When I confirm payment of pascabayar bill with <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | pascaNumber	| pulsa		| condition	| decision	| name	| debit	|
      #| bribri0001 | Jakarta123 | 123457 | 0818900432	| XL	| NULL			| NULL			| NULL	| RATRI	|
      #| bribri0001 | Jakarta123 | 123457 | 0813123456004	| Halo	| NULL			| NULL			| NULL	| RATRI	|
