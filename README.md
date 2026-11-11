# Cucumber BDD-Based ATM System

## Project Overview
This project demonstrates a simple ATM (Automated Teller Machine) system using Java and Behaviour-Driven Development (BDD) with Cucumber.

The project uses Gherkin syntax to define test scenarios in a readable format and Cucumber to execute these scenarios through Java step definitions.

## Objectives
- Understand Behaviour-Driven Development (BDD).
- Implement basic ATM operations using Java.
- Create test scenarios using Gherkin.
- Automate testing using the Cucumber framework.
- Validate application behaviour through automated test execution.

## Technologies Used
- Java 17
- Maven
- Cucumber 7.20.1
- Gherkin
- JUnit 4.13.2
- Visual Studio Code

## Project Structure

```text
CucumberATM/
├── pom.xml
└── src/
    ├── main/
    │   └── java/com/atm/
    │       ├── App.java
    │       └── ATMService.java
    └── test/
        ├── java/com/atm/
        │   ├── AppTest.java
        │   ├── ATMSteps.java
        │   └── RunCucumberTest.java
        └── resources/features/
            └── atm.feature
```

## Features
- PIN authentication.
- Account lock after three incorrect PIN attempts.
- Insufficient balance validation.
- Successful withdrawal and balance update.
- Automated scenario execution using Cucumber.

## How to Run the Project

1. Install Java 17 or later.
2. Install Apache Maven.
3. Clone this repository:

```bash
git clone https://github.com/jeevitha1152-bit/CucumberATM.git
```

4. Navigate to the project directory:

```bash
cd CucumberATM
```

5. Execute the tests:

```bash
mvn test
```

## Testing
The project includes Cucumber scenarios written in Gherkin to validate ATM operations. The test runner executes the scenarios and reports whether they pass or fail.

## Learning Outcomes
This project provides practical experience with Java development, BDD concepts, Gherkin syntax, automated testing, Maven and Cucumber integration.

## Author
Jeevitha

