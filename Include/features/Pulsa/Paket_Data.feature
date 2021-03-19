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
Feature: Paket Data

#	@Invalid
  #Scenario Outline: User buy data package (Ooredoo) with Empty Balance - Abnormal
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I choose data package and write my <numberPhone> phone and <amountPaketData>
    #Then Abnormal Saldo - I choose account debit for data package with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone	| amountPaketData	| condition		| debit 				| provider	|
      #| bribri0001 | Jakarta123 | 123457 | 08561234567	| 30000						|	NEW					|	RATRI					| Ooredoo		|


	@Valid
  Scenario Outline: User buy data package (Ooredoo) with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to buy pulsa with <condition> for <username>
    When I choose data package and write my <numberPhone> phone and <amountPaketData>
    When I choose account <debit> for data package
    When I confirm data package bill cause <provider>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | numberPhone		| amountPaketData	| condition		| debit 				| provider	|
      | bribri0001 | Jakarta123 | 123457 | 08561234567		| 30000						|	NEW					|	RATRI					| Ooredoo		|
      | bribri0001 | Jakarta123 | 123457 | 0812666666001	| 20000						|	NEW					|	RATRI					| Simpati		|
      
  #@Valid
  #Scenario Outline: User buy data package (Ooredoo) from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to buy pulsa with <condition> for <username>
    #When I buy data package from my history with <amountPaketData>
    #When I choose account <debit> for data package
    #When I confirm data package bill cause <provider>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | numberPhone	| amountPaketData	| condition		| debit 				| provider	|
      #| bribri0001 | Jakarta123 | 123457 | 08561234567	| 30000						|	NEW					|	RATRI					| Ooredoo		|