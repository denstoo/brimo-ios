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
Feature: Briva

#	@Invalid
#	Scenario Outline: User pay open briva bill - Abnormal Saldo
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want transfer with virtual account with <condition> for <username>
    #When I saw my virtual account transfer history
    #When I want to add recipient of virtual account
    #When I try adding recipient of virtual account in condition with <brivaNumber>
    #Then Abnormal Saldo - I inputting <amount> for <whatPayment> Payment Briva with <username>
#
    #Examples: 
      #| username   | password   | pin 	 	| whatPayment	| brivaNumber						| amount	| condition	|
      #| bribri0001 | Jakarta123 | 123457 	| Open				| 2276808130852287			| 10000		|	NEW				|

	@Valid
  Scenario Outline: User pay open briva bill with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want transfer with virtual account with <condition> for <username>
    When I saw my virtual account transfer history
    When I want to add recipient of virtual account
    When I try adding recipient of virtual account in condition with <brivaNumber>
    When I inputting <amount> for <whatPayment> Payment Briva and <decision> with <name> , then choose account <debit>
    When I confirm briva transaction with <detail>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 	| whatPayment	| brivaNumber					| amount	| detail		| decision	| name		| debit	| condition	|
      | bribri0001 | Jakarta123 | 123457 	| Open				| 2276808130852287		| 10000		| briva			| Save			| Briva 1	| RATRI	|	NEW				|
    
  #@Valid    
  #Scenario Outline: User pay close briva bill with SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want transfer with virtual account with <condition> for <username>
    #When I saw my virtual account transfer history
    #When I want to add recipient of virtual account
    #When I try adding recipient of virtual account in condition with <brivaNumber>
    #When I inputting <amount> for <whatPayment> Payment Briva and <decision> with <name> , then choose account <debit>
    #When I confirm briva transaction with <detail>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | whatPayment		| brivaNumber							| amount	| detail		| decision	| name	| debit					| condition	|
      #| bribri0001 | Jakarta123 | 123457 | Close					| 2737012345678924				| NULL		| briva			|	NULL			| NULL	| Rihana Elaela	| NULL			|
   
   #@Valid   
   #Scenario Outline: User pay briva bill from list
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want transfer with virtual account with <condition> for <username>
    #When I saw my virtual account transfer history
    #When I try pay briva from my list
    #When I inputting <amount> for <whatPayment> Payment Briva and <decision> with <name> , then choose account <debit>
    #When I confirm briva transaction with <detail>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | whatPayment	| amount	| detail		| decision	| name	| debit	| condition	|
      #| bribri0001 | Jakarta123 | 123457 | NULL					| 10000		| briva			| NULL			| Briva 1	| RATRI	| NULL		|
      #
  #@Valid    
  #Scenario Outline: User pay briva bill from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want transfer with virtual account with <condition> for <username>
    #When I saw my virtual account transfer history
    #When I try pay briva from my history
    #When I inputting <amount> for <whatPayment> Payment Briva and <decision> with <name> , then choose account <debit>
    #When I confirm briva transaction with <detail>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | whatPayment	| amount	| detail		| decision	| name	| debit	| contion	|
      #| bribri0001 | Jakarta123 | 123457 | NULL					| 10000		| briva			| NULL			| Briva 1	| RATRI	| NULL	|