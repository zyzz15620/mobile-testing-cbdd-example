Feature: Verification of products detail in cart screen
  @TC05
  Scenario Outline: Verify cart detail
    Given the user has launched the eCart App
    And the user navigates to the Get Started screen by clicking next
    And the user select "all" location
    And the user clicks on the Category menu item
    And the user clicks on the category = "<category>"
    And the user scroll to product that contains = "<key>"
    And the user clicks Add to Cart the product that contains = "<key>"
    And the user clicks Add Quantity for the product that contains = "<key>"
    And the user clicks Cart icon on top screen
    When the user select "370405" location
    Then the cart should display the following details:
      | Deliver to         | 370405                         |
      | Product Name       | Kurkure Namkeen - Masala Munch, |
      | Product Price      | $13.00                         |
      | Product Measurement| 85 kg                          |
      | Product TotalPrice | $26.00                         |
      | Product Quantity   | 2                              |
    And the cart should display following buttons:
      | Delete             |
      | Save for later     |
      | Use Promo Code     |
      | Continue           |
    Examples:
      | key | category |
      | Kurkure Namkeen - Masala Munch | Fast Food |



