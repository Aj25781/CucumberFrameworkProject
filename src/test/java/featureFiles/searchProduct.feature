Feature: Search and Place the order of Products

Scenario: Search Experience for product search in both home and Offers page
Given User is on GreenKart landing page
When User search with shortname "Tom" and extracted actual name of product
Then User search with "Tom" same shortname in offers page to check if product exist
