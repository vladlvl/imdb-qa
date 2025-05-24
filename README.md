Before start. Make sure:

-Java 17 installed

-Allure CLI installed 

To start:
1) Terminal: git clone https://github.com/vladlvl/imdb-qa.git
into the project folder
2) To get all dependencies downloaded, test compiled, run tests use and generate allure-resuts: ./gradlew clean test
3) To view allure report: allure serve build/allure-results

To run individual tests use the following command: ./gradlew test --tests "tests.testName"
, or it can be launched directly from the IDE (test explorer) UI.

IntelliJ community edition has been used as an IDE for this project.