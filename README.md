# Assignment_Myntra_UI_Framework - Myntra Home Furnishings Page Test

## _Introduction_ 
- Myntra is an eCommerce shopping website. 
- In the project, we will use a Hybrid Framework built using Maven, Java, Selenium, and TestNG.
- In the test, we have used @FindBy to store WebElements in the Page Object Model and have provided various generic ways to handle them using generic classes and methods.
- We have also included methods to handle test data through Excel sheets and properties files.

## _Getting Started_
To get started we need to perform the following steps:
1. We should have Eclipse Version: 2021-06 (4.20) installed.
2. We should have Java Version 11 installed.
3. We should have Chrome browser Version 116.0.5845.96 or above.
4. The other dependencies will be handled from the pom.xml file itself.

## _Dependencies used in framework_
1. selenium-java: Version 3.141.59
2. poi-ooxml: Version 4.1.1 (for xlsx type file for Excel 2007 and above)
3. poi: Version 4.1.1 (for xls type file for Excel 97-2007)
4. testng : Version 7.5.1
5. maven-compiler-plugin : Version 3.8.1
6. maven-surefire-plugin : Version 3.0.0-M5
7. java: Version 11

## _Scenarios covered_
1. Validate applying filters for categories and brands and check the results.
2. Validate adding 1st product to the Wishlist from the filtered product without the user logging in.
3. Validate adding 1st product to the Bag from the filtered product without the user logging in.
4. Validate removing of product from the bag.
5. Validate the search feature for a product.

## _Build and Test_
1. Import the .project in Eclipse as a maven project.
2. Check all dependencies are downloaded and no error is shown.
3. We can run the test in two ways either as TestNG test or as a Maven Test
  - To run as a TestNG test,
```bash
  myntratestng.xml-> Right Click -> Run As -> TestNG Suite.
```
  - To run as Maven test,
```bash
  pom.xml-> Right Click -> Run As -> Maven Test.
```
  


4. After the execution is completed the test report for both types of test can be seen as
  - For the TestNG test report,
```bash
  test-output-> Right-click on emailable-report.html -> Open with WebBrowser
  ```

  - For Maven test report, go to 
```bash
  target-> surefire-reports -> Right-click on emailable-report.html -> Open with WebBrowser
  ```

## _Contributions_

- Framework and Automation Test - Bhaskar (bhaskarreborn@gmail.com)

## _Authors_

- [@bhaskar](https://github.com/Draculareborn)

## _🔗 Links_

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/bhaskarqa/)