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

  @tag1
  Scenario Outline: Title of your scenario outline
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to check my history transaction
    Then I saw my selection history transaction on <month> with <range> and <start> until <end>

    Examples: 
      | username   | password   | month		| range										| start	| end		|
      | bribri0001 | Jakarta123 | NULL		| Pilih Tanggal Sendiri		| 1			| 29		|
      | bribri0001 | Jakarta123 | NULL		| Hari Ini								| NULL	| NULL	|
      | bribri0001 | Jakarta123 | NULL		| Kemarin									| NULL	| NULL	|
      | bribri0001 | Jakarta123 | NULL		| Minggu Ini							| NULL	| NULL	|
      | bribri0001 | Jakarta123 | NULL		| Bulan Ini								| NULL	| NULL	|