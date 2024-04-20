Feature: Verification of products detail in payment screen
  @TC06
  Scenario Outline: Verify Payment detail
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And the user select "all" location
    And the user clicks on the Category menu item
    And the user clicks on the category = "<category>"
    And the user scroll to product that contains = "<key>"
    And the user clicks Add to Cart the product that contains = "<key>"
    And the user clicks Add Quantity for the product that contains = "<key>"
    And the user clicks Cart icon on top screen
    And the user select "370001" location
    And the user clicks Continue on cart page
    And the user clicks Login in login page
    And the user clicks Continue on cart page
    And the user clicks Continue with address
    Then the Payment page should display the following details:
      | Pin Code       | 370465  |
      | Time           | Preferred Delivery Date / Time |
      | Grand Total    | $714.20 |
      | Name           | Sunfeast Dark Fantasy Choco Fills, 600g (1 Pack) |
      | Total          | $414.20 |
      | Subtotal       | $414.20 |
      | Delivery       | $300.00 |
      | Saved          | $109.0  |

    Examples:
      | key | category |
      | Sunfeast Dark Fantasy Choco Fills, 600g | Beverages |



