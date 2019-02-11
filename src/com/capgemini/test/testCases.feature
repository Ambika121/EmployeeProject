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
  Scenario: Creatimg the Employee
    Given We pass name as null
    When Create method is called
    Then nullFieldsFoundException is thrown

  @tag2
  Scenario: Creating the Employee
    Given We pass id as null
    When create method is called
    Then nullFieldsFoundException is thrown
    
    
  @tag3
  Scenario: Creating the Employee
    Given We pass address is null
    When create method is called
    Then nullFieldsFoundException is thrown
    
    
  @tag4
  Scenario: Creating the Employee
    Given We pass all valid details
    When create method is called
    Then Details should be saved in Hashmap
    
    
  @tag5
  Scenario: Creating the Employee
    Given We pass id as duplicate
    When create method is called
    Then idAlreadyExistsException is thrown
    
 
  @tag6
  Scenario: Search by name
    Given We pass name as null
    When search by name is called
    Then InvalidNameException is thrown
    
  @tag7
  Scenario: Search by name
    Given We pass name which dont exists
    When search by name is called
    Then nameNotFoundException is thrown
    
    
   @tag8
  Scenario Outline: Search by name
    Given We pass valid name
    When search by name is called
    Then Result should be printed
 
 
    Examples: 
      | name   | status  |
      | tag1   | Fail |
      | tag2   | Fail |
      | tag3   | Fail |
      | tag4   | Fail |
      | tag5   | Fail |
      | tag6   | Fail |
      | tag7   | Fail |
      | tag8   | Fail |
      
