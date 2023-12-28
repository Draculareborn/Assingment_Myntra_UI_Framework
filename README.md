# Assignment_Myntra_UI_Framework - Myntra Home Furnishings Page Test

## _Introduction_ 
- Myntra is a eCommerce shopping website. 
- In the project we will be using a Hybrid Framework which is built using Maven, Java, Selenium and TestNG.
- In the test we have used @FindBy to store WebElements in Page Object Model and have provided various generic ways to handle them using generic classes and methods.
- We have also included methods to handle test data through excel sheet and properties file.

## _Getting Started_
To get start we need to perform following steps:
1. We should have Eclipse Version: 2021-06 (4.20) installed.
2. We should have Java Version 11 installed.
3. We should have Chrome browser Version 116.0.5845.96 or above.
4. The other dependencies will be handled from pom.xml file itself.

## _Dependencies used in framework_
1. selenium-java : Version 3.141.59
2. poi-ooxml : Version 4.1.1 (for xlsx type file for Excel 2007 and above)
3. poi : Version 4.1.1 (for xls type file for Excel 97-2007)
4. testng : Version 7.1.0
5. maven-compiler-plugin : Version 3.8.1
6. maven-surefire-plugin : Version 3.0.0-M5
7. java : Version 11

## _Test cases covered_
1. Validate appling filters for categories and brand and check the results.
2. Validate adding 1st product to Wishlist from filtered product without having user logged in.
3. Validate adding 1st product to Bag from filtered product without having user logged in.
4. Validate removing of product from bag.
5. Validate search feature for a product.

## _Build and Test_
1. Import the .project in eclipse as maven project.
2. Check all dependency are downloaded and no error shown.
3. We can run the test in two way either as TestNg test or as Maven Test
    - To run as TestNG test, right click on myntratestng.xml -> Run As -> TestNG Suite.
    - To run as Maven test, right click on pom.xml -> Run As -> Maven test.
4. After the execution is completed the test reoprt for both type of test can be seen as
    - For TestNG test report, go to test-output -> right click on emailable-report.html -> and open with WebBrowser.
    - For Maven test report, go to target -> surefire-reports -> right click on emailable-report.html -> and open with WebBrowser.

## _Contributions_

1. Framework and Automation Test - Bhaskar (bhaskarreborn@gmail.com)