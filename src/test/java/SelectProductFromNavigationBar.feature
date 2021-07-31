Feature:Select Product From Navigation Bar

  Background:
    Given Navigate go to website
    And Cookies Accepted

    Scenario: Select Product From Navigation Bar
      And Open side navigate bar
      And Select ayakabi
      And Select Ev terligi
      And Select product "2"
      And Select choose size "36"
      And Buy now button click
      And Enter email address "deneme@deneme.com"
      And Continue button click
      And Enter password "deneme123"
      When Login button click
      Then Verify message
