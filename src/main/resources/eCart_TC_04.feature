Feature: Verification of products detail in product screen
  @TC04
  Scenario Outline: Verify product detail
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And the user select "all" location
    And the user scroll to Coffee category
    And the user click on View All Coffee
    And the user scroll to product that contains = "<key>"
    And the user click on product that contains = "<key>"
    Then the product screen should display with following Name and Price
      | Product Name   | High Octane Instant Coffee Paste with Hazelnut and Coconut Flavors, 150G - Pack of 2 (Hazelnut and Coconut Beaten Coffee Paste)|
      | Product Price  | $718.31|
    And the product screen should display with following buttons
      | Add to Cart       |
      | Go to Cart        |
      | Similar Products  |
    Examples:
      | key |
      | High Octane Instant Coffee |

