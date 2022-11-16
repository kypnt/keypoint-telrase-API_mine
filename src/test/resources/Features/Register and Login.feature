
@service9001
Feature: Register


  @register
  Scenario: User should be able to register with the valid information
    Given Sending request with valid information
    Then Response body should be taken and status code should be 201
  @login
  Scenario: User should be able to login with valid credentials
    Given user should be able to login with valid credentials