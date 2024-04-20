Feature: Verification of number of product in Fresh Veg
  @TC03
  Scenario: Verify number of Fresh Veg in HomePage
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And  the user select "all" location
    And the user scroll to Fresh Veg category
    Then the Fresh Veg category in HomePage should display 3 products
  @TC03
  Scenario: Verify number of Fresh Veg in Fresh Veg Page (after click view all)
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And  the user select "all" location
    And the user scroll to Fresh Veg category
    And the user click on View All Fresh Veg
    Then the Fresh Veg Page should display 10 products

