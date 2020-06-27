@SignUp
Feature: test SignUp function

    Scenario Outline: User can signup new account successful
      Given User is on LoginPage "LoginPage"
      When User click Signup button
      And User input email "<email>"
      And User input password "<password>"
      And User input confirm password "<password>"
      And User select country "<country>"
      And User select checkbox Terms and Conditions
      Then User click Create button


      Examples: user credentials
      |email                  |password            |country        |
      |qc-test01@yopmail.com  |qQwer1234!          |Vietnam        |


