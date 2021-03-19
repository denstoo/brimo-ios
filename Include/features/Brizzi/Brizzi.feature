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
Feature: Brizzi

  #@Invalid
  #Scenario Outline: User do donate some their money - Abnormal
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want top up brizzi with <condition> for <username>
    #When I write brizzi <brizziNumber> and choose <amountBrizzi>
    #Then Abnormal Saldo - I choose account debit for top up brizzi with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | brizziNumber				| amountBrizzi	| debit	| condition	|
      #| bribri0001 | Jakarta123 | 123457 | 6013 5006 0150 5515	| 20000					|	RATRI	| NULL		|
      #
  @Valid
  Scenario Outline: User top up deposit brizzi
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want top up brizzi with <condition> for <username>
    When I write brizzi <brizziNumber> and choose <amountBrizzi>
    When I choose account <debit> for top up brizzi
    When I confirm my top up brizzi
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | brizziNumber					| amountBrizzi	| debit	| condition	|
      | bribri0001 | Jakarta123 | 123457 | 6013 5006 0150 5515	| 20000					|	RATRI	| NEW				|
      
      
  #@Valid
  #Scenario Outline: User top up deposit brizzi from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want top up brizzi with <condition> for <username>
    #When I try top up brizzi with <amountBrizzi> from history
    #When I choose account <debit> for top up brizzi
    #When I confirm my top up brizzi
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | brizziNumber					| amountBrizzi	| debit					| condition	|
      #| bribri0001 | Jakarta123 | 123457 | 6013 5006 0150 5515	| 20000					|	Rihana Elaela	| NULL			|