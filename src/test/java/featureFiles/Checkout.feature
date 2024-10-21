Feature: Search and Place the order of Products

@Placeorder
Scenario Outline: Search Experience for product search in both home and Offers page
Given User is on GreenKart landing page
When User search with shortname <Name> and extracted actual name of product
And Added "3" items of selected product to cart
Then User proceeds to Checkout and validate the <Name> items in checkout page


Examples:
| Name |
| Tomato  |

