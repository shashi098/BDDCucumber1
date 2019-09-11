Feature: Testing the login Feature


#Background:
#Given then user opens the browser and enters the url
#And the user mouse hover to account
#And click on sign in button
#Then he land Customer login page


@SmokeTest @RegressionTest    
#for running while doing in both regerssion and smoketesting
Scenario: Testing the login feature with valid credentials
Given then user opens the browser and enters the url
And the user mouse hover to account
And click on sign in button
Then he land Customer login page
And user enters the valid "sk724677@gmail.com" and "shashi098"
And click on Login Button
Then User dashboard page with username Should be displayed
Then close the brower


#Scenario Outline: Testing the login feature with Invalidvalid credentials

#And user enters the invalid "<username>" and "<password>"
#And click on Login Button
#Then Invalid credential must be displayed
#Then close the brower

@RegressionTest
Scenario: Searching for products
Given then user opens the browser and enters the url
And select search box and search for product

|TV|
|Mobiles|
|bags|
|laptops|
|shoes|



#Examples:
#
#|username|password|
#|shashi@gmail.com|shashi098|
#|kumar@gmail.com|098shashi|