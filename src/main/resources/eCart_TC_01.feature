Feature: Home Screen Verification
  @TC01
  Scenario: Verify Home Screen Elements
    Given the user has launched the eCart App
    Then the welcome screen should be displayed with all the following elements:
      | Skip button        |
      | Next button        |
      | Look for things around you text |