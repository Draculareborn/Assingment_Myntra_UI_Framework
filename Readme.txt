Assignment_Myntra_UI_Framework - Myntra Home Furnishings Page Test

Introduction about framework :-
- Myntra is a eCommerce shopping website. 
- In the project I will be using a Hybrid Framework which is built using Maven, Java, Selenium and TestNG.
- In the test I have used @FindBy to store WebElements in Page Object Model and 
  have provided various generic ways to handle them using generic classes and methods.
- I have also included methods to handle test data through excel sheet and properties file.
- I have used Java and Selenium for UI Automation as those were my area of expertise and it most commonly used
  tool for UI Automation.
- We have used Maven because it provides inbuilt files and folder structure and 
  handles the dependencies it self through pom file, which is easier in project maintenance.
- I have used TestNG for test execution as it help to run multiple test with single click and also provides
  various annotation which helps in automation, also the execution of test methods in a class can be controlled
  by using enabled flag. It also provides the output in form of emailable HTML report. TestNG provides Asset and
  SoftAssert which can be used for verification purpose.
- I have also used Page Object Model as it helps in maintenance when locators changes,
  we just need to modify them in pom class leaving test class unhampered.
- I have also added a README.md which will help in using framework and running test.


Test cases covered :-
1. Validate appling filters for categories and brand and check the results.(Reason - Basic thing the user perform when visit and ecommerce page)
2. Validate adding 1st product to Wishlist from filtered product without having user logged in.(Reason - As this is one of the major functionality)
3. Validate adding 1st product to Bag from filtered product without having user logged in. (Reason - This was most important use case as without this purchasing can't be done)
4. Validate removing of product from bag.
5. Validate search feature for a product. (Reason - As this is one of the major functionality)

Improvement I would have done if more time :-
1. I would have refactored the code and made more reuseability.
2. I would have used external reporting tool to make test report of higher visibility and eye catching.
3. I would have covered more area in testing.
4. I would have validated compatibility with multiple browsers.

