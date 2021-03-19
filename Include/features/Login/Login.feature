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
Feature: Login

#	@Valid
  #Scenario Outline: User login for first time
    #Given I start application for first time
    #When I already have an account
    #Given I start application
    #When I want login
    #When I try first login with existing account <username> and <password> but have not pin
    #When I verification deep link from account <username>
    #And I create pin with <pin>
    #And I confirm pin with <pin>
    #Then I successfully go to dashboard for first time
#
    #Examples: 
      #| username   | password   | pin		 |
      #| brimosv004 | Jakarta123 | 123457 |
      #
   #@Valid
   #Scenario Outline: User login existing in another device
    #Given I start application
    #When I want login
    #When I try login another device with existing account <username> and <password>
    #When I confirm pin with <pin>
    #When I verification deep link from account <username>
    #Then I successfully go to dashboard for first time
#
    #Examples: 
      #| username   | password   | pin		 |
      #| brimosv004 | Jakarta123 | 123457 |
      
   #@Valid
   #Scenario Outline: User login with existing account
    #Given I start application
    #When I want login
    #When I try login with existing account <username> and <password>
    #Then I successfully go to dashboard
#
    #Examples: 
      #| username   | password   |
      #| brimosv004 | Jakarta123 |
      
#TC_BRImo_app_android_login_401
   @401
   Scenario Outline: User login with existing account
   Given I start application
   When I want login
   When I try login with existing account <username> and <password>
   Then I successfully go to dashboard
    Examples: 
      | username   | password   |
      | brimosv004 | Jakarta123 |
      
#TC_BRImo_app_android_login_604
 @Invalid
   Scenario Outline: User login with existing account
   Given I start application
   When I want login
   When I try login with existing account <username> and <password>
   Then I successfully go to dashboard
    Examples: 
      | username   | password   |
      | brimosv004 | asal321 |