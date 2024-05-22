Feature: verifying Amazon page

  Scenario: verifying Amazon page product search
    Given User is on the page
    When User enter the Search product
      | Tv      |
      | Laptop  |
      | Android |
      | iso     |
    And User click the search box
  
