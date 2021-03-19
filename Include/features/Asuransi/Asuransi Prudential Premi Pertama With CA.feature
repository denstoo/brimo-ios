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
Feature: Title of your feature
  I want to use this template for my feature file

  @Valid
  Scenario Outline: User pay open briva bill with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to pay insurance bill with <condition> for <username>
    When I saw my insurance bill history
    When I want to add new insurance bill
    When I try adding new insurance <insuranceType> bill with <paymentType> and <insuranceNumber>
    When I inputting <amountInsurance> for <whatpayment> payment insurance bill and <decision> with <name> , then choose account <debit>
    When I confirm insurance bill transaction with <detail>
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username		| password		| pin			| condition	| detail										| insuranceType	| paymentType		| insuranceNumber	| amountInsurance	| whatPayment	| decision	| name						| debit	|
      | bribri0002	| Jakarta123	| 123457	| NULL			| Prudential Premi Pertama	| Prudential		| Premi Pertama	| 00900043				| 25000						| Open				| Save			| PPremi Pertama	| RATRI	|