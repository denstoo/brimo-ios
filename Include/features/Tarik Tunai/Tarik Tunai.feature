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
Feature: Tarik Tunai

  @Valid
  Scenario Outline: User withdrawing of cash online 
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to cash withdrawal without card
    When I choose <amountWithdraw> for withdrawal, then choose account <debit>
    When I confirm of cash withdrawal
    When I validate my pin with <pin> before transaction
    Then Withdrawal success

    Examples: 
      | username   | password   | pin 	 	| debit	| amountWithdraw	|
      | bribri0001 | Jakarta123 | 123457 	| RATRI	| 100000					|