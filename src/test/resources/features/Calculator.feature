Feature: Calculator
  @release:iteration-1
  @Department:IT
  Rule: Members should be able to count
    Scenario: Addition
      Given 2 numbers 1 and 10
      When adding those 2 numbers
      Then the result is 11

    Scenario: Addition2
      Given 2 numbers 1 and 9
      When adding those 2 numbers
      Then the result is 10

