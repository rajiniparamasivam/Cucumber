Feature: verifying amazon page

@Mobiles
  Scenario: verifying amazon page product search
    Given User is on amazon page
    When User enter the Search product for amazon page
      | Tv      | Sony   |
      | Laptop  | Macbook|
      | Android | Mi     |
      | iso     | Apple  |
    Then User should verifying search product 
    
 @Laptops   
    Scenario: verifying amazon page product search
    Given User is on amazon page
    When User enter the Search product for amazon page
      | Tv      | Sony   |
      | Laptop  | Macbook|
      | Android | Mi     |
      | iso     | Apple  |
    Then User should verifying search product 
    
  
