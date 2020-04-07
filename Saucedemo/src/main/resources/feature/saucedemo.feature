@Saucedemo
Feature: Saucedemo Website
@TC01_Saucedemo
Scenario Outline:
Login in the Saucedemo
Given the user launch the chrome application
When the user open the Saucedemo Home page 
Then the user login using <username> and <password>
Then click on the login button user nagivate to the next page
  
Examples:
| username 			| password					|
|	name	|		pswd		|

@TC02_Saucedemo
Scenario Outline:
Select price-range
Given TC02 the user launch the chrome application
When TC02 the user open the Saucedemo Home page 
Then TC02 the user login using <username> and <password>
Then TC02 click on the login button user nagivate to the next page
Then TC02 select the price range from low to high
  
Examples:
| username 			| password					|
|	name	|		pswd		|

@TC03_Saucedemo
Scenario Outline:
Select product
Given TC03 the user launch the chrome application
When TC03 the user open the Saucedemo Home page 
Then TC03 the user login using <username> and <password>
Then TC03 click on the login button user nagivate to the next page
Then TC03 the user select the product
Then TC03 adds the product to Add Cart
  
Examples:
| username 			| password					|
|	name	|		pswd		|

@TC04_Saucedemo
Scenario Outline:
To know product is added to cart
Given TC04 the user launch the chrome application
When TC04 the user open the Saucedemo Home page 
Then TC04 the user login using <username> and <password>
Then TC04 click on the login button user nagivate to the next page
Then TC04 the user select the product and add to cart
Then TC04 check product is added to cart or not
  
Examples:
| username 			| password					|
|	name	|		pswd		|

@TC05_Saucedemo
Scenario Outline:
To know product is added 
Given TC05 the user launch the chrome application
When TC05 the user open the Saucedemo Home page 
Then TC05 the user login using <username> and <password>
Then TC05 click on the login button user nagivate to the next page
Then TC05 user opens the menu
Then TC05 user click on About
  
Examples:
| username 			| password					| 
|	name	|		pswd		|


@TC06_Saucedemo
Scenario Outline:
Logout from Saucedemo
Given TC06 the user launch the chrome application
When TC06 the user open the Saucedemo Home page 
Then TC06 the user login using <username> and <password>
Then TC06 click on the login button user nagivate to the next page
Then TC06 user opens the menu
Then TC06 user click on Logout

  
Examples:
| username 			| password					|
|	name	|		pswd		|

