## webproject Project
Automated test script to verify the login functionality of a web application.

## Test Automation Framework and its Design
This test automation is using the popular Selenium web-driver automation tool.  Selenium is an open-source for test automation that uses various programming languages and can be integrated with several type of test automation framework.  
The automation script is using the TestNG framework to facilitate the easier test case addition and its automatic test report generator.

On this project, the test object is to validate the login page' functionality:

Web application url: (https://practicetestautomation.com/practice-test-login/)

Acceptance Criteria:
```sh
- Given that application is up and running"
- When user logged in using the default username and password
- Then application would be able to respond"
```
      
On this project, all scenarios are placed under one class file. 
User should be able to see the "LoginTestCases.java" file under "src/test/java"/"all_ui" package.

## Requirements
- Eclipse IDE for Java Developers
- Clone this Git Project to local machine
- Make sure to use or install latest Java JDK this project

## How to Setup
Cloning this Git Project to local machine
1. On this Git Project, click the clone button and copy the HTTPS clone link
2. Open Eclipse and clone the project by following the steps below:
```sh
2.1. Select the workspace folder
2.2. File > Import > Git > Projects from Git, then click Next button
2.3. Select Clone URI and click Next button
2.4. On the URI field, paste the Git HTTPS clone link from step 1. (Host and Repository Path should automatically populated after filling the URI field.)
2.5. Click Next button
2.6. Make sure that master branch is checked.  Then click Next button
2.7. Directory field should be autopopulated. If you have to use different parent folder, then change and click Next button
2.8. Cloning process should start and once done, click Next button
2.9. Click Finish button
```
3. Project should now in the Project Explorer Bar
4. Check if JRE System Library is atleast version 23.  If not, do the steps below:
```sh
4.1. Right click on the project > Build Path > Configure Build Path
4.2. On Libraries tab, select the current JRE System Library and click Remove button
4.3. Click Add Library button
4.4. Select JRE System Library and click Next
4.5. On the Select Alternate JRE field,  select JDK 23.... If not available, click Installed JREs
4.6. Click Add button
4.7. Select Standard VM and click Next button
4.8. Click Directory button and locate the java jdk 23 folder then click Finish button
4.9. Make sure that the newly added jdk 23 is selected as the new JRE
4.10. Click Apply and Close button then Click Finish button
4.11. On the Libraries tab, JRE System Library should now indicate jdk 23
4.12. Click Apply and Close button
```

## How to Run
Using Eclipse IDE, you should be able to quicly execute the test execution.
1. Open Eclipse and Navigate to the Project folder in the Project Explorer
2. Under "src/test/java"/"all_ui" package, you should be able to see LoginTestCases.java
3. Open the class file and user should be able to see a clickable "Run All" inside the class
4. Click the "Run All"
5. After execution is complete, check the "Results of the running suite" tab and user should be able to see the test report.  This tab is usually located next to the Console tab.
6. To open the TestNG html report, user can go to Project Explorer and collapse the "test-output" folder.  Open the index.html in your chrome browser and should be able to see the detailed test execution report.

## How to check the test scenarios
Using Eclipse IDE, you should be able to see the scenarios on this project.
1. Open Eclipse and Navigate to the Project folder in the Project Explorer
2. Under "src/test/java"/"all_ui" package, you should be able to see "LoginTestCases.java" file
3. Open "LoginTestCases.java" file                 
