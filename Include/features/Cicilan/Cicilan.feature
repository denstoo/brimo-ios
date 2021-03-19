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
Feature: Cicilan

  @Valid
  Scenario Outline: User pay installment with CA
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want pay installment with <condition> for <username>
    When I saw my installment payment history
    When I want to add payment of installment
    When I write installment code in condition with <installmentType> and <installmentNumber>
    When I saw amount of installment payment and <decision> with <name> , then choose account <debit>
    When I confirm of installment payment
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 	| installmentType	| installmentNumber		| decision	| name		| debit	| condition	|
      | bribri0001 | Jakarta123 | 123457 	| OTO							| 000126084750				| Save			| OTO			| RATRI	|	NULL			|