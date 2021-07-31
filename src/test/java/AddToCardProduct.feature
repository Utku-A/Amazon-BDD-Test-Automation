@SmokeTest

Feature: Add product to cart

  Background:
    Given Navigate go to website
    And Cookies Accepted

    Scenario Outline: Add product to cart
      And Search product enter "<product>"
      And Click to search button
      And Select search product "<select>"
      When Add to card
      Then Success message
      Examples:
        | product | select |
        | iPhone  |  4     |
        | Samsung |  6     |
        | Huawei  |  1     |