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
Feature: Credit

#	@Invalid
#	Scenario Outline: User pay credit bill - Abnormal Saldo
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay credit bill with <condition> for <username>
    #When I saw payment of credit bills history
    #When I want to add recipient of credit bill
    #When I try adding recipient of credit bill condition with <creditBank> and <creditNumber>
    #Then Abnormal Saldo - I inputting <totalInput> and <amountCredit> for the credit amount with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | creditBank		| creditNumber 			| totalInput	| amountCredit	| condition	|
      #| bribri0001 | Jakarta123 | 123457 | BRI					| 4359650100001206	| Manual			| 10000					| NEW				|
#	
#	@Valid
#	Scenario Outline: User pay credit bill with CA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay credit bill with <condition> for <username>
    #When I saw payment of credit bills history
    #When I want to add recipient of credit bill
    #When I try adding recipient of credit bill condition with <creditBank> and <creditNumber>
    #When I inputting <totalInput> and <amountCredit> for the credit amount and <decision> with <name> , then choose account <debit>
    #When I confirm payment of credit bill with <detail> and <creditBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | creditBank	| creditNumber 			| totalInput	| amountCredit	| detail				| condition	| decision	| name			| debit	|
      #| bribri0001 | Jakarta123 | 123457 | BRI				| 4359650100001206	| Manual			| 150000				| kartu kredit	| NULL			|	Save			| Test BRI	| RATRI	|
      #
  #@Valid
#	Scenario Outline: User pay credit bill with SA
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay credit bill with <condition> for <username>
    #When I saw payment of credit bills history
    #When I want to add recipient of credit bill
    #When I try adding recipient of credit bill condition with <creditBank> and <creditNumber>
    #When I inputting <totalInput> and <amountCredit> for the credit amount and <decision> with <name> , then choose account <debit>
    #When I confirm payment of credit bill with <detail> and <creditBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | creditBank	| creditNumber 			| totalInput	| amountCredit	| detail				| condition	| decision	| name	| debit					|
      #| bribri0001 | Jakarta123 | 123457 | BRI				| 4359650100001206	| Penuh				| Null					| kartu kredit	| NULL			| NULL			| NULL	| Rihana Elaela	|
      #| bribri0001 | Jakarta123 | 123457 | BRI				| 4359650100001206	| Minimal			| Null					| kartu kredit	| NULL			| NULL			| NULL	| Rihana Elaela	|
      #
  #@Valid
#	Scenario Outline: User pay credit bill from list
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay credit bill with <condition> for <username>
    #When I saw payment of credit bills history
    #When I try pay credit bill from my list
    #When I inputting <totalInput> and <amountCredit> for the credit amount and <decision> with <name> , then choose account <debit>
    #When I confirm payment of credit bill with <detail> and <creditBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | creditBank		| creditNumber 			| totalInput	| amountCredit	| detail				| condition	| decision	| name	| debit					|
      #| bribri0001 | Jakarta123 | 123457 | BRI					| 4359650100001206	| Manual			| 150000				| kartu kredit	| NULL			|	NULL			| NULL	| Rihana Elaela	|
      #
  #@Valid
#	Scenario Outline: User pay credit bill from history
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to pay credit bill with <condition> for <username>
    #When I saw payment of credit bills history
    #When I try pay credit bill from my history
    #When I inputting <totalInput> and <amountCredit> for the credit amount and <decision> with <name> , then choose account <debit>
    #When I confirm payment of credit bill with <detail> and <creditBank>
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | creditBank		| creditNumber 			| totalInput	| amountCredit	| detail				| condition	| decision	| name	| debit	|
      #| bribri0001 | Jakarta123 | 123457 | BRI					| 4359650100001206	| Manual			| 150000				| kartu kredit	| NULL			|	NULL			| NULL	| RATRI	|
      
  @Valid
	Scenario Outline: User pay credit bill other bank
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay credit bill with <condition> for <username>
    When I saw payment of credit bills history
    When I want to add recipient of credit bill
    When I try adding recipient of credit bill condition with <creditBank> and <creditNumber>
    When I inputting <totalInput> and <amountCredit> for the credit amount and <decision> with <name> , then choose account <debit>
    When I confirm payment of credit bill with <detail> and <creditBank>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | creditBank								| creditNumber 			| totalInput	| amountCredit	| detail				| condition	| decision	| name	| debit	|
      | bribri0001 | Jakarta123 | 123457 | Standard Chartered Card	| 4511960000000009	| NULL				| 10000					| kartu kredit	| NEW				|	Save			| Other	| RATRI	|
#	    | bribri0001 | Jakarta123 | 123457 | HSBC Card								| 4009341234567890	| NULL				| 10000					| kartu kredit	| NULL			|	NULL			| NULL	| RATRI	|
#	    | bribri0001 | Jakarta123 | 123457 | DBS Card									| 4374511234567895	| NULL				| 10000					| kartu kredit	| NULL			|	NULL			| NULL	| RATRI	|
#	    | bribri0001 | Jakarta123 | 123457 | ANZ Panin								| 1234567890123456	| NULL				| 10000					| kartu kredit	| NULL			|	NULL			| NULL	| RATRI	|