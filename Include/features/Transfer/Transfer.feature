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

#	@Invalid
#	Scenario Outline: User transfer money to other people (BRI) - Abnormal Saldo
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to transfer money with <condition> for <username>
    #When I saw my money transfer history
    #When I want to add recipient of money transfer
    #When I try adding recipient of money transfer in condition with <destinationBank> and <destinationAccount>
    #Then Abnormal Saldo - I inputting <amount> for the transfer amount with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | destinationBank	| destinationAccount	| amount	| condition |
      #| bribri0001 | Jakarta123 | 123457 | BRI							| 020601046274508			| 10000		| NEW				|
	
	@Valid
  Scenario Outline: User transfer money to other people (BRI) with CA
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
      | username   | password   | pin 	 | destinationBank	| destinationAccount	| amount	| detail		| condition | decision	| name	| debit	|
      | bribri0001 | Jakarta123 | 123457 | BRI							| 020601046274508			| 10000		| transfer	| NEW				| NULL			| Ryan	| RATRI	|
      
     
  #@Valid
  #Scenario Outline: User transfer money to other people (BRI) with SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to transfer money with <condition> for <username>
    #When I saw my money transfer history
    #When I want to add recipient of money transfer
    #When I try adding recipient of money transfer in condition with <destinationBank> and <destinationAccount>
    #When I inputting <amount> for the transfer amount and <decision> with <name> , then choose account <debit>
    #When I confirm transfer bill with <detail> and <destinationBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | destinationBank	| destinationAccount	| amount	| detail		| condition 	| decision	| name	| debit					|
      #| bribri0001 | Jakarta123 | 123457 | BRI							| 020601046274508			| 10000		| transfer	| NULL				| NULL			| NULL	| Rihana Elaela	|
      
      
  #@Valid
  #Scenario Outline: User transfer money from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to transfer money with <condition> for <username>
    #When I try transfer from my history
    #When I inputting <amount> for the transfer amount and <decision> with <name> , then choose account <debit>
    #When I confirm transfer bill with <detail> and <destinationBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | destinationBank	| amount	| detail		| condition 	| decision	| name	| debit	|
      #| bribri0001 | Jakarta123 | 123457 | BRI							| 10000		| transfer	| NULL				| NULL			| NULL	| RATRI	|
      
  #@Valid
  #Scenario Outline: User transfer money from list
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to transfer money with <condition> for <username>
    #When I try transfer from my list
    #When I inputting <amount> for the transfer amount and <decision> with <name> , then choose account <debit>
    #When I confirm transfer bill with <detail> and <destinationBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | destinationBank	| amount	| detail		| condition 	| decision	| name	| debit	|
      #| bribri0001 | Jakarta123 | 123457 | BRI							| 10000		| transfer	| NULL				| NULL			| NULL	| RATRI	|
      
  @Valid
  Scenario Outline: User transfer money to other people (Other Bank) with SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to transfer money with <condition> for <username>
    When I saw my money transfer history
    When I want to add recipient of money transfer
    When I try adding recipient of money transfer in condition with <destinationBank> and <destinationAccount>
    When I inputting <amount> for the transfer amount and <decision> with <name> , then choose account <debit>
    When I confirm transfer bill with <detail> and <destinationBank>
    When I validate my pin with <pin> before transaction
    When Transaction still on progress
    Then Transaction success
  

    Examples: 
      | username   | password   | pin 	 | destinationBank	| destinationAccount	| amount	| detail		| condition 	| decision	| name	| debit					|
      | bribri0001 | Jakarta123 | 123457 | BCA							| 1234567890					| 10000		| transfer	| NULL				| NULL			| NULL	| Rihana Elaela	|
      
  #@Valid
  #Scenario Outline: User transfer money to other people (BRI) with SA
    #Given I start application
    #And I want to transfer money with <condition> for <username> from fast menu
    #When I saw my money transfer history
    #When I want to add recipient of money transfer
    #When I try adding recipient of money transfer in condition with <destinationBank> and <destinationAccount>
    #When I inputting <amount> for the transfer amount and <decision> with <name> , then choose account <debit>
    #When I confirm transfer bill with <detail> and <destinationBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | destinationBank	| destinationAccount	| amount	| detail		| condition | decision	| name	| debit	|
      #| bribri0001 | Jakarta123 | 123457 | BRI							| 020601046274508			| 10000		| transfer	| NULL			| NULL			| NULL	| RATRI	|
  