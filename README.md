# E-Commerce-Testing-Selenium-
#Project Overview
Understanding Business and Functional Requirements:
One of the first steps in this project was to thoroughly understand the business and functional requirements of the E-commerce application. This involved close interaction with the client to identify key test scenarios that would ensure the application meets its expected functionality.

Types of Testing Performed:

Smoke Testing: Conducted to ensure that the most crucial functions of the application work without critical issues.
Functional Testing: Verified that the application functions according to the specified requirements.
Retesting: Ensured that previously identified defects were fixed and did not recur.
Regression Testing: Checked that new code changes did not adversely affect the existing functionalities.


Key Components
BaseClass:
The BaseClass served as the foundation for our test scripts. It included the setup and teardown methods, initialization of WebDriver, and configuration settings required for the tests. This class ensured that each test started with a clean slate and that resources were properly managed.

PageClass:
Following the Page Object Model (POM) design pattern, the PageClass contained web elements and methods that performed actions on these elements. This separation of web element definitions from test logic enhanced code reusability and maintainability.

TestCases:
The TestCases class encompassed various test scripts that validated different functionalities of the E-commerce application. These scripts leveraged methods from the PageClass to perform actions and assertions, ensuring that the application behaved as expected under various scenarios.

Utility:
The Utility class provided auxiliary methods and functions that supported the main test scripts. This included common functions like reading from property files, handling waits, taking screenshots, and logging.



testcase1.xml:
This XML file defined the test suite configuration, specifying which test cases to run and the sequence of execution. It was an integral part of managing and organizing the test execution flow.
