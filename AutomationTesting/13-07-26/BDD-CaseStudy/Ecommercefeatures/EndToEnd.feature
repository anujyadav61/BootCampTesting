Feature: Covered E-Commerce Application

Scenario: Customer Registration

Given User should open Chrome Browser.
When User should enter https://www.flipkart.com in browser.
Then User should click on Sign Up/Register option.
Then User should enter valid Name.
Then User should enter valid Mobile Number/Email.
Then User should enter valid Password.
Then User should click on Register button.
Then User should verify registration success message is displayed.

Scenario: Customer Login

Given User should open Chrome Browser.
When User should enter https://www.flipkart.com in browser.
Then User should click on Login option.
Then User should enter registered Email/Mobile Number.
Then User should enter valid Password.
Then User should click on Login button.
Then User should verify Home page is displayed successfully.

Scenario: Product Search

Given User should search for a product.
When User should click on a product from the search results.
Then User should verify Product Details page is displayed.
Then User should verify Product Name, Price, Images and Specifications are displayed.
Then User should verify product availability is displayed.

Scenario: Product Details

Given User should search for a product.
When User should click on a product from the search results.
Then User should verify Product Details page is displayed.
Then User should verify Product Name, Price, Images and Specifications are displayed.
Then User should verify product availability is displayed.

Scenario: Add to Cart

Given User should be on Product Details page.
When User should click on Add to Cart button.
Then User should verify product is added to Cart.
Then User should verify Cart count is increased.

Scenario: Update Cart

Given User should have products in Cart.
When User should open Cart page.
Then User should increase quantity from 1 to 2.
Then User should verify updated quantity is displayed.
Then User should verify total amount is updated.

Scenario: Remove from Cart

Given User should have products in Cart.
When User should open Cart page.
Then User should click on Remove button.
Then User should confirm removal.
Then User should verify product is removed from Cart.

Scenario: Wishlist

Given User should be logged into Flipkart.
When User should open Product Details page.
Then User should click on Wishlist icon.
Then User should open Wishlist page.
Then User should verify selected product is displayed in Wishlist.

Scenario: Checkout

Given User should have products in Cart.
When User should click on Place Order button.
Then User should select Delivery Address.
Then User should proceed to Checkout page.
Then User should verify Order Summary is displayed.

Scenario: Payment

Given User should be on Payment page.
When User should select UPI as Payment Method.
Then User should enter valid UPI ID.
Then User should click on Pay Now button.
Then User should verify Payment Successful message is displayed.

Scenario: Order Confirmation

Given User should complete payment successfully.
When Order is placed successfully.
Then User should verify Order Confirmation page is displayed.
Then User should verify unique Order ID is generated.
Then User should verify confirmation message is displayed.

Scenario: Order History

Given User should be logged into Flipkart.
When User should navigate to My Orders page.
Then User should verify previous orders are displayed.
Then User should verify order details and current status are displayed.

Scenario: Logout

Given User should be logged into Flipkart.
When User should click on Profile icon.
Then User should click on Logout option.
Then User should verify Login page is displayed.
Then User should verify user session is terminated successfully.
