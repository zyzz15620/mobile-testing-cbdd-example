Feature: Verification Profile screen
  @TC07
  Scenario: Verify login screen
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And the user select "all" location
    And the user clicks on the Profile tab
    And the user clicks on Welcome Guest
    Then the Login page should display following:
    | Mobile Textbox    |
    | Password Textbox  |
    | Login Button      |
    | Signup Button     |
    | Forgot password   |

  @TC07
  Scenario: Verify profile screen
    Given the user has launched the eCart App
    When the user navigates to the Get Started screen by clicking next
    And the user select "all" location
    And the user clicks on the Profile tab
    And the user clicks on Welcome Guest
    And the user clicks Login in login page
    And the user clicks on the Profile tab
    Then the Profile screen after login should display following items:
    |Home               |
    |Cart               |
    |Notifications      |
    |Your Orders        |
    |Wallet History     |
    |Transaction History|
    |Change Password ?  |
    |Manage Addresses   |
    |Refer & Earn       |
    |Contact Us         |
    |About Us           |
    |Rate Us            |
    |Share App          |
    |FAQ               |
    |Terms & Conditions |
    |Privacy Policy     |
    |Logout             |




