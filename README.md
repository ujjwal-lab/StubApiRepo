# StubApiRepo

This project is written in Java and uses Cucumber(gherkin-BDD) alongwith an open source automation tool Rest Assured. This project will serve an example of implementing a API test project with Rest Asured and Maven.

#**Prerequisites**

=JDK8 installed

maven installed

#**Used tools and frameworks**

Rest-Assured

Maven

TestNG

Cucumber

#**IDE**

Eclipse

Install testng in eclipse

Install cucumber plugin for eclipse

#**Set Up**

Clone this github repo in your local directory. Once clonsed navigate to project space.

cd StubApiAutomation

All the required dependencies are added in POM. No external dependencies required.

#**Framework Structure**

Fetaure Files: Feature files has all the scenarios given in the problem statement. A single feature file 'apitesting.feature' conatins the three scenarios with examples. The feature file has @tag at feature level in order to run the whole feature as well as tags are present at scenairo level to enable execution at scenario level. The feature file is present in location 'src/test/resoucres/featurefiles' .

Step Definition: For each of the scneario metioned there is a corresponding Step definition file. The step definition does have method written in them instead they call the method from another class GetApiMthodCall. This ensures that any changes to method are reflected across the Step Definitions in which they are used. The Step definition are present in src/test/java/com.qa.step.def

GetApiMthodCall : This class implement all the function related to API method call and other asserstion that needs to be done. In future based on api endpoints more such Api Method class needs to created for testing those endpoints.

Runner: Runner class uses Testng execution feature by extending to AbstractTestNGCucumberTests.

Utility: Utility classes like CommonMethod Utilityclass are created for common operation like loading of various properties and common assertion checks. The methods are all static and can be called anywhere in the project space by passing relevant arguments.

LoggerConfig: This class is used to configure logging and various methods that can be used for logging.

#**How to execute**

**The test suite can be executed at two level**

#**Prerequisites**

Since the Apis are Stubbed, please follow below steps befor running the automation scripts

1.Clone the repository: https://github.com/auto-user/sampleStubService.git

2.On the command prompt, navigate to the cloned repo project and run the following bat command StartStubService.bat This will start the API stub server

Once the server has started user can now run the automation test suite

#**IDE level**
1. Import the maven project in your IDE.
2. Run the testng.xml file from the IDE and it will trigger the execution of the feature

#**Command line.**

Open command prompt/terminal and navigate to the project folder location. Execute below command. 

mvn clean test

#**Reporting** The test generate two reports one in HTML and another in .Json format

Html report : target/cucumber-html-report/index.html

Json report : target/cucumber-reports/cucumber.json

#**Log**
The automation suite generates a log file for all the execution. The log file is present in /Log folder
