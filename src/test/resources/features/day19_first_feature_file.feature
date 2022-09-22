@google_search
Feature: Search Feature

  Background: User_goes_to_Google
    Given user is on the google page

 Scenario:  TC01_iphone_search
   When user search for iPhone on google
   Then verify the page title contains iPhone
   Then close the application


  @teapot
 Scenario: TC02_teapot_search
    When user search for TeaPot on google
   Then verify the page title contains TeaPot
   Then close the application