# MyChallengeQA
Please execute this instructions to run the Selenium tests with Firefox and Chrome:

-------------TEST Selenium with Firefox------------------

1-Create a new Project: Selenium with Firefox
--> File / New / Order / Maven / Maven Project

2-Set:
--> Create a simple project
--> Use default Workplace location

3-Next:
--> Group Id: com.google
--> Artifact Id: Project name

4-Create a new package
--> Right click on src/test/java
--> New / Package

5-Copy the file ConsultProduct.java into the created package

6-Copy the file ConsultProduct.feature to src//test/resources

Attention: the class file shall have the "same_name.java"
e.h:
ConsultProduct.java
ConsultProduct.feature

7-Copy the full folder "drivers" to the project root

8-Copy the file pom.xml to the project root

Then edit the file and insert:

      <groupId>org.apache.maven</groupId>
      <artifactId>your project name here</artifactId>


9-Set into the file java the following line:

ConsultProduct.java:

System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\challenge_MG_QA\\drivers\\firefox\\geckodriver.exe");
--------------------------------------------------------------------------------------

-------------TEST Selenium with Chrome------------------

1-Create a new Project: Selenium with Chrome
--> File / New / Order / Maven / Maven Project

2-Set:
--> Create a simple project
--> Use default Workplace location

3-Next:
--> Group Id: com.google
--> Artifact Id: Project name

4-Create a new package
--> Right click on src/test/java
--> New / Package

5-Copy the file ConsultProduct.java into the created package

6-Copy the file ConsultProduct2.feature to src//test/resources

Attention: the class file shall have the "same_name.java"
e.h:
ConsultProduct2.java
ConsultProduct2.feature

7-Copy the full folder "drivers" to the project root

8-Copy the file pom.xml to the project root

Then edit the file and insert:

      <groupId>org.apache.maven</groupId>
      <artifactId>your project name here</artifactId>

9-Set into the file java the following line:

ConsultProduct2.java:

System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\challenge_MG_QA\\drivers\\chrome\\chromedriver.exe");
--------------------------------------------------------------------------
To run the Test:

-Richt click on: ConsultProduct.feature
-Run As / 1 Cucumber Feature

Not forget to click quickly on Button: [Agree]

We use cookies [Agree]

