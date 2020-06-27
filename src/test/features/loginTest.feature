@Login
Feature: test SignUp function

  Scenario Outline: User can signup new account successful
    Given User is on LoginPage "LoginPage"
    When User input login email "<email>"
    And User input login password "<password>"
    And User click Login button
    Then User is on HomePage "HomePage"

    Examples:
    |email                      |password       |
    |hoang-test-02@yopmail.com  |1234qwer!Q     |