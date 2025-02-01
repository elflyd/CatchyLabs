Feature:  CachyLabs


  @Login;
  Scenario: Login to cachylabs
    Given User goes to cachylabs login page
    When Click accept cookies
    When Click Search box
    When Write product name
    When Click Search button
    When Filter for Shipped by Amazon
    When Filter by Apple
    When Click first product on the page
    When Add to cart
    Then Check the cart page












