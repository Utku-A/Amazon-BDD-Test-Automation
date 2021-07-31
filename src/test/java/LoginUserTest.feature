Feature: Login Page Test

  Background:
    Given Navigate go to website
    And Cookies Accepted

    Scenario:
      And Sign in button click
      And Enter email address "deneme@deneme.com"
      And Continue button click
      And Enter password "deneme123"
      When Login button click
      Then Verify message

