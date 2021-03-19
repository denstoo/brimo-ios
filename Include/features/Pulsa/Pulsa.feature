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
Feature: Pulsa

#	@Invalid
  #Scenario Outline: User buy pulsa (Simpati) with Empty Balance - Abnormal
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #Then Abnormal Saldo - I confirm pulsa bill with <username> and <pulsa>
#
    #Examples: 
      #| username   | password   | pin 	 	| numberPhone				| amount	| condition		| pulsa		|
      #| bribri0001 | Jakarta123 | 123457 	| 081212341234	| 15000		|	NEW					|	Simpati	|


	@Valid
  Scenario Outline: User buy pulsa (Simpati) with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to buy pulsa with <condition> for <username>
    When I write my <numberPhone> phone and <amount>
    When I choose account <debit> for pulsa
    When I confirm pulsa bill cause <pulsa>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa		|
      | brimosv004 | Jakarta123 | 123457 | 081212341234				| 15000		|	NEW					|	RATRI					| Simpati	|
  
  
  #@Valid    
  #Scenario Outline: User buy pulsa (Simpati) with SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 					| pulsa		|
      #| bribri0001 | Jakarta123 | 123457 | 081212341234	| 20000		|	NULL				|	Rihana Elaela		| Simpati	|
      
      
  #@Valid
  #Scenario Outline: User buy pulsa (Simpati) from History
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I buy pulsa from my history
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 	| condition		| debit 					| pulsa		|
      #| bribri0001 | Jakarta123 | 123457 	|	NULL				|	RATRI						| Simpati	|
           
   #@Valid
   #Scenario Outline: User buy pulsa (AS)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa	|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 15000		|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 20000		|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 25000		|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 50000		|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 100000	|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 200000	|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 300000	|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 500000	|	NEW				|	RATRI					| AS		|
      #| bribri0001 | Jakarta123 | 123457 | 085212341234	| 1000000	|	NEW				|	RATRI					| AS		|
        #
        
   #@Valid
   #Scenario Outline: User buy pulsa (XL)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa	|
      #| bribri0001 | Jakarta123 | 123457 | 081911106755	| 25000		| NEW				|	RATRI					| XL		|
        #
   #@Valid
   #Scenario Outline: User buy pulsa (XL)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa	|
      #| bribri0001 | Jakarta123 | 123457 | 081911106755	| 50000		| NEW				|	RATRI					| XL		|
      #| bribri0001 | Jakarta123 | 123457 | 081911106755	| 100000	| NEW				|	RATRI					| XL		|
      #| bribri0001 | Jakarta123 | 123457 | 081911106755	| 200000	| NEW				|	RATRI					| XL		|
      #
    #@Valid
    #Scenario Outline: User buy pulsa (Three)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 20000		| NEW				|	RATRI					|	Three	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 50000		| NEW				|	RATRI					|	Three	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 75000		| NEW				|	RATRI					|	Three	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 100000	| NEW				|	RATRI					|	Three	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 150000	| NEW				|	RATRI					|	Three	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 300000	| NEW				|	RATRI					|	Three	|
      #| bribri0001 | Jakarta123 | 123457 | 089785452541	| 500000	| NEW				|	RATRI					|	Three	|
      #
    #@Valid
    #Scenario Outline: User buy pulsa (Axis)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa	|
      #| bribri0001 | Jakarta123 | 123457 | 083811109000	| 25000		| NEW				|	RATRI					| Axis	|
      #| bribri0001 | Jakarta123 | 123457 | 083811109000	| 50000		| NEW				|	RATRI					| Axis	|
      #| bribri0001 | Jakarta123 | 123457 | 083811109000	| 100000	| NEW				|	RATRI					| Axis	|
      #| bribri0001 | Jakarta123 | 123457 | 083811109000	| 200000	| NEW				|	RATRI					| Axis	|
      #
    #@Valid
    #Scenario Outline: User buy pulsa (Smartfren)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa			|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 20000		| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 25000		| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 50000		| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 100000	| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 150000	| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 200000	| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 300000	| NEW				|	RATRI					| Smartfren	|
      #| bribri0001 | Jakarta123 | 123457 | 08880000034	| 500000	| NEW				|	RATRI					| Smartfren	|
      #
   #@Valid
   #Scenario Outline: User buy pulsa (IM3)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa	|
      #| bribri0001 | Jakarta123 | 123457 | 08561234567	| 25000		| NEW				|	RATRI					| IM3		|
      #| bribri0001 | Jakarta123 | 123457 | 08561234567	| 50000		| NEW				|	RATRI					| IM3		|
      #| bribri0001 | Jakarta123 | 123457 | 08561234567	| 100000	| NEW				|	RATRI					| IM3		|
      #| bribri0001 | Jakarta123 | 123457 | 08561234567	| 150000	| NEW				|	RATRI					| IM3		|
      #
    #@Valid
    #Scenario Outline: User buy pulsa (Mentari)
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I write my <numberPhone> phone and <amount>
    #When I choose account <debit> for pulsa
    #When I confirm pulsa bill cause <pulsa>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone				| amount	| condition		| debit 				| pulsa		|
      #| bribri0001 | Jakarta123 | 123457 | 081512341234	| 25000		| NEW				|	RATRI					| Mentari	|
      #| bribri0001 | Jakarta123 | 123457 | 081512341234	| 50000		| NEW				|	RATRI					| Mentari	|
      #| bribri0001 | Jakarta123 | 123457 | 081512341234	| 100000	| NEW				|	RATRI					| Mentari	|
      #| bribri0001 | Jakarta123 | 123457 | 081512341234	| 150000	| NEW				|	RATRI					| Mentari	|