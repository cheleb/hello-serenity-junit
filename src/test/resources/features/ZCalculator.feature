Feature: ZCalculator
  @release:iteration-1
  @Department:IT
  Rule: ZIO should be able to count
    Scenario: Random number
      Given 3 random numbers
      When adding those numbers
      Then the result is > 0


