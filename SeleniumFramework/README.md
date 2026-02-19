Selenium Automation Framework – Demoblaze E-commerce Application

About This Project:
This project is an automation testing framework developed to test the end-to-end purchase functionality of the Demoblaze E-commerce web application using Selenium WebDriver with Java.

The main aim of this project is to automate the user purchase workflow and verify whether the product ordering process is working correctly.

Technologies Used:
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager
- Eclipse IDE

Test Scenario Automated:
The following test scenario is automated in this project:

1. Launch Chrome Browser
2. Navigate to Demoblaze Website
3. Login with valid credentials
4. Select a product (Samsung Galaxy S6)
5. Add product to cart
6. Navigate to cart page
7. Place order
8. Enter purchase details
9. Confirm purchase
10. Validate successful order confirmation

Framework Implementation:
This automation framework is designed using the Page Object Model (POM) design pattern.

- BaseTest class is used for browser setup and teardown
- LoginPage class is used for handling login functionality
- PurchaseTest class is used for executing purchase workflow

TestNG is used for test execution with annotations such as:
- @BeforeMethod for setup
- @AfterMethod for browser teardown
- @Test for executing test cases

Explicit Wait is implemented using WebDriverWait to handle synchronization issues during login validation.

Assertions are used to verify successful login and order placement.

How to Run This Project:
1. Import the project as a Maven Project in Eclipse IDE
2. Allow Maven to download all required dependencies
3. Go to src/test/java/tests/PurchaseTest.java
4. Right click on PurchaseTest.java
5. Select Run As → TestNG Test

Outcome:
The automation framework successfully validates the end-to-end purchase functionality of the Demoblaze E-commerce application using Selenium WebDriver with Java.
