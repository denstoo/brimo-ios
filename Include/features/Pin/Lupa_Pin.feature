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
Feature: Forgot Pin

  @Valid
  Scenario Outline: User forgot pin
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to buy pulsa with <condition> for <username>
    When I write my <number> phone and <amount>
    When I choose account <debit> for pulsa
    When I confirm pulsa bill cause <pulsa>
		And I forgot my pin
		When I input <password> user info from feature inside
		When I input otp for verification forgot pin on <username>
		And I create new pin with <pin> for forgot pin
		And I confirm pin with <pin> for forgot pin
		Then I successfully go to dashboard

    Examples: 
      | username   | password   | pin 	 | number				| amount	| condition		| debit 				| pulsa		|
      | bribri0001 | Jakarta123 | 123457 | 081212341234	| 15000		|	NULL					|	RATRI					| Simpati	|
      
      
  @Valid
  Scenario Outline: User forgot pin
    Given I start application
    And I want to buy pulsa from fast menu with <condition> for <username>
    When I write my <number> phone and <amount>
    When I choose account <debit> for pulsa
    When I confirm pulsa bill cause <pulsa>
		And I forgot my pin
		When I input <username> and <password> user info from feature outside
		When I input otp for verification forgot pin on <username>
		And I create new pin with <pin> for forgot pin
		And I confirm pin with <pin> for forgot pin
		Then I check fast menu

    Examples: 
      | username   | password   | pin 	 | number				| amount	| condition		| debit 				| pulsa		|
      | bribri0001 | Jakarta123 | 123457 | 081212341234	| 15000		|	NULL				|	RATRI					| Simpati	|