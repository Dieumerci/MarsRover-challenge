# next45-MarsRover-challenge
The code and programs, that are contained within the folder are solution's to the Mars Rover coding challenge.

## DESIGN AND ASSUMPTIONS

This application follows object-oriented design principles and utilizes many single responsibility methods and classes. The classes include:

* a Rotate class to hold a string array method that rotates the array by X number of elements/indeces. (Created this class for future separation of concerns in regards to the rotate method.)

* a Terrain class so different landscapes can be created and store information about their max coordinates (x and y)* for the rectangular landscape. After implementing stretch goals, it will also store information about where obstacles are located on it.

* a Rover class which stores information about each rover object and the methods associated with controlling it and moving it's location on the current terrain.

* a Mars Rover class that runs the application by pulling in data from a text file. It creates instances of the terrain and rovers and calls the methods to be executed (based on the input file).

* Note: I chose to just have X and Y fields instead of a nested array to simulate the grid system. I did this to make it simpler to navigate the landscape (up/down/left/right), to use less space/memory, and to avoid having to traverse a 2D array to check if a position is filled or move to that position, etc.

After doing some research, I came to a conclusion that the best approach to solve the Mars rover coding challenge is to implement the TDD methodology. The TDD methodology follows a RED, GREEN and REFACTOR approach the TDD approach is explained in detail below:
1. The first approach is to write all the test code.
1. After the test code is written, I ran the code which lead to:
1. Item 3
   1. Item 3a
   1. Item 3b

In conclusion I'd love the opportunity to discuss both the Design Pattern implementations and TDD approach further with your developers, as I'm sure there's a lot I can learn and improve in these aspects
## DEVELOPMENT & CODE
The following tools were used to develope the application:
* IntelliJ IDEA 2017.2.3
* Third Party Tools:
  * hamcrest-core-1.3.jar
  * junit-4.12.jar
* Build Tools:
  * JUnit 4.1.2
  * written in Java 8
The code is contained in single file called Rover.java and is described in that file's comments. Its key elements are a Rover location/direction state, transforms on that state, and mappings from the specified input/output formats to those states and transforms.

There are no JUnit tests since the code in its current form is completely exercised 
from the command line and I currently have no intention to re-use any of the code.
## INSTALLATION AND TESTING
Start a bash shell
Unpack the zip archive and cd to the directory it was unpacked  to.

## TEST
The application contains unit tests for each of the classes, which is used when comparing it with the expected outcomes:

