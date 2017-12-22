# next45-MarsRover-challenge
The code and programs, that are contained within the folder are solution's to the Mars Rover coding challenge.

## CODE STRUCTURE
### RoverMain Class
* Is the main java class
* Creates the Mars Rover Object with all the command instructions needed
### directionChange Class
* Has the ability to store an x coordinate, y coordinate, and orientation
### MarsRover Class
* The possible letters are 'L', 'R' and 'M'. 'L' and 'R
* The possible letters are 'E', 'W' and 'S'. 'N' 
### Position Class
* Position object in this case the location can point us to the rovers location " X,Y " and direction
## CHALLENGES & REFLECTIONS
After doing some research, I came to a conclusion that the best approach to solve the Mars Rover coding challenge is to implement the TDD methodology. The TDD methodology follows a RED, GREEN and REFACTOR approach.

I had originally started this challenge in c#, but eventually decided to continue in Java as I am currently more comfortable with the language.Although writing this programme has so far been an enjoyable challenge, I enjoyed the opportunity to work with Design Pattern implementations and TDD approach.

1. First time using the TDD methodology
1. I was able to expand my understanding of the importances of TDD
1. TDD with JUnit helped produce better code
## DEVELOPMENT ENVIROMENT
The following tools were used to developed the application:
* IntelliJ IDEA 2017.2.3
* Third Party Tools:
  * hamcrest-core-1.3.jar
  * junit-4.12.jar
* Build Tools:
  * JUnit 4.12
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

