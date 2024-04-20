Feature: Verify Category and Delivery Location screens
  @TC02
  Scenario: Verify Default Delivery Location screen elements
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    Then the Default Delivery Location screen should display the following elements:
      | Search Pin textbox|
      | Search Button     |
      | Location display  |
    And the location display should show the following pins:
      | All     |
      | 370405  |
      | 841301  |
      | 800001  |
      | 370465  |
      | 370001  |

  @TC02
  Scenario: Verify Category screen elements
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And  the user select "all" location
    And the user clicks on the Category menu item
    Then the Category screen should display the following categories:
      | Coffee Product      |
      | Fast Food           |
      | Home Supplies       |
      | Beverages           |
      | Baby Needs          |
      | Vegetables          |
