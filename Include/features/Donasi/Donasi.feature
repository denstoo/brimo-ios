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
Feature: Donation

  #@Invalid
  #Scenario Outline: User do donate some their money - Abnormal
    #Given I start application
    #When I want login
    #When Abnormal Saldo - I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to donate
    #When I choose <produk> donation for <jenis> with <nominal> and <jumlah>
    #Then Abnormal Saldo - I choose account debit for donation with <username>
#
    #Examples: 
      #| username   | password   | pin 	 | produk		| jenis		| nominal | jumlah	| debit					|
      #| bribri0001 | Jakarta123 | 123457 | YBM BRI	| Zakat		| 10000		| NULL		| RATRI					|
      
  @Valid
  Scenario Outline: User do donate some their money
    Given I start application
    When I want login
    When I try login with existing account <username> and <password>
    Then I successfully go to dashboard
    And I want to donate
    When I choose <produk> donation for <jenis> with <nominal> and <jumlah>
    When I choose account <debit> for donation
    When I confirm my donation
    When I validate my pin with <pin> before transaction
    Then Transaction success

    Examples: 
      | username   | password   | pin 	 | produk		| jenis		| nominal										| jumlah	| debit					|
      | bribri0001 | Jakarta123 | 123457 | YBM BRI	| Zakat		| 10000											| NULL		| RATRI					|
      
      
  #@Valid
  #Scenario Outline: User do donate some their money
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
    #And I want to donate
    #When I choose <produk> donation for <jenis> with <nominal> and <jumlah>
    #When I choose account <debit> for donation
    #When I confirm my donation
    #When I validate my pin with <pin> before transaction
    #Then Transaction success
#
    #Examples: 
      #| username   | password   | pin 	 | produk		| jenis		| nominal										| jumlah	| debit					|
      #| bribri0001 | Jakarta123 | 123457 | YBM BRI	| Infaq		| Masukkan Nominal Sendiri	| 10000		| Rihana Elaela	|