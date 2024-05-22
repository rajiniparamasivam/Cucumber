Feature: Open Google.com feature file

  Scenario: Open Google and search the Website
    Given User Load the URL and open the WebPage
    When User enter the search box MacBook Air m1 laptop
    And User click the search box
    Then User should verify the search results for laptop.
