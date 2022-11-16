@service9001
Feature: CandidateRegisterFlow

  Background: Register
    Given Sending request with valid information
    Given user should be able to be "candidate"

  Scenario: a user should be able to give personal info
    Given user should be able to give personal info
    Given user should be able to update personal positon