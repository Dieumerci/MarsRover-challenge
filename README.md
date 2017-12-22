# next45-MarsRover-challenge
The code and programs, that are contained within the folder are solution's to the Mars Rover coding challenge.

## DESIGN AND ASSUMPTIONS
After doing some research, I came to a conclusion that the best approach to solve the Mars rover coding challenge is to implement the TDD methodology. The TDD methodology follows a RED, GREEN and REFACTOR approach the TDD approach is explained in detail below:
1. The first approach is to write all the test code.
1. After the test code is written, I ran the code which lead to:
1. Item 3
   1. Item 3a
   1. Item 3b
In conclusion I'd love the opportunity to discuss both the Design Pattern implementations and TDD approach further with your developers, as I'm sure there's a lot I can learn and improve in these aspects

## Challenges

I had originally started this challenge in JavaScript, but eventually decided to continue in Ruby as I am currently more comfortable with the language.

Although writing this programme has so far been an enjoyable challenge, I currently stand defeated by the lost robot who just refuse to return the last position they were at before falling off the grid. Pesky robots!

## DEVELOPMENT ENVIROMENT
The following tools were used to developed the application:
* IntelliJ IDEA 2017.2.3
* Third Party Tools:
  * hamcrest-core-1.3.jar
  * junit-4.12.jar
* Build Tools:
  * JUnit 4.1.2
  * Java version 1.8.0_111
## INSTALLATION AND TESTING
The main class(Main.java) is reside inside next45\src\RoverMain.java. We need to run this file to run the application.
To get up and running with the code:
* Import and setup the project in your chosen IDE
* Run the Gradle 'clean', this will run all the tests in Gradle and build you a .jar
* Run the RoverMain class, this will test the input and output in the command line

## TEST
### Unit Test cases:
All the test resources are bundle at the tests folder.Test cases include.
* Test's to check the returning resultants of instructions.
* Invalid commands
* Invalid Instruction sent to the Rover. 

Unit test cases are available under next45\tests\RoverTest.java.

The main class of the project is RoverMain.java, so the solution can be tested by using the command "java RoverMain" inside next45\src\RoverMain.java folder where the classes are located. Alternatively, one can edit the JUnit tests.

