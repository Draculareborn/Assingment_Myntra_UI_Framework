Assignment_Myntra_UI_Framework - Myntra Home Furnishings Page Test

Introduction about the framework:-
- Myntra is an eCommerce shopping website. 
- In the project, I will use a Hybrid Framework built using Maven, Java, Selenium, and TestNG.
- In the test, I have used @FindBy to store WebElements in the Page Object Model and 
  have provided various generic ways to handle them using generic classes and methods.
- I have also included methods to handle test data through Excel sheets and properties files.
- I have used Java and Selenium for UI Automation as those were my areas of expertise and it most commonly used
  tools for UI Automation.
- We have used Maven because it provides inbuilt files and folder structure and 
  handles the dependencies through pom file, which is easier in project maintenance.
- I have used TestNG for test execution as it helps to run multiple tests with a single click and also provides
  various annotations which helps in automation, also the execution of test methods in a class can be controlled
  by using the enabled flag. It also provides the output in the form of an emailable HTML report. TestNG provides Assert and
  SoftAssert which can be used for verification purposes.
- I have also used the Page Object Model as it helps in maintenance when locators change,
  we just need to modify them in the pom class leaving the test class unhampered.
- I have also added a README.md which will help in using the framework and running tests.


Test cases covered:-
1. Validate applying filters for categories and brands and check the results. (Reason - Basic thing the user performs when visiting an e-commerce page)
2. Validate adding 1st product to the Wishlist from the filtered product without the user logging in. (Reason - As this is one of the major functionality)
3. Validate adding 1st product to the Bag from the filtered product without having the user logged in. (Reason - This was the most important use case as without this purchasing can't be done)
4. Validate removing of product from the bag.
5. Validate the search feature for a product. (Reason - As this is one of the major functionality)

Improvement I would have done if more time:-
1. I would have refactored the code and made it more reusable.
2. I would have used an external reporting tool to make a test report of higher visibility and eye-catching.
3. I would have covered more areas in testing.
4. I would have validated compatibility with multiple browsers.

