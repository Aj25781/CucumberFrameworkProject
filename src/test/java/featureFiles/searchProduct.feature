Feature: Search and Place the order of Products

@OffersPage
Scenario Outline: Search Experience for product search in both home and Offers page
Given User is on GreenKart landing page
When User search with shortname <Name> and extracted actual name of product
Then User search with <Name> same shortname in offers page to check if product exist

Examples:
| Name |
| Tom  |
| Beet |
